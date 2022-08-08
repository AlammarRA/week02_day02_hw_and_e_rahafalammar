package hw;

import java.util.ArrayList;

public class Company {
    private String name;
    private ArrayList<PayAble> arrayList = new ArrayList<PayAble>();

    public Company(String name) {
        this.name = name;
    }

    public boolean add(PayAble payAble){
        arrayList.add(payAble);
        return  true;
    }

    @Override
    public String toString() {
        return "hw.Company{" +
                "name='" + name + '\'' +
                ", arrayList=" + arrayList +
                '}';
    }

    public double computeAmount(){
        double total = 0 ;
        for (int i = 0; i < arrayList.size(); i++) {
            total+=arrayList.get(i).computeAmount();
        }
        return total;
    }
}
