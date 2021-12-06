
public class Tire {

	public int maxRotation; //�ִ� ȸ���� ( ���� )
	public int pastRotation; //���� ȸ����
	public String location; //Ÿ�̾��� ��ġ
	
	public Tire() {}
	
	public Tire(int maxRotation, String location) {
		this.maxRotation = maxRotation;
		this.location = location;
	}
	
	public boolean roll() {
		++pastRotation;
		if(pastRotation<maxRotation) {
			System.out.println("Ÿ�̾��� ���� ����"+(this.maxRotation-this.pastRotation)+"ȸ");
			return true;
		}else {
			System.out.println("***"+this.location+"Ÿ�̾� ��ũ***");
			return false;
		}
	}
	
}
