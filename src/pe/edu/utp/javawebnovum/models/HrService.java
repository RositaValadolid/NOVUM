package pe.edu.utp.javawebnovum.models;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class HrService {
    private Connection connection;
    private OrdersEntity ordersEntity;
    private UsersEntity usersEntity;

    private Connection getConnection() {
        if (connection == null){
            try {
                connection = ((DataSource) InitialContext
                        .doLookup("jdbc/MySQLDataSource"))
                        .getConnection();
            } catch (NamingException | SQLException e) {
                e.printStackTrace();
            }
        }
        return connection;
    }

    public void setConnection(Connection connection) {
        this.connection = connection;
    }

    protected UsersEntity getUsersEntity() {
        if(getConnection() != null) {
            if(usersEntity == null) {
                usersEntity = new UsersEntity();
                //usersEntity.setConnection(getConnection());
            }
        }
        return usersEntity;
    }

    protected OrdersEntity getOrdersEntity() {
        if(getConnection() != null) {
            if(ordersEntity == null) {
                ordersEntity = new OrdersEntity();
                ordersEntity.setConnection(getConnection());
            }
        }
        return ordersEntity;
    }

   /* public List<User> findAllRegions() {
        return getOrdersEntity() != null ?
                getOrdersEntity().findAll() : null;
    }*/

    public User findOrderById(int id) {
        return getUsersEntity() != null ?
                getUsersEntity().findById(id) : null;
    }

    /*public User createUser(String password) {
        return getUsersEntity() != null ?
                getUsersEntity().create(password) : null;
    }*/

}
