package oop.library;

import java.time.LocalDate;
import java.util.ArrayList;

public class Library {

    ArrayList<Rent> rents;
    public Library(){
        rents = new ArrayList<>();
    }

    public boolean addRent(Rent r){
        if(rents.contains(r)) return false;
        rents.add(r);
        return true;
    }

    public boolean removeRent(Rent r){
       if(!rents.contains(r)) return false;
       rents.remove(r);
       return true;
    }


    public ArrayList<Rent> getExpired(LocalDate now){
        ArrayList<Rent> expired = new ArrayList<>();
        for(Rent rent : rents){
            if(rent.getEnd().isBefore(now)){
                expired.add(rent);
            }
        }
        return expired;
    }

}
