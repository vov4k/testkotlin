import org.junit.Test
import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.*
import kotlin.test.assertEquals

internal class MainKtTest {
    @Test
    fun testSumStrings() {
        val args = arrayOf("1", "2", "-2", "Nan")
        val expected = 1
        Assertions.assertEquals(expected, sumStrings(args))
    }
    @Test
    fun `пустой массив`() {
        val args = emptyArray<String>()
        val expected = 0
        Assertions.assertEquals(expected, sumStrings(args))
    }
}