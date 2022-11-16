import java.util.Scanner;
public class Usia {
    public static void main(String args[]){
        Scanner  in= new Scanner(System.in);

        int umur;
        System.out.println("Masukkan Umur Anda : ");
        umur=in.nextInt();

        if(umur>60){
            System.out.println("Lansia");
        }
        else if(umur>45){
            System.out.println("Tua");
        }
         else if(umur>17){
            System.out.println("Dewasa");
        }
         else if(umur>5){
            System.out.println("Anak-Anak");
        }
         else{
            System.out.println("Balita");
        }
    }
}