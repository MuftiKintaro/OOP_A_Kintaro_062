package CodelabModule5;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
import java.util.InputMismatchException;

public class Main {
    public static void main(String[] args) {
        ArrayList<Item> itemList = new ArrayList<>();
        Scanner objInput = new Scanner(System.in);
        int choice;
        String name;
        int stock;

        while (true){
            System.out.println("===Item Stock Management===");
            System.out.println("1. Tambahkan Item");
            System.out.println("2. Lihat Item");
            System.out.println("3. Kurangi Stock item");
            System.out.println("0. Exit");

         try {

             System.out.print("Masukkan Pilihan Anda: ");
             choice = objInput.nextInt();
             objInput.nextLine();

             switch (choice) {
                 case 1:
                     System.out.print("Masukkan Nama Barang: ");
                     name = objInput.nextLine();

                     try {
                         System.out.print("Masukkan Jumlah Stock Barang: ");
                         stock = objInput.nextInt();
                         objInput.nextLine();
                         Item newItem = new Item(name, stock);
                         itemList.add(newItem);
                         System.out.println(color.GREEN + "Item Berhasil Ditambahkan\n" + color.RESET);
                     } catch (InputMismatchException e) {
                         System.out.println(color.RED + "Wajib memasukkan angka pada inputan stock!!\n" + color.RESET);

                     }
                     break;
                 case 2:
                     if (itemList.isEmpty()) {
                         System.out.println(color.YELLOW + "Item tidak tersedia" + color.RESET);
                     } else {
                         System.out.println("Item yang tersedia: ");
                         Iterator<Item> iterator = itemList.iterator();
                         while (iterator.hasNext()) {
                             Item item = iterator.next();
                             System.out.println(item.getName() + " (Stock: " + item.getStock() + ")\n");
                         }
                     }
                     break;
                 case 3:
                     if (itemList.isEmpty()) {
                         System.out.println(color.YELLOW + "Stock Item tidak tersedia untuk dikurangi" + color.RESET);
                         break;
                     }
                     System.out.println("Item tersedia: ");
                     for (int i = 0; i < itemList.size(); i++) {
                         Item item = itemList.get(i);
                         System.out.println(i + "." + item.getName() + "(" + item.getStock() + ")");
                     }
                     try {
                         System.out.print("Masukkan index item: ");
                         int index = objInput.nextInt();
                         System.out.print("berapa banyak yang ingin dikurangi: ");
                         int jumlah = objInput.nextInt();
                         objInput.nextLine();

                         if (index < 0 || index >= itemList.size()) {
                             throw new IndexOutOfBoundsException(color.RED + "Index Item tidak tersedia\n" + color.RESET);
                         }
                         Item pilihan = itemList.get(index);

                         if (jumlah > pilihan.getStock()) {
                             throw new InsufficientStockException("Stock untuk " + pilihan.getName() + " hanya " + pilihan.getStock());
                         }

                         pilihan.setStock(pilihan.getStock()-jumlah);
                         System.out.println(color.GREEN + "Stock berhasil dikurangi: " + jumlah + " Sisa stok adalah: "+pilihan.getStock() + color.RESET + "\n");

                     } catch (InputMismatchException e) {
                         System.out.println(color.RED + "\nInput harus angka!\n" + color.RESET);
                     } catch (IndexOutOfBoundsException e) {
                         System.out.println(color.RED + "Error: " + e.getMessage() + color.RESET);
                     } catch (InsufficientStockException e) {
                         System.out.println(color.RED + "\nError: " + e.getMessage() + color.RESET);
                     }
                     break;
                 case 0:
                     System.out.println("=== \uD83D\uDE4F Terima Kasih \uD83D\uDE4F ===");
                     return;
                 default:
                     System.out.println(color.RED + "\nPilihan tidak tersedia, coba lagi.\n" + color.RESET);
             }
         }catch (InputMismatchException e) {
             System.out.println(color.RED + "\nMohon masukkan angka.\n" + color.RESET);
         }
        }
    }
}
