package setup;
import java.util.ArrayList;
import cctzoo.*;

import java.util.Random;

/**
 *
 * @author ERiC, Jhon, Vilma
 */
public class AnimalGen {
    
    StoredData sD = new StoredData();
    Random rG = new Random();
    
    int dataSize = 100;
    
    /**
     * This method generate 100 random animals from a pool of data stored in
     * StroreData class
     *
     * @param animal is an array list of animal object
     */
    public void start (ArrayList<Animal> animal){
        
        /**
         * This for loop create an empty animal instance and look for random
         * data in the storeDsta arrays and assign then to the animal object
         * created.
         */
        for(int i=0;i<dataSize;i++){
            Animal a = new Animal (null,"","","",null);
            animal.add(a);
            animal.get(i).setType(sD.type[rG.nextInt(sD.type.length)]);
            if(animal.get(i).getType() instanceof Mammal){
                animal.get(i).setBreed(sD.mammalBreed[rG.nextInt(sD.mammalBreed.length)]);
            }
            if(animal.get(i).getType() instanceof Aquatic){
                animal.get(i).setBreed(sD.aquaticBreed[rG.nextInt(sD.aquaticBreed.length)]);
            }
            if(animal.get(i).getType() instanceof Avian){
                animal.get(i).setBreed(sD.avianBreed[rG.nextInt(sD.avianBreed.length)]);
            }
            if(animal.get(i).getType() instanceof Reptile){
                animal.get(i).setBreed(sD.reptileBreed[rG.nextInt(sD.reptileBreed.length)]);
            }
            if(animal.get(i).getType() instanceof Insect){
                animal.get(i).setBreed(sD.insectBreed[rG.nextInt(sD.insectBreed.length)]);
            }
            if(animal.get(i).getType() instanceof AquaticAvian){
                animal.get(i).setBreed(sD.aquAvBreed[rG.nextInt(sD.aquAvBreed.length)]);
            }
            if(animal.get(i).getType() instanceof MammalAquatic){
                animal.get(i).setBreed(sD.mamAqBreed[rG.nextInt(sD.mamAqBreed.length)]);
            }
            if(animal.get(i).getType() instanceof MammalAvian){
                animal.get(i).setBreed(sD.mamAvBreed[rG.nextInt(sD.mamAvBreed.length)]);
            }
            if(animal.get(i).getType() instanceof ReptileAquatic){
                animal.get(i).setBreed(sD.repAqBreed[rG.nextInt(sD.repAqBreed.length)]);
            }
            animal.get(i).setGender(sD.gender[rG.nextInt(sD.gender.length)]);
            animal.get(i).setArrivalDate(sD.arrivalDate[rG.nextInt(sD.arrivalDate.length)]);
            animal.get(i).setVaccination(sD.vaccine[rG.nextInt(sD.vaccine.length)]);
            animal.get(i).setMedication(sD.medication[rG.nextInt(sD.medication.length)]);

        }
    }    
}
