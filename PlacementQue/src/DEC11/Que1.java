/*Q.Write a Java function to determine if a given array of integers is palindromic. The twist is that you cannot
 use any additional data structures (like arrays, strings, etc.), and you can only use a constant amount of extra
 space.*/
package DEC11;

public class Que1 {

    public boolean check(int a[]){
        int start = 0;
        int end = a.length-1;
        while(start<=end){
            if(!(a[start]==a[end])){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }

    public static void main(String[] args) {
        int a[] = {1,2,3,4,3,2,1};
        Que1 ob = new Que1();
        System.out.println("OUTPUT: "+ob.check(a));
    }
}
