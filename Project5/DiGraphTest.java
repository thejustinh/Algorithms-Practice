import java.util.Scanner;

public class DiGraphTest {
   public static void main(String[] args) {
      int vertices;
      Scanner scanner = new Scanner(System.in);
      DiGraph dg;

      System.out.print("Enter number of vertices: ");
      vertices = scanner.nextInt();

      dg = new DiGraph(vertices);

      dg.addEdge(0,2);
      dg.addEdge(0,4);
      dg.addEdge(2,2);
      dg.addEdge(2,4);
      dg.addEdge(2,1);
      dg.addEdge(3,3);
      dg.addEdge(4,3);
      dg.addEdge(4,1);

/*      dg.dirGraph[0].add(2); dg.dirGraph[0].add(4); dg.dirGraph[0].add(8);
      dg.dirGraph[1].add(20); dg.dirGraph[1].add(9);
      dg.dirGraph[5].add(36); dg.dirGraph[5].add(10);
      dg.dirGraph[9].add(108);
*/
      printMenu();

      System.out.println("\n" + dg.print());
   }

   public static void printMenu() {
      System.out.println("\nChoose one of the following operations:");
      System.out.println("-add edge (enter a)");
      System.out.println("-delete edge (enter d)");
      System.out.println("-edge count (enter e)");
      System.out.println("-vertex count (enter v)");
      System.out.println("-print graph (enter p)");
      System.out.println("-topological sort (enter t)");
      System.out.println("-Quit (enter q)");
   }
}
