package Code_00_LeetCode_ShuaTi.Code_01_LinkList;
//复杂链表的复制
//https://leetcode-cn.com/problems/copy-list-with-random-pointer/

public class Code_0138 {
    public Node copyRandomList(Node head) {
        return null;
    }
}

class Node {
    public int val;
    public Node next;
    public Node random;

    public Node() {}

    public Node(int _val,Node _next,Node _random) {
        val = _val;
        next = _next;
        random = _random;
    }
};