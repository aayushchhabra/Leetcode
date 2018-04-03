package array

class MaxAreaOfIsland {

    fun getMaxArea(matrix: Array<IntArray>): Int {
        var max = 0
        val maxRow = matrix.size
        val maxCol = matrix[0].size
        var seen = Array(maxRow, {BooleanArray(maxCol, {false})})
        for (i in 0 until maxRow) {
            for (j in 0 until maxCol) {
                max = Math.max(max, getMaxAtIndex(matrix, seen, i, j))
            }
        }
        return max
    }

    private fun getMaxAtIndex(matrix: Array<IntArray>, seen: Array<BooleanArray>, r: Int, c: Int): Int {
        if(r >= matrix.size || c >= matrix[0].size
                || r < 0 || c < 0
                || matrix[r][c] == 0
                || seen[r][c])
            return 0
        seen[r][c] = true
        return 1 + getMaxAtIndex(matrix, seen, r + 1, c) +
                getMaxAtIndex(matrix, seen, r - 1, c) +
                getMaxAtIndex(matrix, seen, r, c + 1) +
                getMaxAtIndex(matrix, seen, r, c - 1)
    }
}