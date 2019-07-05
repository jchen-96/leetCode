package Code_01_arrayProblem;

import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

//https://leetcode-cn.com/problems/reveal-cards-in-increasing-order/

public class Code_0950{
    public int[] deckRevealedIncreasing(int[] deck) {
        // 倒推
        Arrays.sort(deck);
        LinkedList<Integer> deque = new LinkedList<>();
        deque.offerFirst(deck[deck.length - 1]);
        for (int i = deck.length - 2;i >= 0; i--) {
            deque.offerFirst(deque.pollLast());
            deque.offerFirst(deck[i]);
        }

        int[] res = new int[deck.length];
        for (int i = 0;i < deck.length;i++) {
            res[i] = deque.pollFirst();
        }
        return res;
    }

    public static void main(String[] args) {
        Code_0950 code_0950=new Code_0950();
        int[] res=code_0950.deckRevealedIncreasing(new int[]{13,15});
        for(int i:res){
            System.out.println(i);
        }
    }
}