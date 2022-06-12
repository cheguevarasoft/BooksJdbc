package dbpack;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class InsertCls {

    public static void main(String[] args) throws SQLException {

        Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","GROUP87","1234");

        String sqlcommand = "INSERT INTO BOOKS VALUES (gr_87_seq.NEXTVAL,'CEHENNEM','DEN BRAUN',280,30,TO_DATE( '20.03.2008', 'DD.MM.YYYY' ),'AY')";

        PreparedStatement pst = con.prepareStatement(sqlcommand);

        pst.execute();
    }

}
