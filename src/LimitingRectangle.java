public class LimitingRectangle {
    int max_x,max_y, min_x,min_y;
    public LimitingRectangle(int[][]m){
        max_x = m[0][0];
        min_x=max_x;
        max_y = m[0][1];
        min_y=max_y;
        for(int i=1;i<m.length;i++){
            if(m[i][0]>max_x)
                max_x = m[i][0];
            if(m[i][1]>max_y)
                max_y = m[i][1];
            if(m[i][0]<min_x)
                min_x = m[i][0];
            if(m[i][1]<min_y)
                min_y = m[i][1];
        }
    }
    public  int getWidth(){
        return max_x - min_x;
    }
    public  int getHeight(){
        return max_y - min_y;
    }
    public String getBorders(){
        return min_y+", " +max_y+", "+min_x+", "+max_x;
    }
}
