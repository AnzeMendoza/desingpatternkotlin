package estructural.decorator

class EmailNotifier(val notifier: Notifier): Notifier {
    override fun send(message: String): String {
        notifier.send(message)
        return "Sending notification via email: $message"
    }
}