import java.util.Scanner;
public class task1modul2{
    public static void main(String[] args) {
        String choice;
        Scanner Objinput = new Scanner(System.in);
        admin adminlogin = new admin();
        Student studentlogin = new Student();

        System.out.println("Pilihan login");
        System.out.println("1. Admin ");
        System.out.println("2. Student ");
        System.out.print("Masukkan Pilihan anda: ");
        choice = Objinput.nextLine();
        switch (choice){
            case "1":
                adminlogin.admin1();
                break;
            case "2":
                studentlogin.Student1();
            default:
        }

    }
}
