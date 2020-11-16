package Proyecto;

public abstract class MonetaryAmount { //Inherit its values to Ingreso class and Egreso class
    // This class is an abstract class, so its attributes are protected

    protected String description;
    protected int amount;
    protected String week;
    protected String month;
    protected String year;

    public MonetaryAmount(String description, int amount, String week, String month, String year) { //class constructor
        this.description = description;
        this.amount = amount;
        this.week = week;
        this.month = month;
        this.year = year;
    }

    //getter
    public String getDescription() {
        return description;
    }

    public int getAmount() {
        return amount;
    }

    public String getWeek() {
        return week;
    }

    public String getMonth() {
        return month;
    }

    public String getYear() {
        return year;
    }

}
