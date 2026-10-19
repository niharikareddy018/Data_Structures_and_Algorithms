class Solution {
    public int[] exclusiveTime(int n, List<String> logs) {
        int[] res = new int[n];
        Stack<Integer> stack = new Stack<>();
        int prevTime = 0;

        for (String log : logs) {
            String[] parts = log.split(":");
            int id = Integer.parseInt(parts[0]);
            int timestamp = Integer.parseInt(parts[2]);

            if (parts[1].equals("start")) {
                if (!stack.isEmpty()) {
                    res[stack.peek()] += timestamp - prevTime;
                }
                stack.push(id);
                prevTime = timestamp;
            } else {
                res[stack.pop()] += timestamp - prevTime + 1;
                prevTime = timestamp + 1;
            }
        }
        return res;
    }
}
