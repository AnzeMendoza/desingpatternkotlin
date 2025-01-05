package estructural.adapter

class Adapter(val thirdParties: ThirdParties) {
    fun adaptedMethod(): String {
        return "Adapted: ${thirdParties.originalMethod()}"
    }
}