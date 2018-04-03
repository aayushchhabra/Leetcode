import array.MaxAreaOfIsland
import org.junit.Assert
import org.junit.Test

class MaxAreaOfIslandTest {

    @Test
    fun getMaxAreaValid() {
        val matrix = arrayOf(
                intArrayOf(0,0,1,0,0,0,0,1,0,0,0,0,0),
                intArrayOf(0,0,0,0,0,0,0,1,1,1,0,0,0),
                intArrayOf(0,1,1,0,1,0,0,0,0,0,0,0,0),
                intArrayOf(0,1,0,0,1,1,0,0,1,0,1,0,0),
                intArrayOf(0,1,0,0,1,1,0,0,1,1,1,0,0),
                intArrayOf(0,0,0,0,0,0,0,0,0,0,1,0,0),
                intArrayOf(0,0,0,0,0,0,0,1,1,1,0,0,0),
                intArrayOf(0,0,0,0,0,0,0,1,1,0,0,0,0)
        )

        val handler = MaxAreaOfIsland()
        Assert.assertTrue(handler.getMaxArea(matrix) == 6)
    }

    @Test
    fun getMaxAreaInvalid() {
        val matrix = arrayOf(intArrayOf(0,0,0,0,0,0,0,0,0,0,0))
        val handler = MaxAreaOfIsland()
        Assert.assertTrue(handler.getMaxArea(matrix) == 0)
    }
}