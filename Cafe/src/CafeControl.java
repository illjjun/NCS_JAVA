import java.util.Scanner;

public class CafeControl {

	public static void main(String[] args) {
		Menu menu=new Menu();
		Order order=new Order();
		
		Scanner Cafe=new Scanner(System.in);
		System.out.println("���α׷� ����");
		System.out.println("�۾��� �����Ͻÿ�.(X:����,M:�޴�����,O:�ֹ�����,S:��������)");
		String C_X=Cafe.nextLine();
		while(!C_X.equals("X")) {
			
			if(C_X.equals("M")) {
				menu.Handling();
		}
			else if(C_X.equals("O")) {
				System.out.println("�ֹ�����");
				order.Handling(menu);
			
		}
			else if(C_X.equals("S")) {
				System.out.println("��������");
				order.all_display();
		}
			else {
				System.out.println("��ɾ Ʋ�Ƚ��ϴ�.");
				System.out.println("�ٽ��Է��ϼ���.");
			}
		System.out.println("�۾��� �����Ͻÿ�.(X:����,M:�޴�����,O:�ֹ�����,S:��������)");
		C_X=Cafe.nextLine(); //�ٽ� �Է¹ޱ�
		}
	}

}
