package PlacementQue1;

class Solution
{
    public static int maximizeTheFuel(int n, int a, int b) {
        int m = 0;
        for (int p = 0; p <= n; p += a) {
            int r = n - p;
            int d = Math.min(r / b, b);
            m = Math.max(m, p + d);
        }
        for (int d = 0; d <= n; d += b) {
            int r = n - d;
            int p = Math.min(r / a, a);
            m = Math.max(m, p + d);
        }
        for (int p = 0; p <= n; p += a) {
            for (int d = 0; d <= n - p; d += b) {
                int r = n - p - d;
                int h = (p + d) / 2;
                int mh = Math.min(h, r);
                m = Math.max(m, p + d + mh);
            }
        }
        return m;
    }
    /*
  public static int maximizeTheFuel(int n, int a, int b)
  {
      int ans=0;
      int ans2= 0;
      int i=0;
      while(ans<=n){
          if(i%2==0) {
              ans2=ans;
              if(((a / 2) + b)>n){
                  break;
              }
              ans = (a / 2) + b;
              System.out.println(ans+"*");
          }else{
              ans2=ans;
              if(((b / 2) + a)>n){
                  break;
              }
              ans = ans/2 + a;
              System.out.println(ans+"***");
          }
          i++;
      }
      return ans2;
  }*/
    /*public static int maximizeTheFuel(int n, int a, int b) {
        int maxFuel = 0;

        // First move: Fill with diesel
        maxFuel += b;
        if (maxFuel > n) {
            maxFuel = n;
        }

        // Check if halving is beneficial
        int halfFuel = maxFuel / 2;
        if (halfFuel > 0) {
            // Second move: Half the current fuel volume
            maxFuel = Math.max(maxFuel, halfFuel);

            // Third move: Fill with petrol
            maxFuel += a;
            if (maxFuel > n) {
                maxFuel = n;
            }
        }

        return maxFuel;
    }*/

    public static void main(String[] args) {
        System.out.println(maximizeTheFuel(79,50,24));
    }
}
/*class Solution{
    ArrayList<Integer> playOfGlasses(int c1,int w1,int c2,int w2,int c3,int w3)
    {
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0;i<105;i++){
            int pour = Math.min(w1,c2-w2);
            w1-=pour;
            w2+=pour;

            pour = Math.min(w2,c3-w3);
            w2-=pour;
            w3+=pour;

            pour =Math.min(w3,c1-w1);
            w3-=pour;
            w1+=pour;

            int temp=w1;
            w1=w2;
            w2=temp;
        }
        al.add(w1);
        al.add(w2);
        al.add(w3);
        return al;
    }
}*/