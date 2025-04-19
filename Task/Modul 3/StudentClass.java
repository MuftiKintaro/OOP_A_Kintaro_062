public class StudentClass extends userclass{
    private String Nama = "Muhammad Mufti Kintaro";
    public StudentClass(String Student_Id, String Nama) {
        super(Student_Id, Nama); //untuk memanggil constructor yang ada di userclass
        setStudent_Id("202410370110062");
        setName("2006132413");
    }
    public String getNama(){
        return Nama;
    }
    @Override
        public boolean login(String Student_Id, String Name){
        return this.getStudent_Id().equals(getStudent_Id()) && this.getName().equals(getName());
    }
    @Override
    public void DisplayInfo(){
        System.out.println("=======================");
        System.out.println("======Informasi Pelajar======");
        System.out.println("Nama: " + getNama());
        System.out.println("NIM : " + getStudent_Id());
    }
}
