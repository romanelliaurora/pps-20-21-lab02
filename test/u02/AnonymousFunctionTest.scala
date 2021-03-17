package u02

import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import u02.AnonymousFunctions._

class AnonymousFunctionTest {


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
}
