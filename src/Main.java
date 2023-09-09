public class Main {

  public static Graph readGraph(String file) throws FileNotFoundException {
    Graph graph = new Graph();
    Scanner sc = new Scanner(new File(file));
    int n = sc.nextInt();
    int m = sc.nextInt();

    for (int i = 0; i < m; i++) {
      int u = sc.nextInt();
      int v = sc.nextInt();
      graph.addEdge(u, v);
    }

    return graph;
  }

  public static void main(String[] args) throws FileNotFoundException {
    String file = "grafo.txt"; //entrada do usuário
    int v = 2; //entrada do usuário

    Graph graph = readGraph(file);

    System.out.println("Grau de saída: " + graph.outDegree(v));
    System.out.println("Grau de entrada: " + graph.inDegree(v));
    System.out.println("Sucessores: " + graph.successors(v));
    System.out.println("Predecessores: " + graph.predecessores(v));
  }
}