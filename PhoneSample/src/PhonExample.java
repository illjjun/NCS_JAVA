
public class PhonExample {

	public static void main(String[] args) {
		// Phone phone = new Phone("홍길동");
		// 추상 클래스로는 new연산자를 이용해서 인스턴스 변수를 생성할 수 없다.
		SmartPhone smartphone = new SmartPhone("홍길동");

		smartphone.turnOn();
		smartphone.InternetSearch();
		smartphone.turnOff();
		
		CellPhone cellphone = new CellPhone("허 준");
		cellphone.turnOn();
		cellphone.YoutubeSearch();
		cellphone.turnOff();
	}

}
