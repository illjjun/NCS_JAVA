
public interface Remotecontrol {
	//�������̽��� �ʵ尡����. (������ ����). ��� ���𰡴�
	//�������̽��� ��� ������ �ϸ� static ����� �ȴ�
	//�����ڰ� ����.
	//�޼ҵ常 �ִ�. (�߻�޼ҵ�/ ����Ʈ�޼ҵ�/ ���� �޼ҵ�)
	public static final double pi=3.14159;
	public int MAX_VOLUME=10;
	public int MIN_VOLUME=0;
	void turnOn(); //�ƹ��͵� ������� �߻�޼ҵ�
	void turnOff();
	void setVolume(int volume);
	//default(�⺻) �޼ҵ� - �Ϲ� Ŭ������ �޼ҵ�
	default void setMute(boolean mute) { //�Ϲ�Ŭ������ �޼ҵ�� ����
		if(mute) {
		System.out.println("����ó��");
		}else {
			System.out.println("��������");
		}
	}
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
