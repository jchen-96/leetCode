package weekContest.week130;


//　no need to read
//链表中的下一个更大节点，简单的动态规划

public class Code_1030 {
    public int[] nextLargerNodes(ListNode head) {
        int count = 0;
        ListNode p = head;
        while (p != null) {
            count++;
            p = p.next;
        }
        int[] temp = new int[count];
        int[] index = new int[count];

        p = head;
        count = 0;
        while (p != null) {
            temp[count] = p.val;
            p = p.next;
            count++;
        }
        int i = temp.length - 1;
        while (i >= 0) {
            if (i == temp.length - 1) {
                index[i] = -1;
            } else {
                int next = i + 1;
                while (next != -1) {
                    if (temp[next] > temp[i]) {
                        index[i] = next;
                        break;
                    } else {
                        next = index[next];
                    }
                }
                if (next == -1) {
                    index[i] = -1;
                }
            }
            i--;
        }
        for (i = 0; i < index.length; i++) {
            if (index[i] == -1)
                index[i] = 0;
            else
                index[i] = temp[index[i]];
        }
        return index;
    }

}


class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

