Given an array, rotate the array to the right by k steps, where k is non-negative.

Example 1:

Input: [1,2,3,4,5,6,7] and k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: [-1,-100,3,99] and k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]

class Solution {
    public void rotate(int[] nums, int k) {
        
        int temp;
        /*
        if(k == 0){
            temp = nums[0];
            nums[0] = nums[nums.length - 1];
            nums[nums.length - 1] = temp;
        }
        */
        if(k == 0){
            return;
        }
        else{
            for(int c=0; c< k; c++)
        {
            temp = nums[nums.length-1];
            
            for(int i=nums.length-1; i>0; i--)
            {
                nums[i] = nums[i-1];
            }
            nums[0] = temp;
                     
            
        }
            
        }
      
            
        
        
        
    }
}
