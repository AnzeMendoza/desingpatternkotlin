package creational.factorymethod

class VehicleFactory {
    fun createVehicle(type: String): Vehicle? =
        when(type)  {
            "car" -> Car()
            "motorcycle" -> Motorcycle()
            else -> null
        }
}