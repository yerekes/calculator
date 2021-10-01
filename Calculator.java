import java.util.Scanner;
import java.math.*;

public class Calculator {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int num1 = getFirstInt();
        int num2 = getSecondInt();
        char operation = getOperation();
        int result = calc(num1,num2,operation);
        System.out.println("YOur answer:"+ result);
    }

    private static int calc(int num1, int num2, char operation) {
        int result;
        switch (operation){
            case '+':
            result = num1 + num2;
            break;
            case '-':
            result = num1 - num2;
            break;
            case '*':
            result = num1 * num2;
            break;
            case '/':
            result = num1 / num2;
            break;
            case '^':
            result = num1 ^ num2;
            break;
            case '%':
            result = num1 % num2;
            break; 
            default:
            System.out.println("OPerciya ne raspoznanana");
            result = calc(num1,num2,getOperation());
        }
        return result;
    }

    public static int getFirstInt(){
        System.out.println("Choose your first number: ");
        int num1;
        if(scanner.hasNextInt()){
            num1 = scanner.nextInt();
        }else{
            scanner.nextInt();
            num1 = getFirstInt();
            System.out.println("Ne pravil'no vvodish");
        }
        return num1;
    }

    public static int getSecondInt(){
        System.out.println("Choose your second number: ");
        int num2;
        if(scanner.hasNextInt()){
            num2 = scanner.nextInt();
        }else{
            scanner.nextInt();
            num2 = getSecondInt();
            System.out.println("Ne pravil'no vvodish");
        }
        return num2;
    }
    
    public static char getOperation(){
        System.out.println();
        char operation;
        if(scanner.hasNext()){
            operation = scanner.next().charAt(0);
        }else{
            scanner.next();
            operation = getOperation();
            System.out.println("vvedi Pravil'nee!!!");
    }
        return operation;
    }
    
}
