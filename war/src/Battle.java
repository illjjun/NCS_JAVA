
public class Battle {

	public static void main(String[] args) {
		Soldier Solid = new Soldier(50,200);
		Warrior warri = new Warrior(50,200);
		int Solid_Attack;
		int warri_Attack;
		System.out.println("War started");
		while(Solid.getHP()>0 &&
				warri.getHP()>0) {
				Solid_Attack = (int)(Math.random()*2);
				warri_Attack = (int)(Math.random()*2);
			try {
				if(Solid_Attack==1) {
				Solid.attack(warri);
				Thread.sleep(1000);
				}
				else {
					System.out.println("������ ���ݿ� �����߽��ϴ�.");
					Thread.sleep(1000);
				}
				if(warri_Attack==1) {
					warri.attack(Solid);
					Thread.sleep(1000);
				}
				else {
					System.out.println("����� ���ݿ� �����߽��ϴ�.");
					Thread.sleep(1000);
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			System.out.println("---------------------");
			
		}
		if(Solid.getHP()>0) {
			System.out.println("�¸� : ����");
			System.out.println("����ü�� : "+Solid.getHP());
		}else if(warri.getHP()>0) {
			System.out.println("�¸� : ������");
			System.out.println("����ü�� : "+warri.getHP());
		}else {
			System.out.println("���º�!");
		}
	}

}
