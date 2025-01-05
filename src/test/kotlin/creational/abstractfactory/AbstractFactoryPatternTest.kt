import creational.abstractfactory.AbstractFactory
import creational.abstractfactory.FuturisticFactory
import creational.abstractfactory.MedievalFactory
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class AbstractFactoryPatternTest {
    @Test
    fun `should be medieval castle`() {
        val factory: AbstractFactory = MedievalFactory()
        val medievalCastle = factory.createCastle()
        
        assertEquals(medievalCastle.getDescription(), "Medieval Castle")
    }

    @Test
    fun `should be futuristic wall`() {
        val factory: AbstractFactory = FuturisticFactory()
        val futuristicWall = factory.createWall()

        assertEquals(futuristicWall.getMaterial(), "Titanium")
    }
}