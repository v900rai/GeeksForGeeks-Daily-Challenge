class Solution {
	public int getSecondLargest(int[] arr) {
		
		int firstMax = Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for (int num : arr)
			{
			if (num>firstMax)
				{
				secondMax = firstMax;
				firstMax =num;
				continue;
				
			}
			if (num>secondMax && num != firstMax)
				{
				secondMax = num;
			}
		}
		return secondMax == Integer.MIN_VALUE ? -1 :secondMax;
	}
}
