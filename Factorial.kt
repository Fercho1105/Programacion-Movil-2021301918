
/*
fun main() {
    print("Ingrese un número: ")
    var numero = readLine()!!.toInt()

    for (i in numero - 1 downTo 1) {
        numero *= i
    }

    println("El factorial es: $numero")
}
*/


fun main() {
    print("Ingrese un número: ")
    var numero = readLine()!!.toInt()
    var factorial = 1
    var i = numero

    while (i > 1) {
        factorial *= i
        i--
    }

    println("El factorial es: $factorial")
}