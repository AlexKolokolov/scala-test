package org.kolokolov.actors

import scala.actors.Actor._
import scala.actors.Channel
import scala.actors.OutputChannel


object Demo extends App {
  
  case class HandShake(msg: String, result: OutputChannel[Int])
  
  val hiActor = actor {
    while(true) {
      receive {
        case HandShake(msg, out) => {
          if (msg == "Bye") {
            println("Bye")
            out ! 1
            exit
          }
          println(msg + " - Hello!") 
          out ! 0 
        }
      }
    }
  }
  
  actor {
    val channel = new Channel[Int]
    hiActor ! HandShake("Hi!", channel)
    hiActor ! HandShake("Bye", channel)
    while(true) {
      channel.receive {
        case 0 => println("OK")
        case 1 => { println("Exiting..."); exit }
      }
    }
  }
  
}