import array.MaxConsecutiveOnes
import org.junit.Assert
import org.junit.Test

class MaxConsecutiveOnesTest {
    @Test
    public fun getMaxConsecutiveOnes () {
        val handler = MaxConsecutiveOnes()
        val maxNumber = handler.getMaxConsecutiveOnes(intArrayOf(1,1,1,0,0,0,1,1,1,1,0,0))
        Assert.assertTrue("Max number of ones do not match", maxNumber == 4)
    }
}