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
    public User getRegion() {
        return user;
    }

    public void setRegion(User region) {
        this.user = region;
    }

    public String getName() {
        return this.getRegion().getName();
    }

    public void setName(String name){
        this.getRegion().setName(name);
    }

    public String newRegion(){
        this.setRegion(new User());
        return "success";
    }

    public String createRegion(){
        //service.createUser(this.getName());
        return "success";
    }

    public String editRegion(User region){
        this.setRegion(region);
        return "success";
    }

    public String updateRegion(){
        //service.updateUser(this.getRegion());
        return "success";
    }
    public String deleteRegion(User region){
        //service.deleteUser(region.getId());
        return "success";
    }
}
