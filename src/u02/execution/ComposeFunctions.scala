package u02.execution

object ComposeFunctions{

  def compose(f: Int => Int, g: Int => Int): Int => Int = x=> f(g(x))

  def composeGenerics[A] (f: A => A, g: A => A): A => A = x=> f(g(x))

  def composeFullGenerics[A,B,C](f: B => C, g: A => B): A => C = x=> f(g(x))


}
