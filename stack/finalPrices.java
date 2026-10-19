class Solution {
	public int[] finalPrices(int[] prices) {
		int[] res = prices.clone();
		Stack<Integer> stack = new Stack<>();

		for (int i = 0; i < prices.length; i++) {
			while (!stack.isEmpty() && prices[stack.peek()] >= prices[i]) {
				res[stack.pop()] -= prices[i];
			}
			stack.push(i);
		}
		return res;
	}
}