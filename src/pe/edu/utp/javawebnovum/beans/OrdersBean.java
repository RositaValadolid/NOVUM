package pe.edu.utp.javawebnovum.beans;

import pe.edu.utp.javawebnovum.models.HrService;
import pe.edu.utp.javawebnovum.models.Order;

import javax.enterprise.context.SessionScoped;
import javax.inject.Named;
import java.io.Serializable;

@Named
@SessionScoped
public class OrdersBean implements Serializable {
    private HrService service;
    private Order order;

    public OrdersBean(){
        service = new HrService();
    }
}
