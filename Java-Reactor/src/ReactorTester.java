import java.io.IOException;

import reactor.Reactor;
//Source of the code: http://jeewanthad.blogspot.hu/2013/02/reactor-pattern-explained-part-1.html

public class ReactorTester {
	public static void main(String[] args) throws IOException{
		 
	    Reactor reactor  = new Reactor(9900, false);
	    new Thread(reactor).start();
	}
}
