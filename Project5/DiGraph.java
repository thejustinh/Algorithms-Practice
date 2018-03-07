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
   private LinkedList<Integer> dirGraph[];

   public DiGraph(int N) {
      this.dirGraph = new LinkedList[N];
      for(int i = 0; i < dirGraph.length; i++) {
         dirGraph[i] = new LinkedList<>();
      }
   }

   public void addEdge(int from, int to) {
      dirGraph[from-1].add(to);
   }

   public void deleteEdge(int from, int to) {
      dirGraph[from-1].remove(to-1);
   }

   public int edgeCount() {
      int edgeCount = 0;

      for(int i = 0; i < dirGraph.length; i++) {
         edgeCount += dirGraph[i].size();
      }

      return edgeCount;
   }

   public int vertexCount() {
      return dirGraph.length;
   }

   public void print() {
      String result = "";
      int j = 1;
      for(int i = 0; i < dirGraph.length; i++, j++) {
         System.out.println(j + " is connected to: " + dirGraph[i]);
      }
   }
}
