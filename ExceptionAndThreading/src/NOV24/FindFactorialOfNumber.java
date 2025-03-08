/*6. Write a program that creates a thread that calculates the factorial of a number.
The main thread should wait for the thread to finish and then print out the result.
*/
package NOV24;



public class FindFactorialOfNumber extends Thread{

    public void run(){

    }

    public static void main(String[] args) {
        FindFactorialOfNumber ob = new FindFactorialOfNumber();
        ob.start();
    }
}
