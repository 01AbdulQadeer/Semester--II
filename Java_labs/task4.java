
package array;
import java.util.Scanner;

public class task4 {
    public static void main(String[] args) {
         Scanner input=new Scanner (System.in);
        int num,count=0,sum=0;
        num=input.nextInt();
        for(int i=2; i<=num; i+= 2){
            sum+=i;
            count+=1;
        }
        System.out.println("HERE IS YUOR TOTAL "+count);
    }
}
