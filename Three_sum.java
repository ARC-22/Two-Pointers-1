// Time Complexity : O(nlogn) + O(n^2)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes
// Any problem you faced while coding this :


// Your code here along with comments explaining your approach
// sort array and select three pointers. one to iterate through entire array.
// other two to calculate sum with first element and adjust the sum.
class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        if(nums == null || nums.length ==0){
            return new ArrayList<>();
        }

        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>(); 

        for(int i=0; i<nums.length; i++){

            if(i>1 && nums[i]==nums[i-1]){
                continue;
            }
            
            int j = i+1;
            int k = nums.length-1;  
            while(j<k){
                int sum = nums[i] + nums[j] + nums[k];

                if(sum == 0){
                    res.add(Arrays.asList(nums[i] , nums[j] , nums[k]));
                    j++;
                    k--;
                    while(j<k & nums[j]==nums[j-1]) j++;
                    while(j<k & nums[k]==nums[k+1]) k--;
                }
                else if (sum < 0){
                    j++;
                }
                else{
                    k--;
                }
            }
        }
        return res;
    }
}