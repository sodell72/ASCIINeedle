// Sean O'Dell, CSE 142, Spring 2015, Section BG
// Programming Assignment #2, 04/14/15
//
// This program's behavior is to print an Ascii picture of college student's financial standings
public class AsciiArt {
   public static void main(String[] args) {
      for(int i = 1; i <= 10; i++) {
         for(int j = 1; j <= (11 - i) * (11 - i); j++) {
            System.out.print("$");
         }
         System.out.println(" The " + i*10 + "%");
      }
      System.out.println("The College Student");
   }
}