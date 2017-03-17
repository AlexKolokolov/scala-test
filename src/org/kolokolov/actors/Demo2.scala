package org.kolokolov.actors

import scala.util.Random
import scala.collection.mutable.ArrayBuffer
import scala.actors.Actor._

object Demo2 extends App {
  
  val avgActor = actor {
    loop {
      react {
        case buffer: ArrayBuffer[Int] => {
          println("Average value of the list: " + buffer.sum / buffer.size)
        }
        case "stop" => {
          println("Bye")
          exit
        }
      }
    }
  }
  
  
  val rand = new Random
  val list = new ArrayBuffer[Int]
  for (i <- 0 until 100) {
    list += rand.nextInt(100)
  }
  avgActor ! list
  println("List: " + list)
  avgActor ! "stop"
}