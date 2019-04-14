package corejava.dp.behavioural.cor;

public class Test {

	public Test() {
	}

	public static void main(String[] args) {
		ITicketHandler t1 = new Level1Handler();
		ITicketHandler t2 = new Level2Handler();
		t1.setHandler(t2);

		t1.handleTicket(TicketType.LEVEL1);
	}

}
