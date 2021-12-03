
public class Warrior {
	private int AP;
	private int HP;
	
	
	
	public Warrior(int AP, int HP) {
		this.AP = AP;
		this.HP = HP;
	}
	public int getAP() {
		return AP;
	}
	public void setAP(int AP) {
		this.AP = AP;
	}
	public int getHP() {
		return HP;
	}
	
	public void setHP(int AP) {
		this.HP-=AP;
		System.out.println("워리어의 남은 체력 : " + this.HP);
	}
	public void attack(Soldier s) {
		int attackPoint =(int) (Math.random()*this.AP);
		System.out.println("워리어의 데미지 : "+attackPoint);
		s.setHP(attackPoint);
	}
	
}
