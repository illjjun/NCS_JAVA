
public class Car {
//	Tire frontLeft;
//	Tire frontRight;
//	Tire backLeft;
//	Tire backRight;
	
	Tire[] tires= {
			new Tire(6,"앞왼쪽"),
			new Tire(2,"앞오른쪽"),
			new Tire(3,"뒤왼쪽"),
			new Tire(4,"뒤오른")
	};
	
	public Car() {}

	void stop() {
		System.out.println("[자동차 STOP]");
	}
	
	int run() {
		System.out.println("[자동차 RUN]");
		
		for(int i=0; i<tires.length;i++) {
			if(!tires[i].roll()) {stop(); return i+1;}
		}
		return 0;
		
	}
//	String company;
//	String model;
//	String color;
//	int nMaxSpeed;
//	int nSpeed;
//	
//	public Car() {
//		this.color="green";
//	}
//	
//	public Car(String company, String model,String color, int nMaxSpeed,int nSpeed) {
//		this.company=company;
//		this.model=model;
//		this.color=color;
//		this.nMaxSpeed=nMaxSpeed;
//		this.nSpeed=nSpeed;
//	}
//	
//	void drive(int speed) {
//		this.nSpeed=speed;
//	}
//	void stop() {
//		this.nSpeed=0;
//	}

}
