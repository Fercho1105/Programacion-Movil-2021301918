fun main() {
    println("Ingrese una cadena para encriptar:")
    val cadena = readLine() ?: ""
    val encriptada = cadena.map {
        when (it) {
            in 'A'..'Z' -> 'A' + (it - 'A' + 13) % 26
            in 'a'..'z' -> 'a' + (it - 'a' + 13) % 26
            else -> it
        }
    }.joinToString("")

    println("Cadena encriptada:\n$encriptada")
}
