package customer;
	
public class Member {
	private String code;
	private String name;
	private int point;
	
	public Member() {
	}
	
	
	
	public Member (String code , String name , int point) {
		this.code = code;
		this.name = name;
		this.point =point; 
	}
	
	
	public String getCode() {
		return code;
	}
	
	public void setCode(String code) {
		this.code = code;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}
}
