package com.camel.firstProject.firstCamelProject;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

@Component
public class FileDemoRoute extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		
		consumeFile();
		
	}

	private void consumeFile() {
		
		//change the output file name

		from("file:///D://CamelDocs//input?fileName=input.txt")
		
		.setHeader("CamelFileName", simple("outputFile.txt"))
			
		.to("file:///D://CamelDocs//output");
		
	}

}
