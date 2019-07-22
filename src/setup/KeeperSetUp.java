package setup;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;
import cctzoo.*;

/**
 *
 * @author ERiC, Jhon, Vilma
 */
public class KeeperSetUp {
    
    Scanner kB = new Scanner(System.in);
    
    /**
     * This method generate an empty instance of keeper class and ask the user
     * to input keeper detail to be assigned to keeper instance created and
     * finally set the new keeper to the array list of keeper
     *
     * @param k is an array list of Keeper object
     */
    public void addKeeper() {
        kB.reset();
        Keeper keeper = new Keeper("","");
        System.out.println("\n---------Add Keeper---------\n");
        System.out.println("--FIRST NAME--");
        selectFName(keeper);
        System.out.println("--LAST NAME--");
        selectLName(keeper);
        System.out.println("--SPECIALTY--");
        selectSpecialty(keeper);
        System.out.println("\nNEW KEEPER ADDED");
        keeper.displayKeeper(keeper);
        
        Menu.keeper.add(keeper);
    }
    
    /**
     * This method ask the user to input keeper first name, store in a variable
     * to be assigned to new instance
     *
     * @param k is a Keeper object
     */
    public void selectFName(Keeper k){
        System.out.println("Please enter a First name:");
        String name = kB.nextLine();
        k.setFName(name);
        System.out.println();
    }
    
    /**
     * This method ask the user to input keeper last name, store in a variable
     * to be assigned to new instance
     *
     * @param k is an Keeper object
     */
    public void selectLName(Keeper k){
        System.out.println("Please enter a Last name:");
        String name = kB.nextLine();
        k.setLName(name);
        System.out.println();
    }
    
    /**
     * This method display to the user a keeper specialty menu
     *
     * @param k is an Keeper object
     */
    public void selectSpecialty(Keeper k){
        try{
        System.out.println("\nEnter Keeper's specialty:");
        System.out.println("Enter 1 for Mammal");
        System.out.println("Enter 2 for Aquatic");
        System.out.println("Enter 3 for Reptile");
        System.out.println("Enter 4 for Insect");
        System.out.println("Enter 5 for Avian");
        System.out.println("Enter 6 for MammalAquatic");
        System.out.println("Enter 7 for MammalAvian");
        System.out.println("Enter 8 for ReptileAquatic");
        System.out.println("Enter 9 for AquaticAvian\n");
        
        for(int i=0;i<k.getSpecialty().length;i++){
            System.out.print("Enter Specialty: ");
            int option = kB.nextInt();
            switch(option){
                case 1:
                    k.setSpecialty("Mammal", i);
                    break;
                case 2:
                    k.setSpecialty("Aquatic", i);
                    break;
                case 3:
                    k.setSpecialty("Reptile", i);
                    break;
                case 4:
                    k.setSpecialty("Insect", i);
                    break;
                case 5:
                    k.setSpecialty("Avian", i);
                    break;
                case 6:
                    k.setSpecialty("MammalAquatic", i);
                    break;
                case 7:
                    k.setSpecialty("MammalAvian", i);
                    break;
                case 8:
                    k.setSpecialty("ReptileAquatic", i);
                    break;
                case 9:
                    k.setSpecialty("AquaticAvian", i);
                    break;
                default:
                    System.out.println("\nERROR - Not A Valid Option\n");
                    selectSpecialty(k);
                break;
            }
        }
        if(k.getSpecialty(0).equals(k.getSpecialty(1))||k.getSpecialty(0).equals(k.getSpecialty(2))||k.getSpecialty(1).equals(k.getSpecialty(2))){
            System.out.println("\nERROR - Keeper has repeating Specialties\n");
            kB.reset();
            selectSpecialty(k);
        }
        }catch(InputMismatchException e){
            System.out.println("\nERROR - Not A Valid Option\n");
            kB.next();
            selectSpecialty(k);
        }
        System.out.println();
    }
    
