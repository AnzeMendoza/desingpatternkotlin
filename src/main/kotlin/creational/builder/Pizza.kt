package creational.builder

class Pizza {
    var size: String? = null
    var crust: String? = null
    var ingredients: List<String?> = emptyList()
    var price: Double? = null

    class Builder {
        private val pizza = Pizza()
        fun size(size: String) = apply {pizza.size = size}
        fun crust(crust: String) = apply {pizza.crust = crust}
        fun ingredients(vararg ingredients: String) = apply {pizza.ingredients = ingredients.toList()}
        fun price(price: Double) = apply {pizza.price = price}
        fun build() = pizza
    }
}