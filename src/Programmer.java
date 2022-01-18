public class Programmer {
    private int pos_number=0;
    public String name, company;
    String[] position_values = {"intern","junior","middle","senior","lead"};
    public Programmer(String name, String company){
        this.name = name;
        this.company=company;
    }
    public void work(){
        pos_number++;
    }
    public String getPosition(){
        if(pos_number<4){
            return  position_values[pos_number];
        }
        else{
            return position_values[4];
        }

    }

}
