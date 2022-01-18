public class Separator {
    int[] array, array_even,array_odd;
    public Separator(int[] array){
        this.array = array;
        int count =0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0)
                count++;
        }
        array_even = new int[count];
        array_odd = new int[array.length - count];
        count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==0) {
                array_even[count] = array[i];
                count++;
            }
        }
        count=0;
        for(int i=0;i<array.length;i++){
            if(array[i]%2==1) {
                array_odd[count] = array[i];
                count++;
            }
        }
    }
    public int[] even(){
        return array_even;
    }
    public int[] odd(){
        return array_odd;
    }
}
