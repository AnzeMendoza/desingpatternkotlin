import behavioral.CreditCardPayment
import behavioral.CryptoPayment
import behavioral.PaymentContext
import behavioral.PaypalPayment
import estructural.decorator.BasicNotifier
import estructural.decorator.EmailNotifier
import estructural.decorator.PushNotifier
import estructural.decorator.SMSNotifier
import org.junit.jupiter.api.Test

class StrategyPatternTest {
    @Test
    fun `should be ok payment with Credit card`() {
        val creditCardPayment = CreditCardPayment("1234-1234-1234-1234")
        val paymentContext = PaymentContext(creditCardPayment)
        val result = paymentContext.executePayment(100.0)

        assert(result.contains("100.0"))
        assert(result.contains("1234-1234-1234-1234"))
    }

    @Test
    fun `should be ok payment with Paypal`() {
        val paypalPayment = PaypalPayment("mail@mail.com")
        val paymentContext = PaymentContext(paypalPayment)
        val result = paymentContext.executePayment(200.0)

        assert(result.contains("200.0"))
        assert(result.contains("mail@mail.com"))
    }

    @Test
    fun `should be ok payment with Crypto`() {
        val cryptoPayment = CryptoPayment("0xqwerrewq")
        val paymentContext = PaymentContext(cryptoPayment)
        val result = paymentContext.executePayment(300.0)

        assert(result.contains("300.0"))
        assert(result.contains("0xqwerrewq"))
    }
}