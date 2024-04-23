package oops;

public class DynamicArray {

    private int data[];

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }

    public int getNextInt() {
        return nextInt;
    }

    public void setNextInt(int nextInt) {
        this.nextInt = nextInt;
    }

    private int nextInt;

    public DynamicArray(){
        data= new int[5];
        nextInt=0;
    }

    public void add(int i) {
        if(nextInt==data.length){
            reStrucutre();
        }
        data[nextInt]=i;
        nextInt++;
    }

    private void reStrucutre(){
        int temp[]=data;
        data= new int[data.length*2];
        for(int i=0;i<temp.length;i++){
            data[i]=temp[i];

        }

    }

}
