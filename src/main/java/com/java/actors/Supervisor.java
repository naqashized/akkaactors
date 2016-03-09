package com.java.actors;

import akka.actor.UntypedActor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Supervisor extends UntypedActor {

    private final Logger log = LoggerFactory.getLogger(Supervisor.class);
    public static final String PATH = "/supervisor/";

    @Override
    public void preStart() throws Exception {

        super.preStart();
        log.debug("starting supervisor actor");

    }
    @Override
    public void onReceive(Object message) throws Exception {

    }

    @Override
    public void postStop(){

    }
}
