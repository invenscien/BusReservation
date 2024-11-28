package busResv;

import com.sun.source.doctree.StartElementTree;

public class Bus {
   private int busNo;
    private boolean ac;
    private int capacity;

    public Bus(int busNo, boolean ac, int capacity) {
        this.busNo = busNo;
        this.ac = ac;
        this.capacity = capacity;
    }

    public int getCapacity() {//accessor
        return capacity;
    }
    public void setCapacity(int capacity){//mutator
        capacity = capacity;
    }

    public int getBusNo() {
        return busNo;
    }

    public void setBusNo(int busNo) {
        this.busNo = busNo;
    }

    public boolean isAc() {
        return ac;
    }

    public void setAc(boolean ac) {
        this.ac = ac;
    }
    public void displayBusInfo(){
        System.out.println("bus no: "+busNo+" ac: "+ac+" total capacity: "+ capacity);
    }

}
