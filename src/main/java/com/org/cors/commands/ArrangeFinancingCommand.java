package com.org.cors.commands;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class ArrangeFinancingCommand implements Command {

	private Logger logger = LoggerFactory.getLogger(ArrangeFinancingCommand.class);

	@Override
	public boolean execute(Context ctx) {
		logger.info("Arrange financing");
		return false;
	}
}