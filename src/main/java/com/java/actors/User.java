package com.java.actors;

import akka.actor.UntypedActor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class User extends UntypedActor {

    private final Logger log = LoggerFactory.getLogger(Supervisor.class);
    public static final String PATH = "/user/";
    private int userId;

    public User(int userId){

        this.userId = userId;
    }

    @Override
    public void preStart() throws Exception {

        super.preStart();
        log.info("User actor starting");

    }
    @Override
    public void onReceive(Object message) throws Exception {

        log.info("message received =>" + message);

    }

    @Override
    public void postStop(){

    }
}
