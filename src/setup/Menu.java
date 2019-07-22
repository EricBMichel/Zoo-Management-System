package setup;
import java.util.ArrayList;
import cctzoo.*;
import java.util.InputMismatchException;

import java.util.Scanner;

/**
 *
 * @author ERiC, Jhon, Vilma
 */
public class Menu {
    
    //Data container for the Zoo management system
    static ArrayList<Animal> animal = new ArrayList<>();
    static ArrayList<Keeper> keeper = new ArrayList<>();
    
    //Call function classes to run methods
    KeeperSetUp kSU = new KeeperSetUp();
    AnimalSetUp aSU = new AnimalSetUp();
    
    /**
     * This constructor doesn't receive parameters and create and instance of
     * Menu
     */
    KeeperGen kG = new KeeperGen();

    public Menu(){
    }
    
    /**
     * Start the generation of animals and keepers
     */
    public void startZoo(){
        kG.start(keeper, animal);
    }
    
    /**
     * Basic menu layout
     */
    public void mainMenu(){
        Scanner kB = new Scanner(System.in);
        try{
        System.out.println("\n---------MAIN MENU---------");
        System.out.println("--Animal--");
        System.out.println("1. ADD ANIMAL:");
        System.out.println("2. SEARCH ANIMAL:");
        System.out.println("3. UPDATE ANIMAL:");
       
        System.out.println("\n--Keeper--");
        System.out.println("4. ADD KEEPER:");
        System.out.println("5. SEARCH KEEPER:");
        System.out.println("6. UPDATE KEEPER:");
        System.out.println("\n7. DISPLAY ALL:");
        System.out.println("\n0. EXIT THE SYSTEM");
        
        int input = kB.nextInt();
        
        switch (input) {
            case 1:
                kB.reset();
                aSU.addAnimal(keeper);
                mainMenu();
                break;
            case 2:
                kB.reset();
                aSU.searchAnimalMenu(animal);
                mainMenu();
                break;
            case 3:
                kB.reset();
                aSU.updateAnimalMenu(animal, keeper);
                mainMenu();
                break;
            case 4:
                kB.reset();
                kSU.addKeeper();
                mainMenu();
                break;
            case 5:
                kB.reset();
                kSU.searchKeeperMenu(keeper);
                break;
            case 6:
                kB.reset();
                kSU.updateKeeperMenu(keeper);
                break;
            case 7:
                kB.reset();
                for(int i=0;i<keeper.size();i++){
                    keeper.get(i).displayKeeper(keeper.get(i));
                }
                mainMenu();

            case 0:
                System.out.println("THANK YOU - GOODBYE!");
                System.exit(0);
                break;
            default:
                kB.reset();
                System.out.println("\nERROR- Please try again");
                mainMenu();
                break;
        }
        }catch(InputMismatchException e){
            kB.reset();
            System.out.println("\nERROR- Please try again");
            mainMenu();
            kB.nextInt();
        }
    }
}
