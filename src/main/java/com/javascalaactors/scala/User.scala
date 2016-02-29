package com.javascalaactors.scala

import akka.actor.UntypedActor

class User(userId: Int) extends UntypedActor{

  var PATH = "/user/";

  override def onReceive(message: Any) = {

    print("message received =>"+message);
  }
}
