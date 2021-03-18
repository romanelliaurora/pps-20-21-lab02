package u02.execution

object Recursion {
  def fib(n: Int): Int ={
    var first = 0
    var second = 0
    @annotation.tailrec
    def _fib(n: Int, acc: Int): Int = n match {

      case 0 | 1 => acc
      case _ => {
        first = second
        second = acc
        _fib(n - 1,first+second )
      }
    }
    _fib(n, 1)
  }

  def fibNoTail (n: Int): Int = n match {
    case 0=>0
    case 1=>1
    case _=> fibNoTail(n-1)+fibNoTail(n-2)
  }

}
