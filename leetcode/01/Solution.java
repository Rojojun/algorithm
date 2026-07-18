class Solution {
  public int[] nextGreaterElements(int[] nums) {
    int[] result = new int[nums.length];

    for (int i = 0; i < nums.length; i++) {
      result[i] = -1;

      for (int j = 0; j < nums.length; j++) {
        int nextIndex = (i + j) % nums.length;

        if (nums[nextIndex] > nums[i]) {
          result[i] = nums[nextIndex];
          break;
        }
      }
    }
    return result;
  }
}
