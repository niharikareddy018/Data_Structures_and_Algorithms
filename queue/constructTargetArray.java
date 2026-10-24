class Solution {
    public boolean isPossible(int[] target) {
        if (target.length == 1) {
            return target[0] == 1;
        }
        long totalSum = 0;
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        for (int num : target) {
            totalSum += num;
            maxHeap.add(num);
        }
        while (maxHeap.peek() > 1) {
            int maxVal = maxHeap.poll();
            long remainingSum = totalSum - maxVal;
            if (remainingSum <= 0 || maxVal <= remainingSum) {
                return false;
            }
            long oldValue = maxVal % remainingSum;
            if (oldValue == 0) {
                return remainingSum == 1;
            }
            maxHeap.add((int) oldValue);
            totalSum = remainingSum + oldValue;
        }
        return true;
    }
}