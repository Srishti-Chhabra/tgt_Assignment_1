package MyPackage
import scala.io.StdIn.readDouble
import scala.io.StdIn.readInt

object TGT_Assignment_1 {
//  Function to add
  def add(a: Double,b: Double) = a+b
//  Function to subtract
  def subtract(a: Double,b: Double) = a-b
//  Function to multiply
  def multiply(a: Double,b: Double) = a*b
//  Function to divide
  def divide(a: Int,b: Int) = a/b

//  Menu driven function to perform 4 basic maths operations
  def main(args: Array[String]): Unit = {
    println("Choose an operation to perform: ")
    println("1: Addition")
    println("2: Subtraction")
    println("3: Multiplication")
    println("4: Division")
    println("5: Exit")

    while(true){
      println("Enter your choice: ")
      val choice: Double=readDouble()
      choice match{
        case 1 => {
          println("Enter two numbers: ")
          val a: Double=readDouble()
          val b: Double=readDouble()
          println(add(a,b))
        }
        case 2 => {
          println("Enter two numbers: ")
          val a: Double=readDouble()
          val b: Double=readDouble()
          println(subtract(a,b))
        }
        case 3 => {
          println("Enter two numbers: ")
          val a: Double=readDouble()
          val b: Double=readDouble()
          println(multiply(a,b))
        }
        case 4 => {
          println("Enter two numbers: ")
          val a: Int=readInt()
          val b: Int=readInt()
          println(divide(a,b))
        }
        case 5 => return
        case default => println("Please enter  a valid  choice!")
      }
    }
  }
}
