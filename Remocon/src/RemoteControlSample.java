
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
		
		
		//익명 구현 클래스
		/*Remotecontrol rc=new Remotecontrol() {
			private int volume;
			public void turnOn() {
				System.out.println("오디오를 켭니다");
			}
			@Override
			public void turnOff() {
				System.out.println("오디오를 끕니다");
				
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
		//부모클래스명 변수(인스턴스)=new 자식클래스명
		//추상클래스명 변수(인스턴스)=new 자식클래스명
		//인터페이스명 변수(인스턴스)=new 구현클래스명
	}

}
