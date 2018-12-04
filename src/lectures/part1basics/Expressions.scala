package lectures.part1basics

object Expressions extends App{
  val x = 1 + 2 // Expression
  println(x)

  println(2 + 3 + 4)
  // + - * / & | ^ << >> >>> (right shift with zero extension)

  println(1 == x)
  // == != >= < <=

  println(!(1== x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /= ..... side effects
  println(aVariable)

  // Instructions (DO) vs Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3
  println(aConditionedValue)
  println(if(aCondition) 5 else 3)
  println(1 + 3)

  // Loops don't return anything meanful, and only intoduce side effects
  var i = 0
  while(i < 10) {
    println(i)
    i += 1
  } // NEVER WRITE THIS AGAIN.
  // Don't write imperative code in Scala

  // Everything in Scala is an Expression

  val aWeirdValue = (aVariable = 3) // Unit === void | prints as ()
  // while expression returns Unit

  // side effects: println(), whiles, reassigning

  // Code blocks
  val aCodeBlock = {
    val y = 2
    val z = y + 1

    if (z > 2) "hello" else "goodbye" // returns the type of the last expression
  } // aCodeBlock is an expression

  // 1. difference between "hello world" vs println("hello world")?
  // 1 (Answer). String hello world is a value of type string. The other one is a Unit with a side effect.
  println(println("hello world")) // Returns Unit which prints as ()
  // 2.

  val someValue = {
    2 < 3
  }
  println(someValue)

  val someOtherValue = {
    if(someValue) 239 else 986
    42
  }
  println(someOtherValue)
  //2 (Answer). someValue is a Boolean / someOtherValue is 42
 }
