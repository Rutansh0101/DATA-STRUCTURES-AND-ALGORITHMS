public class Main {
    public static void main(String[] args) {
        // Graph g = new Graph(5);
        
        // g.addEdge(0, 1, false);
        // g.addEdge(0, 2, true);
        // g.addEdge(2, 1, false);

        // g.print();

        WeightedGraph wg = new WeightedGraph(5);
        wg.addEdge(0, 1, 10, false);
        wg.addEdge(2, 1, 12, false);
        wg.addEdge(1, 3, 13, false);
        wg.addEdge(4, 2, 11, false);

        wg.print();
    }
}

class Graph {
    private int[][] adjMatrix;
    private int size;

    public Graph(int _s) {
        this.size = _s;
        this.adjMatrix = new int[_s][_s];
    }

    public void addEdge(int u, int v, boolean direction) {
        adjMatrix[u][v] = 1;
        if(direction)
            adjMatrix[v][u] = 1;
    }

    public void print() {
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(adjMatrix[i][j] == 1) {
                    System.out.println(i + " -> " + j);
                }
            }
        }
    }
}

class WeightedGraph {
    private int[][] adjMatrix;
    private int size;

    public WeightedGraph(int _s) {
        this.size = _s;
        this.adjMatrix = new int[size][size];
    }

    public void addEdge(int u, int v, int weight, boolean direction) {
        adjMatrix[u][v] = weight;
        if(direction)
            adjMatrix[v][u] = weight;
    }

    public void print() {
        for(int i = 0; i < size; i++) {
            for(int j = 0; j < size; j++) {
                if(adjMatrix[i][j] != 0) {
                    System.out.println(i + " -> " + j + ", weight is -> " + adjMatrix[i][j]);
                }
            }
        }
    }
}