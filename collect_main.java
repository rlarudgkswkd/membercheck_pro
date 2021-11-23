package collect_app;

import java.util.Scanner;

public class collect_main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        menu_class mc = new menu_class();
        while(true){
            int menu_sel = 0;
            System.out.println();
            System.out.println("===hwajeong collect program===");
            System.out.println();
            System.out.println("1. 인원 등록");
            System.out.println("2. 인원 조회");
            System.out.println("3. 인원 삭제");
            System.out.println("4. 인원 계수");
            System.out.println("0. 종료");
            System.out.println();
            System.out.print("번호 입력 : ");
            menu_sel = sc.nextInt();
            switch (menu_sel) {
                case 1:
                    System.out.println(menu_sel+"번 선택");
                    
                    break;
                case 2:
                    System.out.println(menu_sel+"번 선택");
                    break;
                case 3:
                    System.out.println(menu_sel+"번 선택");
                    break;
                case 4:
                    System.out.println(menu_sel+"번 선택");
                    break;
                default:
                    break;
            }
            if(menu_sel==0){
                System.out.println("종료");
                break;
            }
        }
        sc.close();
        
    }
}
