
package array;
import java.util.Scanner;

public class task7 {
    public static void main(String[] args) {
        String zero="0", zero1="0";
        for(int i=1; i<=12; i++){
            if(i==10)
            {
                zero="";
            }
          for(int j =1; j <=60; j++){
            if(j==10)
            {
                zero1="";
            }
            if(j==0)
            {
                zero1="0";
            }
              System.out.println(zero+i+":"+zero1+j);
            }
          }  
        }
    }

