package admin;



import java.util.Scanner;

public class CustomerVO {

	private String customer_id;
	private String password;
	private String name;
	private String tel;
	
	Scanner scan = new Scanner(System.in);
	
	//持失切(id,password,name,tel)
	public CustomerVO(String customer_id, String password, String name, String tel) {
		super();
		this.customer_id = customer_id;
		this.password = password;
		this.name = name;
		this.tel = tel;
	}
	//持失切(id)
	public CustomerVO(String customer_id) {
		super();
		this.customer_id = customer_id;
	}
	//持失切(id,password)
	public CustomerVO(String customer_id, String password) {
		super();
		this.customer_id = customer_id;
		this.password = password;
	}

	//getter, setter
	public String getCustomer_id() {
		return customer_id;
	}

	public void setCustomer_id(String customer_id) {
		this.customer_id = customer_id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	@Override
	public String toString() {
		return "CustomerVO [id=" + customer_id + ", password=" + password + ", name=" + name + ", tel=" + tel + "]";
	}
	
}
