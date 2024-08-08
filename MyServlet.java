import java.sql.*;

public class MyServlet{
    public static void main(String[] args)throws SQLException {
        String jdbcUrl ="jdbc:mysql://localhost:3306/org";
        String username ="root";
        String password ="abhi@0806";

        Connection con = DriverManager.getConnection(jdbcUrl,username,password);
        Statement st = con.createStatement();
        ResultSet rs =st.executeQuery("select *from student");

        while(rs.next()){
         System.out.println(rs.getInt(1)+"   "+rs.getString(2)+"   "+rs.getInt(3));
        }
        con.close();
    }
}