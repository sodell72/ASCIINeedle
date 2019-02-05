// Sean O'Dell, CSE 142, Spring 2015, Section BG
// Programming Assignment #2, 04/14/15
//
// This program's behavior is to print a space needle
public class SpaceNeedle {
   public static final int SIZE = 4;
   public static void main(String[] args) {
      printSmallShaft();
      printBase();
      printGroundWidthLine();
      printObservationBase();
      printSmallShaft();
      printBottomShaft();
      printBase();
      printGroundWidthLine();
   }
   
   // Prints observation base
   public static void printObservationBase() {
      for(int i = 1; i <= SIZE; i++) {
         for(int j = 1; j <= 2 * i - 2; j++) {
            System.out.print(" ");
         }
         System.out.print("\\_");
         for(int j = 1; j <= SIZE * 3 - 2 * i + 1; j++) {
            System.out.print("/\\");
         }
         System.out.println("_/");
      }
   }
   
   // Prints small shaft
   public static void printSmallShaft() {
      for(int i = 1; i <= SIZE; i++) {
         for(int j = 1; j <= 3 * SIZE; j++) {
            System.out.print(" ");
         }
         System.out.println("||");
      }
   }
   
   // Prints bottom elevator shaft and surrounding structure
   public static void printBottomShaft() {
      for(int i = 1; i <= SIZE * SIZE; i++) {
         for(int j = 1; j <= (2 * SIZE) + 1; j++) {
            System.out.print(" ");
         }
         System.out.print("|");
         for(int j = 1; j <= SIZE - 2; j++) {
            System.out.print("%");
         }
         System.out.print("||");
         for(int j = 1; j <= SIZE - 2; j++) {
            System.out.print("%");
         }
         System.out.println("|");
      }
   }
   
   // Prints base
   public static void printBase() {
      for(int i = 1; i <= SIZE; i++) {
         for(int j = 1; j <= 3 * SIZE - 3 * i; j++) {
            System.out.print(" ");
         }
         System.out.print("__/");
         for(int j = 1; j <= -3 + 3 * i; j++) {
            System.out.print(":");
         }
         System.out.print("||");
         for(int j = 1; j <= -3 + 3 * i; j++) {
            System.out.print(":");
         }
         System.out.println("\\__");
      }
   }
   
   // Prints ground
   public static void printGroundWidthLine() {
      System.out.print("|");
      for(int i = 1; i <= SIZE * 6; i++) {
         System.out.print("\"");
      }
      System.out.println("|");
   }
}