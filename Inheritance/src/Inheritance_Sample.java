
public class Inheritance_Sample {

	public static void main(String[] args) {
		Car car = new Car();
		
		for(int i=0; i<5;i++) {
			int punk = car.run();
			switch(punk) {
			case 1: //�տ�
				System.out.println("�� ���� ���� �ѱ�Ÿ�̾�� ��ü");
				car.tires[punk-1]=new HankookTire(15,"�տ���");
				break;
			case 2://�տ���
				System.out.println("�� ������ ���� ��ȣŸ�̾�� ��ü");
				car.tires[punk-1]=new KumhoTire(13,"�տ���");
				break;
			case 3://�ڿ�
				System.out.println("�� ���� ���� �ѱ�Ÿ�̾�� ��ü");
				car.tires[punk-1]=new HankookTire(14,"�ڿ���");
				break;
			case 4://�ڿ���
				System.out.println("�� ������ ���� ��ȣŸ�̾�� ��ü");
				car.tires[punk-1]=new KumhoTire(17,"�տ���");
				break;
			}
			System.out.println("-----------------------------------------");
		}
		
	}

}
