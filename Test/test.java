package Test;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
       try {
           // DEKLARASI
           int total = 0;

           // INPUT USER
           Scanner input = new Scanner(System.in);
           System.out.println("===== WELCOME TO JASA MARGA =====");
           System.out.println("1. Sistem Terbuka");
           System.out.println("2. Sistem Tertutup");
           System.out.println("3. Sistem Terbuka (Ruas relokasi Porong - Gempol");
           System.out.println("   a. Porong - Kejapanan  ");
           System.out.println("   b. Kejapanan - Gempol  ");
           System.out.println("Masukan sistem penggunaan jalan tol : ");
           String stm = input.next();
           System.out.println("Masukan golongan kendaraan anda :\t");
           int gol = input.nextInt();
           System.out.println("Masukan asal kota anda :\t");
           String asal = input.next();
           System.out.println("Masukan tujuan kota anda :\t");
           String keluar = input.next();



           // SELEKSI KONDISI
           switch(stm) {
               // SISTEM TERBUKA
               case "satu" :
                   switch (asal) {
                       case "Waru":
                           switch (keluar) {
                               case "Sidoarjo":
                                   if (gol == 1) total += 5000;
                                   else if (gol == 2 || gol == 3) total += 8000;
                                   else if (gol == 4 || gol == 5) total += 10500;
                                   else throw new Exception("TERDAPAT KESALAHAN PADA CASE WARU-SIDOARJO!");
                                   break;
                           }
                           break;
                   }

                   // SISTEM TERTUTUP
               case "dua" :
               switch (asal) {
                   case "Waru":
                       switch (keluar) {
                           case "Sidoarjo":
                               if (gol == 1) total += 6000;
                               else if (gol == 2 || gol == 3) total += 9000;
                               else if (gol == 4 || gol == 5) total += 12000;
                               else throw new Exception("TERDAPAT KESALAHAN PADA CASE WARU-SIDOARJO!");
                               break;
                           case "Porong":
                               if (gol == 1) total += 9000;
                               else if (gol == 2 || gol == 3) total += 14000;
                               else if (gol == 4 || gol == 5) total += 18500;
                               else throw new Exception("TERDAPAT KESALAHAN PADA CASE WARU-PORONG!");
                               break;
                       }
                       break;
                   case "Sidorajo" :
                       switch (keluar) {
                           case "Waru":
                               if (gol == 1) total += 6000;
                               else if (gol == 2 || gol == 3) total += 9000;
                               else if (gol == 4 || gol == 5) total += 12000;
                               else throw new Exception("TERDAPAT KESALAHAN PADA CASE WARU-SIDOARJO!");
                               break;
                           case "Porong":
                               if (gol == 1) total += 5500;
                               else if (gol == 2 || gol == 3) total += 8500;
                               else if (gol == 4 || gol == 5) total += 11500;
                               else throw new Exception("TERDAPAT KESALAHAN PADA CASE WARU-PORONG!");
                               break;
                       }
                       break;
                   case "Porong":
                       switch (keluar) {
                           case "Sidoarjo":
                               if (gol == 1) total += 5500;
                               else if (gol == 2 || gol == 3) total += 8500;
                               else if (gol == 4 || gol == 5) total += 11500;
                               else throw new Exception("TERDAPAT KESALAHAN PADA CASE WARU-SIDOARJO!");
                               break;
                           case "Waru":
                               if (gol == 1) total += 9000;
                               else if (gol == 2 || gol == 3) total += 14000;
                               else if (gol == 4 || gol == 5) total += 18500;
                               else throw new Exception("TERDAPAT KESALAHAN PADA CASE WARU-PORONG!");
                               break;
                       }
                       break;
                   default:
                       throw new Exception("TERDAPAT KESALAHAN PADA SWITCH CASE KELUAR");
               }
                   //  SISTEM TERBUKA (RUAS RELOKASI PORONG - GEMPOL)
               case "tiga" :
                   switch (asal) {
                       case "tiga a":
                           if (gol == 1) total += 6000;
                           else if (gol == 2 || gol == 3) total += 8500;
                           else if (gol == 4 || gol == 5) total += 11500;
                           else throw new Exception("TERDAPAT KESALAHAN PADA CASE WARU-SIDOARJO!");
                           break;

                           case "tiga b":
                               if (gol == 1) total += 3000;
                               else if (gol == 2 || gol == 3) total += 5000;
                               else if (gol == 4 || gol == 5) total += 6500;
                               else throw new Exception("TERDAPAT KESALAHAN PADA CASE WARU-PORONG!");
                               break;

                   }
                   break;
               default:
                   throw new Exception("TERDAPAT KESALAHAN PADA SWITCH CASE MASUK");
           }


           // OUTPUT
           System.out.println("\t====== Print Out Info ======");
           System.out.println("GOL. Kendaraan       \t:" + gol);
           System.out.println("Daerah Masuk         \t:" + asal);
           System.out.println("Daerah Keluar        \t:" + keluar);
           System.out.println("Total Tagihan        \t:" + total);



     } catch (Exception e) {
           e.printStackTrace();
       }
    }
}