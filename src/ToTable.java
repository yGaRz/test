public class ToTable {
    int[] data;
    int x,y;
    public ToTable(int[] data,int x,int y){
        this.data = data;
        this.x = x;
        this.y = y;
    }
    public int[][] resize(){
        int [][]res = new int[x][y];
        int n= data.length;
        int x1=0,y1=0;
        for(int i=0;i<n;i++){
            res[x1][y1]=data[i];
            y1++;
            if(y1>=y){
                y1=0;
                x1++;
            }
        }
        return res;
    }
}
