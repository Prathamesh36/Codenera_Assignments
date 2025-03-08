package DEC22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class data_fetching {

    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con =DriverManager.getConnection("jdbc:mysql://localhost:3306/sept_JDBC?useSSL=false&allowPublicKeyRetrieval=true","root","root");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from emp_info");
            System.out.println("--------Employee Information--------");
            while(rs.next()) {
                System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getInt(3));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
