package mysqlConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
public class FooditemsDAO {
	public static ArrayList<FooditemsDTO> getFoodList(){
		ArrayList<FooditemsDTO> Food= new ArrayList<>();
		try {
			Connection con = Jdbc.getCon();
			PreparedStatement stmt = con.prepareStatement("select * from fooditems");
			ResultSet res = stmt.executeQuery();
			while(res.next()) {
				FooditemsDTO FoodList = new FooditemsDTO(res.getInt(1),res.getString(2),res.getInt(3),res.getString(4),res.getString(5),res.getString(6),res.getString(7),res.getString(8), res.getInt(9),res.getInt(10));
				Food.add(FoodList);
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return Food;
		
	}
}

