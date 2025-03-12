public class Hewan { //class
    String Name, Type, Sound; // atribut dengan type data string

    void info(){ //ini adalah method menggunakan void (tidak mengembalikan nilai apapun)
        System.out.println("Name: " + Name); //untuk mencektak atau menampilkan nama hewan
        System.out.println("Type: "+ Type); // untuk mencetak atau menampilkan tipe hewan
        System.out.println("Sound: "+ Sound); // untuk menampilkan suara hewan
    }
}