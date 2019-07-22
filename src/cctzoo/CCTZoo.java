package cctzoo;

import setup.*;

/**
 *
 * @author ERiC, Jhon, Vilma
 */
public class CCTZoo {

    /**
     * This method creates and instance of Menu class and call two methods which
     * represent to the users the available options.
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Menu m = new Menu();
        
        m.startZoo();
        m.mainMenu();
    }
    
}
