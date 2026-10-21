class Solution {
    public int countStudents(int[] students, int[] sandwiches) {
        Stack<Integer> st = new Stack<>();
        for (int i = sandwiches.length - 1; i >= 0; i--) {
            st.push(sandwiches[i]);
        }
        Queue<Integer> queue = new LinkedList<>();
        for (int q : students) {
            queue.add(q);
        }
        int j = 0;
        while (j < queue.size() && !queue.isEmpty()) {
            if (queue.peek() == st.peek()) {
                queue.poll();
                st.pop();
                j = 0;
            } else {
                queue.add(queue.poll());
                j++;
            }
        }
        return queue.size();
    }
}
