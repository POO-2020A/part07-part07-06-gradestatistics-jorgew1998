
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
         Scanner scanner = new Scanner(System.in);
         int sumOfPoints = 0;
         int sumOfAprobed = 0;
         int contOfAprobed = 0;
         int contOfTotal = 0;
         int contForOne = 0;
         int contForTwo = 0;
         int contForThree = 0;
         int contForFour = 0;
         int contForFive = 0;
         int contForSix = 0;

         System.out.println("Enter point totals, -1 stops: ");
         while(true) {
           int number = Integer.valueOf(scanner.nextLine());
           if(number == -1) {
             break;
           }

           if(number >= 0 && number <= 100) {
           sumOfPoints += number;
           contOfTotal++;
           }

           if(number >= 50 && number <= 100){
             sumOfAprobed += number;
             contOfAprobed++;
           }
         if(number >= 0 && number <= 100){
            if(number < 50) {
             contForOne++;
            } else if(number < 60) {
             contForTwo++;
            } else if(number < 70) {
             contForThree++;
            } else if(number < 80) {
             contForFour++;
            } else if(number < 90) {
             contForFive++;
            } else if(number >= 90) {
             contForSix++;
            }
           }
         }

         double average = (double) sumOfPoints/contOfTotal;
         System.out.println("Point average (all): " + average);
         double averageOfAprobbed = (double) sumOfAprobed/contOfAprobed;
         if(contOfAprobed == 0) {
           System.out.println("Point average (passing): " + "-");
         } else {
           System.out.println("Point average (passing): " + averageOfAprobbed);
         }
    
         double passPorcentaje = 100 * contOfAprobed / contOfTotal;
         System.out.println("Pass percentage: " + passPorcentaje);

         System.out.println("Grade distribution: ");
         System.out.print("5:");
         for(int i = 1; i <= contForSix; i++) {
           System.out.print("*");
         }

         System.out.println("");
         System.out.print("4:");
         for(int i = 1; i <= contForFive; i++) {
           System.out.print("*");
         }

         System.out.println("");
         System.out.print("3:");
         for(int i = 1; i <= contForFour; i++) {
           System.out.print("*");
         }

         System.out.println("");
         System.out.print("2:");
         for(int i = 1; i <= contForThree; i++) {
           System.out.print("*");
         }

         System.out.println("");
         System.out.print("1:");
         for(int i = 1; i <= contForTwo; i++) {
           System.out.print("*");
         }

         System.out.println("");
         System.out.print("0:");
         for(int i = 1; i <= contForOne; i++) {
           System.out.print("*");
         }

         System.out.println();
       }
   }
