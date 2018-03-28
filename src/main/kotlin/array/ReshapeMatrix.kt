package array

class ReshapeMatrix {
    fun doReshape (nums: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        if(nums.size * nums[0].size != r * c)
            return nums
        var newMatrix: Array<IntArray> = Array(r, { IntArray(c, {0}) })
        var newR: Int = 0
        var newC: Int = 0
        for(i in 0 until nums.size) {
            for(j in 0 until nums[i].size) {
                newMatrix[newR][newC] = nums[i][j];
                newC++;
                if(newC >= c) {
                    newC = 0;
                    newR++;
                }
            }
        }
        return newMatrix;
    }
}