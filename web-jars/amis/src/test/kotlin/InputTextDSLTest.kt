import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class InputTextDSLTest {

    var testName = "foo"
    var testLabel = "bar"

    @Test
    fun label() {
        val input = inputText {
            label {
                testLabel
            }
            name {
                testName
            }
        }
        assertNotNull(input)
        assertEquals(input.name, testName)
        assertEquals(input.label, testLabel)
    }

    @Test
    fun name() {
    }
}