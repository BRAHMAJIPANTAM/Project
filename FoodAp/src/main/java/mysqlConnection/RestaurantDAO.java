package mysqlConnection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class RestaurantDAO {
	public static ArrayList<RestaurantDTO> getList(){
		ArrayList<RestaurantDTO> res=new ArrayList<>();
	try {
		Connection con=Jdbc.getCon();
		PreparedStatement stmt=con.prepareStatement("select *from restaurantdetails");
		ResultSet rs=stmt.executeQuery();
		while(rs.next()) {
			RestaurantDTO list =new RestaurantDTO(rs.getInt(1),rs.getString(2),rs.getString(3), rs.getString(4), rs.getString(5),  rs.getString(6),  rs.getString(7),  rs.getString(8),  rs.getString(9),  rs.getString(10),  rs.getString(11), rs.getString(12),  rs.getString(13),  rs.getString(14),  rs.getString(15));
			res.add(list);
		} 
		}
	catch(Exception e) {
		System.out.println(e);
	}
	return res;
	}
}
