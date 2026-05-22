import kotlin.math.sqrt

class Triangulo(val ladoA: Double, val ladoB: Double, val ladoC: Double) : FiguraGeometrica {
    init {
        require(ladoA > 0 && ladoB > 0 && ladoC > 0) { "Todos los lados deben ser positivos" }
        require(ladoA + ladoB > ladoC && ladoA + ladoC > ladoB && ladoB + ladoC > ladoA) {
            "Los lados no forman un triángulo válido"
        }
    }
    override fun calcularArea(): Double {
        val s = (ladoA + ladoB + ladoC) / 2
        return sqrt(s * (s - ladoA) * (s - ladoB) * (s - ladoC))
    }
    override fun calcularPerimetro(): Double = ladoA + ladoB + ladoC
}

