package Test;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Kurs {
    public static void main(String[]args){
        double rptousd = 0.00007407407;
 		Scanner input = new Scanner(System.in);
        System.out.println("Konversi Kurs Mata Uang Rupiah");
        System.out.print("----->");
        System.out.println("USD/Dolar US , RM/Ringgit Malay , SGD/ Dolar SG, EURO/ Posterling");
        System.out.println("_______________________________________________________");
        System.out.println("Info Kurs Harga");
        System.out.println("1 USD = Rp13.500");
        System.out.println("1 RM = Rp3.000");
        System.out.println("1 SGD = Rp10.000");
        System.out.println("1 EURO= Rp20.000");
        System.out.println("_______________________________________________________");
       System.out.print("Masukan nilai Rupiah= ");
        int rupiah = input.nextInt();
        double konversi_rptousd = rupiah*rptousd;
        if (rupiah >=135) {
            DecimalFormat digit = new DecimalFormat("0.00"); 
            System.out.println("Rp ----> USD ");
           String  dcikon = digit.format(konversi_rptousd);
            System.out.println("Rp"+rupiah+"="+dcikon+"USD");
           
        }
            else if (rupiah <135) {
            	DecimalFormat digit = new DecimalFormat("0.000000000");
            System.out.println("Rp ----> USD ");
            String  dcikon = digit.format(konversi_rptousd);
            System.out.println("Rp"+rupiah+"="+dcikon+"USD");
            //System.out.println(digit.format(konversi_rptousd));
               }
        double rptorm = 0.000333333;
         double konversi_rptorm = rupiah*rptorm;
        if (rupiah >=300) {
            DecimalFormat digit = new DecimalFormat("0.00"); 
            System.out.println("Rp ----> RM ");
           String  dcikon = digit.format(konversi_rptorm);
            System.out.println("Rp"+rupiah+"="+dcikon+"RM");
           
        }
            else if (rupiah <300) {
            	DecimalFormat digit = new DecimalFormat("0.000000000");
            System.out.println("Rp ----> RM ");
            String  dcikon = digit.format(konversi_rptorm);
            System.out.println("Rp"+rupiah+"="+dcikon+"RM");
            //System.out.println(digit.format(konversi_rptousd));
               }
        double rptosgd = 0.0001;
         double konversi_rptosgd = rupiah*rptosgd;
        if (rupiah >=100) {
            DecimalFormat digit = new DecimalFormat("0.00"); 
            System.out.println("Rp ----> SGD ");
           String  dcikon = digit.format(konversi_rptosgd);
            System.out.println("Rp"+rupiah+"="+dcikon+"SGD");
           
        }
            else if (rupiah <100) {
            	DecimalFormat digit = new DecimalFormat("0.000000000");
            System.out.println("Rp ----> SGD ");
            String  dcikon = digit.format(konversi_rptousd);
            System.out.println("Rp"+rupiah+"="+dcikon+"SGD");
            //System.out.println(digit.format(konversi_rptousd));
               }
        double rptoeuro = 0.00005;
         double konversi_rptoeuro = rupiah*rptoeuro;
        if (rupiah >=200) {
            DecimalFormat digit = new DecimalFormat("0.00"); 
            System.out.println("Rp ----> EURO ");
           String  dcikon = digit.format(konversi_rptoeuro);
            System.out.println("Rp"+rupiah+"="+dcikon+"EURO");
           
        } else if (rupiah <200) {
            DecimalFormat digit = new DecimalFormat("0.000000000");
            System.out.println("Rp ----> EURO ");
            String  dcikon = digit.format(konversi_rptoeuro);
            System.out.println("Rp"+rupiah+"="+dcikon+"EURO");
            //System.out.println(digit.format(konversi_rptousd));
            }
        input.close();
    }
    
}