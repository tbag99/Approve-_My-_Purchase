package handlers;

import common.Type;


/**
 * //TODO - Implement approval implementation for VicePresident level
 */
public class VicePresident extends Approver{
    @Override
    public void approve(int id, double cost, Type type) {
        if (canApprove(id, cost, type)) {
            System.out.println("Vice President approved purchase with id " + id + " that costs " + cost);
            return;
        }

        System.out.println("Purchase with id " + id + " needs approval from higher postion than  Vice President.");
        next.approve(id, cost, type);


    }

    @Override
    protected boolean canApprove(int id, double cost, Type type) {
        switch (type) {
            case PC -> {
                return (cost <= 6500);

            }
            case GAMING -> {
                return (cost <= 4500);

            }

            case GADGETS -> {
                return (cost <= 2000);
            }

            case CLERICAL -> {
                return (cost <= 1500);
            }
            case CONSUMABLES -> {
                return (cost <= 700);
            }
            default -> {
                return false;
            }
        }
    }
    }

