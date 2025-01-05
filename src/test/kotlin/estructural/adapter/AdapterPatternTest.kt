import estructural.adapter.Adapter
import estructural.adapter.ThirdParties
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AdapterPatternTest {
    @Test
    fun `should be ok`() {

        val thirdParties = ThirdParties()
        val adapter = Adapter(thirdParties)

        assertEquals(adapter.adaptedMethod(), "Adapted: Origin method by ThirdParties")

    }
}