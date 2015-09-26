package _01_TopologicalSorting;

import java.util.ArrayList;

public class DirectedGraphNode {
    
    int label;

    ArrayList<DirectedGraphNode> neighbors;

    public DirectedGraphNode(int x) {
        label = x;
        neighbors = new ArrayList<>();
    }

}
