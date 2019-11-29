import java.util.Scanner;
 
public class CustomerManager {
    // 프로그램 전체에서 사용할 변수들을 클래스 블록 아래에 선언합니다.
    // 배열의 길이를 상수화 시킴.
    // 상수를 선언할 때는 변수 이름 앞에 static final을 붙임.
    static final int MAX = 100;
    
    // static이 붙어있는 블록(메서드)에서는  
    // static변수와 static메서드만 사용할 수 있습니다.
     
    static int[] customer_UID = new int[MAX];
    static String[] customer_ID = new String[MAX];
    static String[] customer_PW = new String[MAX];
    static String[] customer_name = new String[MAX];
    static String[] customer_tel = new String[MAX];
    
    // 현재 고객 데이터가 몇 개 저장되었는지 알기 위한 변수 count 선언.
    static int count = 0;
    
    /*
        배열의 인덱스를 조작하기 위해 인덱스를 변수화 시킴.
        배열의 인덱스는 0번부터 시작하므로 초기값을 0 바로 이전값인
    -1로 세팅하여 초기에 next를 실행했을 때 1번 고객데이터가 아닌
    0번 고객데이터가 등장하도록 하기 위함.
    */
    
    static int index = -1;
    
    static Scanner scan = new Scanner(System.in);
 
    public static void main(String[] args) {        
        
        while(true) {
            
            System.out.println("\n[INFO] 회원수: " + count);
            System.out.println("--------------------------------------------");
            System.out.println("메뉴를 입력하세요.");
            System.out.println("회원가입(1), 회원정보수정(2), 회원탈퇴(3), 나가기(4)");
            System.out.println("--------------------------------------------");
            System.out.print("메뉴 입력: ");
            String menu = scan.next();
            menu = menu.toLowerCase();
            char m = menu.charAt(0);
            
            switch(m) {
            
            case '1':
                System.out.println("\n고객 정보 입력을 시작합니다.");
                insertData();
                System.out.println("고객 정보가 정상적으로 입력되었습니다.");
                break;
         
            case '2':
                if(index >= 0 && index < count) {
                    System.out.println(customer_UID[index] + "님의 정보를 수정합니다.");
                    updateData(index);
                    System.out.println("고객 정보가 정상적으로 수정되었습니다.");
                }else {
                    System.out.println("수정할 데이터가 존재하지 않습니다.");
                }
                break;
            case '3':
                if(index >= 0 && index < count) {
                    System.out.println(customer_UID[index] + "님의 정보를 삭제합니다.");
                    deleteData(index);
                    System.out.println("고객 정보가 정상적으로 삭제되었습니다.");
                }else {
                    System.out.println("삭제할 데이터가 존재하지 않습니다.");
                }
                
                break;
            case '4':
                System.out.println("\n프로그램을 종료합니다.");
                scan.close();
                System.exit(0);//프로그램을 강제종료하는 구문
                break;
            
            default:
                System.out.println("메뉴를 잘못 입력했습니다.");
            }//end switch            
            
        }//end while
    }//end main method
    
    
    // 고객정보를 입력받는 메서드 선언.
    static void insertData() {
        
        System.out.println("========고객 정보 입력========");
        
        System.out.println("회원번호 : ");
        int cus_UID = scan.nextInt();
        
        System.out.print("아이디: ");
        String id = scan.next();
        
        System.out.print("비밀번호: ");
        String pw = scan.next();
        
        System.out.print("이름: ");
        String name = scan.next();
        
        System.out.print("전화번호: ");
        String tel = scan.next();
        
        System.out.println("===========================");
        
        customer_UID[count] = cus_UID;
        customer_ID[count] = id;
        customer_PW[count] = pw;
        customer_name[count] = name;
        customer_tel[count] = tel;
        
        count++;
    }
    
    // 고객 정보를 출력하는 메서드 선언.
    static void printData(int index) {
        
        System.out.println("\n======고객 정보======");
        System.out.println("회원번호: " + customer_UID[index]);
        System.out.println("아이디: " + customer_ID[index]);
        System.out.println("비밀번호: " + customer_PW[index]);
        System.out.println("이름: " + customer_name[index]);
        System.out.println("전화번호: " + customer_tel[index]);
        System.out.println("=====================");
    }
    
    // 고객 정보를 수정하는 메서드 선언.
    static void updateData(int index) {
        
        System.out.println("\n========고객 정보 수정========");
        System.out.print("회원번호(" + customer_UID[index] + "): ");
        customer_UID[index] = scan.nextInt();
        
        System.out.print("아이디(" + customer_ID[index] + "): ");
        customer_ID[index] = scan.next();
        
        System.out.print("비밀번호(" + customer_PW[index] + "): ");
        customer_PW[index] = scan.next();
        
        System.out.print("이름(" + customer_name[index] + "): ");
        customer_name[index] = scan.next();
        
        System.out.print("전화번호(" + customer_tel[index] + "): ");
        customer_tel[index] = scan.next();
    }
    
    // 고객 정보를 삭제하는 메서드 선언.
    static void deleteData(int index) {
        
        for(int i=index; i<count-1; i++) {
        	customer_UID[i] = customer_UID[i+1];
        	customer_ID[i] = customer_ID[i+1];
        	customer_PW[i] = customer_PW[i+1];
        	customer_name[i] = customer_name[i+1];
        	customer_tel[i] = customer_tel[i+1];
        }
        count--;
    }
 
}//end class