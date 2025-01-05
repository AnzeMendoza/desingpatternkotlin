package creational.factorymethod

class Motorcycle: Vehicle {
    override fun startEngine(): String {
        return "Starting motorcycle engine"
    }

    override fun stopEngine(): String {
        return "Stopping motorcycle engine"
    }

    override fun drive(): String {
        return "Driving motorcycle"
    }
}