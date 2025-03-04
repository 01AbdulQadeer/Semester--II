
package array;
import java.util.Scanner;

public class task5 {
    public static void main(String[] args) {
         Scanner input=new Scanner (System.in);
         int num ,fact=1;
         num=input.nextInt();
         for(int i=num; i>=1; i--){
             fact*=i;
             System.out.print(i+"x ");
         }
         System.out.print("  = "+ fact) ;
    }
}
