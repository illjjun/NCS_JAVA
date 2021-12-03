import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
	//멤버 선언
	private ArrayList<String> alMenu;
	private ArrayList<Integer> alPrice;

	public String getAlMenu(int ndx) {
		return this.alMenu.get(ndx);
	}
	public int getAlPrice(int ndx) {
		return this.alPrice.get(ndx);
	}
	//생산자 정의
	public Menu(){
		alMenu = new ArrayList<String>();
		alPrice = new ArrayList<Integer>();
		//메뉴이름					가격
		File f=new File("C:\\Temp1\\menu.txt");
		try {
			FileReader fr= new FileReader(f);
			BufferedReader br = new BufferedReader(fr);
			try {
				String line=br.readLine();
				while(line!=null) {
					String[] ar = line.split(",");
					this.alMenu.add(ar[0]);
					this.alPrice.add(Integer.parseInt(ar[1]));
					line = br.readLine();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}
	private void saveMenu() {
		File f=new File("C:\\Temp1\\menu.txt");
		try {
			FileWriter fw= new FileWriter(f);
			PrintWriter pw  = new PrintWriter(fw);
			for(int i=0;i<this.alMenu.size();i++) {
				pw.print(this.alMenu.get(i)+","+this.alPrice.get(i)+"\n");
						
			}
			pw.close();
		}catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	public void display() {
		//커피명, 가격 출력
		System.out.println("-----------메뉴판-----------");
		for(int i=0; i<alMenu.size();i++) {
			System.out.println((i+1)+". 메뉴:"+alMenu.get(i)+" "+"가격:"+alPrice.get(i));
			
	}
		
}
	private void display(String s) {
		for(int i=0;i<alMenu.size();i++) {
			System.out.println((i+1)+". 메뉴:"+alMenu.get(i)+" "+"가격:"+alPrice.get(i));
		}
		System.out.println(s);
		
	}
	
	private void display(int n) {
		   
		      for(int i=0; i<n; i++) {
		         System.out.println((i+1)+"메뉴 : "+alMenu.get(i)+" "+"가격 : "+alPrice.get(i));
		      }
	   }
	private void guide() {
		System.out.println("메뉴관리\n작업을 선택하시오.(X:종료,C:메뉴추가,R:메뉴목록표시,U:메뉴수정,D:메뉴삭제)");
	}
	
	private void add(String menu, int price) {
		alMenu.add(menu);
		alPrice.add(price);
		this.saveMenu();
	}
	
	private void update(int menu_num, String menu, int price) {
		alMenu.set(menu_num-1, menu);
		alPrice.set(menu_num-1, price);
		this.saveMenu();
	}
	
	private void remove(int menu_num) {
		alMenu.remove(menu_num-1);
		alPrice.remove(menu_num-1);
		this.saveMenu();
	}
	
	public void Handling() {
		Scanner Cafe=new Scanner(System.in);
					
				this.display();
				this.guide();
				String stm=Cafe.nextLine();
				while(!stm.equals("X")) {
					if(stm.equals("C")) 
					{
						Scanner ms=new Scanner(System.in);
						System.out.println("메뉴추가");
						System.out.print("새로운 메뉴이름을 입력하세요 :");
						String new_menuname=ms.nextLine();
						System.out.print("새로운 메뉴의 가격을 입력하세요:");
						int new_menuprice=ms.nextInt();
						this.add(new_menuname, new_menuprice);
						}
					else if(stm.equals("U")) 
					{
						Scanner ms=new Scanner(System.in);
						System.out.println("메뉴수정");
						System.out.print("수정할 메뉴의 번호를 입력하세요:");
						int menu_num=ms.nextInt();
						System.out.print("수정할 메뉴의 이름을 입력하세요:");
						String menu_name=ms.next();
						System.out.print("수정할 메뉴의 가격을 입력하세요:");
						int menu_price=ms.nextInt();
						this.update(menu_num, menu_name, menu_price);
						}
					else if(stm.equals("D")) 
					{
						Scanner ms=new Scanner(System.in);
						System.out.println("메뉴삭제");
						System.out.print("삭제할 메뉴의 번호를 입력하시오:");
						int menu_num=ms.nextInt();
						this.remove(menu_num);
						}
					this.display();
					this.guide();
					stm=Cafe.nextLine(); //다시입력받기
			}
		
		
	}
	
}



