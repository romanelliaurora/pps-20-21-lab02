package u02.execution

object UtilityFunctions {

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

  val  isOrdered: (Int, Int, Int) => Boolean = (x:Int, y:Int, z:Int) =>  (x<=y && y<=z)
  def  isOrderedMethod: (Int, Int, Int) => Boolean = (x:Int, y:Int, z:Int) =>  (x<=y && y<=z)
  val  curriedIsOrdered: Int => Int => Int => Boolean = x => y => z => (x<=y && y<=z)
  def  curriedIsOrderedMethod (x:Int)( y:Int)( z:Int) : Boolean = (x<=y && y<=z)

}
