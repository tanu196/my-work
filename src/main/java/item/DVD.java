package item;

public class DVD {
	private String title;
	private String kind;
	private String number;
	private boolean judge;
	private int dvdDays;
	
	public DVD() {
	}

	public DVD(String title, String kind, String number) {
		this.title = title;
		this.kind = kind;
		this.number = number;
	}
	
	
	
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public int getPrice() {
		if( kind == "新作") {
			return 350;
		}else if( kind == "準新作") {
			return 250;
		}else if( kind == "旧作") {
			return 150;
		}else {
			return 0;
		}
	}
	
	public int getdvdDays() {
		if( kind == "新作") {
			return 7;
		}else if( kind == "準新作") {
			return 10;
		}else if( kind == "旧作") {
			return 14;
		}else {
			return 0;
		}
		
	}
	
	
	
	
	public boolean getJudge() {
		return true;
	}
	
	public void setJudga(boolean judge) {
		this.judge = judge;
	}
}
