package u02.execution

sealed trait Option[A]
object Option {
  case class None[A]() extends Option[A]
  case class Some[A](a: A) extends Option[A]

  def filter[A](some: Option[A])(function: A => Boolean): Option[A] = some match {
    case None() => None()
    case Some(a) if function(a) => some
    case _ => None()
  }

  def map[A,B](some: Option[A])(function: A => B): Option[B] = some match {
    case None() => None()
    case Some(a) =>  Some(function(a))
  }
  def map2[A,B,C](some1: Option[A])(some2: Option[B])(function: (A, B) => C): Option[C] = (some1, some2) match {
    case (Some(a), Some(b)) => Some(function(a, b))
    case _ => None()

  }

}
