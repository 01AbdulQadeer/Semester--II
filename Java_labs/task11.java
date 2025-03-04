
package array;
import java.util.Scanner;

public class task11 {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        char ch;
        ch= input.next().charAt(0);
        if(ch=='a'||ch=='e'||ch=='i'||ch=='u'||ch=='o'){
            System.out.println("vowel");
         
        }
        else{
            System.out.println("consonant");
        }
    }
}
