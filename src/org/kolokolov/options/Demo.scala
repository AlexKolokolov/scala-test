package org.kolokolov.options

object Demo extends App {
  
  println(sum(Some(1), Some(2), Some(3))) //Some(6)
  println(sum(Some(1), Some(2), None))    //Some(3)
  println(sum(None, None, None))          //None
  
  
  def sum(x: Option[Int], y: Option[Int], z: Option[Int]): Option[Int] = {
    (x, y, z) match {
      case (None, None, None) => None
      case _ => Some(Array(x,y,z).flatten.sum)
    }
  }
}