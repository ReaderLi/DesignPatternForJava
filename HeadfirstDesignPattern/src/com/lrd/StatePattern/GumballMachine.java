package com.lrd.StatePattern;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class GumballMachine {

    HasQuarterState hasQuarterState;
    NoQuarterState noQuarterState;
    SoldOutState soldOutState;
    SoldState soldState;
    WinnerState winnerState;


    private State state = soldOutState;
    private int count = 0;         //糖果数目

    public GumballMachine(int count){

        hasQuarterState = new HasQuarterState(this);
        noQuarterState = new NoQuarterState(this);
        soldOutState = new SoldOutState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = count;
        if (count > 0) {
            state = noQuarterState;
        }
    }

    public void insertQuarter() {
        state.insertQuarter();

    }

    public void ejectQuarter() {
        state.ejectQuarter();
    }

    //dispense() 发放糖果方法认为是糖果机器内部的方法，不再单独调用
    //用户不可能直接要求掉糖果，只能通过旋转手柄，然后等待
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }


    @Override
    public String toString() {

        StringBuffer returnValue = new StringBuffer("\nMighty Gumball, Inc.\n" +
                "Inventory: " + count + " gumballs\n" + "Machine state is: ");

        if (state instanceof SoldOutState) {
            returnValue.append("sold out\n");
        }else if (state instanceof NoQuarterState) {
            returnValue.append("waiting for quarter\n");
        }else if (state instanceof HasQuarterState) {
            returnValue.append("waiting for turn crank");
        }else if (state instanceof SoldState) {
            returnValue.append("waiting for quarter\n");
        }

        return returnValue.toString();
    }


    public void releaseBall() {
        System.out.println("A gumball comes rolling out the slot...");
        if (count != 0) {
            count--;
        }
    }

    public HasQuarterState getHasQuarterState() {
        return hasQuarterState;
    }

    public void setHasQuarterState(HasQuarterState hasQuarterState) {
        this.hasQuarterState = hasQuarterState;
    }

    public NoQuarterState getNoQuarterState() {
        return noQuarterState;
    }

    public void setNoQuarterState(NoQuarterState noQuarterState) {
        this.noQuarterState = noQuarterState;
    }

    public SoldOutState getSoldOutState() {
        return soldOutState;
    }

    public void setSoldOutState(SoldOutState soldOutState) {
        this.soldOutState = soldOutState;
    }

    public SoldState getSoldState() {
        return soldState;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public WinnerState getWinnerState() {
        return winnerState;
    }

    public void setWinnerState(WinnerState winnerState) {
        this.winnerState = winnerState;
    }
}
