public class CheckArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,7,-1,4,5};
        int c=0;
        for(int i=0;i<a.length;i++){
            for (int j = i+1; j <a.length ; j++) {
                for (int k = j+1; k < a.length; k++) {
                    if(a[i]+a[j]+a[k]==0){
                        c++;
                    }
                }
            }
        }
        if(c>0){
            System.out.println("Array contains the triplet that sums up to zero");
        }
        else{
            System.out.println("Array not contains the triplet that sums up to zero");
        }
    }
}
