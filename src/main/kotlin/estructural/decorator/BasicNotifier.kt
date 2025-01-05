package estructural.decorator

class BasicNotifier: Notifier {
    override fun send(message: String): String {
        return "Sending basic notification: $message"
    }
}