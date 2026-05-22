import kotlin.math.PI

class Circulo(val radio: Double) : FiguraGeometrica {
    init { require(radio > 0) { "El radio debe ser mayor que cero" } }
    override fun calcularArea(): Double = PI * radio * radio
    override fun calcularPerimetro(): Double = 2 * PI * radio
}

