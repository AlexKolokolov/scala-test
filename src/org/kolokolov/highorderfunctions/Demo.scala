package org.kolokolov.highorderfunctions

object Demo extends App {
  def mulBy(factor: Double) = (x: Double) => x * factor
  
  val fourTimes = mulBy(4)
  
  val half = mulBy(0.5)
  
  println(fourTimes(10) + " " + half(40))
}