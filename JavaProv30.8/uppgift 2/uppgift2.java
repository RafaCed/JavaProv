
public class uppgift2 {

/*Gör en funktion som för båda Arrays var den räknar ut summan av båda Arrays och skrivet ut svaret.
Var efter gör ni division med Sum1 o Sum 2 och skrivet ut svaret*/
    
    public static void main(String args[]) {
       
        int[] num1 = {5, 10, 25, 75, 125};
        int[] num2 = {50, 100, 250, 750, 25};
        
       
             int sum1 = 0;
        for (int i : num1) {
            sum1 += i;
        }
        System.out.println("Sum1: " + sum1);
        int sum2 = 0;
        for (int i : num2) {

            sum2 += i;
        }
        System.out.println("Sum2: " + sum2);
        System.out.println("Divided: " + sum1 / sum2);
    }
}
     
   

