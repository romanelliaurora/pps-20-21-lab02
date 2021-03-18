package u02.execution

import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse, assertTrue}
import org.junit.jupiter.api.Test
import u02.execution.UtilityFunctions.{curriedIsOrdered, curriedIsOrderedMethod, isOrdered, isOrderedMethod, neg, negGenerics, negMethod, parity, parityMethod}

class UtilityTest {

  @Test def testParity(){
    assertEquals("Even", parity(4))
    assertEquals("Odd", parity(3))
    assertEquals("Even", parityMethod(4))
    assertEquals("Odd", parityMethod(3))

  }

  @Test def testNeg(): Unit ={
    val empty: String => Boolean = _==""
    var notEmpty = neg(empty)
    assertTrue(notEmpty("foo") )
    assertFalse(notEmpty(""))
    assertTrue(notEmpty("foo") && !notEmpty("") )
    notEmpty = negMethod(empty)
    assertTrue(notEmpty("foo") )
    assertFalse(notEmpty(""))
    assertTrue(notEmpty("foo") && !notEmpty("") )

  }

  @Test def testNegGenerics(): Unit ={
    val empty: String => Boolean = _==""
    val zero : Int => Boolean = _==0
    val bTrue : Boolean => Boolean = _==true
    val notEmpty = negGenerics(empty)
    val notZero = negGenerics(zero)
    val notTrue = negGenerics(bTrue)
    assertTrue(notEmpty("foo") )
    assertFalse(notEmpty(""))
    assertTrue(notEmpty("foo") && !notEmpty("") )
    assertTrue(notZero(3))
    assertTrue(notTrue(false) )

  }

  @Test def testOrdered(): Unit ={
    assertTrue(isOrdered(3, 5, 7) )
    assertFalse(isOrdered(10, 5, 7) )
    assertTrue(isOrderedMethod(3, 5, 7) )
    assertFalse(isOrderedMethod(10, 5, 7) )
    assertTrue(curriedIsOrdered(3)(5)(7) )
    assertFalse(curriedIsOrdered(10)(5)(7) )
    assertTrue(curriedIsOrderedMethod(3)(5)(7) )
    val minTenOrdered: Int => Int => Boolean = curriedIsOrderedMethod(10)
    assertTrue(minTenOrdered(15)(25) )
    assertFalse(minTenOrdered(7)(3) )
  }
}
