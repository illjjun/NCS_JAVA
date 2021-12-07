
public abstract class Phone {
	public String owner;
	
	public Phone(String owner) {
		this.owner=owner;
	}
	
	public abstract void turnOn();
	public abstract void turnOff();
	//추상메소드와 Overriding
	//추상클래스 <- 추상메소드선언 <- 오버라이딩을 부담없이
}
