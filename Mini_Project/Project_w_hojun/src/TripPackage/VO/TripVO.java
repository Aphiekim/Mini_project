package TripPackage.VO;

public class TripVO {
	private String id;
	private String name;
	private String phone;
	private String age;
	private String passWord;
	
	public TripVO() {
		
	}

	public TripVO(String id, String name, String phone, String age, String passWord) {
		super();
		this.id = id;
		this.name = name;
		this.phone = phone;
		this.age = age;
		this.passWord = passWord;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	@Override
	public String toString() {
		return "아이디가 "+ id  + ", 비밀번호가" + passWord +"인 "+ name+ " 회원님은, 전화번호  " + phone + ", 나이대 " + age + "로 가입되어 있습니다.";
	}
	
	

}
