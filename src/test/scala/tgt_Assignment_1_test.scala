import MyPackage.TGT_Assignment_1
import org.scalatest.flatspec.AnyFlatSpec

class tgt_Assignment_1_test extends AnyFlatSpec {
  "Add function" should "add two numbers" in{
    assert(TGT_Assignment_1.add(5,9) ==14)
  }

  "Subtract function" should "subtract two numbers" in{
    assert(TGT_Assignment_1.subtract(10,6) ==4)
  }

  "Multiply function" should "multiply two numbers" in{
    assert(TGT_Assignment_1.multiply(40,2) ==80)
  }

  "Divide function" should "divide two numbers" in{
    assert(TGT_Assignment_1.divide(72,8) ==9)
  }

  it should "produce ArithmeticException when the number is attempted to divide by 0" in{
    assertThrows[java.lang.ArithmeticException]{
      TGT_Assignment_1.divide(10,0)
    }
  }
}
