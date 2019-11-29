import java.util.Scanner;
 
public class CustomerManager {
    // ���α׷� ��ü���� ����� �������� Ŭ���� ��� �Ʒ��� �����մϴ�.
    // �迭�� ���̸� ���ȭ ��Ŵ.
    // ����� ������ ���� ���� �̸� �տ� static final�� ����.
    static final int MAX = 100;
    
    // static�� �پ��ִ� ���(�޼���)������  
    // static������ static�޼��常 ����� �� �ֽ��ϴ�.
     
    static int[] customer_UID = new int[MAX];
    static String[] customer_ID = new String[MAX];
    static String[] customer_PW = new String[MAX];
    static String[] customer_name = new String[MAX];
    static String[] customer_tel = new String[MAX];
    
    // ���� �� �����Ͱ� �� �� ����Ǿ����� �˱� ���� ���� count ����.
    static int count = 0;
    
    /*
        �迭�� �ε����� �����ϱ� ���� �ε����� ����ȭ ��Ŵ.
        �迭�� �ε����� 0������ �����ϹǷ� �ʱⰪ�� 0 �ٷ� ��������
    -1�� �����Ͽ� �ʱ⿡ next�� �������� �� 1�� �������Ͱ� �ƴ�
    0�� �������Ͱ� �����ϵ��� �ϱ� ����.
    */
    
    static int index = -1;
    
    static Scanner scan = new Scanner(System.in);
 
    public static void main(String[] args) {        
        
        while(true) {
            
            System.out.println("\n[INFO] ȸ����: " + count);
            System.out.println("--------------------------------------------");
            System.out.println("�޴��� �Է��ϼ���.");
            System.out.println("ȸ������(1), ȸ����������(2), ȸ��Ż��(3), ������(4)");
            System.out.println("--------------------------------------------");
            System.out.print("�޴� �Է�: ");
            String menu = scan.next();
            menu = menu.toLowerCase();
            char m = menu.charAt(0);
            
            switch(m) {
            
            case '1':
                System.out.println("\n�� ���� �Է��� �����մϴ�.");
                insertData();
                System.out.println("�� ������ ���������� �ԷµǾ����ϴ�.");
                break;
         
            case '2':
                if(index >= 0 && index < count) {
                    System.out.println(customer_UID[index] + "���� ������ �����մϴ�.");
                    updateData(index);
                    System.out.println("�� ������ ���������� �����Ǿ����ϴ�.");
                }else {
                    System.out.println("������ �����Ͱ� �������� �ʽ��ϴ�.");
                }
                break;
            case '3':
                if(index >= 0 && index < count) {
                    System.out.println(customer_UID[index] + "���� ������ �����մϴ�.");
                    deleteData(index);
                    System.out.println("�� ������ ���������� �����Ǿ����ϴ�.");
                }else {
                    System.out.println("������ �����Ͱ� �������� �ʽ��ϴ�.");
                }
                
                break;
            case '4':
                System.out.println("\n���α׷��� �����մϴ�.");
                scan.close();
                System.exit(0);//���α׷��� ���������ϴ� ����
                break;
            
            default:
                System.out.println("�޴��� �߸� �Է��߽��ϴ�.");
            }//end switch            
            
        }//end while
    }//end main method
    
    
    // �������� �Է¹޴� �޼��� ����.
    static void insertData() {
        
        System.out.println("========�� ���� �Է�========");
        
        System.out.println("ȸ����ȣ : ");
        int cus_UID = scan.nextInt();
        
        System.out.print("���̵�: ");
        String id = scan.next();
        
        System.out.print("��й�ȣ: ");
        String pw = scan.next();
        
        System.out.print("�̸�: ");
        String name = scan.next();
        
        System.out.print("��ȭ��ȣ: ");
        String tel = scan.next();
        
        System.out.println("===========================");
        
        customer_UID[count] = cus_UID;
        customer_ID[count] = id;
        customer_PW[count] = pw;
        customer_name[count] = name;
        customer_tel[count] = tel;
        
        count++;
    }
    
    // �� ������ ����ϴ� �޼��� ����.
    static void printData(int index) {
        
        System.out.println("\n======�� ����======");
        System.out.println("ȸ����ȣ: " + customer_UID[index]);
        System.out.println("���̵�: " + customer_ID[index]);
        System.out.println("��й�ȣ: " + customer_PW[index]);
        System.out.println("�̸�: " + customer_name[index]);
        System.out.println("��ȭ��ȣ: " + customer_tel[index]);
        System.out.println("=====================");
    }
    
    // �� ������ �����ϴ� �޼��� ����.
    static void updateData(int index) {
        
        System.out.println("\n========�� ���� ����========");
        System.out.print("ȸ����ȣ(" + customer_UID[index] + "): ");
        customer_UID[index] = scan.nextInt();
        
        System.out.print("���̵�(" + customer_ID[index] + "): ");
        customer_ID[index] = scan.next();
        
        System.out.print("��й�ȣ(" + customer_PW[index] + "): ");
        customer_PW[index] = scan.next();
        
        System.out.print("�̸�(" + customer_name[index] + "): ");
        customer_name[index] = scan.next();
        
        System.out.print("��ȭ��ȣ(" + customer_tel[index] + "): ");
        customer_tel[index] = scan.next();
    }
    
    // �� ������ �����ϴ� �޼��� ����.
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