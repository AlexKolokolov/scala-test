package org.kolokolov.options

object Demo2 extends App {

  println(sum(Some(1), Some(2), Some(3))) //Some(6)
  println(sum(Some(1), Some(2), None))    //Some(3)
  println(sum(None, Some(2), Some(3)))    //Some(5)
  println(sum(None, None, None))          //Some(0)
  
  
  def sum(x: Option[Int], y: Option[Int], z: Option[Int]): Option[Int] = {
    def plus(a: Option[Int], b: Int): Option[Int] = {
      a match {
        case None => Some(b)
        case _ => Some(a.get + b)
      }
    }

    plus(x,0).flatMap(plus(y,_)).flatMap(plus(z,_))
  }
}