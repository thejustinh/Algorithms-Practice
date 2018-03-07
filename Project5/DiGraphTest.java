import java.util.Scanner;

public class DiGraphTest {
   public static void main(String[] args) {
      int vertices;
      char menuItem;
      boolean quit = false;
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

      printMenu();

      do {
         System.out.print("\nChoose menu item: ");
         menuItem = scanner.next().charAt(0);
         switch(menuItem) {
            case 'a': 
               System.out.println("You've chosen to addEdge");
               break;
            case 'd':
               System.out.println("You've chosen to deleteEdge");
               break;
            case 'e':
               System.out.println("You've chosen to get edgeCount");
               break;
            case 'v':
               System.out.println("You've chosen to get vertexCount");
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
