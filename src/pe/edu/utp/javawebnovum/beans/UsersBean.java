package pe.edu.utp.javawebnovum.beans;

import pe.edu.utp.javawebnovum.models.HrService;
import pe.edu.utp.javawebnovum.models.Order;
import pe.edu.utp.javawebnovum.models.User;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;
import java.util.List;

@Named
@SessionScoped
public class UsersBean implements Serializable {
    private HrService service;
    private User user;

    public UsersBean(){
        service = new HrService();
    }

    /*public List<User> getUsers(){
        return service.findAllUsers();
    }
*/
    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getPassword() {
        return this.getUser().getPassword();
    }

    public void setPassword(String password){
        this.getUser().setPassword(password);
    }

    public String newUser(){
        this.setUser(new User());
        return "success";
    }

    public String createUser(){
        service.createUser(this.getPassword());
        return "success";
    }

    public String editUser(User region){
        this.setUser(user);
        return "success";
    }

    public String updateUser(){
        //service.updateUser(this.getUser());
        return "success";
    }
    public String deleteUser(User user){
        //service.deleteUser(user.getId());
        return "success";
    }
}
