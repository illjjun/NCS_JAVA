import java.util.Scanner;

public class CafeControl {

	public static void main(String[] args) {
		Menu menu=new Menu();
		Order order=new Order();
		
		Scanner Cafe=new Scanner(System.in);
		System.out.println("프로그램 시작");
		System.out.println("작업을 선택하시오.(X:종료,M:메뉴관리,O:주문관리,S:실적관리)");
		String C_X=Cafe.nextLine();
		while(!C_X.equals("X")) {
			
			if(C_X.equals("M")) {
				menu.Handling();
		}
			else if(C_X.equals("O")) {
				System.out.println("주문관리");
				order.Handling(menu);
			
		}
			else if(C_X.equals("S")) {
				System.out.println("실적관리");
				order.all_display();
		}
			else {
				System.out.println("명령어가 틀렸습니다.");
				System.out.println("다시입력하세요.");
			}
		System.out.println("작업을 선택하시오.(X:종료,M:메뉴관리,O:주문관리,S:실적관리)");
		C_X=Cafe.nextLine(); //다시 입력받기
		}
	}

}
