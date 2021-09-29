import java.util.Scanner;


public class Conditions{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int j = getVozrastInt();
        float rost = getRostInt();
        String name = getNameStr();
    }

    public static int getVozrastInt() {
        System.out.println(" Choose your age:");
        int j;
        if(scanner.hasNextInt() ){
            j = scanner.nextInt();
            if(j > 20){
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
            if(rost > 180f){
                System.out.println("Jiraf");    
            } else {
                System.out.println("korotyshka");
            }     
        }
        return 0;
    }  
    public static String getNameStr(){
        System.out.println("Choose your name:");
        String name;
        if(scanner.hasNext()){
            name = scanner.nextLine();
            System.out.println("Your name lol:"+ name);
        }else {
            System.out.println("Smotri 4to ty pishesh!!!!");
            scanner.next();
            name = getNameStr();
        }
        return name;
    }
}

    

