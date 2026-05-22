import kotlin.test.*

class TrianguloTest {
    @Test
    fun `area de triangulo rectangulo 3-4-5 es 6`() {
        assertEquals(6.0, Triangulo(3.0, 4.0, 5.0).calcularArea(), 0.0001)
    }

    @Test
    fun `perimetro de triangulo 3-4-5 es 12`() {
        assertEquals(12.0, Triangulo(3.0, 4.0, 5.0).calcularPerimetro(), 0.0001)
    }

    @Test
    fun `lados invalidos lanzan excepcion`() {
        assertFailsWith<IllegalArgumentException> { Triangulo(1.0, 2.0, 10.0) }
    }

    @Test
    fun `lado negativo lanza excepcion`() {
        assertFailsWith<IllegalArgumentException> { Triangulo(-1.0, 3.0, 3.0) }
    }
}
