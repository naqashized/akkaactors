package com.scala.actors

import akka.actor.UntypedActor
import org.slf4j.LoggerFactory

class Supervisor extends UntypedActor{

    val log = LoggerFactory.getLogger(classOf[Supervisor])

    override def onReceive(message: Any): Unit = {

        log.info("Supervisor receives message =>"+message);

    }
}
