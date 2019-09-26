package Code_99_LuanShua;

//https://leetcode-cn.com/problems/convert-sorted-list-to-binary-search-tree/
//将有序链表转换成平衡的搜索二叉树

//no need to read

import Code_00_LeetCode_ShuaTi.Code_01_LinkList.ListNode;

public class Code_0109 {
    public TreeNode sortedListToBST(ListNode head) {
        int len=0;
        ListNode temp=head;
        while (temp!=null){
            len++;
            temp=temp.next;
        }
        int[] arr=new int[len];
        for (int i=0;i<arr.length;i++){
            arr[i]=head.val;
            head=head.next;
        }
        TreeNode root=createNode(arr,0,arr.length-1);
        return root;
    }

    private TreeNode createNode(int[] arr,int l,int r){
        if(l>r)
            return null;
        if(l==r)
            return new TreeNode(arr[l]);

        int mid=(l+r)/2;
        TreeNode node=new TreeNode(arr[mid]);
        node.left=createNode(arr,l,mid-1);
        node.right=createNode(arr,mid+1,r);
        return node;
    }
}
