package org.kolokolov.options

object Demo2 extends App {

  println(sum(Some(1), Some(2), Some(3))) //Some(6)
  println(sum(Some(1), Some(2), None))    //None
  println(sum(Some(1), None, Some(3)))    //None
  println(sum(None, Some(2), Some(3)))    //None
  println(sum(None, None, None))          //None
  
  
  def sum(x: Option[Int], y: Option[Int], z: Option[Int]): Option[Int] = {
    def plus(a: Option[Int], b: Int): Option[Int] = {
      a match {
        case None => None
        case _ => Some(a.get + b)
      }
    }

    x.flatMap(plus(y,_)).flatMap(plus(z,_))
  }
}