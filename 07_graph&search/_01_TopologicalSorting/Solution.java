/**
 * Time : O() ; Space: O()
 * @tag : LintCode Copyright; Geeks for Geeks; Depth First Search; Breadth First Search
 * @by  : Steven Cooks
 * @date: Sep 26, 2015
 ***************************************************************************
 * Description:
 *
 * Given an directed graph, a topological order of the graph nodes is defined 
 * as follow: 
 * 
 * For each directed edge A -> B in graph, A must before B in the order list. 
 * The first node in the order can be any node in the graph with no nodes direct to it. 
 * Find any topological order for the given graph.
 * 
 ***************************************************************************
 * {@link http://www.lintcode.com/en/problem/topological-sorting/ }
 */
package _01_TopologicalSorting;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/** see test {@link _01_TopologicalSorting.SolutionTest } */
public class Solution {
    
    public ArrayList<DirectedGraphNode> topSort(ArrayList<DirectedGraphNode> graph) {
        Map<DirectedGraphNode, Integer> in = new Hashtable<>();
        // count in-degree for each node in the graph
        for (DirectedGraphNode node : graph) {
            if (!in.containsKey(node)) {
                in.put(node, 0);
            }
            for (DirectedGraphNode neighbor : node.neighbors) {
                int degree = 1;
                if (in.containsKey(neighbor)) {
                    degree += in.get(neighbor);
                }
                in.put(neighbor, degree);
            }
        }
        
        // put all nodes with zero in-degree
        Queue<DirectedGraphNode> zeros = new LinkedList<>();
        for (DirectedGraphNode node : in.keySet()) {
            if (in.get(node) == 0) {
                zeros.offer(node);
            }
        }
        
        // construct result
        ArrayList<DirectedGraphNode> res = new ArrayList<>();
        while (!zeros.isEmpty()) {
            DirectedGraphNode node = zeros.poll();
            res.add(node);
            for (DirectedGraphNode neighbor : node.neighbors) {
                int degree = in.get(neighbor) - 1;
                if (degree > 0) {
                    in.put(neighbor, degree);
                }
                if (degree == 0) {
                    zeros.offer(neighbor);
                }
            }
        }
        return res;
    }

}
