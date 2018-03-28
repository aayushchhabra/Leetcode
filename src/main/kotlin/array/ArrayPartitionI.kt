package array

import java.util.*

public class ArrayPartitionI {
    public fun doPartition(nums: IntArray): Int {
        Arrays.sort(nums);
        var sum = 0
        for(i in 0 until nums.size step 2) {
            sum += nums[i]
        }
        return sum
    }
}