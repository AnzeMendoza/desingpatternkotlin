package behavioral

class CreditCardPayment(
    private val cardNumber: String
): PaymentStrategy {
    override fun pay(amount: Double): String {
        return "Paid $amount using Credit Card with number: $cardNumber"
    }
}