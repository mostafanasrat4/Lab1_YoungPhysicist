public class Main {

    public String solve(int n, int[][] forces){
        int SumX=0, SumY=0, SumZ=0;
        for (int i = 0; i < n; i++) {
            SumX += forces[i][0];
            SumY += forces[i][1];
            SumZ += forces[i][2];
        }
        if(SumX==0 && SumY==0 && SumZ==0){
            return "YES";
        }else{
            return "NO";
        }
    }
}
