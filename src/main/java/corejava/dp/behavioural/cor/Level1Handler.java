package corejava.dp.behavioural.cor;

public class Level1Handler extends ITicketHandler {


	public Level1Handler() {
	}

	@Override
	public void handleTicket(TicketType ticketType) {
		if (ticketType==TicketType.LEVEL1) {
			System.out.println("Handling ticket type t1");
		} else {
			System.out.println("Level1Handler cannot handle "+ticketType+" ticket forwarding to level2 handler");
			tickerHandler.handleTicket(ticketType);
		}
	}
}
