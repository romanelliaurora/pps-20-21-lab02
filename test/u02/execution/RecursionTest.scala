package u02.execution

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import u02.execution.Recursion._




class RecursionTest {

  @Test def testFib(): Unit ={
    assertEquals(3, fib(4) )
    assertEquals(1346269, fib(31) )
  }
}
