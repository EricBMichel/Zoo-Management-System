package setup;
import java.util.ArrayList;
import cctzoo.*;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 *
 * @author ERiC, Jhon, Vilma
 */
public class AnimalSetUp {
    
    Scanner kB = new Scanner(System.in);
    StoredData sD = new StoredData();
    
    /**
     * This method ask the user to input Animal details by taking in few
     * methods, then after animal is added add a new animal and then display
     * same animal full details.
     *
     * @param a is an array list of Animal object
     * @param k is an array list of keeper object
     */
    public void addAnimal (ArrayList<Keeper> k){
        kB.reset();
        Animal animal = new Animal(null,"","","",null);
        System.out.println("\n---------Add Animal---------\n");
        System.out.println("--TYPE--");
            selectType(animal);
        System.out.println("--BREED--");
            selectBreed(animal);
        System.out.println("--GENDER--");
            selectGender(animal);
        System.out.println("--ARRIVAL DATE--");
            selectArrivalDate(animal);
        System.out.println("--VACCINATION--");
            selectVaccine(animal);
        System.out.println("--MEDICATION--");
            selectMedication(animal);
        System.out.println("--ASSIGN KEEER--");
            selectKeeper(animal, k);
        System.out.println("NEW ANIMAL ADDED");
            animal.displayAnimal(animal);

        Menu.animal.add(animal);       
    }
    
    /**
     * This method displays a menu to the user with all animal types,depending
     * on the input same will be assigned to the new animal
     *
     * @param a is an Animal object
     */
    public void selectType(Animal a){
        try{
        System.out.println("Please select a Type: ");
        System.out.println("1. Mammal");
        System.out.println("2. Aquatic");
        System.out.println("3. Avian");
        System.out.println("4. Reptile");
        System.out.println("5. Insect");
        System.out.println("6. ReptileAquatic");
        System.out.println("7. MammalAvian");
        System.out.println("8. MammalAquatic");
        System.out.println("9. AquaticAvian");

        int option = kB.nextInt();
        
        switch(option){
        case 1:
            a.setType(sD.type[0]);
            break;
        case 2:
            a.setType(sD.type[1]);
            break;
        case 3:
            a.setType(sD.type[2]);
            break;
        case 4:
            a.setType(sD.type[3]);
            break;
        case 5:
            a.setType(sD.type[4]);
            break;
        case 6:
            a.setType(sD.type[5]);
            break;
        case 7:
            a.setType(sD.type[6]);
            break;
        case 8:
            a.setType(sD.type[7]);
            break;
        case 9:
            a.setType(sD.type[8]);
            break;
        default:
            System.out.println("\nERROR - Not A Valid Option\n");
            selectType(a);
            break;
        }
        }catch(InputMismatchException e){
            System.out.println("\nERROR - Not A Valid Option\n");
            kB.next();
            selectType(a);
        }
        System.out.println();
    }
    
    /**
     * This method allows the user to type in the breed of the animal
     *
     * @param a is an Animal object
     */
    public void selectBreed(Animal a){
        System.out.println("Please enter the Breed: ");
        kB.nextLine();
        String breed = kB.nextLine();
        a.setBreed(breed);
        System.out.println();
    }
    
    /**
     * This method display a menu to the user to select the animal gender
     *
     * @param a is an Animal object
     */
    public void selectGender(Animal a){
        try{
        System.out.println("Please enter the Gender: ");
        System.out.println("1. Male");
        System.out.println("2. Female");

        int option = kB.nextInt();
        
        switch(option){
        case 1:
            kB.reset();
            a.setGender("M");
            break;
        case 2:
            kB.reset();
            a.setGender("F");
            break;
        default: 
            kB.reset();
            System.out.println("\nERROR - Not A Valid Option\n");
            selectGender(a);
            break;
        }
        }catch(InputMismatchException e){
            System.out.println("\nERROR - Not A Valid Option\n");
            kB.next();
            selectGender(a);
        }
        System.out.println();
    }
    
    /**
     * This method allows the user to input the animal arrival day
     *
     * @param a is an Animal object
     */
    public void selectArrivalDate(Animal a){
        System.out.println("Please enter the Arrival Date: (dd/mm/yyyy)");
        kB.nextLine();
        String date = kB.nextLine();
        a.setArrivalDate(date);
        System.out.println();
    }
    
