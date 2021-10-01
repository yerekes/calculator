public class Cikl {
    public static void main(String[] args) {
        int result = 1;
        for(int i = 2; i < 5; i++){
            result = result +i;
            if(result % 2 == 0){
                System.out.println("Otvet?" + result);
           
            }
        }
    }
}
