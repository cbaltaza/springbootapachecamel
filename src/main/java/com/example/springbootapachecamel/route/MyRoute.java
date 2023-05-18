/**
 * 
 */
package com.example.springbootapachecamel.route;


import java.time.LocalDateTime;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
/**
 * @author BalMen
 *
 */
//@Component
public class MyRoute extends RouteBuilder {
	
	@Autowired
	private GetCurrentTimeBean getCurrentTimeBean;

	@Autowired
	private SimpleLoggingProcessingComponent loggingComponent;

    @Override
    public void configure() throws Exception {
    	from("timer:first-timer")
//    	.transform().constant("Mi constante message" + LocalDateTime.now())

    	.log("{body}")
    	.transform().constant("Mi constante message")
    	.log("{body}")

    	//.bean("getCurrentTimeBean")
    	.bean(getCurrentTimeBean)
    	.log("{body}")
		.bean(loggingComponent)
		.process(new SimpleLoggingProcessor())

    	.to("log:first-timer");
    	
    	//from("jms:invoices").to("file:/invoices");
    }
}

@Component
class GetCurrentTimeBean {
	public String getCurrentTime() {
		return "Mi constante message" + LocalDateTime.now();
	}
}

@Component
class SimpleLoggingProcessingComponent {
	private Logger logger = LoggerFactory.getLogger(SimpleLoggingProcessingComponent.class);

	public void process(String message) {
		logger.info("SimpleLoggingProcessingComponent {}", message);
	}
}

class SimpleLoggingProcessor implements Processor {

	private Logger logger = LoggerFactory.getLogger(SimpleLoggingProcessingComponent.class);

	@Override
	public void process(Exchange exchange) throws Exception {
		logger.info("SimpleLoggingProcessor {}", exchange.getMessage().getBody());
	}
}