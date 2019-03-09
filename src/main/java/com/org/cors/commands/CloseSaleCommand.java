package com.org.cors.commands;

import org.apache.commons.chain.Command;
import org.apache.commons.chain.Context;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class CloseSaleCommand implements Command {

	private Logger logger = LoggerFactory.getLogger(CloseSaleCommand.class);

	@Override
	public boolean execute(Context ctx) {
		logger.info("Congratulations {} , you bought a new car!", ctx.get("customerName"));
		return false;
	}
}