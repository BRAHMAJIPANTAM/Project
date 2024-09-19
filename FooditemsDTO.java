package mysqlConnection;

public class FooditemsDTO {
	int food_id; 
	String food_item_name;
	int price_per_quantity;
	String food_image;
	String food_description;
	String is_non_vegitarian;
	String is_eggitarian;
	String avg_rating;
	int cuisin_id;
	int menu_id;
	public FooditemsDTO(int food_id, String food_item_name, int price_per_quantity, String food_image,
			String food_description, String is_non_vegitarian, String is_eggitarian, String avg_rating, int cuisin_id,
			int menu_id) {
		super();
		this.food_id = food_id;
		this.food_item_name = food_item_name;
		this.price_per_quantity = price_per_quantity;
		this.food_image = food_image;
		this.food_description = food_description;
		this.is_non_vegitarian = is_non_vegitarian;
		this.is_eggitarian = is_eggitarian;
		this.avg_rating = avg_rating;
		this.cuisin_id = cuisin_id;
		this.menu_id = menu_id;
	}
	public int getFood_id() {
		return food_id;
	}
	public void setFood_id(int food_id) {
		this.food_id = food_id;
	}
	public String getFood_item_name() {
		return food_item_name;
	}
	public void setFood_item_name(String food_item_name) {
		this.food_item_name = food_item_name;
	}
	public int getPrice_per_quantity() {
		return price_per_quantity;
	}
	public void setPrice_per_quantity(int price_per_quantity) {
		this.price_per_quantity = price_per_quantity;
	}
	public String getFood_image() {
		return food_image;
	}
	public void setFood_image(String food_image) {
		this.food_image = food_image;
	}
	public String getFood_description() {
		return food_description;
	}
	public void setFood_description(String food_description) {
		this.food_description = food_description;
	}
	public String getIs_non_vegitarian() {
		return is_non_vegitarian;
	}
	public void setIs_non_vegitarian(String is_non_vegitarian) {
		this.is_non_vegitarian = is_non_vegitarian;
	}
	public String getIs_eggitarian() {
		return is_eggitarian;
	}
	public void setIs_eggitarian(String is_eggitarian) {
		this.is_eggitarian = is_eggitarian;
	}
	public String getAvg_rating() {
		return avg_rating;
	}
	public void setAvg_rating(String avg_rating) {
		this.avg_rating = avg_rating;
	}
	public int getCuisin_id() {
		return cuisin_id;
	}
	public void setCuisin_id(int cuisin_id) {
		this.cuisin_id = cuisin_id;
	}
	public int getMenu_id() {
		return menu_id;
	}
	public void setMenu_id(int menu_id) {
		this.menu_id = menu_id;
	}
	
}
