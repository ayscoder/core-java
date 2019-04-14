package corejava.dp.behavioural.cor;

public class Level2Handler extends ITicketHandler {

	public Level2Handler() {
	}

	@Override
	public void handleTicket(TicketType ticketType) {
		if (ticketType == TicketType.LEVEL2) {
			System.out.println("Handling ticket type t2");
		} else {
			System.out.println("Level2Handler cannot handle " + ticketType);
			System.out.println("no handler found for ticket " + ticketType);
		}
	}
}
