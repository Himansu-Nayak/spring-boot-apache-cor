package com.org.cors;

import org.apache.commons.chain.impl.ContextBase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CommonsChainApplication implements CommandLineRunner {

    @Autowired
    private SellVehicleChain sellVehicleChain;

    @Autowired
    private ContextBase contextBase;

//	public static void main(String[] args) throws Exception {
////        Object[] sources = new Object[] {CommonsChainApplication.class, new ClassPathResource("applicationContext.groovy")};
//        SpringApplication.run(CommonsChainApplication.class, args);
////        ChainBase sellVehicleChain = (ChainBase)appContext.getBean("sellVehicleChain");
//	}

    @Override
    public void run(String... args) throws Exception {
        sellVehicleChain.execute(contextBase);

    }

    public static void main(String[] args) {
        SpringApplication.run(CommonsChainApplication.class, args);
    }


}
