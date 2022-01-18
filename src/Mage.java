public class Mage {
    public String name;
    public int level;
    public int damage;
    public String type;
    public Mage(String name, int level, int damage, String type){
        this.name = name;
        this.level = level;
        this.damage = damage;
        this.type = type;
    }
    public String getInfo(){
        return ""+name+", "+level+", "+damage+", "+type+"";
    }
    public String fight(Mage mage){
        if(this.type.equals(mage.type)) {
            if (this.level > mage.level) {
                return this.name;
            }
            else {
                if (this.level < mage.level) {
                    return mage.name;
                }
                else {
                    if (this.damage > mage.damage) {
                        return this.name;
                    }
                    else {
                        if (this.damage < mage.damage) {
                            return mage.name;
                        }
                        else {
                            return "draw";
                        }
                    }

                }
            }
        }


        if(this.type.equals("fire")){
            if(mage.type.equals("earth"))
                return mage.name;
            else
                return this.name;
        }
        if(this.type.equals("earth")){
            if(mage.type.equals("ice"))
                return mage.name;
            else
                return this.name;
        }
        if(this.type.equals("ice")){
            if(mage.type.equals("fire"))
                return mage.name;
            else
                return this.name;
        }
        return "";
    }
}
