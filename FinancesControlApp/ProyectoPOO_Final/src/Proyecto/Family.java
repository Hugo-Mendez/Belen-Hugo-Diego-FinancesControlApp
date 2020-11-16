package Proyecto;

import java.util.ArrayList;

public class Family {

    private String LastName;
    private String Location;
    private ArrayList members; //Composition relation from 1 to many
    private String IncomeClasification;
    public Family nextF;

    public Family(String LastName, String Location, ArrayList members) { //class constructor
        this.LastName = LastName;
        this.Location = Location;
        this.members = members;
    }

    //setters
    public void addMember(Person nMiembro) { //adds a person to the members list

        this.members.add(nMiembro);

    }

    public void setClasificationIncome(String month, String year) {//sets the clasification of the family
        String kind = this.calculateClasification(month, year);
        this.IncomeClasification = kind;
    }

    //getters
    public String getLastName() {//returns the last name of the family
        return LastName;
    }

    public String getLocation() {//returns the location of the family
        return Location;
    }

    public ArrayList getMember() {//returns the members list
        return members;
    }

    public String getIncomeClasification() {//returns the incomeClasification
        return this.IncomeClasification;
    }

    public String calculateClasification(String month, String year) {//recives month and year and calculates what kind of class the family belongs to 
        int quantity = 0;
        int quantityM = 0;

        for (int a = 0; a < members.size(); a++) {

            Person aux = (Person) members.get(a);
            ArrayList IncomeList = aux.getIncomeList();

            for (int b = 0; b < IncomeList.size(); b++) {

                Income income = (Income) IncomeList.get(b);
                quantityM ++;

                if (income.getYear().equals(year) & income.getMonth().equals(month)) {
                    quantity += income.amount;
                }
            }

        }
        if (quantityM == 0){
            quantity = 0;
        } else{
            quantity = quantity / quantityM;
        }

        if (quantity >= 2000000) {
            return "High Class";
        } else if (quantity >= 1500000) {
            return "Medium high class";
        } else if (quantity >= 700000) {
            return "Medium low class";
        } else if (quantity >= 400000) {
            return "Superior low class";
        } else {
            return "Low class";
        }

    }

    public int getIncome(String year) { //goes over the income list and returns total incomes made a specific year
        int a = 0;
        int income = 0;
        while (a < this.members.size()) {
            Person newP = (Person) this.members.get(a);
            int x = 0;
            while (x < newP.getIncomeList().size()) {
                Income newI = (Income) newP.getIncomeList().get(x);
                if(newI.getYear().equals(year)){
                    income += newI.amount;
                }
                
                x++;
            }

            a++;
        }
        return income;
    }
    
    public int getSaving() {//goes over the members list and calculates the family savings
        int a = 0;
        int saving = 0;
        while (a < this.members.size()) {
            Person newP = (Person) this.members.get(a);
            saving += newP.getSave();
            a++;
        }
        if (saving < 0){
            saving = 0;
        }
        return saving; 
    }
}
