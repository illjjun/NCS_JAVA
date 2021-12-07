
public interface Remotecontrol {
	//인터페이스는 필드가없다. (변수가 없다). 상수 선언가능
	//인터페이스에 상수 선언을 하면 static 취급이 된다
	//생성자가 없다.
	//메소드만 있다. (추상메소드/ 디폴트메소드/ 정적 메소드)
	public static final double pi=3.14159;
	public int MAX_VOLUME=10;
	public int MIN_VOLUME=0;
	void turnOn(); //아무것도 안적어야 추상메소드
	void turnOff();
	void setVolume(int volume);
	//default(기본) 메소드 - 일반 클래스의 메소드
	default void setMute(boolean mute) { //일반클래스의 메소드와 동일
		if(mute) {
		System.out.println("무음처리");
		}else {
			System.out.println("무음해제");
		}
	}
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
