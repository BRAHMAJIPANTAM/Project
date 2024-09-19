package mysqlConnection;

public class RestaurantDTO {
	int res_id;
	String res_name;
	String 	address;
	String location;
	String open_time;
	String 	close_time;
	String 	gst_no;
	String cuisins_list;
	String contact_number;
	String bank_account_number;
	String 	email;
	String login_password; 
	String 	avg_rating;
	String 	curr_order_accepting_status;
	String 	res_img;
	public RestaurantDTO(int res_id, String res_name, String address, String location, String open_time,
			String close_time, String gst_no, String cuisins_list, String contact_number, String bank_account_number,
			String email, String login_password, String avg_rating, String curr_order_accepting_status,
			String res_img) {
		super();
		this.res_id = res_id;
		this.res_name = res_name;
		this.address = address;
		this.location = location;
		this.open_time = open_time;
		this.close_time = close_time;
		this.gst_no = gst_no;
		this.cuisins_list = cuisins_list;
		this.contact_number = contact_number;
		this.bank_account_number = bank_account_number;
		this.email = email;
		this.login_password = login_password;
		this.avg_rating = avg_rating;
		this.curr_order_accepting_status = curr_order_accepting_status;
		this.res_img = res_img;
		
	}
	public int getRes_id() {
		return res_id;
	}
	public void setRes_id(int res_id) {
		this.res_id = res_id;
	}
	public String getRes_name() {
		return res_name;
	}
	public void setRes_name(String res_name) {
		this.res_name = res_name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getOpen_time() {
		return open_time;
	}
	public void setOpen_time(String open_time) {
		this.open_time = open_time;
	}
	public String getClose_time() {
		return close_time;
	}
	public void setClose_time(String close_time) {
		this.close_time = close_time;
	}
	public String getGst_no() {
		return gst_no;
	}
	public void setGst_no(String gst_no) {
		this.gst_no = gst_no;
	}
	public String getCuisins_list() {
		return cuisins_list;
	}
	public void setCuisins_list(String cuisins_list) {
		this.cuisins_list = cuisins_list;
	}
	public String getContact_number() {
		return contact_number;
	}
	public void setContact_number(String contact_number) {
		this.contact_number = contact_number;
	}
	public String getBank_account_number() {
		return bank_account_number;
	}
	public void setBank_account_number(String bank_account_number) {
		this.bank_account_number = bank_account_number;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getLogin_password() {
		return login_password;
	}
	public void setLogin_password(String login_password) {
		this.login_password = login_password;
	}
	public String getAvg_rating() {
		return avg_rating;
	}
	public void setAvg_rating(String avg_rating) {
		this.avg_rating = avg_rating;
	}
	public String getCurr_order_accepting_status() {
		return curr_order_accepting_status;
	}
	public void setCurr_order_accepting_status(String curr_order_accepting_status) {
		this.curr_order_accepting_status = curr_order_accepting_status;
	}
	public String getRes_img() {
		return res_img;
	}
	public void setRes_img(String res_img) {
		this.res_img = res_img;
	}	
}
