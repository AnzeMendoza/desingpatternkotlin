package estructural.decorator

class PushNotifier(val notifier: Notifier): Notifier {
    override fun send(message: String): String {
        notifier.send(message)
        return "Sending notification via PUSH: $message"
    }
}