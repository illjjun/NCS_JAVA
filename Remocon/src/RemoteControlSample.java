
public class RemoteControlSample {

	public static void main(String[] args) {
		Television tv = new Television();
		
		tv.turnOn();
		tv.setVolume(7);
		tv.turnOff();
		
		Audio audio = new Audio();
		
		audio.turnOn();
		audio.setVolume(6);
		audio.setMute(false);
		audio.turnOff();
		
		Remotecontrol rc = new Television();
		
		int x=Remotecontrol.MAX_VOLUME; // correct
		int y=rc.MAX_VOLUME; 
		
		
		//�͸� ���� Ŭ����
		/*Remotecontrol rc=new Remotecontrol() {
			private int volume;
			public void turnOn() {
				System.out.println("������� �մϴ�");
			}
			@Override
			public void turnOff() {
				System.out.println("������� ���ϴ�");
				
			}
			@Override
			public void setVolume(int v) {
				if(v>Remotecontrol.MAX_VOLUME) {
					this.volume=Remotecontrol.MAX_VOLUME;
				}else if(v<Remotecontrol.MIN_VOLUME) {
					this.volume=Remotecontrol.MIN_VOLUME;
				}else {
					this.volume=v;
				}
			}
		};*/
		//parent child = new Child();
		//�θ�Ŭ������ ����(�ν��Ͻ�)=new �ڽ�Ŭ������
		//�߻�Ŭ������ ����(�ν��Ͻ�)=new �ڽ�Ŭ������
		//�������̽��� ����(�ν��Ͻ�)=new ����Ŭ������
	}

}
