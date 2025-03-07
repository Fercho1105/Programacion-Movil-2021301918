import kotlin.math.sqrt

fun main() {
    println("Cuál es el valor de L? ")
    val ll = readLine()!!.toDouble()

    //Perimetro
    val ladoraiz = sqrt((ll * ll) + (ll * ll))
    val ladoraiz2 = sqrt((3 * ll / 2) * (3 * ll / 2) + ll * ll)

    val partePLana = (ll/2) + (ll/4) + 2*ll + (ll/4) + (ll/2) + (3 * ll / 2)
    val parteDificil = (2 * ladoraiz) + ladoraiz2

    val perimetro = parteDificil + partePLana

    // Cálculo del área
    val area1 = ll * ll
    val area2 = ((1 * ll /4) * 2*ll)
    val area3 = ((3 * ll / 2) * ll) / 2
    val area4 = (ll * ll) / 2
    val areaTotal = area1 + area2 + area3 + 2*area4

    println(perimetro)
    println(areaTotal)

}

