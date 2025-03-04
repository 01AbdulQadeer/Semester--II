
package array;
import java.util.Scanner;

public class task9 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int count=0,sum=0,num=1;
        while(num>0)
        {
            num=input.nextInt();
            if(num>0)
            {
            count++;
            sum+=num;
                
            }
        }
        System.out.println(sum/count);
    }
}
