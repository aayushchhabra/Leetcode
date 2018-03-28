import array.ArrayPartitionI
import org.junit.Assert
import org.junit.Test

class ArrayPartitionITest {
    @Test
    public fun doPartitionTest() {
        var handler = ArrayPartitionI();
        Assert.assertTrue("Arrays do not match",
                handler.doPartition(intArrayOf(4,3,1,2)) == 4)
        Assert.assertTrue("Arrays do not match",
                handler.doPartition(intArrayOf()) == 0)
        Assert.assertTrue("Arrays do not match",
                handler.doPartition(intArrayOf(-1, -6, -4, -2)) == -8)
    }
}