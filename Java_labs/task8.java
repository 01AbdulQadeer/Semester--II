
package array;
import java.util.Scanner;

public class task8 {
    public static void main(String[] args) {
         Scanner x=new Scanner(System.in);
        int  temp;
        temp=x.nextInt();
        if(temp>80){
            System.out.println("swimming");
        }
         if(temp >60 && temp <80){
            System.out.println("tennis");
        }
        if(temp >40 && temp<60){
            System.out.println("golf");
        }
        if(temp<40 && temp<20){
            System.out.println("skiip");
        }
        
        
}}
