package Customer_Join;

import java.util.Scanner;

public class CustomerVO {

	private String id;
	private String password;
	private String name;
	private String tel;
	
	Scanner scan = new Scanner(System.in);
	
	//持失切(id,password,name,tel)
	public CustomerVO(String id, String password, String name, String tel) {
		super();
		this.id = id;
		this.password = password;
		this.name = name;
		this.tel = tel;
	}
	//持失切(id)
	public CustomerVO(String id) {
		super();
		this.id = id;
	}
	//持失切(id,password)
	public CustomerVO(String id, String password) {
		super();
		this.id = id;
		this.password = password;
	}

	//getter, setter
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
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
		return "CustomerVO [id=" + id + ", password=" + password + ", name=" + name + ", tel=" + tel + "]";
	}
	
}
