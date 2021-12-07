//implements == 구현하다 
// Remotecontrol에있는내용을 Television클래스에서 구현했다.
public class Television implements Remotecontrol{
	private int volume;
	
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	public void turnOff() {
		System.out.println("TV를 끕니다.");	
	}
	public void setVolume(int v) {
		if(v>Remotecontrol.MAX_VOLUME) {
			this.volume=Remotecontrol.MAX_VOLUME;
		}else if(v<Remotecontrol.MIN_VOLUME) {
			this.volume=Remotecontrol.MIN_VOLUME;
		}else {
			this.volume=v;
		}
		System.out.println("현재 볼륨 : "+this.volume);
	}
}