    /**
     * This method allows the user to select whether the animal is vaccinated or
     * not
     *
     * @param a is an Animal object
     */
    public void selectVaccine(Animal a){
        try{
        System.out.println("Has the Animal been vacciniated? ");
        System.out.println("1. Vaccinated");
        System.out.println("2. Not Vaccinated");
        
        int option = kB.nextInt();
        
        switch(option){
        case 1:
            a.setVaccination(true);
            break;
        case 2:
            a.setVaccination(false);
            break;
        default:
            System.out.println("\nERROR - Not A Valid Option\n");
            selectVaccine(a);
            break;
        }
        }catch(InputMismatchException e){
           System.out.println("\nERROR - Not A Valid Option\n");
           kB.next();
           selectVaccine(a);
        }
        System.out.println();
    }
    
    /**
     * This method allows the user to input whether the animal is on medication
     * or not, if yes, the user needs to type in the medication's name
     *
     * @param a is an Animal object
     */
    public void selectMedication(Animal a){
        try{
        System.out.println("Is the Animal on medication?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        
        int option = kB.nextInt();
        switch(option){
        case 1:
            System.out.println("Please enter the name of the medication");
            kB.nextLine();
            a.setMedication(kB.nextLine());
            break;
        case 2:
            a.setMedication(" ");
            break;
        default: 
            selectMedication(a);
            break;
        }
        }catch(InputMismatchException e){
            System.out.println("\nERROR - Not A Valid Option\n");
            kB.next();
            selectMedication(a);
        }
        System.out.println();
    }
    
    /**
     * This method goes through an arrayList of keepers and displays the list of
     * keepers qualified to look after the animal type the user selected
     *
     * @param a is an array list of Animal object
     * @param k is an array list of Keeper object
     */
    public void selectKeeper(Animal a, ArrayList<Keeper> k){
        try{
        System.out.println("AVAILABLE KEEPERS: ");
        
        for(int i=0;i<k.size();i++){
            if(k.get(i).getSpecialty(0).equals(a.getSimpleType())||
                k.get(i).getSpecialty(1).equals(a.getSimpleType())||
                k.get(i).getSpecialty(2).equals(a.getSimpleType())&&k.get(i).animalInCareSize()<10){
                System.out.println(k.get(i).getKeeperID()+" "+k.get(i).getFName()+" "+k.get(i).getLName());
            }
        }
        
        System.out.println("Please enter a Keeper's ID");
        
        int kID = kB.nextInt()-1;
        
        if(kID >= k.size() || kID == -1){
            System.out.println("\nSorry - No Keeper Exist\n");
            selectKeeper(a,k);
        }else{
            System.out.println();
            System.out.println("------------KEEPER------------");
            k.get(kID).getKeeperDetails();
            System.out.println("\nAssign this keeper?");
            System.out.println("1. Yes");
            System.out.println("2. No");
            
            int option = kB.nextInt();
            
            switch(option){
            case 1:
                k.get(kID).setAnimalInCare(a);
                break;
            case 2:
                selectKeeper(a,k);
                break;
            default: 
                System.out.println("\nERROR - Not A Valid Option\n");
                break;
            }
            }
            if(a.getKeeper() == null){
                System.out.println("\nERROR - Keeper is not quaified\n");
                selectKeeper(a,k);
            }
        }catch(InputMismatchException e){
            System.out.println("\nERROR - Not A Valid Option\n");
            kB.next();
            selectKeeper(a,k);
        }
        System.out.println();
    }
    
    /**
     * This method displays a menu to search animals by type, breed, gender or
     * keeper, depending on the user selection will return a list of animals in
     * that range of search
     *
     * @param a is an array list of Animal object
     */
    public void searchAnimalMenu(ArrayList<Animal> a){
        try{
        System.out.println("\n------Search for Animal------");
        System.out.println("1. TYPE");
        System.out.println("2. BREED");
        System.out.println("3. GENDER");
        System.out.println("4. KEEPER");
        System.out.println("\n0. BACK TO MAIN MENU");

        int option = kB.nextInt();
        
        switch(option){
        case 1:
            kB.reset();
            searchType(a);
            searchAnimalMenu(a);
            break;
        case 2:
            kB.reset();
            searchBreed(a);
            searchAnimalMenu(a);
            break;
        case 3:
            kB.reset();
            searchGender(a);
            searchAnimalMenu(a);
            break;
        case 4:
            kB.reset();
            searchKeeper(a);
            searchAnimalMenu(a);
            break;
        case 0:
            kB.reset();
            Menu m = new Menu();
            m.mainMenu();
            break;
        default:
            kB.reset();
            System.out.println("\nERROR - Not a valid option\n");
            searchAnimalMenu(a);
            break;
        }
        }catch(InputMismatchException e){
            kB.reset();
            System.out.println("\nERROR - Not a valid option\n");
            kB.next();
            searchAnimalMenu(a);
            
        }
        System.out.println();
    }
    
    /**
     * This method allows the user to search animals by type
     *
     * @param a is an array list of Animal object
     */
    public void searchType(ArrayList<Animal> a){
        try{
        System.out.println("\n--TYPE--");
        System.out.println("1. Mammal");
        System.out.println("2. Aquatic");
        System.out.println("3. Avian");
        System.out.println("4. Reptile");
        System.out.println("5. Insect");
        System.out.println("6. ReptileAquatic");
        System.out.println("7. MammalAvian");
        System.out.println("8. MammalAquatic");
        System.out.println("9. AquaticAvian");
        System.out.println("Please select a Type: ");

        int option = kB.nextInt();
        
        switch(option){
        case 1:
            for(int i=0;i<a.size();i++){
                if(a.get(i).getSimpleType().equals("Mammal")){
                    System.out.println("------------ANIMAL------------");
                    a.get(i).getAnimalDetails();
                }
            }
            break;
        case 2:
            for(int i=0;i<a.size();i++){
                if(a.get(i).getSimpleType().equals("Aquatic")){
                    System.out.println("------------ANIMAL------------");
                    a.get(i).getAnimalDetails();
                }
            }
            break;
        case 3:
            for(int i=0;i<a.size();i++){
                if(a.get(i).getSimpleType().equals("Avian")){
                    System.out.println("------------ANIMAL------------");
                    a.get(i).getAnimalDetails();
                }
            }
            break;
        case 4:
            for(int i=0;i<a.size();i++){
                if(a.get(i).getSimpleType().equals("Reptile")){
                    System.out.println("------------ANIMAL------------");
                    a.get(i).getAnimalDetails();
                }
            }
            break;
        case 5:
            for(int i=0;i<a.size();i++){
                if(a.get(i).getSimpleType().equals("Insect")){
                    System.out.println("------------ANIMAL------------");
                    a.get(i).getAnimalDetails();
                }
            }
            break;
        case 6:
            for(int i=0;i<a.size();i++){
                if(a.get(i).getSimpleType().equals("ReptileAquatic")){
                    System.out.println("------------ANIMAL------------");
                    a.get(i).getAnimalDetails();
                }
            }
            break;
        case 7:
            for(int i=0;i<a.size();i++){
                if(a.get(i).getSimpleType().equals("MammalAvian")){
                    System.out.println("------------ANIMAL------------");
                    a.get(i).getAnimalDetails();
                }
            }
            break;
        case 8:
            for(int i=0;i<a.size();i++){
                if(a.get(i).getSimpleType().equals("MammalAquatic")){
                    System.out.println("------------ANIMAL------------");
                    a.get(i).getAnimalDetails();
                }
            }
            break;
        case 9:
            for(int i=0;i<a.size();i++){
                if(a.get(i).getSimpleType().equals("AquaticAvian")){
                    System.out.println("------------ANIMAL------------");
                    a.get(i).getAnimalDetails();
                }
            }
            break;
        default: 
            kB.reset();
            System.out.println("\nERROR - Not a valid option");
            searchType(a);
            break;
        }
        }catch(InputMismatchException e){
            System.out.println("\nERROR - Not a valid option");
            kB.next();
            searchType(a);
        }
        System.out.println();  
    }
    
    /**
     * This method allows the user to search for animal by breed
     *
     * @param a is an array list of Animal object
     */
    public void searchBreed(ArrayList<Animal> a){
        try{
        System.out.println("\n--BREED--");
        System.out.println("Please enter the Animal's Breed or press 'B' to go back:");
        
        String option = kB.nextLine();
        
        switch(option){
            case "b":
                searchAnimalMenu(a);
                break;
            default:
                kB.reset();
                String breed = kB.nextLine();
                for(int i=0;i<a.size();i++){
                    if(a.get(i).getBreed().equalsIgnoreCase(breed)){
                        System.out.println("------------ANIMAL------------");
                        a.get(i).getAnimalDetails();
                    }
                }
            break;
        }
        }catch(InputMismatchException e){
            System.out.println("\nERROR - Not a valid option");
            kB.next();
            searchBreed(a);
           
        }
        System.out.println();
    }
    
    /**
     * This method allows the user to search animal by gender
     *
     * @param a is an array list of Animal object
     */
    public void searchGender(ArrayList<Animal> a){
        try{
        System.out.println("\n--GENDER--");
        System.out.println("Please select a Gender: ");
        System.out.println("1. Male");
        System.out.println("2. Female");
        
        int option = kB.nextInt();
        
        switch(option){
        case 1:
            for(int i=0;i<a.size();i++){
                if(a.get(i).getGender().equals("M")){
                    System.out.println("------------ANIMAL------------");
                    a.get(i).getAnimalDetails();
                }
            }
            break;
        case 2:
            for(int i=0;i<a.size();i++){
                if(a.get(i).getGender().equals("F")){
                    System.out.println("------------ANIMAL------------");
                    a.get(i).getAnimalDetails();
                }
            }
            break;
        default:
            System.out.println("\nERROR - Not a valid option");
            searchGender(a);
            break;
        }
        }catch(InputMismatchException e){
            System.out.println("\nERROR - Not a valid option");
            kB.next();
            searchGender(a);   
        }
        kB.reset();
        System.out.println();
    }
    
    /**
     * This method allows the user search by keeper
     *
     * @param a is an array list of Animal object
     */
    public void searchKeeper(ArrayList<Animal> a){
        try{
        System.out.println("\n--KEEER--");
        System.out.println("Please enter a Keepers first name or press 'B' to go back:");

        String option = kB.nextLine();
        
        switch(option){
        case "b":
            searchAnimalMenu(a);
            break;
        default:
            String keeper = kB.nextLine();
            if(keeper.equalsIgnoreCase("b")){
                searchAnimalMenu(a);
            }else{
                for(int i=0;i<a.size();i++){
                    if(a.get(i).getKeeper().getFName().equalsIgnoreCase(keeper)){
                        System.out.println("------------ANIMAL------------");
                        a.get(i).getAnimalDetails();
                    }
                }
            }
            break;
        }
        }catch(InputMismatchException e){
            System.out.println("\nERROR - Not a valid option");
            kB.next();
            searchKeeper(a);
        }
        System.out.println();
    }
    
    /**
     * This method display to the user a menu allowing th user to update animal
     * info, depending on the user input will update the section selected.
     *
     * @param a is an array list of Animal object
     * @param k is an array list of Keeper object
     */
    public void updateAnimalMenu(ArrayList<Animal> a, ArrayList<Keeper> k){
        try{
        System.out.println("\n------Update Animal------");
        System.out.println("1. UPDATE MEDICATION");
        System.out.println("2. SET VACCINATION");
        System.out.println("3. ADD OFFSPRING");
        System.out.println("\n0. BACK TO MAIN MENU");

        int option = kB.nextInt();
        
        switch(option){
        case 1:
            kB.reset();
            updateMedication(a);
            updateAnimalMenu(a, k);
            break;
        case 2:
            kB.reset();
            updateVaccine(a);
            updateAnimalMenu(a, k);
            break;
        case 3:
            kB.reset();
            updateOffspring(a, k);
            updateAnimalMenu(a, k);
            break;
        case 0:
            kB.reset();
            Menu m = new Menu();
            m.mainMenu();
            break;
        default:
            kB.reset();
            System.out.println("\nERROR - Not a valid option\n");
            updateAnimalMenu(a, k);
            break;
            
        }
        }catch(InputMismatchException e){
            kB.reset();
            System.out.println("\nERROR - Not a valid option\n");
            kB.next();
            updateAnimalMenu(a, k);
        }
        System.out.println();
    }
    
    /**
     * This method ask the user to enter an animal id, then will ask to set the
     * Animal medication by picking up an option displayed in the menu, and
     * finally will display in console the Animal details updated
     *
     * @param a is an array list of Animal object
     */
    public void updateMedication(ArrayList<Animal> a){
        try{
        System.out.println("--MEDICATION--");
        System.out.println("Please enter an Animals's ID");
        
        int aID = kB.nextInt()-1;
        
        if(aID >= a.size() || aID == -1){
                System.out.println("\nSorry - No Animal Exist\n");
                updateMedication(a);
        }else{
            System.out.println();
            System.out.println("------------ANIMAL------------");
            a.get(aID).getAnimalDetails();
            
            System.out.println("Please select the medication: ");
            System.out.println("1. Marbofloxacin:");
            System.out.println("2. Apomorphine:");
            System.out.println("3. Morphine:");
            System.out.println("4. None:");
            
            int option = kB.nextInt();
            
            switch(option){
            case 1:
                a.get(aID).setMedication("Marbofloxacin");
                System.out.println("------------ANIMAL UPDATED------------");
                a.get(aID).getAnimalDetails();
                break;
            case 2:
                a.get(aID).setMedication("Apomorphine");
                System.out.println("------------ANIMAL UPDATED------------");
                a.get(aID).getAnimalDetails();
                break;
            case 3:
                a.get(aID).setMedication("Morphine");
                System.out.println("------------ANIMAL UPDATED------------");
                a.get(aID).getAnimalDetails();
                break;
            case 4:
                a.get(aID).setMedication(" ");
                System.out.println("------------ANIMAL UPDATED------------");
                a.get(aID).getAnimalDetails();
                break;
            default:
                kB.nextInt();
                break;
            }
        }
        }catch(InputMismatchException e){
            System.out.println("\nERROR - Try Again");
            kB.next();
            updateMedication(a);
        }
    }
    
    /**
     * This method ask the user to enter an animal id, then will ask to set the
     * Animal Vaccine by choosing option (yes/not) displayed in the menu, and
     * finally will display in console the Animal details updated
     *
     * @param a is an array list of Animal object
     */
    public void updateVaccine(ArrayList<Animal> a){
        try{
        System.out.println("--VACCINE--");
        System.out.println("Please enter an Animals's ID");
        int aID = kB.nextInt()-1;
        if(aID >= a.size() || aID == -1){
                System.out.println("\nSorry - No Animal Exist\n");
                updateVaccine(a);
        }else{
            
            if(a.get(aID).getVaccine()==true){
                System.out.println("Animal is already Vaccinated:\n");
                updateVaccine(a);
            }else{
                a.get(aID).setVaccination(true);
                System.out.println("------------ANIMAL UPDATED------------");
                a.get(aID).getAnimalDetails(); 
                System.out.println("Animal is now Vaccinated:");
            }
            
        }
        }catch(InputMismatchException e){
            System.out.println("\nERROR - Not a valid option\n");
            kB.next();
            updateVaccine(a);
        }
    }
    
    /**
     * This method ask the user to enter an animal id, then will ask to set the
     * Animal offSpring by asking the amount and new animal details, and finally
     * will display in console the Animal details updated
     *
     * @param a is an array list of Animal object
     * @param k is an array list of Keeper object
     */
    public void updateOffspring(ArrayList<Animal> a, ArrayList<Keeper> k){
        try{
        System.out.println("--OFFSPRING--");
        System.out.println("Please enter an Animals's ID");
        int aID = kB.nextInt()-1;
        if(aID >= a.size() || aID == a.size() || a.get(aID).getBreed().equalsIgnoreCase("M")){
            System.out.println("\nSorry - No Animal Exist\n");
            updateOffspring(a,k);
        }
        
        System.out.println("------------PARENT ANIMAL------------");
        a.get(aID).getAnimalDetails(); 
       
        System.out.println("Correct Animal?");
        System.out.println("1. Yes");
        System.out.println("2. No");
        
        int option = kB.nextInt();
        
            switch(option){
                case 1:
                    System.out.println("How many offspring are there?");
                    int amount = kB.nextInt();
                    for(int i=1;i<=amount;i++){
                        Animal offspring = a.get(aID).newOffspring("", a);
                        System.out.println("\nOFFSPRING NUMBER "+i+":");
                        selectGender(offspring);
                        System.out.println("\nPlease assign a Keeper:\n");
                        selectKeeper(offspring, k);
                        System.out.println("NEW ANIMAL ADDED:");
                        offspring.getAnimalDetails();
                        kB.reset();
                    }
                break;
                default:kB.reset();
                    updateOffspring(a,k);
                break;
            }
        }catch(InputMismatchException e){
            System.out.println("\nERROR - Not a valid option\n");
            kB.next();
            updateOffspring(a,k);
        }
       
    }
    
    
}
