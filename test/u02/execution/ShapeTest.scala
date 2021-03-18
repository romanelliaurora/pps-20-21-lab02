package u02.execution
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import u02.execution.Shape._

import scala.math.Pi

class ShapeTest {

  @Test def testShape(): Unit = {
    assertEquals(42, perimeter(Square(10.5)))
    assertEquals(9, area(Square(3)))
    assertEquals(27.4, perimeter(Rectangle(10.5, 3.2)))
    assertEquals(33.6, area(Rectangle(10.5, 3.2)))
    assertEquals(21*Pi, perimeter(Circle(10.5)))
    assertEquals(110.25*Pi, area(Circle(10.5)))

  }

}

