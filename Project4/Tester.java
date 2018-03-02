/*
 * Justin Herrera
 * jherre34@calpoly.edu
 * Juan Ramirez
 * jramir94@calpoly.edu
 *
 * Project 4
 * Friday, March 2, 2018
 */

import java.util.Arrays;

public class Tester {
   public static void main(String[] args) {
      int us[] = {100,50,25,10,5,1};
      int soviet[] = {100,50,20,15,10,5,3,2,1};
      int pow2[] = {64,32,16,8,4,2,1};
      int us_wo5[] = {100,50,25,10,1};
      int rand[] = {66,35,27,18,10,1};
      int x1 = 0;
      int x2 = 0;
      int x3 = 0;
      int x4 = 0;
      int x5 =0;

      ChangeMaker cm = new ChangeMaker();

      

      for(int i = 0; i < 200; i++) {
         if(Arrays.equals(cm.change_DP(i, us), cm.change_greedy(i, us)))
            x1++;
         if(Arrays.equals(cm.change_DP(i, soviet), cm.change_greedy(i, soviet)))
            x2++;
         if(Arrays.equals(cm.change_DP(i, pow2), cm.change_greedy(i, pow2)))
            x3++;
         if(Arrays.equals(cm.change_DP(i, us_wo5), cm.change_greedy(i, us_wo5)))
            x4++;
         if(Arrays.equals(cm.change_DP(i, rand), cm.change_greedy(i, rand)))
            x5++;
      }

      System.out.println("Testing change_DP and change_greedy algorithms");
      System.out.println("Testing set1: " + x1 + " matches in 200 tests");
      System.out.println("Testing set2: " + x2 + " matches in 200 tests");
      System.out.println("Testing set3: " + x3 + " matches in 200 tests");
      System.out.println("Testing set4: " + x4 + " matches in 200 tests");
      System.out.println("Testing set5: " + x5 + " matches in 200 tests");
   }
}
