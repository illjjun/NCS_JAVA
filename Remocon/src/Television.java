//implements == �����ϴ� 
// Remotecontrol���ִ³����� TelevisionŬ�������� �����ߴ�.
public class Television implements Remotecontrol{
	private int volume;
	
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");	
	}
	public void setVolume(int v) {
		if(v>Remotecontrol.MAX_VOLUME) {
			this.volume=Remotecontrol.MAX_VOLUME;
		}else if(v<Remotecontrol.MIN_VOLUME) {
			this.volume=Remotecontrol.MIN_VOLUME;
		}else {
			this.volume=v;
		}
		System.out.println("���� ���� : "+this.volume);
	}
}
