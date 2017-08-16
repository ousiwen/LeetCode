public class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int result1=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
        int result2=nums[nums.length-1]*nums[1]*nums[0];
        return result1>result2 ? result1:result2;
    }
}