    /**
     * This method display to the users the keeper details that can be modified
     * and depending what users input will call method to set the attribute.
     *
     * @param k is an array list of Keeper object
     */
    public void searchKeeperMenu(ArrayList<Keeper> k){
        try{
        System.out.println("\n------Search for Keeper------");
        System.out.println("1. FIRST NAME");
        System.out.println("2. LAST NAME");
        System.out.println("3. SPECIALTY");
        System.out.println("\n0. BACK TO MAIN MENU");

        int option = kB.nextInt();
        
        switch(option){
            case 1:
                searchFirstName(k);
                searchKeeperMenu(k);
                break;
            case 2:
                searchLastName(k);
                searchKeeperMenu(k);
                break;
            case 3:
                searchSpecialty(k);
                searchKeeperMenu(k);
                break;
            case 0:
                Menu m = new Menu();
                m.mainMenu();
                break;
            default:
                System.out.println("\nERROR - Not A Valid Option\n");
                searchKeeperMenu(k);
                break;
        }
        }catch(InputMismatchException e){
            System.out.println("\nERROR - Not A Valid Option\n");
            kB.next();
            searchKeeperMenu(k);
            
        }
        System.out.println();
    }
    
    /**
     * This method ask the user to input the keeper first name, and through a
     * loop looks for a keeper that coincide with a keeper name on the store
     * date pool and show in console the keeper details found.
     *
     *
     * @param k is an array list of Keeper object
     */
    public void searchFirstName(ArrayList<Keeper> k){
        try{
        System.out.println("\n--FIRST NAME--");
        System.out.println("Please enter the Keeper's First Name or press B to go back:");
       
        String option = kB.nextLine();
        
        switch(option){
            case "b":
                searchKeeperMenu(k);
                break;
        default:
            String name = kB.nextLine();
            
            for(int i=0;i<k.size();i++){
                if(k.get(i).getFName().equalsIgnoreCase(name)){
                    k.get(i).displayKeeper(k.get(i));
                }
            }
            break;
        }
        }catch(InputMismatchException e){
            System.out.println("\nERROR - Not A Valid Option\n");
            kB.next();
            searchFirstName(k);
        }
        System.out.println();
    }
    
    /**
     * This method ask the user to input the keeper last name, and through a
     * loop looks for a keeper that coincide with a keeper name on the store
     * date pool and show in console the keeper details found.
     *
     * @param k is an array list of Keeper object
     */
    public void searchLastName(ArrayList<Keeper> k){
        try{
        System.out.println("\n--LAST NAME--");
        System.out.println("Please enter the Keeper's Last Name or press B to go back:");
        
        String option = kB.nextLine();
        
        switch(option){
            case "b":
                searchLastName(k);
                break;
        default:
            String name = kB.nextLine();
            for(int i=0;i<k.size();i++){
                if(k.get(i).getLName().equalsIgnoreCase(name)){
                    k.get(i).displayKeeper(k.get(i));
                }
            }
            break;
        }
        }catch(InputMismatchException e){
            System.out.println("\nERROR - Not A Valid Option\n");
            kB.next();
            searchLastName(k);
        }
        System.out.println();
    }
    
