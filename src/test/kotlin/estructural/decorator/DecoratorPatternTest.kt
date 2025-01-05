import estructural.decorator.BasicNotifier
import estructural.decorator.EmailNotifier
import estructural.decorator.PushNotifier
import estructural.decorator.SMSNotifier
import org.junit.jupiter.api.Test

class DecoratorPatternTest {
    @Test
    fun `should be ok`() {
        val basicNotifier = BasicNotifier()
        val emailNotifier = EmailNotifier(basicNotifier)
        val smsNotifier = SMSNotifier(emailNotifier)
        val pushNotifier = PushNotifier(smsNotifier)

        assert(pushNotifier.send("Hello, user").contains("PUSH"))
    }
}