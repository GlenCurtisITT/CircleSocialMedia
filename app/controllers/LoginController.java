package controllers;

// Import models
import ch.qos.logback.core.db.dialect.DBUtil;
import controllers.*;
import models.*;

import play.api.Environment;
import play.mvc.*;
import play.data.*;
import play.db.ebean.Transactional;

import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

import views.html.*;

import models.users.*;
import java.sql.*;

public class LoginController extends Controller{
    private FormFactory formFactory;

    private Environment env;

    @Inject
    public LoginController(Environment e, FormFactory f){
        this.env = e;
        this.formFactory = f;
    }

    public Result login(){
        Form<Login> loginForm = formFactory.form(Login.class);

        return ok(login.render(loginForm));
    }

    public Result logout(){
        session().clear();
        flash("logout", "You have been logged out.");
        return redirect(routes.HomeController.index());
    }

    public Result loginSubmit(){
        Form<Login> loginForm = formFactory.form(Login.class).bindFromRequest();
        if(loginForm.hasErrors()){
            return badRequest(login.render(loginForm));
        }
        int accountId = -1;
        Connection con = null;
        Statement stmt = null;
        String query = "SELECT a.account_id FROM ACCOUNT a, USER u WHERE a.email = u.email AND a.email ='"+loginForm.get().getEmail()+"' ";
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


        session().clear();
        session("email", loginForm.get().getEmail());
        session("account", Integer.toString(accountId));

        return redirect(controllers.routes.HomeController.profile());
    }

}
