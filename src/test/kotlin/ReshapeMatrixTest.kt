import array.ReshapeMatrix
import org.junit.Assert
import org.junit.Test


class ReshapeMatrixTest {
    @Test
    public fun reshapeMatrix() {
        var matrixHandler = ReshapeMatrix()
        var matrix = arrayOf(intArrayOf(1,2), intArrayOf(3,4))
        var newMatrix = matrixHandler.doReshape(matrix, 1, 4)
        Assert.assertArrayEquals("Arrays are not equal",
                arrayOf(intArrayOf(1,2,3,4)), newMatrix)
        newMatrix = matrixHandler.doReshape(matrix, 2, 4)
        Assert.assertArrayEquals("Arrays are not equal", matrix, newMatrix)
    }
}