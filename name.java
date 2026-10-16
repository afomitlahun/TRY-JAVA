 import java.util.Scanner;
 public class name {
    public static void main (String[] argn){
      Scanner input =new Scanner(System.in);
      System.out.println ("enter your name");
      String name=input.nextLine();
      System.out.println ("name:"+name);
      input.close();
    }
 }