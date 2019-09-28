package Code_04_DFS;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

//图的算法还是不会

public class Code_0133 {
    public Node1 cloneGraph(Node1 node) {
        Map<Node1, Node1> lookup = new HashMap<>();
        return dfs(node, lookup);
    }

    private Node1 dfs(Node1 node, Map<Node1,Node1> lookup) {
        if (node == null) return null;
        if (lookup.containsKey(node)) return lookup.get(node);
        Node1 clone = new Node1(node.val, new ArrayList<>());
        lookup.put(node, clone);
        for (Node1 n : node.neighbors)clone.neighbors.add(dfs(n,lookup));
        return clone;
    }



}

class Node1 {
    public int val;
    public List<Node1> neighbors;

    public Node1() {}

    public Node1(int _val, List<Node1> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
};

