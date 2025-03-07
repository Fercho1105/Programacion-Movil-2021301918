// Programa para ordenar los elementos de un arreglo usando el método de la burbuja (Bubble Sort).
fun main() {
    var temporal: Int
    var arreglo = intArrayOf(40, 20, 50, 10, 30)

    println("Números desordenados:")
    for (i in 0..4) {
        print(" ${arreglo[i]}")
    }

    for (i in 0..4) {
        for (j in 1..(4-i)) {
            if (arreglo[j - 1] > arreglo[j]) {
                temporal = arreglo[j - 1]
                arreglo[j - 1] = arreglo[j]
                arreglo[j] = temporal
            }
        }
    }

    println("\nNúmeros ordenados:")
    for (i in 0..4) {
        print(" ${arreglo[i]}")
    }
}
