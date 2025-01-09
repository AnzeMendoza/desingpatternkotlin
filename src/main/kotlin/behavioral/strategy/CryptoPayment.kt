package behavioral.strategy

class CryptoPayment(
    private val walletAddress: String
): PaymentStrategy {
    override fun pay(amount: Double): String {
        return "Paid $amount using Crypto wallet: $walletAddress"
    }
}