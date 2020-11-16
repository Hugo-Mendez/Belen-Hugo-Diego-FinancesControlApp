package Proyecto;

import java.util.ArrayList;

public class Person {

    private int id;
    private String name;
    private int age;
    private ArrayList job;
    private String gender;
    private String scholar_grade;
    private int save;
    private ArrayList IncomeList; //Adding relationship from 0 to many
    private ArrayList OutcomeList; //Adding relationship from 0 to many

    public Person(int id, String name, int age, ArrayList job, String gender, String scholar_grade, ArrayList lIncomes, ArrayList lOutcomes) {//class constructor
        this.id = id;
        this.name = name;
        this.age = age;
        this.job = job;
        this.gender = gender;
        this.scholar_grade = scholar_grade;
        this.IncomeList = lIncomes;
        this.OutcomeList = lOutcomes;
    }

    //setter
    public void setSave(String year) { //sets the amount of savings a person has by substracting the amount of outcome from the total income
        int saving = 0;
        
        int x = 0;
        while(x < this.IncomeList.size()){
            Income aux = (Income)this.IncomeList.get(x);
            if (aux.year.equals(year)){
                saving += aux.getAmount();
            }
            x ++;
        }
        
        x = 0;
        while(x < this.OutcomeList.size()){
            Outcome aux2 = (Outcome)this.OutcomeList.get(x);
            if (aux2.year.equals(year)){
                saving = saving - aux2.getAmount();
            }
            x ++;
        }
        
        this.save = saving;

    }

    public void addIncome(Income montoI) { //adds a new element to the incomelist

        this.IncomeList.add(montoI);

    }

    public void addOutcome(Outcome montoE) {//adds a new element to the outcome list

        this.OutcomeList.add(montoE);

    }
    
    public void addJob(String Job){ //adds a job to the job list
        
        this.job.add(Job);
        
    }   

    //getters
    public int getId() { //returns the id
        return id;
    }

    public String getName() {//returns the name
        return name;
    }

    public int getAge() {//returns the age
        return age;
    }

    public ArrayList getJob() {//returns the job list
        return job;
    }

    public String getGender() {//returns the gender
        return gender;
    }

    public String getScholar_grade() {//returns the scholar grade
        return scholar_grade;
    }

    public int getSave() {//returns the saving
        return save;
    }

    public ArrayList getIncomeList() {//returns the income list
        return IncomeList;
    }

    public ArrayList getOutcomeList() {//returns the outcome list
        return OutcomeList;
    }
    
    
}
