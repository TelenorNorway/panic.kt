package no.telenor.kt

import kotlin.system.exitProcess

@Suppress("unused")
fun panic(message: String, vararg arguments: Any?): Nothing {
	panic(message, null, *arguments)
}

fun panic(message: String, throwable: Throwable? = null, vararg arguments: Any?): Nothing {
	println("\u001b[91;1merror\u001b[39m: ${message.format(*arguments)}")
	throwable?.printStackTrace()
	exitProcess(1)
}
