/*
 * Justin Herrera
 * jherre34@calpoly.edu
 * Juan Ramirez
 * jramir94@calpoly.edu
 *
 * Project 5
 * Friday, March 9, 2018
 */

 import java.util.Scanner;

public class DiGraphTest {
   public static void main(String[] args) {
      int vertices, addEdgeFrom, addEdgeTo, deleteEdgeFrom, deleteEdgeTo;
      String menuItem;
      char menuItem_c;
      boolean quit = false;
      Scanner scanner = new Scanner(System.in);
      DiGraph dg;
      int[] sorted;

      System.out.print("Enter number of vertices: ");

      while (true) {
          if (scanner.hasNext()) {
            vertices = Integer.valueOf(scanner.nextLine());
            dg = new DiGraph((vertices));
            break;
        }
      }

      printMenu();

      while (!quit) {

          menuItem = scanner.nextLine();
          if (menuItem == null || menuItem.length() != 1) {
              System.out.println("Invalid menu choice.");
              continue;
          }

          menuItem_c = menuItem.charAt(0);

          switch(menuItem_c) {

             case 'a':
                addEdgeFrom = scanner.nextInt();
                addEdgeTo = scanner.nextInt();
                scanner.nextLine();
                dg.addEdge(addEdgeFrom, addEdgeTo);
                System.out.println("(" + addEdgeFrom + ", " +addEdgeTo + ") edge is now added to the graph");
                break;
             case 'd':
                deleteEdgeFrom = scanner.nextInt();
                deleteEdgeTo = scanner.nextInt();
                scanner.nextLine();
                dg.deleteEdge(deleteEdgeFrom, deleteEdgeTo);
                System.out.println("(" + deleteEdgeFrom + ", " +deleteEdgeTo + ") edge is now deleted from the graph");
                break;
             case 'e':
                System.out.println("Number of edges is " + dg.edgeCount());
                break;
             case 'v':
                System.out.println("Number of vertices is " + dg.vertexCount());
                break;
             case 'p':
                System.out.println("The graph is the following: ");
                dg.print();
                break;
             case 't':
                 try {
                    System.out.println("You've chosen to sort topologically");
                    sorted = dg.topSort();
                    System.out.print("Sorted: ");
                    if (sorted.length > 0)
                       System.out.print(sorted[0] + 1);
                    for (int i = 1; i < sorted.length; i++)
                        System.out.print(", " + (sorted[i] + 1));
                    System.out.println();
                } catch (Exception e) {
                    System.out.println("Cycle in graph!");
                }
                break;
             case 'q':
                quit = true;
                break;
             default:
                System.out.println("Invalid menu choice.");

          }

      }

      System.out.println("Good bye.");

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
