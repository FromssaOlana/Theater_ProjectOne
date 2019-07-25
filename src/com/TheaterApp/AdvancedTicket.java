package com.TheaterApp;

public class AdvancedTicket extends Ticket{
    private static final long serialVersionUID = 1L;

    public AdvancedTicket(double Price, String dateOfShow) {
        super(Price, dateOfShow);
        super.setTypOfTicket("Advanced Ticket");
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
