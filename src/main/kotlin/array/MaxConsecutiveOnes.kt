package array

class MaxConsecutiveOnes {

    fun getMaxConsecutiveOnes(nums: IntArray): Int {
        var current = 0
        var max = 0
        for (i in nums) {
            if(i == 0) {
                current = 0
            } else {
                current++
                max = Math.max(max, current)
            }
        }
        return max
    }
}