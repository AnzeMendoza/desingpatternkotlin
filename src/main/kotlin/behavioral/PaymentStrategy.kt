package behavioral

fun interface PaymentStrategy {
    fun pay(amount: Double): String
}