
public class PhonExample {

	public static void main(String[] args) {
		// Phone phone = new Phone("ȫ�浿");
		// �߻� Ŭ�����δ� new�����ڸ� �̿��ؼ� �ν��Ͻ� ������ ������ �� ����.
		SmartPhone smartphone = new SmartPhone("ȫ�浿");

		smartphone.turnOn();
		smartphone.InternetSearch();
		smartphone.turnOff();
		
		CellPhone cellphone = new CellPhone("�� ��");
		cellphone.turnOn();
		cellphone.YoutubeSearch();
		cellphone.turnOff();
	}

}
