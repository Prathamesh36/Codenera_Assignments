package NOV16.AmanSir;

public class MultipleCatch {
    public static void main(String[] args) {

        try{
            String s ="  ";
            System.out.println(s.length());

            int a =5;
            int b=0;
            System.out.println(a/b);

            int arr[]={1,2,3,4,5};

            System.out.print(arr[8]);
        }

        catch(ArithmeticException e){
            System.out.println("You cannot divide any number by '0', please change the number..."+e);
        }
        catch (NullPointerException e){
            System.out.println("your string as null..."+e);
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("you have entered large index no...."+e);
        }
        catch (Exception e){
            System.out.println("something is wrong.. please check once again");
        }

    }
}
