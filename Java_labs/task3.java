package array;
import java.util.Scanner;
public class task3 {
    public static void main(String[] args) {
         Scanner input=new Scanner (System.in);
        int x,i;
        x=input.nextInt();
        for(i=1; i<=10; i++){
            System.out.println(i+"x"+x+"="+i*x);
        }
    }
}
