package pe.edu.utp.javawebnovum.models;

import com.oracle.wls.shaded.org.apache.xpath.operations.Or;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OrdersEntity extends BaseEntity{
    private static String DEFAULT_SQL = "SELECT * FROM orders";
    private List<Order> findByCriteria(String sql, OrdersEntity regionsEntity) {
        List<Order> countries = new ArrayList<>();
        if(getConnection() != null) {
            try {
                ResultSet resultSet = getConnection()
                        .createStatement()
                        .executeQuery(sql);
                while(resultSet.next()) {
                    Order country = new Order(
                            //resultSet.getString("country_id"),
                            //resultSet.getString("country_name"),
                            //regionsEntity
                                    //.findById(resultSet
                                            //.getInt("order_id"))
                    );
                    countries.add(country);
                }
                return countries;
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return null;

    }

    public List<Order> findAll(OrdersEntity regionsEntity) {
        return findByCriteria(DEFAULT_SQL, regionsEntity);
    }
}
