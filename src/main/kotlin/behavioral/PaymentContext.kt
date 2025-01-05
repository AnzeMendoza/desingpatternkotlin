package behavioral

class PaymentContext(
    private var strategy: PaymentStrategy
) {
    fun setPaymentStrategy(strategy: PaymentStrategy) {
        this.strategy = strategy
    }

    fun executePayment(amount: Double): String {
        return strategy.pay(amount)
    }
}