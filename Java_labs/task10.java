
package array;
import java.util.Scanner;

public class task10 {
    public static void main(String[] args) {
        Scanner x=new Scanner(System.in);
        int num1,num2;
        System.out.println("ENTER THE FIRST NO");
        num1=x.nextInt();
               System.out.println("ENTER THE SECOND NO");
        num2=x.nextInt();
        switch(num1 > num2 ?1:0){
            case 1: System.out.println(num1+"is greater then"+num2);
            break;
            case 2:System.out.println(num2+"is greater then"+num1);
       break;
            default :System.out.println("invalid entry");
     
        }
        
    }
}
