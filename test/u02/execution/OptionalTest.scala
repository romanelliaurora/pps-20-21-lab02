package u02.execution
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import u02.execution.Option._


class OptionalTest {


  @Test def testFilter(): Unit = {
    assertEquals(Some(5), filter(Some(5))(_>2))
    assertEquals(None(), filter(Some(5))(_ > 8))
  }


  @Test def testMap(): Unit = {
    assertEquals(Some(true),map(Some(5))(_ > 2))
    assertEquals(None[Int](),map(None[Int]())(_ > 2))
  }

  @Test def testMap2(): Unit = {
    assertEquals(Some(15),map2(Some(5))(Some(3))(_*_))
    assertEquals(None[Int](),map2(None[Int]())(Some(5))(_*_))
  }
}
