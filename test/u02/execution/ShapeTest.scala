package u02.execution
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test

class ShapeTest {

  @Test def testFib(): Unit ={
    assertEquals(3, fib(4) )
    assertEquals(1346269, fib(31) )
  }
}
