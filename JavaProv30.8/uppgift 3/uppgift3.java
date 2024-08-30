
public class uppgift3 {
/*
    for (int i = 0; i <= 5; i+); {
            System.out.println(Number: " + i);
    Coden skall skriva ut från 0 till 4 men den gör det inte.
    Kan ni fixa min coden o berätta vad som var fel
    */
    
    public static void main(String args[]) {
   
/*första koden hade "i+" det ska vara i++ 
     for (int i = 0; i <= 4; i++) { 
// ändrade "i <=5" till "i <= 4" för att printa 0-4
            
        System.out.println("Number: " + i);
         om man inte vill använda break
        }*/
     for (int i =0; i <=5; i++){
      if(i==5)
          break;{
         System.out.println(i);  
     }
     }
    }   
}