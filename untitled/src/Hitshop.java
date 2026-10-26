import java.util.Scanner;
public class Hitshop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Ten mat hang: ");
        String TenMH=scanner.nextLine();
        System.out.println("Don gia: ");
        double dongia= scanner.nextDouble();
        System.out.println("Soluong: ");
        int Soluong= scanner.nextInt();
        double thanhtien=dongia*Soluong;
        System.out.println("Ten mat hang"+TenMH );
        System.out.println("Dongia: "+dongia);
        System.out.println("So luong: "+Soluong);
        System.out.println("Thanh tien"+thanhtien);
    }
}