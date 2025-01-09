package behavioral.strategy

fun interface PaymentStrategy {
    fun pay(amount: Double): String
}