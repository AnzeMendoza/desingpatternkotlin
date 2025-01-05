package creational.factorymethod

class Car: Vehicle {
    override fun startEngine(): String {
        return "Starting car engine"
    }

    override fun stopEngine(): String {
        return "Stopping car engine"
    }

    override fun drive(): String {
        return "Driving car"
    }
}