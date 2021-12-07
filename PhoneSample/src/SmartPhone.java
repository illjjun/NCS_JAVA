
public class SmartPhone extends Phone {

	public SmartPhone(String owner) {
			super(owner);
	}
	
	public void InternetSearch() {
		System.out.println("인터넷 검색을 활성화.");
	}
	
	public void turnOn() {
	System.out.println("스마트폰 전원을 켭니다.");
}

	public void turnOff() {
	System.out.println("스마트폰 전원을 종료합니다.");
}
	
}
