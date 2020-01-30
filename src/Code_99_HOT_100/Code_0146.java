package Code_99_HOT_100;

import java.util.HashMap;

public class Code_0146 {

}

//LRU缓存算法的设计

class LRUCache {
    private HashMap<Integer,Node> map;

    private DoubleList cache;

    private int capc;

    public LRUCache(int capacity) {
        this.capc=capacity;
        map=new HashMap<>();
        cache=new DoubleList();
    }

    public int get(int key) {
        if(!map.containsKey(key))
            return -1;
        int val=map.get(key).val;
        put(key,val);
        return val;
    }

    public void put(int key, int value) {
        Node x=new Node(key,value);
        if(map.containsKey(key)){
            cache.remove(map.get(key));
        }else{
            if(capc==cache.size()){
                Node last=cache.removeLast();
                map.remove(last.key);
            }
        }
        cache.addFirst(x);
        map.put(key,x);
    }
}

class DoubleList{
    private Node head,tail;
    private int size;

    public DoubleList(){
        head=new Node(0,0);
        tail=new Node(0,0);
        head.next=tail;
        tail.prev=head;
        size=0;
    }

    public void addFirst(Node x){
        x.next=head.next;
        x.prev=head;
        head.next.prev=x;
        head.next=x;
        size++;
    }

    public void remove(Node x){
        x.prev.next=x.next;
        x.next.prev=x.prev;
        size--;
    }
    public Node removeLast(){
        if(tail.prev==head){
            return null;
        }
        Node last=tail.prev;
        remove(last);
        return last;
    }
    public int size(){
        return size;
    }
}

class Node {
    public int key, val;
    public Node next, prev;
    public Node(int k, int v) {
        this.key = k;
        this.val = v;
    }
}
