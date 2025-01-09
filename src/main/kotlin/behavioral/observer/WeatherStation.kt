package behavioral.observer

class WeatherStation {
    val observers = mutableListOf<Observer>()

    var temperature: Float = 0.0f
        set(value) {
            field = value
            notifyObservers()
        }

    fun addObserver(observer: Observer) {
        observers.add(observer)
    }

    fun removeObserver(observer: Observer) {
        observers.remove(observer)
    }

    private fun notifyObservers() {
        observers.forEach { it.update(temperature) }
    }
}