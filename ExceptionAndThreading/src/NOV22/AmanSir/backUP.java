package NOV22.AmanSir;
/*
package NOV22.AmanSir;

import java.util.Scanner;

class Booking{
    int total_Seats=10;
    synchronized void bookSeat(int seats){
        if(total_Seats>=seats){
            System.out.println("Seats Booked Successfully");
            total_Seats=total_Seats-seats;
            System.out.println("Seats Left"+total_Seats);
        }
        else{
            System.out.println("Sorry! you booking of seats "+seats+" is not available");
            System.out.println("Seats left="+total_Seats);
        }
    }
}

public class MovieTicketBooking extends Thread{
    static Booking b;
    int seats;
    public void run(){
        b.bookSeat(seats);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        b=new Booking();
        MovieTicketBooking p1 = new MovieTicketBooking();
        MovieTicketBooking p2 = new MovieTicketBooking();
        MovieTicketBooking p3 = new MovieTicketBooking();

        System.out.print("Enter Name: ");
        String name = sc.nextLine();
        System.out.print("In which tier you want to book Gold(G)/Silver(S): ");
        char tier = sc.next().charAt(0);
        String t =(tier=='G' ||tier=='g')?"Gold":"Silver";
        System.out.println("In "+t+" how many tickets do you want to book");
        p1.seats=sc.nextInt();

        System.out.println("Enter seat no for person 2:");
        p2.seats=sc.nextInt();

        System.out.println("Enter seat no for person 3:");
        p3.seats=sc.nextInt();

        p1.start();
        p2.start();
        p3.start();
    }
}
*/