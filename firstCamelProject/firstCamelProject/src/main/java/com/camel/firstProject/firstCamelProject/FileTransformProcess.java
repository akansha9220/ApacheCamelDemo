package com.camel.firstProject.firstCamelProject;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.springframework.stereotype.Component;

@Component("FileTransformProcess")
public class FileTransformProcess implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {
	
		
	}

}
