package org.kolokolov.monads


object MonadDemo2 extends App {

  println(sum(Some(1), Some(2), Some(3))) //Some(6)
  println(sum(Some(1), Some(2), None))    //None
  println(sum(Some(1), None, Some(3)))    //None
  println(sum(None, Some(2), Some(3)))    //None
  println(sum(None, None, None))          //None
  
  
  def sum(x: Option[Int], y: Option[Int], z: Option[Int]): Option[Int] = {
    for {
      _x <- x
      _y <- y
      _z <- z
    } yield _x + _y + _z
  }
}