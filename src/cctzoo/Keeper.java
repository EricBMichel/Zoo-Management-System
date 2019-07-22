package cctzoo;

import java.util.ArrayList;

/**
 *
 * @author ERiC, Jhon, Vilma
 */
public class Keeper {
    private static int lastKeeperID=0;
    private int keeperID;
    private String fname;
    private String lname;  
    private String[] specialty = new String [3];
    private ArrayList<Animal> animalInCare = new ArrayList<>(10);
    
    /**
     * This constructor doesn't receive parameters and create and instance of
     * Keeper
     */
    public Keeper(){
        
    }
    
    /**
     *
     * @param fname Is an String type of Keeper first name
     * @param lname Is an String type of Keeper last name
     */
    public Keeper(String fname, String lname){
        this.fname = fname;
        this.lname = lname;
        keeperID = ++lastKeeperID;
    }
    
    /**
     *
     * @return an integer of keeper ID
     */
    public int getKeeperID(){
        return keeperID;
    }
    
    /**
     *
     * @return An String of keeper first name
     */
    public String getFName(){
        return fname;
    }
    
    /**
     *
     * @return An String of keeper last name
     */
    public String getLName(){
        return lname;
    }
    
    /**
     *
     * @return An array String type of keeper specialty
     */
    public String[] getSpecialty(){
        return specialty;
    }
    
    /**
     *
     * @param a is integer that represent the specialty position
     * @return an String of the specialty in the indicated position from 0 to 2
     */
    public String getSpecialty(int a){
        return specialty[a];
    }
    
    /**
     *
     * @return the actual keeper object from the instance which is calling the
     * method
     */
    public Keeper getKeeper(){
        return this;
    }
    
    /**
     * this method print by console the keeper details
     */
    public void getKeeperDetails(){
        System.out.println("KEEPER ID: "+keeperID);
        System.out.println("NAME: "+fname+" "+lname);
        System.out.print("SPECIALTY: ");
            for(int i=0;i<specialty.length;i++){
                System.out.print("| "+getSpecialty(i)+" |");
            }
        System.out.println();
        System.out.println("ANIMALS IN CARE: "+animalInCare.size()+"\n");
    }
    
    /**
     * This method invoke the method size to obtain the size of the array list
     *
     * @return an integer of the amount animal that has the Keeper assigned
     */
    public int animalInCareSize(){
        return animalInCare.size();
    }
    
    /**
     * This method print by console the details of animal that keeper has
     * assigned
     */
    public void getAnimalInCare(){
        System.out.println("\tANIMAL DETAILS: ");
        if(animalInCare.size() == 0){
            System.out.println("\t-- This keeper is not looking after any animals --\n");
        }else{
            for(int i=0;i<animalInCare.size();i++){
                animalInCare.get(i).displayAnimal(animalInCare.get(i));
            }
        }
    }
    
    /**
     * this method invoke two methods the first print by console keeper details
     * and the second one print by console keeper animals in care details
     *
     * @param k is keeper object
     */
    public void displayKeeper(Keeper k){
        System.out.println("------------KEEPER------------");
        getKeeperDetails();
        getAnimalInCare();
    }
    
    /**
     *
     * @param a is a String type which is assigned to First name
     */
    public void setFName(String a){
        this.fname = a;
    }
    
    /**
     *
     * @param b is a String type which is assigned to last name
     */
    public void setLName(String b){
        this.lname = b;
    }
    
    /**
     *
     * @param a is an String assigned to specialty
     * @param i i an integer that indicate the position of the specialty
     * assigned
     */
    public void setSpecialty(String a, int i){
        this.specialty[i] = a;
    }
    
    /**
     *
     * @param a is an String that represent the first specialty
     * @param b is an String that represent the second specialty
     * @param c is an String that represent the third specialty
     */
    public void setSpecialty(String a, String b, String c){
        this.specialty[0] = a;
        this.specialty[1] = b;
        this.specialty[2] = c;
    }
    
    /**
     * This method go through the array list and validate that keeper specialty
     * cannot be repeated and not accept more that 10 animal per keeper
     *
     * @param a is an array list of animal object
     */
    public void setAnimalInCare(ArrayList<Animal> a){
        for(int i=0;i<a.size();i++){
            String animal = a.get(i).getSimpleType();
            for(int j=0;j<specialty.length;j++){
                String sp = getSpecialty(j);
                if(animalInCare.size()<10 && animal.equals(sp) && a.get(i).getKeeper()==null){
                    this.animalInCare.add(a.get(i));
                    a.get(i).setKeeper(this);
                }
            }
        }
    }
    
    /**
     *
     * @param a is an animal object that validate keeper Specialty
     */
    public void setAnimalInCare(Animal a){
        String animal = a.getSimpleType();
        for(int j=0;j<specialty.length;j++){
            String sp = getSpecialty(j);
            if(animalInCare.size()<10 && animal.equals(sp) && a.getKeeper()==null){
                this.animalInCare.add(a);
                a.setKeeper(this);
            }
        }
    }
    
}
