package org.kolokolov.collections

object Demo2 extends App {
  val str = "aaabbcc"
  
  val map = new scala.collection.mutable.LinkedHashMap[Char,Int].withDefaultValue(0)
  
  str.foreach(ch => map += (ch -> (map(ch) + 1)))
  
  val buffer = new StringBuilder
//  map.foreach(((k: Char, v: Int) => buffer.append(v).append(k)).tupled)
  map.foreach { case (k, v) => buffer.append(v).append(k) }
  
  println(buffer)
}