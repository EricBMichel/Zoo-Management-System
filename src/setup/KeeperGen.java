package setup;
import java.util.ArrayList;
import cctzoo.*;
import java.util.Random;

/**
 *
 * @author ERiC, Jhon, Vilma
 */
public class KeeperGen {
    StoredData sD = new StoredData();
    Random rG = new Random();
    AnimalGen  aG = new AnimalGen();
    
    int dataSize = 40;
    
    /**
     * This method generate 40 random keepers from a pool of data stored in
     * StroreData class
     *
     * @param keeper is n array list of keeper object
     * @param animal is an array list of animal object
     */
    public void start (ArrayList<Keeper> keeper, ArrayList<Animal> animal){
        aG.start(animal);
        
        /**
         * This for loop create an empty keeper instance and look for random
         * data in the storeData arrays and assign then to the keeper object
         * created and finally assign the array list of animals that receive to
         * Keeper.
         */
        for(int i=0;i<dataSize;i++){
            String sp1 =sD.keeperSpec[rG.nextInt(sD.keeperSpec.length)];
            String sp2 =sD.keeperSpec[rG.nextInt(sD.keeperSpec.length)];
            String sp3 =sD.keeperSpec[rG.nextInt(sD.keeperSpec.length)];
            
            Keeper k = new Keeper("","");
            keeper.add(k);
            keeper.get(i).setFName(sD.keeperFN[rG.nextInt(sD.keeperFN.length)]);
            keeper.get(i).setLName(sD.keeperLN[rG.nextInt(sD.keeperLN.length)]);
            
            keeper.get(i).setSpecialty(sp1, sp2, sp3);
            
            while(keeper.get(i).getSpecialty(0).equals(sp2) ||keeper.get(i).getSpecialty(0).equals(sp3)){
                keeper.get(i).setSpecialty(sD.keeperSpec[rG.nextInt(sD.keeperSpec.length)],0);
            }
            while(keeper.get(i).getSpecialty(1).equals(sp1) ||keeper.get(i).getSpecialty(1).equals(sp3)){
                keeper.get(i).setSpecialty(sD.keeperSpec[rG.nextInt(sD.keeperSpec.length)],1);
            }
            while(keeper.get(i).getSpecialty(2).equals(sp1) ||keeper.get(i).getSpecialty(2).equals(sp2)){
                keeper.get(i).setSpecialty(sD.keeperSpec[rG.nextInt(sD.keeperSpec.length)],2);
            }
            for (Animal a : animal) {
                keeper.get(i).setAnimalInCare(animal);
            }
        }
    }
}
