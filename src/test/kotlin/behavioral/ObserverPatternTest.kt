package behavioral

import behavioral.observer.Observer
import behavioral.observer.TemperatureDisplay
import behavioral.observer.WeatherStation
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

class ObserverPatternTest {
    @Test
    fun `temperature change notification`() {
        val weatherStation = WeatherStation()
        val display = TemperatureDisplay()
        var observedTemperature = 0.0f

        val testObserver = object : Observer {
            override fun update(temperature: Float) {
                observedTemperature = temperature
            }
        }

        weatherStation.addObserver(testObserver)
        weatherStation.temperature = 25.3f
        assertEquals(25.3f, observedTemperature)

        weatherStation.temperature = 30.0f
        assertEquals(30.0f, observedTemperature)
    }
}