package handlers;

import common.Type;

/**
 * //TODO - If needed, validate logic and if possible optimize code.
 */
public class Director extends Approver {

    @Override
    public void approve(int id, double cost, Type type) {
        if (canApprove(id, cost, type)) {
            System.out.println("Director approved purchase with id " + id + " that costs " + cost);
            return;
        }

        System.out.println("Purchase with id " + id + " needs approval from higher position than Director.");
        next.approve(id, cost, type);
    }

    @Override
    protected boolean canApprove(int id, double cost, Type type) {
        switch (type) {
            case PC -> {
                return (cost <= 6000);

            }
            case GAMING -> {
                return (cost <= 3500);

            }

            case GADGETS -> {
                return (cost <= 1500);
            }

            case CLERICAL -> {
                return (cost <= 1000);
            }
            case CONSUMABLES -> {
                return (cost <= 500);
            }
            default -> {
                return false;
            }
        }

    }
}
