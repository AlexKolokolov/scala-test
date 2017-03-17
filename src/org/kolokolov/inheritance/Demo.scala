package org.kolokolov.inheritance

object Demo extends App {
  val bobCat = new Cat("Bob")
  bobCat.age = 5
  println(bobCat)
  
  val spykeDog = new Dog("Spyke")
  print(spykeDog)
}

abstract class Pet(name: String) {
  val greeting: String
  var age: Int
  
  def sayHello { println(greeting) }
  override def toString = s"My name is $name. I am $age years old. I say $greeting."
}

class Cat(name: String) extends Pet(name) {
  val greeting = "Meow"
  var age = 2
}

class Dog(name: String) extends Pet(name) {
  val greeting = "Woof"
  var age = 5
}