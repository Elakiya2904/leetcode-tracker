// Last updated: 7/8/2026, 3:36:16 PM
class Solution {
    public int missingNumber(int[] nums) {
        int xor=nums.length;
        for(int i=0;i<nums.length;i++){
            xor^=i^nums[i];
        }
        return xor;
    }
}