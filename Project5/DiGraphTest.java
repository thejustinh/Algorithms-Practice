import java.util.Scanner;

public class DiGraphTest {
   public static void main(String[] args) {
      int vertices, addEdgeFrom, addEdgeTo, deleteEdgeFrom, deleteEdgeTo;
      char menuItem;
      boolean quit = false;
      Scanner scanner = new Scanner(System.in);
      DiGraph dg;

      System.out.print("Enter number of vertices: ");
      vertices = scanner.nextInt();

      dg = new DiGraph(vertices);

      printMenu();

      do {
         System.out.print("\nChoose menu item: ");
         menuItem = scanner.next().charAt(0);
         switch(menuItem) {
            case 'a': 
               System.out.println("You've chosen to addEdge");
               System.out.print("Enter from then to numbers: ");
               addEdgeFrom = scanner.nextInt();
               addEdgeTo = scanner.nextInt();
               dg.addEdge(addEdgeFrom, addEdgeTo);
               break;
            case 'd':
               System.out.println("You've chosen to deleteEdge");
//               System.out.print("Enter from then to numbers: ");
//               deleteEdgeFrom = scanner.nextInt();
//               deleteEdgeTo = scanner.nextInt();
//               dg.deleteEdge(deleteEdgeFrom, deleteEdgeTo);
               break;
            case 'e':
               System.out.println("Edge Count: " + dg.edgeCount());
               break;
            case 'v':
               System.out.println("Vertex Count: " + dg.vertexCount());
               break;
            case 'p':
               dg.print();
               break;
            case 't':
               System.out.println("You've chosen to sort topologically");
               break;
            case 'q':
               quit = true;
               break;
            default:
               System.out.println("Invalid choice.");
         }
      } while (!quit);
      System.out.println("Quitting.");
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
