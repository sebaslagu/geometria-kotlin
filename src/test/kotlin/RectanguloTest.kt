import kotlin.test.*

class RectanguloTest {
    private lateinit var rectangulo: Rectangulo

    @BeforeTest
    fun setUp() {
        rectangulo = Rectangulo(4.0, 6.0)
    }

    @Test
    fun `area de rectangulo 4x6 es 24`() {
        assertEquals(24.0, rectangulo.calcularArea(), 0.0001)
    }

    @Test
    fun `perimetro de rectangulo 4x6 es 20`() {
        assertEquals(20.0, rectangulo.calcularPerimetro(), 0.0001)
    }

    @Test
    fun `base negativa lanza excepcion`() {
        assertFailsWith<IllegalArgumentException> { Rectangulo(-1.0, 4.0) }
    }

    @Test
    fun `altura cero lanza excepcion`() {
        assertFailsWith<IllegalArgumentException> { Rectangulo(4.0, 0.0) }
    }
}
