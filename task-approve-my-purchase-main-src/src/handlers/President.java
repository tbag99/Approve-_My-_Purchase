package handlers;

import common.Type;

/**
 * //TODO - Implement approval implementation for President level
 */
public class President extends Approver{
    @Override
    public void approve(int id, double cost, Type type) {
        if (canApprove(id, cost, type)) {
            System.out.println("President approved purchase with id " + id + " that costs " + cost);
            return;
        }


        next.approve(id,cost,type);

    }

    @Override
    protected boolean canApprove(int id, double cost, Type type) {
        switch (type) {
            case PC -> {
                return (cost <= 8000);

            }
            case GAMING -> {
                return (cost <= 5000);

            }

            case GADGETS -> {
                return (cost <= 3000);
            }

            case CLERICAL -> {
                return (cost <= 2000);
            }
            case CONSUMABLES -> {
                return (cost <= 1000);
            }
            default -> {
                return false;
            }
        }
    }
}
