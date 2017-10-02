/*
 * The following program is to help determine how much your parking fee is\
after a set number of hours. 
 */

package parkingcharges;
import java.util.Scanner; 

/**
 *
 * @author imkas2134
 */
public class ParkingCharges {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //select 1 for the minimum fee 
        //select 2 for the maximum fee 
        //select 3 for charges after 3 hours but less than 24 hours
        int choice =0; 
         Scanner input = new Scanner (System.in);
         
         System.out.println("1. If you are parking for 3 hours you will be charged $2.00");
         System.out.println("2. If you are parking for 24 hours you will be charged $10.00");
         System.out.println("3. If you are parking for more than 3hrs but less than 24hrs you will be charged 0.50 cents per hour"); 
         choice = input.nextInt(); 
         if (choice == 1) {
             minFee(); 
         }else if (choice == 2){
             maxFee();
         }else{
             aftHour(); 
         }
    }
    //minFee
    /**
     * This method calculates your fee for 2 hours
     * preconditions:
     * if choice =1;
     * postcondition shows the charge to the screen  
     */
     public static void minFee(){
         double minimumFee = 2;
         System.out.println("Your parking fee will be: " + "$ " +minimumFee );
        
            
        }
    //maxFee
     /**
      * This method calculates your fee for 1 day
      * preconditions:
      * if choice = 2
      * postcondition shows the charge to the screen 
      */
     public static void maxFee(){
         double fee = 10.00; 
         System.out.println("Your parking fee will be: " + "$" +fee );
     }
    //aftHour
     /**
      * This method calculates any after hour fees of 0.50 cents per hour
      * assuming that 24 hours is the max amount of hours
      * 
      * preconditions: 
      * if choice = 3
      * postcondition shows the charges to the screen  
      */
     public static void aftHour(){
         double charge, hours;
         Scanner input = new Scanner(System.in); 
         System.out.println("Enter the number of hours you stayed: ");
         hours = input.nextDouble(); 
         charge = 0.50 * (hours - 3) +2;
         System.out.println("$ " + charge); 
          
         
     }
     
}
