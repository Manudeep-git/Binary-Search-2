 // Time Complexity : O(logn) where n is  number of rows, m is no of columns
// Space Complexity : O(1) 
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this : No
class Solution {
    public int findPeakElement(int[] nums) {
        if(nums.length==1){
            return 0;
        }
        
        for(int i=1;i<nums.length-1;i++){
            if((nums[i-1]<nums[i]) && (nums[i]>nums[i+1])){
                return i;
            }
        }
        if(nums[0]>nums[1]){
            return 0;
        }
        
        if(nums[nums.length-1]>nums[nums.length-2]){
            return nums.length-1;
        }
        return -1;
    }
}
