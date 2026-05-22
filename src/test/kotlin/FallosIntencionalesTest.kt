import kotlin.test.Test

class FallosIntencionalesTest {
    @Test
    fun `fallo intencional - circulo con radio cero no deberia fallar`() {
        Circulo(0.0).calcularArea()
    }

    @Test
    fun `fallo intencional - triangulo invalido no deberia fallar`() {
        Triangulo(1.0, 2.0, 10.0).calcularPerimetro()
    }

    @Test
    fun `fallo intencional - rectangulo con altura cero no deberia fallar`() {
        Rectangulo(4.0, 0.0).calcularArea()
    }
}
