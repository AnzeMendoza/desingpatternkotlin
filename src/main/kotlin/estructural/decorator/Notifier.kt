package estructural.decorator

fun interface Notifier {
    fun send(message: String): String
}