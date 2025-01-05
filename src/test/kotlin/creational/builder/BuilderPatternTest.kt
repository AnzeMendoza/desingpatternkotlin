import creational.builder.Pizza
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class BuilderPatternTest {
    @Test
    fun `should be ok`() {
        val pizza = Pizza.Builder()
            .size("XL")
            .ingredients("Cheese", "onion")
            .price(2000.0)
            .build()

        assertEquals(pizza.size, "XL")
        assertEquals(pizza.price, 2000.0)
        assertEquals(pizza.ingredients.size, 2)
    }
}