package behavioral.strategy

class PaypalPayment(
    private val email: String
): PaymentStrategy {
    override fun pay(amount: Double): String {
        return "Paid $amount using Paypal account: $email"
    }
}