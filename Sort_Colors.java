// Time Complexity : O(n)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach

class Solution {
    public void sortColors(int[] nums) {
        if(nums == null || nums.length == 0){
            return;
        }
        int n = nums.length;
        int left = 0, mid= 0, right = n-1;

        while(mid <= right){
            if(nums[mid] == 2){
                swap(nums, mid, right);
                right--; // not incrementing mid since swaped value can be unsorted
            }
            else if(nums[mid] == 0){
                swap(nums, mid, left);
                left++;
                mid++; // swaped value(0) is at right place, move forward(mid++) 
            }
            else{
                mid++;
            }
        }
        
    }
    private void swap(int[]nums, int i,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
}
