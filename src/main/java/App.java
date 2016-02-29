import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.actor.Props;
import com.javascalaactors.actors.Supervisor;
import com.javascalaactors.actors.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Random;

/**
 * Created by tahirmacbook on 29/02/2016.
 */
public class App {

    private static Logger log = LoggerFactory.getLogger(App.class);

    public static void main(String args[]){

        log.info("App starting");

        final ActorSystem system = ActorSystem.create("javascalaactors");
        system.actorOf(Props.create(Supervisor.class), "supervisor");
        Random rn = new Random();
        int userActorId = rn.nextInt();
        log.info("creating first user actor");
        ActorRef actor = system.actorOf(Props.create(User.class, userActorId), String.valueOf(userActorId));
        actor.tell("Welcome actor "+userActorId,ActorRef.noSender());
        //another user actor
        log.info("creating second user actor");
        int newUserId = rn.nextInt();
        ActorRef actor2 = system.actorOf(Props.create(User.class, newUserId), String.valueOf(newUserId));
        actor.tell("Welcome actor "+newUserId,ActorRef.noSender());

    }


}
