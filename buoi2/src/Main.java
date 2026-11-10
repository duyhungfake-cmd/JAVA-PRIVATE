import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class Main {
    static final List<Student> students = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        Car car01=new Car("CAR01","Lamborghini","30A-12345");
        Car car02=new Car("Car02","Toyota","30B-67890");
        Student sv1=new Student("SV01","Khanh",20,car01);
        Student sv2=new Student("SV02","AN",19,car02);
        int choice;
        do {
            System.out.println("1. Thêm sinh viên");
            System.out.println("2. Xóa sinh viên");
            System.out.println("3. Sửa sinh viên");
            System.out.println("4. Giới thiệu sinh viên tên Khánh");
            System.out.println("5. Tìm sinh viên có ô tô hãng Lamborghin");
            System.out.println("0. Thoát");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 ->
                        System.out.println("Đang thêm");
                case 2 -> System.out.println("Đang xóa");
                case 3 -> System.out.println("Đang xem giỏ");
                case 4 -> System.out.println("Đang tính tổng");
                case 0 -> System.out.println("Kết thúc.");
                default -> System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 0);
    }
}
