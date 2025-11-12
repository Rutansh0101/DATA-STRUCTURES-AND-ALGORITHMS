import java.util.*;




class Pair {
    int vertex, weight;
    public Pair(int vertex, int weight) {
        this.vertex = vertex;
        this.weight = weight;
    }
}




class Graph {
    public Map<Integer, List<Integer>> adjList = new HashMap<>();

    public void addEdge(int src, int dest, boolean direction) {
        // direction = true -> directed graph
        // direction = false -> undirected graph
        if(direction == false) {
            adjList.putIfAbsent(src, new ArrayList<>());
            adjList.putIfAbsent(dest, new ArrayList<>());
            adjList.get(src).add(dest);
            adjList.get(dest).add(src);
        }
        else {
            adjList.putIfAbsent(src, new ArrayList<>());
            adjList.putIfAbsent(dest, new ArrayList<>());
            adjList.get(src).add(dest);
        }
    }

    public void printAdjList() {
        for(Map.Entry<Integer, List<Integer>> entry:adjList.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }

    public List<Integer> BFSTraversal(int src) {
        List<Integer> ans = new ArrayList<>();
        
        Queue<Integer> queue = new LinkedList<>();
        HashMap<Integer, Boolean> visited = new HashMap<>();

        queue.offer(src);
        visited.put(src, true);

        while(!queue.isEmpty()) {
            int frontNode = queue.poll();
            ans.add(frontNode);
            for(int Node : adjList.getOrDefault(frontNode, new ArrayList<>())) {
                if(!visited.getOrDefault(Node, false)) {
                    queue.offer(Node);
                    visited.put(Node, true);
                }
            }
        }
        
        return ans;
    }
}




class WeightedGraph {
    public Map<Integer, List<Pair>> adjList = new HashMap<>();

    public void addEdge(int src, int dest, int weight, boolean direction) {
        // direction = true -> directed graph
        // direction = false -> undirected graph
        if(direction == false) {
            adjList.putIfAbsent(src, new ArrayList<>());
            adjList.putIfAbsent(dest, new ArrayList<>());
            adjList.get(src).add(new Pair(dest, weight));
            adjList.get(dest).add(new Pair(src, weight));
        }
        else {
            adjList.putIfAbsent(src, new ArrayList<>());
            adjList.putIfAbsent(dest, new ArrayList<>());
            adjList.get(src).add(new Pair(dest, weight));
        }
    }

    public void printAdjList() {
        for(Map.Entry<Integer, List<Pair>> entry:adjList.entrySet()) {
            System.out.print(entry.getKey() + " -> " + "[");
            List<Pair> list = entry.getValue();
            for(Pair p:list) {
                System.out.print("(" + p.vertex + ", " + p.weight + "), ");
            }
            System.out.println("]");
        }
    }
}


public class Main {
    public static void main(String[] args) {
        
        // Graph g = new Graph();
        // g.addEdge(0, 1, true);
        // g.addEdge(0, 2, true);
        // g.addEdge(1, 2, true);
        // g.addEdge(2, 3, true);
        // g.printAdjList();


        // WeightedGraph wg = new WeightedGraph();
        // wg.addEdge(0, 1, 4, true);
        // wg.addEdge(0, 2, 2, true);
        // wg.addEdge(1, 2, 3, true);
        // wg.addEdge(3, 1, 5, true);
        // wg.addEdge(2, 3, 1, true);

        // wg.printAdjList();


        // BFS traversal:
        Graph g = new Graph();
        g.addEdge(0, 3, true);
        g.addEdge(0, 5, true);
        g.addEdge(0, 2, true);
        g.addEdge(2, 5, true);
        g.addEdge(3, 5, true);
        g.addEdge(5, 4, true);
        g.addEdge(5, 6, true);
        g.addEdge(6, 1, true);
        g.addEdge(4, 1, true);

        List<Integer> bfs = g.BFSTraversal(0);
        System.out.println(bfs);
    }
}