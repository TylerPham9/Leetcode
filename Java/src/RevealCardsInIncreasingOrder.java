import java.util.Arrays;
import java.util.Queue;
import java.util.LinkedList;

class RevealCardsInIncreasingOrder {
    public int[] deckRevealedIncreasing(int[] deck) {
        int size = deck.length;
        Arrays.sort(deck);
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < size; i++) {
            q.add(i);

        }
        int[] result = new int[size];

        for (int i = 0; i < size; i++) {
//            int x = ;
//            System.out.println(x);
            result[q.poll()] = deck[i];
//            System.out.println(deck[i]);

//            x = q.poll();
//            System.out.println(x);
            q.add(q.poll());
        }
        return result;
    }

    public static void main(String[] args){
        RevealCardsInIncreasingOrder s = new RevealCardsInIncreasingOrder();
        int[] input = {17, 13, 11, 2, 3, 5, 7};
        int[] result = s.deckRevealedIncreasing(input);
        System.out.println(Arrays.toString(result));
    }
}
