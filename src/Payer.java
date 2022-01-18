public class Payer {
    private String surname, name, address, cardNumber;
    public Payer(String sn, String nm,String ad, String cn){
        surname = sn;
        name=nm;
        address = ad;
        cardNumber  = cn;
    }
    public String toString()    {
        //Payer: surname name, address: address, card: cardNumber.
        return "Payer: "+surname+" "+name+", address: "+address+", card: "+cardNumber+".";
    }
}

