package oop.library;

import java.time.LocalDate;
import java.util.ArrayList;

public class Library {

    private ArrayList<Rent> rents;

    public Library(){
        rents = new ArrayList<>();
    }

    public boolean addRent(Rent rent){
        return rents.add(rent);
    }

    public boolean removeRent(Rent rent){
        return rents.remove(rent);
    }

    public ArrayList<Rent> getExprired(LocalDate now){
        ArrayList<Rent> out = new ArrayList<>();
        for(Rent rent : rents){
            if(rent.isExpired(now)){
                out.add(rent);
            }
        }
        return out;
    }

}
