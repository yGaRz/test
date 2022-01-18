import static java.lang.Math.*;
public class Tank {

    private int x=0;
    private int y=0;
    private int edge=0;
    private int fuel;
    public Tank(){
        fuel =100;
        x =0;
        y = 0;
    }
    public Tank(int x,int y){
        fuel =100;
        this.x =x;
        this.y=y;
    }
    public Tank(int x,int y, int fuel){
        this.fuel =fuel;
        this.x =x;
        this.y=y;
    }
    public void turnRight(){
        edge++;
        edge = edge%4;
    }
    public void turnLeft(){
        edge+=3;
        edge = edge%4;
    }
    public void goForward(int len){
        if(fuel<Math.abs(len)) {
            if (len>0)
                len=fuel;
            else
                len = -fuel;
        }
        switch(edge){
            case 0:
                this.x+=len;
                break;
            case 1:
                this.y+=len;
                break;
            case 2:
                this.x-=len;
                break;
            case 3:
                this.y-=len;
                break;
        }
    }
    public void goBackward(int len){
        if(fuel<Math.abs(len)) {
            if (len>0)
                len=fuel;
            else
                len = -fuel;
        }
        switch(edge){
            case 0:
                this.x-=len;
                break;
            case 1:
                this.y-=len;
                break;
            case 2:
                this.x+=len;
                break;
            case 3:
                this.y+=len;
                break;
        }
    }
    public void printPosition(){
        System.out.println("The Tank is at "+ this.x+", "+ this.y+" now.");
    }
}