import java.io.*;
import java.util.*;

@SuppressWarnings("unchecked")
public class BFS_DFS_DirectedGraph {
    static class Graph {
        int vertices;
        LinkedList<Integer>[] adjacencylist;// array of linked lists of integer

        Graph(int vertices) {
            this.vertices = vertices;
            adjacencylist = new LinkedList[vertices];
            // initialize adjacency lists for all the vertices
            for (int i = 0; i < vertices; i++) {
                adjacencylist[i] = new LinkedList<>();
            }
        }

        public void addEdge(int source, int destination) {
            adjacencylist[source].add(destination); // for directed graph

        }

        public void printGraph() {
            for (int i = 0; i < vertices; i++) {
                LinkedList<Integer> list = adjacencylist[i];
                // System.out.println("vertex "+i+" is connected to "+list);

                for (int j = 0; j < list.size(); j++) {
                    System.out.println("vertex-" + i + " is connected to " + list.get(j));
                }
            }
        }

        void BFS(int start_vertex) {
            boolean[] visited = new boolean[vertices];

            LinkedList<Integer> queue = new LinkedList<>();
            visited[start_vertex] = true;
            queue.add(start_vertex);

            while (!queue.isEmpty()) {
                start_vertex = queue.poll();
                System.out.print(start_vertex + " ");
                ListIterator<Integer> i = adjacencylist[start_vertex].listIterator();
                while (i.hasNext()) {
                    int n = i.next();
                    if (!visited[n]) {
                        visited[n] = true;
                        queue.add(n);
                    }
                }

            }
        }

        void DFSUtil(int v, boolean visited[]) {
            // Mark the current node as visited and print it
            visited[v] = true;
            System.out.print(v + " ");

            Iterator<Integer> i = adjacencylist[v].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n])
                    DFSUtil(n, visited);
            }
        }

        void DFS(int v) {

            boolean visited[] = new boolean[vertices];

            DFSUtil(v, visited);
        }

    }

    public static void main(String[] args) {
        Graph g = new Graph(4);

        g.addEdge(0, 1);
        g.addEdge(0, 2);
        g.addEdge(1, 2);
        g.addEdge(2, 0);
        g.addEdge(2, 3);
        g.addEdge(3, 3);
        g.printGraph();
        System.out.println("Following is Breadth First Traversal " + "(starting from vertex 2)");
        g.BFS(2);
        System.out.println("Following is Depthth First Traversal " + "(starting from vertex 2)");
        g.DFS(2);
    }
}
