package mysqlConnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Jdbc {
	static String Drive="com.mysql.cj.jdbc.Driver";
	static String Url="jdbc:mysql://localhost:3306/tmf_food_delivary";
	static String UserName="root";
	static String Password="root";
	public static Connection getCon() throws SQLException, ClassNotFoundException{
		Class.forName(Drive);
		Connection Con=DriverManager.getConnection(Url,UserName,Password);
		return Con;
	}
}
