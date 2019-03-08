package com.org.cors;

import com.org.cors.commands.*;
import org.apache.commons.chain.impl.ChainBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import javax.annotation.PostConstruct;

@Configuration
public class SellVehicleChain extends ChainBase {

    @Autowired
    private GetCustomerInfoResponsibility getCustomerInfoResponsibility;

    @Autowired
    private TestDriveVehicleResponsibility testDriveVehicleResponsibility;

    @Autowired
    private NegotiateSaleResponsibility negotiateSaleResponsibility;

    @Autowired
    private ArrangeFinancingResponsibility arrangeFinancingResponsibility;

    @Autowired
    private CloseSaleResponsibility closeSaleResponsibility;

    public SellVehicleChain() {
        super();
    }

    @PostConstruct
    public void init() {
        addCommand(getCustomerInfoResponsibility);
        addCommand(testDriveVehicleResponsibility);
        addCommand(negotiateSaleResponsibility);
        addCommand(arrangeFinancingResponsibility);
        addCommand(closeSaleResponsibility);
    }
}