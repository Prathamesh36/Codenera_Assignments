package NOV22.AmanSir;

import java.util.Scanner;

class Booking {
    int Gold_Seats=10;
    int Silver_Seats=10;
    synchronized void bookSeat(int Gseats,int Sseats,String name){
        if(Gold_Seats>=Gseats && Sseats==0){
            System.out.println("Congratulations!! "+name+" Gold seats Booked Successfully");
            Gold_Seats=Gold_Seats-Gseats;
        }
        else if(Silver_Seats>=Sseats && Gseats==0){
            System.out.println("Congratulations!! "+name+" Silver seats Booked Successfully");
            Silver_Seats=Silver_Seats-Sseats;
        }
        else if(Gseats>Gold_Seats && Gseats<=Silver_Seats){
            System.out.println("Sorry! "+name+" Gold tier seats are not available, You can book Silver Tier Seats");
        }
        else if(Sseats>Silver_Seats && Sseats<=Gold_Seats){
            System.out.println("Sorry! "+name+" Silver tier seats are not available, You can book Gold Tier Seats");
        }
        else{
            System.out.println("Sorry! "+name+" your booking of seats is not available");

        }
        System.out.println("Gold seats Left: "+Gold_Seats);
        System.out.println("Silver Seats Left: "+Silver_Seats);
        System.out.println("-----------------------------------------------------------------");
    }
}

public class MovieTicketBooking extends Thread {
    static Booking b;
    int Gseats;
    int Sseats;
    String name;
    public void run() {
        b.bookSeat(Gseats,Sseats,name);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        b=new Booking();
        MovieTicketBooking p1 = new MovieTicketBooking();
        MovieTicketBooking p2 = new MovieTicketBooking();
        MovieTicketBooking p3 = new MovieTicketBooking();

        System.out.print("Enter Name: ");
        String name = sc.next();
        System.out.print(name+", In which tier do you want to book Gold(G)/Silver(S): ");
        char tier = sc.next().charAt(0);
        String t =(tier=='G' ||tier=='g')?"Gold":"Silver";
        System.out.print("In "+t+" tier how many tickets do you want to book: ");
        if(tier=='g'||tier=='G'){
            p1.Gseats=sc.nextInt();
            p1.Sseats=0;
            p1.name=name;
        }
        else{
            p1.Gseats=0;
            p1.Sseats=sc.nextInt();
            p1.name=name;
        }
        System.out.println("-----------------------------------------------------------------");

        System.out.print("Enter Name: ");
        String name1 = sc.next();
        System.out.print(name1+", In which tier do you want to book Gold(G)/Silver(S): ");
        char tier1 = sc.next().charAt(0);
        String t1 =(tier1=='G' ||tier1=='g')?"Gold":"Silver";
        System.out.print("In "+t1+" how many tickets do you want to book: ");
        if(tier1=='g'||tier1=='G'){
            p2.Gseats=sc.nextInt();
            p2.Sseats=0;
            p2.name=name1;
        }
        else{
            p2.Gseats=0;
            p2.Sseats=sc.nextInt();
            p2.name=name1;
        }
        System.out.println("-----------------------------------------------------------------");
        System.out.print("Enter Name: ");
        String name2 = sc.next();
        System.out.print(name2+", In which tier do you want to book Gold(G)/Silver(S): ");
        char tier2 = sc.next().charAt(0);
        String t2 =(tier2=='G' ||tier2=='g')?"Gold":"Silver";
        System.out.print("In "+t2+" how many tickets do you want to book: ");
        if(tier2=='g'||tier2=='G'){
            p3.Gseats=sc.nextInt();
            p3.Sseats=0;
            p3.name=name2;
        }
        else{
            p3.Gseats=0;
            p3.Sseats=sc.nextInt();
            p3.name=name2;
        }
        System.out.println("-----------------------------------------------------------------");

        System.out.print("Loading Information");
        for (int i = 1; i <=20; i++) {
            System.out.print(".");
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("-----------------------------------------------------------------");
        p1.start();
        p2.start();
        p3.start();
    }
}
