package activemq.listener;

public class ActiveMQListenerApp {

	public static void main(String[] args) {
		ActiveMQListener sender = new ActiveMQListener("tcp://localhost:61616", "admin", "admin");
		try {
			sender.startReceiving("First.queue");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
