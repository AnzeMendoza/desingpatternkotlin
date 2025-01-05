package estructural.decorator

class SMSNotifier(val notifier: Notifier): Notifier {
    override fun send(message: String): String {
        notifier.send(message)
        return "Sending notification via SMS: $message"
    }
}