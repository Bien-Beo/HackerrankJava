import java.util.HashMap;
import java.util.Scanner;

public class HasMapJV {
    public static void main(String[] args) {
        //Tạo HashMap chứa các thông tin user name và password
        HashMap<String, String> users = new HashMap<>();
        users.put("bienbeo", "123456");
        users.put("user1", "xyz");
        users.put("user2", "abc");

        Scanner in = new Scanner(System.in);
        System.out.println("Nhập user name: ");
        String userName = in.nextLine();
        System.out.println("Nhập password: ");
        String passWord = in.nextLine();

        //Kiểm tra các trường hợp đăng nhập
        if (!users.containsKey(userName)) {
            //Nếu không có Key trong HashMap users : user không tồn tại
            System.out.println("User name không tồn tại !");
        } else if (!users.get(userName).equals(passWord)) {
            //Nếu có Key mà Password sai
            System.out.println("Đăng nhập thất bại !");
        } else {
            //Có Key và password đúng
            System.out.println("Đăng nhập thành công !");
        }
    }
}
