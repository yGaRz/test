public class ToLine {
    int[][] data;
    int x,y;
    public ToLine(int[][] data){
        this.data = data;
        this.x = data.length;
        this.y = data[0].length;
    }
    public int[] resize(){
        int[] res = new int[x*y];
        int cnt = 0;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                res[cnt] = data[i][j];
                cnt++;
            }
        }
        return res;
    }
}
