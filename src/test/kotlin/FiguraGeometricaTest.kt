import kotlin.math.PI
import kotlin.test.Test
import kotlin.test.assertEquals
import kotlin.test.assertFailsWith

class FiguraGeometricaTest {
    @Test
    fun circulo_calcula_area_y_perimetro() {
        val circulo = Circulo(2.0)
        assertEquals(PI * 4.0, circulo.calcularArea(), 1e-9)
        assertEquals(2 * PI * 2.0, circulo.calcularPerimetro(), 1e-9)
    }

    @Test
    fun rectangulo_calcula_area_y_perimetro() {
        val rectangulo = Rectangulo(3.0, 4.0)
        assertEquals(12.0, rectangulo.calcularArea(), 1e-9)
        assertEquals(14.0, rectangulo.calcularPerimetro(), 1e-9)
    }

    @Test
    fun triangulo_calcula_area_y_perimetro() {
        val triangulo = Triangulo(3.0, 4.0, 5.0)
        assertEquals(6.0, triangulo.calcularArea(), 1e-9)
        assertEquals(12.0, triangulo.calcularPerimetro(), 1e-9)
    }

    @Test
    fun circulo_rechaza_radio_no_positivo() {
        assertFailsWith<IllegalArgumentException> { Circulo(0.0) }
    }
}

