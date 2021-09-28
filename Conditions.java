import java.util.Scanner;

public class Conditions{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int j = getVozrastInt();
        float rost = getRostInt();
    }
     public static int getVozrastInt() {
        System.out.println(" Choose your age:");
        int j;
     if(scanner.hasNextInt() ){
        j = scanner.nextInt();
        if(j>20){
        System.out.println("Starik");
        } else {
        System.out.println("Molodoy brariska");
        }
        }
    return 0;
    }    
     public static float getRostInt() {
        System.out.println(" Choose your height:");
        float rost;
    if(scanner.hasNextFloat() ){
        rost = scanner.nextFloat();
        if(rost>1.80f){
        System.out.println("Jiraf");    
        } else {
        System.out.println("korotyshka");
        }     
        }
        return 0;
    }  
}

    

