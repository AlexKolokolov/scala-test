package org.kolokolov.options


object Demo2 extends App {

  println(sum(Some(1), Some(2), Some(3))) //Some(6)
  println(sum(Some(1), Some(2), None))    //None
  println(sum(Some(1), None, Some(3)))    //None
  println(sum(None, Some(2), Some(3)))    //None
  println(sum(None, None, None))          //None
  
  
  def sum(x: Option[Int], y: Option[Int], z: Option[Int]): Option[Int] = {
    x.flatMap { i => 
      y.flatMap { j => 
        z.flatMap { k => 
          Some(i + j + k) 
        }
      }
    }
  }
}