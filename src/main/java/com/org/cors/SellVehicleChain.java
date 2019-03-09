package com.org.cors;

import com.org.cors.commands.*;
import org.apache.commons.chain.impl.ChainBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class SellVehicleChain extends ChainBase {

    @Autowired
    private GetCustomerInfoCommand getCustomerInfoCommand;

    @Autowired
    private TestDriveVehicleCommand testDriveVehicleCommand;

    @Autowired
    private NegotiateSaleCommand negotiateSaleCommand;

    @Autowired
    private ArrangeFinancingCommand arrangeFinancingCommand;

    @Autowired
    private CloseSaleCommand closeSaleCommand;

    public SellVehicleChain() {
        super();
    }

    @PostConstruct
    public void init() {
        addCommand(getCustomerInfoCommand);
        addCommand(testDriveVehicleCommand);
        addCommand(negotiateSaleCommand);
        addCommand(arrangeFinancingCommand);
        addCommand(closeSaleCommand);
    }
}