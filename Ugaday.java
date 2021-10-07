import java.util.Random;
import java.util.Scanner;

public class Ugaday {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int vvod = getVvodInt();
        int ran = (int) (Math.random() * 100);
        boolean result = vvod == ran;
        while(true){
            if(vvod == ran){
                System.out.println("You are winneeeeeerrr!! " + ran);
                break;
            } if(vvod > ran){
                System.out.println("Slishkom mnogo " + vvod + " chislo = " + ran);
                vvod = scanner.nextInt();
                System.out.println("Choose new number");
            } if(vvod < ran){
                System.out.println("Slishkom malo " + vvod + " ot chisla  " + ran);
                //vvod++;
                vvod = scanner.nextInt();
                System.out.println("Choose new number");
                }
            }  
        }

    public static int getVvodInt(){
        System.out.println("Choose your number");
        int vvod;
        if(scanner.hasNextInt()){
            vvod = scanner.nextInt();
        } else{
            System.out.println("Write number please ");
            vvod =  scanner.nextInt();
        }
        return vvod;
    }
}    