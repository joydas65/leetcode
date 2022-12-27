class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int stone : stones) {
            pq.offer(stone);
        }

        int w1 = 0, w2 = 0;

        while (!pq.isEmpty() && pq.size() > 1) {
            w1 = pq.poll();
            w2 = pq.poll();

            if (w1 != w2) {
                pq.offer(w1-w2);
            }
        }

        return pq.isEmpty() ? 0 : pq.poll();
    }
}
