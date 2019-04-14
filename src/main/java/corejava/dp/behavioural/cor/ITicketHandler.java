package corejava.dp.behavioural.cor;

/**
 * The chain of responsibility pattern is a behavioral object design pattern. In
 * the chain of responsibility pattern, a series of handler objects are chained
 * together to handle a request made by a client object. If the first handler
 * can't handle the request, the request is forwarded to the next handler, and
 * it is passed down the chain until the request reaches a handler that can
 * handle the request or the chain ends. In this pattern, the client is
 * decoupled from the actual handling of the request, since it does not know
 * what class will actually handle the request.
 * 
 * In this pattern, a Handler is an interface for handling a request and
 * accessing a handler's successor. A Handler is implemented by a Concrete
 * Handler. The Concrete Handler will handle the request or pass it on to the
 * next Concrete Handler. A Client makes the request to the start of the handler
 * chain.
 * 
 * Now, let's look at an example of the chain of responsibility pattern. Rather
 * than an interface, I'll use an abstract base class as the handler so that
 * subclasses can utilize the implemented setSuccessor() method. This abstract
 * class is called PlanetHandler. Concrete handlers that subclass PlanetHandler
 * need to implement the handleRequest() method.
 * 
 * @author ayush
 *
 */
public abstract class ITicketHandler {
	protected ITicketHandler tickerHandler;

	public void setHandler(ITicketHandler tickerHandler) {
		this.tickerHandler = tickerHandler;
	}

	public abstract void handleTicket(TicketType ticketType);
}
