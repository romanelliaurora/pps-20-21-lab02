package u02.execution

import org.junit.jupiter.api.Assertions.{assertEquals, assertFalse}
import org.junit.jupiter.api.Test
import u02.execution.ComposeFunctions.{compose, composeFullGenerics, composeGenerics}

class ComposeTest {
  @Test def testCompose(): Unit ={
    assertEquals(9, compose(_-1,_*2)(5)  )
    assertEquals("Ciao a tutti", composeGenerics[String](_+" tutti",_+" a")("Ciao")  )
    assertFalse(composeFullGenerics[String, Int, Boolean](_<5,_.length())("Contare")  )
  }
}
