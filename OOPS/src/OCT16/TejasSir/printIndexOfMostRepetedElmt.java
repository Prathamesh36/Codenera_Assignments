package OCT16.TejasSir;

public class printIndexOfMostRepetedElmt {

    public void mostRepeted(){
        int a[]={0,0,0,0,1,1,1,1,1,1,0,1};
        int c=0;
        int k=0;
        int max=0;
        for(int i=0;i<a.length;i++){
            c=1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]==a[j]){
                    c++;
                    a[j]=-1;
                }
            }
            if(c>max){
                max=c;
                k=i;
            }

        }
        System.out.print("Index is: "+k);
    }

    public static void main(String[] args) {
        printIndexOfMostRepetedElmt ob = new printIndexOfMostRepetedElmt();
        ob.mostRepeted();
    }
}
