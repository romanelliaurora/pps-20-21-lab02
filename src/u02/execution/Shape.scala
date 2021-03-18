package u02.execution
import math._


sealed trait Shape
object Shape {
  case class Square(side: Double) extends Shape
  case class Rectangle(side1: Double, side2: Double) extends Shape
  case class Circle(radius: Double) extends Shape

  def perimeter(shape: Shape):Double = shape match {
    case Square(side) => side*4
    case Rectangle(side1, side2) => (side1+side2)*2
    case Circle(radius) => 2*radius*Pi
  }

  def area(shape: Shape):Double = shape match {
    case Square(side) => math.pow(side,2)
    case Rectangle(side1, side2) =>side1*side2
    case Circle(radius) => pow(radius,2)*Pi

  }


}
