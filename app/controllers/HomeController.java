package controllers;

import controllers.*;
import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import java.lang.Object.*;

import views.html.*;

// Import models
import models.*;
import models.users.*;

public class HomeController extends Controller {

    // Declare a private FormFactory instance
    private FormFactory formFactory;

    //  Inject an instance of FormFactory it into the controller via its constructor
    @Inject
    public HomeController(FormFactory f) {
        this.formFactory = f;
    }

    public Result index() {

        return ok(index.render(getUserFromSession(), nullAccount()));
    }

    public Result about() {

        return ok(about.render(getUserFromSession(), nullAccount()));
    }

    public Result signup(){
        Form<User> addUserForm = formFactory.form(User.class);
        return ok(signup.render(addUserForm));
    }

    @Security.Authenticated(Secured.class)
    public Result update(){
        Form<User> userForm = formFactory.form(User.class);
        return ok(update.render(userForm));
    }

    @Security.Authenticated(Secured.class)
    public Result updateUserProfile(){
        Form<Account> accountForm = formFactory.form(Account.class);
        return ok(updateUserProfile.render(accountForm));
    }

    public Result otherprofile(){
        return ok(otherprofile.render(nullAccount(), nullUser()));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result updateUser(String email){
        User u;
        Form<User> userForm;

        try{
            u = User.find.byId(email);
            userForm = formFactory.form(User.class).fill(u);
        }catch(Exception ex){
            return badRequest("error");
        }
        return ok(update.render(userForm));
    }

    @Security.Authenticated(Secured.class)
    @Transactional
    public Result updateProfile(Integer id){
        Account a;
        Form<Account> accountForm;

        try{
            a = Account.find.byId(id);
            accountForm = formFactory.form(Account.class).fill(a);
        }catch(Exception ex){
            return badRequest("error");
        }
        return ok(updateUserProfile.render(accountForm));
    }

    public Result otherProfileGenerate(String email){
        Account a;
        User u;
        try{
            u = User.find.byId(email);
            a = Account.find.byId(profileId(email));
        }catch(Exception ex){
            return badRequest("error");
        }
        return ok(otherprofile.render(a, u));
    }

    public int profileId(String email){
        int accountId = -1;
        Connection con = null;
        Statement stmt = null;
        String query = "SELECT a.account_id FROM ACCOUNT a, USER u WHERE a.email = u.email AND a.email ='"+email+"' ";
        try{
            con = DriverManager.getConnection("jdbc:h2:file:./data/circleDB", "sa", "");
            stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            while(rs.next()){
                accountId = rs.getInt("account_id");
            }
            rs.close();
            con.close();
            stmt.close();
        }catch(SQLException ex){

        }
        return accountId;
    }

    public Result updateUserSubmit(){
        Form<User> newUserForm = formFactory.form(User.class).bindFromRequest();
        if(newUserForm.hasErrors()){
            return badRequest(signup.render(newUserForm));
        }

        User u = newUserForm.get();
        u.update();
        return redirect(controllers.routes.HomeController.profile());
    }

    public Result updateUserProfileSubmit(){
        Form<Account> newAccountForm = formFactory.form(Account.class).bindFromRequest();
        if(newAccountForm.hasErrors()){
            return badRequest(updateUserProfile.render(newAccountForm));
        }

        Account a = newAccountForm.get();
        a.update();
        return redirect(controllers.routes.HomeController.profile());
    }

    @Security.Authenticated(Secured.class)
    public Result profile(){
            return ok(profile.render(getUserFromSession(), getAccountFromSession()));
    }

    public Result search(){
        List<User> userList = User.findAll();
        List<Account> accountList = Account.findAll();
        return ok(search.render(userList, accountList));
    }

    public Result addUserSubmit(){
        Form<User> newUserForm = formFactory.form(User.class).bindFromRequest();
        if(newUserForm.hasErrors()){
            return badRequest(signup.render(newUserForm));
        }

        User newUser = newUserForm.get();
        Account newAccount = new Account();
        List<User> allusers = User.findAll();
        for(int i = 0; i < allusers.size(); i++){ //Check if duplicate email. If email exists go back to sign-up form.
            if(newUser.getEmail().equals(allusers.get(i).getEmail())){
                flash("emailExists", "Email already exists."); //Should not be using flash here. Change if solution is found.
                return badRequest(signup.render(newUserForm));
            }
        }
        if(newUser.getEmail().equals("")){ //If email is blank
            return badRequest(signup.render(newUserForm));
        }
        if(!newUser.getEmail().contains("@")){
            flash("noAtSymbol", "No @ symbol found in email.");
            return badRequest(signup.render(newUserForm));
        }
        newUser.addAccount(newAccount);
        newUser.save();
        newAccount.save();

        flash("created", "User Created.");

        return redirect(controllers.routes.HomeController.index());
    }

    @Security.Authenticated(Secured.class)
    public Result deleteAccount(String email){
        User.find.ref(email).delete();

        flash("deleted", "User delete");
        session().clear();
        return redirect(routes.HomeController.index());
    }

    private User getUserFromSession(){
        return User.getUserById(session().get("email"));
    }

    private Account getAccountFromSession(){
        return Account.getAccountById(Integer.parseInt(session().get("account")));
    }

    private User nullUser(){
        User newUser = new User();
        return newUser;
    }

    private Account nullAccount(){
        Account newAccount = new Account();
        return newAccount;
    }

}
