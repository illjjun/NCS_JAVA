
public class Tire {

	public int maxRotation; //최대 회전수 ( 수명 )
	public int pastRotation; //누적 회전수
	public String location; //타이어의 위치
	
	public Tire() {}
	
	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	public boolean roll() {
		++pastRotation;
		if(pastRotation<maxRotation) {
			System.out.println("타이어의 남은 수명"+(this.maxRotation-this.pastRotation)+"회");
			return true;
		}else {
			System.out.println("***"+this.location+"타이어 펑크***");
			return false;
		}
	}
	
}
