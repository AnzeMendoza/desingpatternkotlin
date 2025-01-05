import creational.factorymethod.VehicleFactory
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class FactoryMethodPatternTest {
    @Test
    fun `should be ok`() {
        val factory = VehicleFactory()

        val car = factory.createVehicle("car")
        assertEquals(car?.startEngine(), "Starting car engine")

        val motorcycle = factory.createVehicle("motorcycle")
        assertEquals(motorcycle?.startEngine(), "Starting motorcycle engine")
    }
}