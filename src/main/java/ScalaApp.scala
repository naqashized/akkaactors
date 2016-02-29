import akka.actor.{Props, ActorSystem}
import com.javascalaactors.actors.User
import com.javascalaactors.scala.Supervisor

object ScalaApp {


  def  main(args: Array[String]){

    print("Scala App...");

    val system = ActorSystem("scalaactors")
    val supervisor = system.actorOf(Props[Supervisor], name = "supervisor")
    val random = new scala.util.Random(100)

    //user actor1
    val userId1 = random.nextInt();
    val user = system.actorOf(Props(new User(userId1)), userId1.toString)
    user ! "welcome actor "+userId1

    //user actor2
    val userId2 = random.nextInt();
    val user2 = system.actorOf(Props(new User(userId2)), userId2.toString)
    user2 ! "welcome actor "+userId2


  }
}
