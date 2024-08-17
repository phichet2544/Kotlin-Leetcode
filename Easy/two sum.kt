class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        for(i in 0..nums.size-1){
            for(n in i+1..nums.size-1){
                //sum myself is worng
                if(nums[i] + nums[n]==target){
                    return intArrayOf(i,n)
                }
            }
        }
        return intArrayOf()
        
    }
}