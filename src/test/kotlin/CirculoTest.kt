import kotlin.math.PI
import kotlin.test.*

class CirculoTest {
    private lateinit var circulo: Circulo

    @BeforeTest
    fun setUp() {
        circulo = Circulo(5.0)
    }

    @Test
    fun `area de circulo con radio 5 es correcta`() {
        assertEquals(PI * 25.0, circulo.calcularArea(), 0.0001)
    }

    @Test
    fun `perimetro de circulo con radio 5 es correcto`() {
        assertEquals(2 * PI * 5.0, circulo.calcularPerimetro(), 0.0001)
    }

    @Test
    fun `radio cero lanza excepcion`() {
        assertFailsWith<IllegalArgumentException> { Circulo(0.0) }
    }

    @Test
    fun `radio negativo lanza excepcion`() {
        assertFailsWith<IllegalArgumentException> { Circulo(-3.0) }
    }
}
