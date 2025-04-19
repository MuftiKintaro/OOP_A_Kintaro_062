public class adminclass extends userclass {
    private final String username = "MuftiKintaro";
    private final String password = "Mufti062";

    public adminclass(String username, String password) {
        super(username, password);
    }

    @Override
    public boolean login(String username, String password) {
        return this.username.equals(username) && this.password.equals(password);
    }
    @Override
    public void DisplayInfo(){
        System.out.println("======================");
        System.out.println("========Admin=======\n");
        System.out.println("Nama : " + username);
        System.out.println("Anda login sebagai admin");
    }
}
