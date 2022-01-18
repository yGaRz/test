public class Human {
    public String name="base_human",address=null,work=null;
    public int age=18,weight=65;
    public Human(String name,int age){
        this.name=name;
        this.age=age;
    }
    public Human(String name,String address){
        this.name= name;
        this.address= address;
    }
    public Human(String name,int age, int weight){
        this.name= name;
        this.weight= weight;
        this.age=age;
    }
    public Human(String name,int age,String work){
        this.name= name;
        this.work= work;
        this.age=age;
    }
    public Human(int age, int weight,String address,String work){
        this.work= work;
        this.weight= weight;
        this.age=age;
        this.address= address;
    }
}
