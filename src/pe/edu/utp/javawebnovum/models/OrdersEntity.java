package pe.edu.utp.javawebnovum.models;

import com.oracle.wls.shaded.org.apache.xpath.operations.Or;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrdersEntity extends BaseEntity{
    private static String DEFAULT_SQL = "SELECT * FROM orders";
    private List<Order> findByCriteria(String sql, UsersEntity usersEntity) {
        List<Order> orders = new ArrayList<>();
        if(getConnection() != null) {
            try {
                ResultSet resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                while(resultSet.next()) {
                    Order country = new Order(
                            resultSet.getInt("id"),
                            resultSet.getInt("user_id"),
                            resultSet.getInt("user_id"),
                            usersEntity
                                    .findById(resultSet
                                            .getInt("id"))
                    );
                    orders.add(country);
                }
                return orders;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;

    }

    public List<Order> findAll(UsersEntity usersEntity) {
        return findByCriteria(DEFAULT_SQL, usersEntity);
    }
}
