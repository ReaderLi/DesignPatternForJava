package com.lrd.StatePattern;

import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class GumballMachine {
    //糖果机的四个状态
    final static int SOLD_OUT = 0;       //售罄
    final static int NO_QUARTER = 1;     //没有25分钱
    final static int HAS_QUARTER = 2;    //有25分钱
    final static int SOLD = 3;           //售出

    private int state = SOLD_OUT;
    private int count = 0;         //糖果数目

    public GumballMachine(int count){
        this.count = count;
        if (count > 0) {
            state = NO_QUARTER;
        }
    }

    public void insertQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("You can't insert another quarter");
        }else if (state == NO_QUARTER) {
            state = HAS_QUARTER;
            System.out.println("You insert a quarter");
        }else if (state == SOLD_OUT) {
            System.out.println("You can't insert a quarter,the machine is sold out");
        }else if (state == SOLD) {
            System.out.println("Please wait,we're already giving you a gumball");
        }
    }

    public void ejectQuarter() {
        if (state == HAS_QUARTER) {
            System.out.println("Quarter returned");
            state = NO_QUARTER;
        }else if (state == NO_QUARTER) {
            System.out.println("You haven't inserted a quarter");
        }else if (state == SOLD) {
            System.out.println("Sorry,you already turned the crank");
        }else if (state == SOLD_OUT) {
            System.out.println("You can't eject,you haven't inserted a quarter yet");
        }
    }

    public void turnCrank() {
        if (state == SOLD) {
            System.out.println("Turning twice doesn't get you another gumball");
        }else if (state == NO_QUARTER) {
            System.out.println("You turned but there's no quarter");
        }else if (state == SOLD_OUT) {
            System.out.println("You turned,but there are no gumballs");
        }else if (state == HAS_QUARTER) {
            System.out.println("You turned...");
            state = SOLD;
            dispense();
        }
    }

    public void dispense() {
        if (state == SOLD) {
            System.out.println("A gumball comes rolling out the slot");
            count--;
            if (count == 0) {
                System.out.println("Oops,out of gumballs");
                state = SOLD_OUT;
            }else {
                state = NO_QUARTER;
            }
        }else if (state == NO_QUARTER) {
            System.out.println("You need to pay first");
        }else if (state == SOLD_OUT) {
            System.out.println("No gumball dispensed");
        }else if (state == HAS_QUARTER) {
            System.out.println("No gumball dispensed");
        }
    }

    @Override
    public String toString() {

        StringBuffer returnValue = new StringBuffer("\nMighty Gumball, Inc.\n" +
                "Inventory: " + count + " gumballs\n" + "Machine state is: ");

        if (state == SOLD_OUT) {
            returnValue.append("sold out\n");
        }else if (state == NO_QUARTER) {
            returnValue.append("waiting for quarter\n");
        }else if (state == HAS_QUARTER) {
            returnValue.append("waiting for turn crank");
        }else if (state == SOLD) {
            returnValue.append("waiting for quarter\n");
        }

        return returnValue.toString();
    }
}
