package u02

object AnonymousFunctions{

  // first-class, anonymous functions (lambdas) with various syntax
  val f1 = (x: Int, y: Int) => x + y
  val f2: (Int, Int) => Int = (x: Int, y: Int) => x + y
  val f3: (Int, Int) => Int = (x, y) => x + y
  val f4: (Int, Int) => Int = _ + _
  val f5: (Int, Int) => Int = f4
  // val f6 = _ + _ // won't type-check

  println(f1(10, 5), f4(10, 5)) // (15,15)

  val g: Int => Int =
    (x: Int) => { // a lambda with an imperative body
      println("hello")
      x + 1 // last statement is a return
    }

  println(g(10)) // hello \n 11

  // higher-order functions are smoothly handled
  val h: (Int, Int, (Int, Int) => Int) => Int =
    (a, b, f) => f(a, b)

  println(h(10, 5, _ * _)) // 50
  println(h(10, 5, (a,b) => a+b )) // 15
  println(h(10, 5, f1 )) // 15

  val i: ( Int, Int => Int, Int => Int) => Int =
    (n, f1, f2) => f1(f2(n))

  println(i(10, _ + 1, _ * 2)) // 21

  val l: (Int => Int) => (Int => Int) =
    (f => (i => f(f(i))))

  println(l(_+1)(10)) // 12, see currying next..
 // (x : Int, y: String) =>

  val parity: Int => String = {
    case x if x%2 == 0 => "Even"
    case _ => "Odd"
  }

  def parityMethod (x :Int): String = x match {
    case x if x%2 == 0 => "Even"
    case _ => "Odd"
  }

  val neg: (String => Boolean) => (String => Boolean) = pred => string => !pred(string)

  def negMethod : (String => Boolean) => (String => Boolean) = pred => string => !pred(string)
  def negGenerics[A] (pred: A => Boolean): A => Boolean = string => !pred(string)

  val  isOrdered= (x:Int, y:Int, z:Int) =>  (x<=y && y<=z)
  def  isOrderedMethod= (x:Int, y:Int, z:Int) =>  (x<=y && y<=z)
  val  curriedIsOrdered: Int => Int => Int => Boolean = x => y => z => (x<=y && y<=z)
  def  curriedIsOrderedMethod (x:Int)( y:Int)( z:Int) : Boolean = (x<=y && y<=z)

  def compose(f: Int => Int, g: Int => Int): Int => Int = x=> f(g(x))

  def composeGenerics[A] (f: A => A, g: A => A): A => A = x=> f(g(x))

  def composeFullGenerics[A,B,C](f: B => C, g: A => B): A => C = x=> f(g(x))

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
