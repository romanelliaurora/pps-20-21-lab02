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

}
