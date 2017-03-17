package org.kolokolov.collections

import scala.collection.mutable.ArrayBuffer


object Demo extends App {
  val list = new ArrayBuffer[Int]
  list += 10
  list += 20
  println(list)
  
  val vect: Seq[Int] = Vector(10, 20, 30)
  println(vect)
}