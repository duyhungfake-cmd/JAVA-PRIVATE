import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Hitshop {
    static final List<String> names = new ArrayList<>();
    static final List<Double> prices = new ArrayList<>();
    static final List<Integer> quantities = new ArrayList<>();

    static void addItem(String name, double price, int quantity) {
        names.add(name);
        prices.add(price);
        quantities.add(quantity);
    }

    static void removeItem(int index) {
        if (index < 0 || index >= names.size()) {
            System.out.println("Không có");
            return;
        }
        names.remove(index);
        prices.remove(index);
        quantities.remove(index);
    }

    static void printItems() {
        for (int i = 0; i < names.size(); i++) {
            double lineTotal = prices.get(i) * quantities.get(i);
            System.out.printf("%d. %s | %.1f | SL: %d | Thành tiền: %.1f%n",
                    i + 1,
                    names.get(i),
                    prices.get(i),
                    quantities.get(i),
                    lineTotal);
        }
    }

    static double calculateTotal() {
        double total = 0;
        for (int i = 0; i < names.size(); i++) {
            total += prices.get(i) * quantities.get(i);
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("\n--- MENU ---");
            System.out.println("1. Thêm mặt hàng");
            System.out.println("2. Xóa mặt hàng");
            System.out.println("3. Xem giỏ");
            System.out.println("4. Xem tổng tiền");
            System.out.println("0. Thoát");
            System.out.print("Chọn: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Xóa bộ đệm dấu Enter thừa sau khi nhập số

            switch (choice) {
                case 1 -> {
                    // Yêu cầu đề: tên không rỗng, giá > 0, số lượng nguyên dương
                    System.out.print("Nhập tên mặt hàng: ");
                    String name = scanner.nextLine().trim();
                    System.out.print("Nhập giá: ");
                    double price = scanner.nextDouble();
                    System.out.print("Nhập số lượng: ");
                    int quantity = scanner.nextInt();

                    if (name.isEmpty() || price <= 0 || quantity <= 0) {
                        System.out.println("Dữ liệu không hợp lệ. Vui lòng thử lại!");
                    } else {
                        addItem(name, price, quantity);
                        System.out.println("Đã thêm vào giỏ hàng.");
                    }
                }
                case 2 -> {
                    System.out.print("Nhập số thứ tự mặt hàng muốn xóa: ");
                    int displayIndex = scanner.nextInt();
                    // Đề yêu cầu: Số thứ tự hiển thị từ 1, nên index thực tế là thứ tự - 1
                    removeItem(displayIndex - 1);
                }
                case 3 -> printItems();
                case 4 -> System.out.println("Tổng tiền giỏ hàng: " + calculateTotal());
                case 0 -> System.out.println("Kết thúc.");
                default -> System.out.println("Lựa chọn không hợp lệ.");
            }
        } while (choice != 0);
    }
}


