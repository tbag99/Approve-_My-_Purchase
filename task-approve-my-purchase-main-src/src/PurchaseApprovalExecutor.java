import common.Type;
import handlers.Approver;
import handlers.Manager;

/**
 * Execution class of the application.
 * Be free to modify below line 14 (bellow comment line)
 */
public class PurchaseApprovalExecutor {

    public static void execute() {
        Approver manager = new Manager();
        ApprovalChainGenerator.generate(manager);
        //Be free to modify method below this line

        manager.approve(1, 400, Type.CONSUMABLES);
        manager.approve(2, 5000, Type.GADGETS);
        manager.approve(3, 400, Type.PC);
        manager.approve(4, 3000, Type.CLERICAL);
        manager.approve(5, 1000, Type.GAMING);
        manager.approve(6, 3501, Type.GAMING);
        manager.approve(7,1300,Type.CLERICAL);
    }
}
