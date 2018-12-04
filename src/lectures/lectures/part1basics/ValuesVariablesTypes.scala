package lectures.lectures

object ValuesVariablesTypes extends App {

  val x: Int = 42 // Can also be val x = 42 (types can be inferred)
  println(x)

  // vals are immutable = can't be reassigned
  // compiler can infer types

  val aString: String = "hello"; val anotherString = "goodbye"

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val aInt: int = x
  val aShort: Short = 4613
  val aLong: Long = 12345678901111L
  val aFloat: Float = 2.0f
  val aDouble: Double = 3.14

  //variables
  var aVariable: Int = 4

  aVariable = 5 // side effects
}
