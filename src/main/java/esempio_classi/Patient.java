package esempio_classi;

public class Patient { //PAZIENTE
    String name;
    int age;
    double weight;
    /**
     * constructor -> assegna agli attributi dei valori
     * @param weight -> peso della persona
     * @param age -> età della persona
     * @param  name -> nome della persona
     *  this. ti da la possibiltà di accedere agli attributi della classe
     *  this() ti da la possibilità di acceddere ai metodi della classe
     * **/

    public Patient(double weight, int age, String name) {
        this.weight = weight;
        this.age = age;
        this.name = name;
    }

    public Patient(int age, String name){
        this(60,age,name);
    }


    /*
     * metodo
     * funzione con valore di ritorno
     * */

    public void walk(){
        System.out.println(name + " sta camminando");
    }


    /**
     *
     * Setter
     * associano ad un attributo un valore
     * @param name -> nome da assegnare
     *
     * **/
    public void setName(String name) {
        this.name = name;
    }


    /**
     *
     * Getter
     * ritornano il parametro richiesto
     * @return il nome dell' paziente
     * */

    public String getName(){
        return name;
    }


}

