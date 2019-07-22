package cctzoo;

/**
 *
 * @author ERiC, Jhon, Vilma
 */
public class MammalAquatic extends Animal{
    
    public MammalAquatic(){
        
    }
    
    /**
     * this methods invoke the super function which calls the constructor of the
     * father class
     *
     * @param type is an animal type object
     * @param breed is a String of animal breed
     * @param gender is a String of animal gender
     * @param arrivalDate is a String of animal date of arrival
     * @param k is keeper object type
     */
    public MammalAquatic(Animal type, String breed, String gender, String arrivalDate, Keeper k) {
        super(type, breed, gender, arrivalDate,k);
    }
}
