package Code_99_JZOFFER;

import java.util.LinkedList;

public class Code_36 {
    public Node treeToDoublyList(Node root) {
        if(root==null)
            return null;
        ReturnType type=process(root);
        type.start.left=type.end;
        type.end.right=type.start;
        return type.start;
    }

    private ReturnType process(Node node){
        if(node==null)
            return new ReturnType(null,null);
        ReturnType left=process(node.left);
        ReturnType right=process(node.right);
        if(left.end!=null){
            left.end.right=node;
        }
        node.left=left.end;
        if(right.start!=null)
            right.start.left=node;
        node.right=right.start;

        return new ReturnType(left.start!=null?left.start:node,right.end!=null?right.end:node);

    }

    class ReturnType{
        public Node start;
        public Node end;

        public ReturnType(Node start, Node end) {
            this.start = start;
            this.end = end;
        }
    }

    class Node{
        public int val;
        public Node left;
        public Node right;

        public Node() {}

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val,Node _left,Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }
}

