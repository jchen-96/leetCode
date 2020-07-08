package Code_99_HOT_100;


import java.util.HashMap;

public class Code_0146 {

}

//LRU缓存算法的设计

class LRUCache {
    CacheList cacheList;
    HashMap<Integer,DataNode> map;
    int capc;
    int size;

    public LRUCache(int capc) {
        this.cacheList = new CacheList();
        this.map = new HashMap<>();
        this.capc = capc;
    }

    public int get(int key){
        if(!map.containsKey(key))
            return -1;
        DataNode node=map.get(key);
        cacheList.deleteNode(node);
        cacheList.addFirst(node);
        return node.v;
    }

    public void put(int k,int v){
        DataNode node=new DataNode(k,v);
        if(map.containsKey(k)){
            cacheList.deleteNode(map.get(k));
            size--;
        }
        if(size==capc){
            DataNode t=cacheList.removeLast();
            map.remove(t.k);
            size--;
        }
        map.put(k,node);
        cacheList.addFirst(node);
        size++;
    }
}

class CacheList{
    int capc;
    DataNode head;
    DataNode tail;

    public CacheList() {
        capc=0;
        this.head = new DataNode(0,0);
        this.tail = new DataNode(0,0);
        head.next=tail;
        tail.pre=head;
    }

    public void addFirst(DataNode node){
        capc++;
        node.next=head.next;
        head.next.pre=node;
        head.next=node;
        node.pre=head;
    }
    public DataNode removeLast(){
        capc--;
        if(capc<0)
            return null;
        DataNode temp=tail.pre;
        tail.pre.pre.next=tail;
        tail.pre=tail.pre.pre;
        return temp;
    }
    public void deleteNode(DataNode node){
        capc--;
        if(capc<0)
            return;
        node.pre.next=node.next;
        node.next.pre=node.pre;
    }
}

class DataNode{
    int k,v;
    DataNode pre,next;
    public DataNode(int k, int v) {
        this.k = k;
        this.v = v;
    }
}

