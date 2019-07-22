package cctzoo;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;


/**
 *
 * @author ERiC, Jhon, Vilma
 */
public class Animal {

    private static int lastAnimalID = 0;
    private int animalID;
    private static int lastCageNum = 0;
    private int cageNum;
    private Animal type;
    private ArrayList<Animal> offspring = new ArrayList<>();
    private String breed;
    private String gender;
    private String arrivalDate;
    private String medication;
    private Keeper keeper;
    private boolean vaccine;
    
    /**
     * This constructor doesn't receive parameters and create and instance of
     * Animal class with default data is used in child class by inheritance.
     */
    public Animal(){
        
    }
    
    /**
     *
     * @param type Animal type object that represent species
     * @param breed String that storage animal breed
     * @param gender String that represent male and female
     * @param arrivalDate String that represent date of arrival
     * @param k Keeper object that represent Animal keeper Assigned
     */
    public Animal(Animal type, String breed, String gender, String arrivalDate, Keeper k){
        this.type = type;
        this.breed = breed;
        this.gender = gender;
        this.arrivalDate = arrivalDate;
        this.keeper = null;
        this.medication = " ";
        this.vaccine = false;
        animalID = ++lastAnimalID;
        cageNum = ++lastCageNum;
    }
    
    /**
     * This method allows to create a new Animal and Assign the gender, is
     * called when a there is a new Offspring
     *
     * @param gender is an String type which indicate the gender of the new
     * Animal
     * @param a is an array list of animal object
     * @return an Animal type object
     */    
    public Animal newOffspring(String gender, ArrayList<Animal> a){

        Animal baby = new Animal(null,"","","",null);
        baby.setType(this.getType());
        baby.setBreed(this.getBreed());
        baby.setGender(gender);
        baby.setArrivalDate(new SimpleDateFormat("dd/MM/yyyy").format(new Date()));
        baby.setMedication(" ");
        baby.setVaccination(true);
        baby.setCageNum(this.getCageNum());
        
        offspring.add(baby);
        a.add(baby);
        return baby;
    }
   
    /**
     *
     * @return the instance that invoked the method
     */
    public Animal getAnimal(){
        return this;
    }
    
    /**
     *
     * @return the type attribute of the instance that called the method
     */
    public Animal getType(){
        return type;
    }
    
    /**
     * @This method calls a function that return an String with the name of the
     * Animal type
     * @return an String that represent Animal types converted in String for
     * example Mammal, Avian, etc
     */
    public String getSimpleType(){
        return type.getClass().getSimpleName();
    }
    
    /**
     *
     * @return an integer of animal ID
     */
    public  final int getAnimalID() {
        return animalID;
    }
    
    /**
     *
     * @return an String of Animal breed
     */
    public String getBreed(){
        return breed;
    }
    
    /**
     *
     * @return an String of Animal gender
     */
    public String getGender(){
        return gender;
    }
    
    /**
     *
     * @return an integer with with the Amount of offspring of an Animal
     */
    public int getOffspringAmount(){
        return offspring.size();
    }
    
    /**
     *
     * @return an String of date of arrival
     */
    public String getArrivalDate(){
        return arrivalDate;
    }
    
    /**
     *
     * @return an object of Keeper
     */
    public Keeper getKeeper(){
        return keeper;
    }    
    
    /**
     *
     * @return a boolean that indicates if the Animal was vaccinated or not
     */
    public boolean getVaccine(){
        return vaccine;
    }
    
    /**
     *
     * @return an String of animal medication
     */
    public String getMedication(){
        return medication;
    }
    
    /**
     *
     * @return an integer of Animal cage number
     */
    public int getCageNum(){
        return cageNum;
    }
    
    /**
     * This method calls another method that show in console general info of
     * Animal
     *
     * @param a is an Animal object from which is required the details
     */
    public void displayAnimal(Animal a){
        System.out.println("\t--------ANIMAL--------");
        getAnimalDetails(); 
    }
    
    /**
     * This methods calls getters and show in console the information returned
     * by getter methods
     */
    public void getAnimalDetails(){
        System.out.println("\tID: "+getAnimalID());
        System.out.println("\tTYPE: "+getSimpleType());
        System.out.println("\tANIMAL: "+getBreed());
        System.out.println("\tGENDER: "+getGender());
        System.out.println("\tEXHIBIT NUMBER: "+getCageNum());
        System.out.println("\tARRIVAL DATE: "+getArrivalDate());
        System.out.println("\tOFFSPRING: "+getOffspringAmount());
        System.out.println("\tVACCINATED: "+getVaccine());
        if(this.getKeeper() == null){
            System.out.println("\tKEEPER: No Keeper");
        }else{
            System.out.println("\tKEEPER: "+getKeeper().getFName()+" "+getKeeper().getLName());
        }
        if(this.getMedication().equals(" ")||this.getMedication().equals("")){
            System.out.println("\tMEDICATION: None \n");
        }else{
            System.out.println("\tMEDS: "+getMedication()+"\n");
        }
    }
    
    /**
     *
     * @param a is an Animal object and is assigned to type attribute
     */
    public void setType(Animal a){
        this.type = a;
    }
    
    /**
     *
     * @param a is a String an is assigned to the breed attribute
     */
    public void setBreed(String a){
        this.breed = a;
    }
    
    /**
     *
     * @param a is a String an is assigned to the gender attribute
     */
    public void setGender(String a){
        this.gender = a;
    }
    
    /**
     *
     * @param a is a String an is assigned to the date of arrival attribute
     */
    public void setArrivalDate(String a){
        this.arrivalDate = a;
    }
    
    /**
     *
     * @param k is a Keeper object and is assigned to keeper attribute
     */
    public void setKeeper(Keeper k){
        this.keeper = k;
    }
    
    /**
     *
     * @param m is a String an is assigned to the medication attribute
     */
    public void setMedication(String m){
           this.medication = m;
    }
    
    /**
     *
     * @param b is a boolean an is assigned to the vaccine attribute
     */
    public void setVaccination(boolean b){
        this.vaccine = b;
    }
    
    /**
     *
     * @param a is a integer an is assigned to the cage number attribute
     */
    public void setCageNum(int a){
        this.cageNum = a;
    }
}
