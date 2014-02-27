import java.util.List

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.messaging.handler.annotation.MessageExceptionHandler
import org.springframework.messaging.handler.annotation.MessageMapping
import org.springframework.messaging.simp.annotation.SendToUser
import org.springframework.messaging.simp.annotation.SubscribeMapping
import org.springframework.stereotype.Controller

@Controller
@Log
public class PortfolioController {
	@SubscribeMapping("/positions")
	Map<String, String> getPositions() throws Exception {
		["GOOGL": 1400,
		 "MSFT": 600,
		 "YAHOO": 700,
		]
	}

	@MessageMapping("/trade")
	void executeTrade(String trade) {
		log.debug("Trade: " + trade)
	}

	@MessageExceptionHandler
	@SendToUser("/queue/errors")
	String handleException(Throwable exception) {
		exception.message
	}
}