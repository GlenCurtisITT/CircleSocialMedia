package models.users;
import java.util.*;
import javax.persistence.*;
import javax.validation.Constraint;

import com.avaje.ebean.Model;
import play.data.validation.*;
/**
 * Created by wdd on 06/12/16.
 */
@SequenceGenerator(name = "acc_seq", sequenceName = "accseq", initialValue = 1, allocationSize = 1)
@Entity
public class Account extends Model{


    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "acc_seq")
    public int account_id;

    @Constraints.Required
    private String aboutMe;

    @Constraints.Required
    private String profilePicture;

    @Constraints.Required
    private String coverPhoto;

    @OneToOne
    @JoinColumn(name = "email")
    public User user;

    public Account(){
        this.setAboutMe("Enter some information to tell people about yourself...");
        this.setProfilePicture("http://www.clker.com/cliparts/5/9/4/c/12198090531909861341man%20silhouette.svg.hi.png");
        this.setCoverPhoto("http://wallpapercave.com/wp/46IcIP8.jpg");
    }



    public static Finder<Integer,Account> find = new Finder<Integer, Account>(Account.class);

    public static List<Account> findAll(){
        return Account.find.all();
    }

    public void setProfilePicture(String profilePicture){
        this.profilePicture = profilePicture;
    }

    public String getAboutMe() {
        return aboutMe;
    }

    public void setUser(User u) {
        this.user = u;
    }

    public static Account getAccountById(Integer id){
        return find.byId(id);
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    public String getProfilePicture() {
        return profilePicture;
    }

    public int getAccount_id() {
        return account_id;
    }

    public void setAccount_id(int account_id) {
        this.account_id = account_id;
    }

    public String getCoverPhoto() {
        return coverPhoto;
    }

    public void setCoverPhoto(String coverPhoto) {
        this.coverPhoto = coverPhoto;
    }
}
