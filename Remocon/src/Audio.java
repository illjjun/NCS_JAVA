
public class Audio implements Remotecontrol {
	private int volume;
	
	public void turnOn() {
		System.out.println("오디오를 켭니다.");
	}
	public void turnOff() {
		System.out.println("오디오를 끕니다.");	
	}
	public void setVolume(int v) {
		if(v>Remotecontrol.MAX_VOLUME) {
			this.volume=Remotecontrol.MAX_VOLUME;
		}else if(v<Remotecontrol.MIN_VOLUME) {
			this.volume=Remotecontrol.MIN_VOLUME;
		}else {
			this.volume=v;
		}
		System.out.println("현재 오디오의 볼륨 : "+this.volume);
	}
}
