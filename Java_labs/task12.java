
package array;
import java.util.Scanner;
public class task12 {
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
         String name[]=new String[5];
         int marks[]=new int[5];
         char grade[]=new char[5];
         for(int i=0;i<5;i++)
         {
             System.out.println("name : ");
             name[i]=input.nextLine();
             System.out.println("marks");
             marks[i]=input.nextInt();
             System.out.println("grade");
             grade[i]=input.next().charAt(0);
             input.nextLine();
         }
         System.out.println("name\t\tmarks\t\tgrade");
         for(int i=0;i<5;i++)
         {
             System.out.println(name[i]+"\t\t"+marks[i]+"\t\t"+grade[i]);
         }
                
    }
}
