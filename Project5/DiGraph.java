/*
 * Justin Herrera
 * jherre34@calpoly.edu
 * Juan Ramirez
 * jramir94@calpoly.edu
 *
 * Project 5
 * Friday, March 9, 2018
 */

import java.util.*;

public class DiGraph {
   LinkedList<Integer> dirGraph[];

   public DiGraph(int N) {
      this.dirGraph = new LinkedList[N];
      for(int i = 0; i < dirGraph.length; i++) {
         dirGraph[i] = new LinkedList<>();
      }
   }

   public void addEdge(int from, int to) {
      // TO-DO
   }

   public void deleteEdge(int from, int to) {
      // TO-DO
   }

   public int edgeCount() {
      // TO-DO
      return 0;
   }

   public int vertexCount() {
      // TO-DO
      return 0;
   }

   public void print() {
      // TO-DO
   }

   // just implemented to see the output
   // overriding it is not necessary for project
   @Override
   public String toString() {
      String result = "";
      int j = 1;
      for(int i = 0; i < dirGraph.length; i++, j++) {
         result += j + " ==> " + dirGraph[i] + "\n";
      }
      return result;
   }
}
