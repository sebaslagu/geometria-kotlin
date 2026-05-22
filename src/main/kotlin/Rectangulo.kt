class Rectangulo(val base: Double, val altura: Double) : FiguraGeometrica {
    init {
        require(base > 0) { "La base debe ser mayor que cero" }
        require(altura > 0) { "La altura debe ser mayor que cero" }
    }
    override fun calcularArea(): Double = base * altura
    override fun calcularPerimetro(): Double = 2 * (base + altura)
}

