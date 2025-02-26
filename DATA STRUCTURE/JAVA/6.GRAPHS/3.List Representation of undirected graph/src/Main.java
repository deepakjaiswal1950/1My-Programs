import java.io.*;
import java.util.*;

class Main
{
    // A utility function to add an edge in an undirected graph
    static void addEdge(ArrayList<ArrayList<Integer> > graph, int u, int v) {
        graph.get(u).add(v); // For directed graph
        graph.get(v).add(u); // For undirected graph
    }


    // A utility function to print the adjacency list
    static void printGraph(ArrayList<ArrayList<Integer> > graph)
    {
        for (int i = 0; i < graph.size(); i++) {  // Row of list
            System.out.print(i+":  ");
            for (int j = 0; j < graph.get(i).size(); j++) { // Column of list
                System.out.print(" -> "+graph.get(i).get(j));  // get() is to access the indexes of list.
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        // Creating a graph with 5 vertices
        int V = 5;
        // ArrayList<ArrayList<Integer> > graph = new ArrayList<ArrayList<Integer>>(V); Normal definition.
        ArrayList<ArrayList<Integer> > graph = new ArrayList<>(V);

        for (int i = 0; i < V; i++)
            graph.add(new ArrayList<>());    // Allocating memory for list array.

        addEdge(graph,0,1);
        addEdge(graph,0,2);
        addEdge(graph,0,3);
        addEdge(graph,1,4);
        addEdge(graph,4,3);
        addEdge(graph,3,2);

        System.out.println("The Adjacency List For Undirected Graph: ");
        printGraph(graph);
    }
}