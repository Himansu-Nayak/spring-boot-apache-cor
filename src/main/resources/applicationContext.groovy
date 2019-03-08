import com.org.cors.commands.ArrangeFinancingResponsibility
import com.org.cors.commands.CloseSaleResponsibility
import com.org.cors.commands.GetCustomerInfoResponsibility
import com.org.cors.commands.NegotiateSaleResponsibility
import com.org.cors.commands.TestDriveVehicleResponsibility
import org.apache.commons.chain.impl.ChainBase

beans {
    getCustomerInfo(GetCustomerInfoResponsibility)
    testDrive(TestDriveVehicleResponsibility)
    negotiateSale(NegotiateSaleResponsibility)
    arrangeFinancing(ArrangeFinancingResponsibility)
    closeSale(CloseSaleResponsibility)

    sellVehicleChain(ChainBase, [getCustomerInfo, testDrive, negotiateSale, arrangeFinancing, closeSale])
}