import java.util.Scanner;

public class admin {
    public String username;
    public String password;
    Scanner input = new Scanner(System.in);

    public void admin1() {
            System.out.println("======================================");
            System.out.print("Masukkan username: ");
            username = input.nextLine();
            System.out.print("Masukkan password: ");
            password = input.nextLine();

            if (username.equals("user062") && password.equals("admin062")) {
                System.out.println("Login Berhasil.");
            }
            else {
                System.out.println("Login gagal, silahkan coba lagi.");
            }
    }
}
