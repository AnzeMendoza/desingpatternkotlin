package behavioral.observer

class TemperatureDisplay: Observer {
    override fun update(temperature: Float) {
        println("Temperature: $temperature °C")
    }
}