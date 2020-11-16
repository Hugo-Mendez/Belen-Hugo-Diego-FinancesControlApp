package Proyecto;

public class Outcome extends MonetaryAmount { //inherits from MontoMonetario class

    private String clasification;

    public Outcome(String description, int amount, String week, String month, String year, String clasification) { //class constructor
        super(description, amount, week, month, year);
        this.clasification = clasification;
    }

    //getter
    public String getClasificacion() { //returns the clasification
        return clasification;
    }

}
