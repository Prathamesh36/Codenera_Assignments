package NOV22.AmanSir;

import java.util.Scanner;

class Bus_ticket_Booking
{
    int total_ticket=10;

    synchronized void booking(int seat)
    {
        if(total_ticket>=seat)
        {
            System.out.println("Congratulations!! booking of "+seat+" is confirmed");
            total_ticket=total_ticket-seat;
            System.out.println("Seats left="+total_ticket);
        }
        else
        {
            System.out.println("Sorry! you booking of seats "+seat+" is not available");
            System.out.println("Seats left="+total_ticket);
        }

    }
}

public class BusTicketBooking  extends Thread
{
    static Bus_ticket_Booking ob;
    int seat;

    public void run()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        ob.booking(seat);
    }

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        ob=new Bus_ticket_Booking();

        BusTicketBooking p1=new BusTicketBooking();
        BusTicketBooking p2=new BusTicketBooking();
        BusTicketBooking p3=new BusTicketBooking();

        System.out.println("Enter seat no for person 1:");
        p1.seat=sc.nextInt();

        System.out.println("Enter seat no for person 2:");
        p2.seat=sc.nextInt();

        System.out.println("Enter seat no for person 3:");
        p3.seat=sc.nextInt();

        p1.start();
        p2.start();
        p3.start();
        
    }

}