    /**
     * This method display a keeper specialty menu to the user go through the
     * loop on the keeper list an verify if keeper has this specialty assigned
     * then show in console the keeper details.
     *
     * @param k is an array list of Keeper object
     */
    public void searchSpecialty (ArrayList<Keeper> k){
        try{
        System.out.println("Please select a Specialty: ");
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
            for(int i=0;i<k.size();i++){
                if(k.get(i).getSpecialty(0).equals("Mammal")||
                    k.get(i).getSpecialty(1).equals("Mammal")||
                    k.get(i).getSpecialty(2).equals("Mammal")){
                    System.out.println("------------KEEPER------------");
                    k.get(i).getKeeperDetails();
                }
            }
            break;
        case 2:
            for(int i=0;i<k.size();i++){
                if(k.get(i).getSpecialty(0).equals("Aquatic")||
                    k.get(i).getSpecialty(1).equals("Aquatic")||
                    k.get(i).getSpecialty(2).equals("Aquatic")){
                    System.out.println("------------KEEPER------------");
                    k.get(i).getKeeperDetails();
                }
            }
            break;
        case 3:
            for(int i=0;i<k.size();i++){
                if(k.get(i).getSpecialty(0).equals("Avian")||
                    k.get(i).getSpecialty(1).equals("Avian")||
                    k.get(i).getSpecialty(2).equals("Avian")){
                    System.out.println("------------KEEPER------------");
                    k.get(i).getKeeperDetails();
                }
            }
            break;
        case 4:
            for(int i=0;i<k.size();i++){
                if(k.get(i).getSpecialty(0).equals("Reptile")||
                    k.get(i).getSpecialty(1).equals("Reptile")||
                    k.get(i).getSpecialty(2).equals("Reptile")){
                    System.out.println("------------KEEPER------------");
                    k.get(i).getKeeperDetails();
                }
            }
            break;
        case 5:
            for(int i=0;i<k.size();i++){
                if(k.get(i).getSpecialty(0).equals("Insect")||
                    k.get(i).getSpecialty(1).equals("Insect")||
                    k.get(i).getSpecialty(2).equals("Insect")){
                    System.out.println("------------KEEPER------------");
                    k.get(i).getKeeperDetails();
                }
            }
            break;
        case 6:
            for(int i=0;i<k.size();i++){
                if(k.get(i).getSpecialty(0).equals("ReptileAquatic")||
                    k.get(i).getSpecialty(1).equals("ReptileAquatic")||
                    k.get(i).getSpecialty(2).equals("ReptileAquatic")){
                    System.out.println("------------KEEPER------------");
                    k.get(i).getKeeperDetails();
                }
            }
            break;
        case 7:
            for(int i=0;i<k.size();i++){
                if(k.get(i).getSpecialty(0).equals("MammalAvian")||
                    k.get(i).getSpecialty(1).equals("MammalAvian")||
                    k.get(i).getSpecialty(2).equals("MammalAvian")){
                    System.out.println("------------KEEPER------------");
                    k.get(i).getKeeperDetails();
                }
            }
            break;
        case 8:
            for(int i=0;i<k.size();i++){
                if(k.get(i).getSpecialty(0).equals("MammalAquatic")||
                    k.get(i).getSpecialty(1).equals("MammalAquatic")||
                    k.get(i).getSpecialty(2).equals("MammalAquatic")){
                    System.out.println("------------KEEPER------------");
                    k.get(i).getKeeperDetails();
                }
            }
            break;
        case 9:
            for(int i=0;i<k.size();i++){
                if(k.get(i).getSpecialty(0).equals("AquaticAvian")||
                    k.get(i).getSpecialty(1).equals("AquaticAvian")||
                    k.get(i).getSpecialty(2).equals("AquaticAvian")){
                    System.out.println("------------KEEPER------------");
                    k.get(i).getKeeperDetails();
                }
            }
            break;
        default: 
            System.out.println("\nERROR - Not A Valid Option\n");
            searchSpecialty(k);
            break;
        }
        }catch(InputMismatchException e){
            System.out.println("\nERROR - Not A Valid Option\n");
            kB.next();
            searchSpecialty(k);
        }
        System.out.println();
    }
    
    /**
     * This method display in console to the user keeper details option that can
     * be updated, then depending on the input calls calls the method that
     * allows to modify the attribute selected.
     *
     * @param k is an array list of Keeper object
     */
    public void updateKeeperMenu(ArrayList<Keeper> k){
        try{
        System.out.println("\n------Update Keeper------");
        System.out.println("1. FIRST NAME");
        System.out.println("2. LAST NAME");
        System.out.println("3. SPECIALTY");
        System.out.println("\n0. BACK TO MAIN MENU");

        int option = kB.nextInt();
        
        switch(option){
        case 1:
            kB.reset();
            updateFirstName(k);
            updateKeeperMenu(k);
            break;
        case 2:
            kB.reset();
            updateLastName(k);
            updateKeeperMenu(k);
            break;
        case 3:
            kB.reset();
            updateSpecialty(k);
            updateKeeperMenu(k);
            break;
            
        case 0:
            kB.reset();
            Menu m = new Menu();
            m.mainMenu();
            break;
        default:
            System.out.println("\nERROR - Not A Valid Option\n");
            updateKeeperMenu(k);
            break;
        }
        }catch(InputMismatchException e){
            System.out.println("\nERROR - Not A Valid Option\n");
            kB.next();
            updateKeeperMenu(k);
        }
        System.out.println(); 
    }
    
    /**
     * This method display to the user a menu of keeper 3 specialty and ask to
     * which specialty want to modify then display all 9 specialty available and
     * validate that input specialty cannot be repeated in same keeper and
     * assign through setSpecialty method
     *
     * @param k is a Keeper object
     */
    public void selectSpecialtyUpdate(Keeper k){
        try{
        System.out.println("Which specialty would you like to update?");
        
        for(int i=1;i<k.getSpecialty().length+1;i++){
            System.out.println(i+": "+k.getSpecialty(i-1));
        }
        
        int updateSpec = kB.nextInt()-1;
        
        System.out.println("\nPlease choose a new Specialty: ");
        System.out.println("1: Mammal");
        System.out.println("2: Aquatic");
        System.out.println("3: Reptile");
        System.out.println("4: Insect");
        System.out.println("5: Avian");
        System.out.println("6: MammalAquatic");
        System.out.println("7: MammalAvian");
        System.out.println("8: ReptileAquatic");
        System.out.println("9: AquaticAvian\n");
        
        int option = kB.nextInt();
        
        switch(option){
            case 1:
                kB.reset();
                k.setSpecialty("Mammal", updateSpec);
                break;
            case 2:
                kB.reset();
                k.setSpecialty("Aquatic", updateSpec);
                break;
            case 3:
                kB.reset();
                k.setSpecialty("Reptile", updateSpec);
                break;
            case 4:
                kB.reset();
                k.setSpecialty("Insect", updateSpec);
                break;
            case 5:
                kB.reset();
                k.setSpecialty("Avian", updateSpec);
                break;
            case 6:
                kB.reset();
                k.setSpecialty("MammalAquatic", updateSpec);
                break;
            case 7:
                kB.reset();
                k.setSpecialty("MammalAvian", updateSpec);
                break;
            case 8:
                kB.reset();
                k.setSpecialty("ReptileAquatic", updateSpec);
                break;
            case 9:
                kB.reset();
                k.setSpecialty("AquaticAvian", updateSpec);
                break;
            default:
                kB.reset();
                System.out.println("\nERROR - Not A Valid Option\n");
                selectSpecialtyUpdate(k);
            break;
        }
        }catch(InputMismatchException e){
            kB.next();
            System.out.println("\nERROR - Not A Valid Option\n");
            selectSpecialtyUpdate(k);
        }
    }
    
    /**
     * This method ask for keeper id and look through get method validate thats
     * id exits and display the keeper details
     *
     * @param k is an array list of Keeper object
     */
    public void updateSpecialty(ArrayList<Keeper> k){
        try{
        System.out.println("\n--SPECIALTY--");
        System.out.println("Please enter an Keeper's ID");
        
        int kID = kB.nextInt()-1;
        
        if(kID >= k.size() || kID == -1){
                System.out.println("\nSorry - No Keeper Exist\n");
                updateSpecialty(k);
        }else{
            System.out.println();
            System.out.println("------------KEEPER------------");
            k.get(kID).getKeeperDetails();
            selectSpecialtyUpdate(k.get(kID));
            System.out.println("------------KEEPER UPDATED------------");
            k.get(kID).getKeeperDetails();
        }
            
        }catch(InputMismatchException e){
            System.out.println("\nERROR - Not A Valid Option\n");
            kB.next();
            updateSpecialty(k);
                
        }
    }
    
    /**
     * This method ask the user to Keeper id then will ask to set the keeper
     * fist name and finally will display in console the keeper details
     *
     * @param k is an array list of Keeper object
     */
    public void updateFirstName(ArrayList<Keeper> k){
        try{
            System.out.println("\n--FIRST NAME--");
            System.out.println("Please enter an Keeper's ID");
        
        int kID = kB.nextInt()-1;
        
        if(kID >= k.size() || kID == -1){
                System.out.println("\nSorry - No Keeper Exist\n");
                updateFirstName(k);
        }else{
            System.out.println("------------KEEPER------------");
            System.out.println("Enter a new First name");
            String fname = kB.next();
            k.get(kID).setFName(fname);
            System.out.println("------------KEEPER UPDATED------------");
            k.get(kID).getKeeperDetails();
        }
        }catch(InputMismatchException e){
            System.out.println("\nERROR - Not A Valid Option\n");
            kB.next();
            updateFirstName(k);
        }
    }
    
    /**
     * This method ask the user to enter a Keeper id then will ask to set the
     * keeper last name and finally will display in console the keeper details
     *
     * @param k is an array list of Keeper object
     */
    public void updateLastName(ArrayList<Keeper> k){
        try{
            System.out.println("\n--LAST NAME--");
            System.out.println("Please enter an Keeper's ID");
        
        int kID = kB.nextInt()-1;
        
        if(kID >= k.size() || kID == -1){
                System.out.println("\nSorry - No Keeper Exist\n");
                updateLastName(k);
        }else{
            System.out.println("------------KEEPER------------");
            System.out.println("Enter a new Last name");
            String lname = kB.next();
            k.get(kID).setLName(lname);
            System.out.println("------------KEEPER UPDATED------------");
            k.get(kID).getKeeperDetails();
        }
        }catch(InputMismatchException e){
            System.out.println("\nERROR - Not A Valid Option\n");
            kB.next();
            updateFirstName(k);
        }
    }
}
