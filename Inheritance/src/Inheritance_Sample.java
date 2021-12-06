
public class Inheritance_Sample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=0; i<5;i++) {
			int punk = car.run();
			switch(punk) {
			case 1: //앞왼
				System.out.println("앞 왼쪽 바퀴 한국타이어로 교체");
				car.tires[punk-1]=new HankookTire(15,"앞왼쪽");
				break;
			case 2://앞오른
				System.out.println("앞 오른쪽 바퀴 금호타이어로 교체");
				car.tires[punk-1]=new KumhoTire(13,"앞오른");
				break;
			case 3://뒤왼
				System.out.println("뒤 왼쪽 바퀴 한국타이어로 교체");
				car.tires[punk-1]=new HankookTire(14,"뒤왼쪽");
				break;
			case 4://뒤오른
				System.out.println("뒤 오른쪽 바퀴 금호타이어로 교체");
				car.tires[punk-1]=new KumhoTire(17,"앞왼쪽");
				break;
			}
			System.out.println("-----------------------------------------");
		}
		
	}

}
