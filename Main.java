import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // khai báo hàm người dùng nhập
        Scanner scanner = new Scanner(System.in);
        // khai báo các biến toàn cục
        int number;
        String end;
        // vòng lặp do - while
        do {
            System.out.println("Vui lòng nhập 1 số từ 0 ~ 9:");
            number = scanner.nextInt();
            // người dùng nhập số lơn hơn 9 or nhỏ hơn 0 thì cho nhập lại
            // vòng lặp while
            while (number > 9 || number < 0){
                System.out.println("bạn đã nhập sai, vui lòng nhập từ 0 ~ 9");
                number = scanner.nextInt();
            }
            // khi người dùng nhập 0 thì dừng chương trình
            if (number==0){
                System.out.println("kết thúc chương trình");
                break;
            }
            // vòng lặp for (bảng cưu chương * từ 0 đến 9)
            for (int a = 0; a < 10; a++){
                // in ra bảng cửu chương
                System.out.println(number+"*"+a+" = "+number*a);
            }
            // in ra câu hỏi
            System.out.println("Do you want to continues?(Y/N)");
            scanner.nextLine();
            end = scanner.nextLine();
        // tiếp tục hay dừng lại
        }while ("Y".equalsIgnoreCase(end));
    }
}