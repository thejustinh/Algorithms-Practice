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
      if (dirGraph[from - 1].contains(to - 1))
        return;
      dirGraph[from - 1].add(to - 1);
   }

   public void deleteEdge(int from, int to) {
      if (!dirGraph[from - 1].contains(to - 1))
         return;
      dirGraph[from - 1].remove((Object)(to - 1));
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
      for(int i = 0; i < dirGraph.length; i++) {
         System.out.print((i + 1) + " is connected to: ");
         if (dirGraph[i].size() > 0)
            System.out.print((dirGraph[i].get(0)+1));
         for (int j = 1; j < dirGraph[i].size(); j++) {
             System.out.print(", " + (dirGraph[i].get(j) + 1));
         }
         System.out.println();
      }
   }

   private int[] indegrees()
   {
       int n = this.dirGraph.length;

       int[] indegrees = new int[n];

       for (int i = 0; i < n; i++){
           indegrees[i] = 0;
       }

       for (int node = 0; node < n; node++) {
           for (int adj = 0; adj < n; adj++) {
               if (this.dirGraph[adj].contains(node))
                indegrees[node] = indegrees[node] + 1;
            }
       }

       return indegrees;
   }

   public int[] topSort() {
       int n = this.dirGraph.length;
       int[] in = indegrees();
       int[] A = new int[n];
       Queue<Integer> Q = new LinkedList<Integer>();

       for (int j = 0; j < in.length; j++) {
           if (in[j] == 0)
                Q.add(j);
       }

       int i = 0;

       while (!Q.isEmpty()) {
           int u = Q.poll();
           A[i] = u;
           for (int node = 0; node < this.dirGraph[u].size(); node++) {
                in[this.dirGraph[u].get(node)] = in[this.dirGraph[u].get(node)] - 1;
                if (in[this.dirGraph[u].get(node)] == 0)
                Q.add(this.dirGraph[u].get(node));
           }
           i = i + 1;
       }

       if (i != n)
            throw new IllegalArgumentException("Graph has a cycle!");

       return A;
   }

   /**
    * Returns an array of VertexInfo type objects containing data that can be
    * used to construct shortest paths from s vertex to all vertices in the graph
    * that are reachable from s.
    **/
   private VertexInfo[] BFS(int s) {
       int n = this.dirGraph.length;
       VertexInfo[] VA = new VertexInfo[n];
       Queue<Integer> Q = new LinkedList<Integer>();

       for (int u = 0; u < n; u++) {
           VertexInfo v = new VertexInfo();
           VA[u] = v;
           VA[u].distance = -1;
           VA[u].predecessor = -1;
       }

       VA[s].distance = 0;
       Q.add(s);

       while (!Q.isEmpty()) {
           int u = Q.poll();
           for (int node = 0; node < this.dirGraph[u].size(); node++) {
               if (VA[this.dirGraph[u].get(node)].distance == -1) {
                   VA[this.dirGraph[u].get(node)].distance = VA[this.dirGraph[u].get(node)].distance + 1;
                   VA[this.dirGraph[u].get(node)].predecessor = u;
                   Q.add(this.dirGraph[u].get(node));
               }
           }
       }

       return VA;
   }

    public boolean isTherePath(int from, int to) {
        VertexInfo[] VA = BFS(from - 1);
        if (VA[to - 1].distance == -1)
            return false;
        return true;
    }

    public int lengthOfPath(int from, int to) {
        int length = -1;
        int s = from - 1;
        int x = to - 1;
        VertexInfo[] VA = BFS(s);
        if (isTherePath(from, to)) {
            length = 0;
            while (s != x) {
                length++;
                x = VA[x].predecessor;
            }
        }

        return length;
    }

    public void printPath(int from, int to) {
        int s = from - 1;
        int x = to - 1;
        VertexInfo[] VA = BFS(s);
        if (VA[x].distance == -1)
            System.out.println("No path");
        else {
            String output = "";
            while (s != x) {
                output = "->" + x + output;
                x = VA[x].predecessor;
            }
            output = s + output;
            System.out.println(output);
        }
    }

   private class VertexInfo {
       public int distance;
       public int predecessor;
   }
}
