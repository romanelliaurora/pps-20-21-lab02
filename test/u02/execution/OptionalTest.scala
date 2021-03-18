package u02.execution
import org.junit.jupiter.api.Assertions._
import org.junit.jupiter.api.Test
import u02.execution.Option._


class OptionalTest {


  @Test def testFilter(): Unit = {
    assertEquals(Some(5), filter(Some(5))(_>2))
    assertEquals(None(), filter(Some(5))(_ > 8))
  }
}
