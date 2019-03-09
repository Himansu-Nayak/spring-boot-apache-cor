import com.org.cors.commands.ArrangeFinancingCommand
import com.org.cors.commands.CloseSaleCommand
import com.org.cors.commands.GetCustomerInfoCommand
import com.org.cors.commands.NegotiateSaleCommand
import com.org.cors.commands.TestDriveVehicleCommand
import org.apache.commons.chain.impl.ChainBase

beans {
    getCustomerInfo(GetCustomerInfoCommand)
    testDrive(TestDriveVehicleCommand)
    negotiateSale(NegotiateSaleCommand)
    arrangeFinancing(ArrangeFinancingCommand)
    closeSale(CloseSaleCommand)

    sellVehicleChain(ChainBase, [getCustomerInfo, testDrive, negotiateSale, arrangeFinancing, closeSale])
}