class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
    val sum = (nums1+nums2)
    val sizesum = sum.size
    sum.sort()
    if(sizesum %2 == 1){
        return (sum[(sizesum/2)]).toDouble()
    }else{
        return (sum[(sizesum/2)-1]+sum[sizesum/2]).toDouble()/2
    }
    }
}