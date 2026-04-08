class Solution {
    fun hasDuplicate(nums: IntArray): Boolean {

    //Brute force
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
            if (nums[i] == nums[j]) {
                return true
            }
        }
    }
    return false
    }
}
