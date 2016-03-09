package com.scala.actors

import akka.actor.UntypedActor
import org.slf4j.LoggerFactory

class User(userId: Int) extends UntypedActor{

    val log = LoggerFactory.getLogger(classOf[User])
    var PATH = "/user/";

    override def onReceive(message: Any) = {

        log.info("message received =>"+message);
    }
}
