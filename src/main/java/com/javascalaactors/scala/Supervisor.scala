package com.javascalaactors.scala

import akka.actor.UntypedActor

class Supervisor extends UntypedActor{


  override def onReceive(message: Any): Unit = {

    print("Supervisor receives message =>"+message);

  }
}
