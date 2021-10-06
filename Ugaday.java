import java.util.Random;
import java.util.Scanner;

public class Ugaday {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int vvod = getVvodInt();
        int ran = (int) (Math.random() * 100);
        System.out.println("Start game ");
        while(true){
            if(vvod == ran){
                System.out.println("You win!! " + ran);
                break;
            } if(vvod > ran){
                System.out.println("Slishkom mnogo " + vvod + " chislo = " + ran);
                //vvod--;
                break;
            } if(vvod < ran){
                System.out.println("Slishkom malo" + vvod + " ot chisla  " + ran);
                //vvod++;
                break;
                }

            }  
        }

    public static int getVvodInt(){
        int vvod;
        vvod = scanner.nextInt();
        System.out.println("Choose your number");
    
    return vvod;
    }


}    
    

