package setup;
import cctzoo.*;

/**
 *
 * @author ERiC, Jhon, Vilma
 */

/**
 * This class contain all the pool of data, from where all objects will auto
 * generated when the program runs
 */
public class StoredData {
    
    Animal mammal = new Mammal();
    Animal aquatic = new Aquatic();
    Animal avian = new Avian();
    Animal reptile = new Reptile();
    Animal insect = new Insect();
    Animal repAq = new ReptileAquatic();
    Animal mamAv = new MammalAvian();
    Animal mamAq = new MammalAquatic();
    Animal AquAv = new AquaticAvian();

    public Animal [] type = new Animal [] {mammal,aquatic,avian,reptile,insect,repAq,mamAv,mamAq,AquAv};
    
    public String [] mammalBreed = new String[] {"Ram","Jaguar","Woodchuck","Tiger",
        "Chimpanzee","Weasel","Marmoset","Kitten","Rhinoceros","Addax","Hedgehog","Bison","Lynx","Grizzly Bear",
        "Wolf","Steer","Hamster","Hippopotamus","Gazelle","Civet","Hog","Muskrat","Raccoon","Cheetah"
    };
    
    public String [] aquaticBreed = new String [] {"Shark","Snapper","Octopus","Flounder","Goatfish","Pompano",
        "Silver Perch","Stingray","Spottail Pinfish","Searobin","Yellowtail Snapper","Cleaner Fish",
        "Mako Shark","Pufferfish","Haddock","Salmon","Spadefish","Gray Triggerfish","Blobfish","Mandarin Fish",
        "Skipjack Tuna","Sailfish","Atlantic Bonito","Paddlefish","Mackerel"
    };
    
    public String [] avianBreed = new String[]{"Albatross","Hummingbird","Eagle","Falcon","Barn Owl",
        "Snowy Owl","Peacock","Budgerigar","Lovebird","Finch","Rooster","Chicken","Crow","Parrot",
        "Parakeet","Mynah Bird","Canary","Sandpiper","Rheas","Turaco","Bustard","Guineafowl","Woodpecker",
        "Anseriformes","Potoo"
    };
    
    public String[] reptileBreed = new String[]{"Alligator", "Crocodile", "Komododragon", "Eslizon", "Lizard", "Iguana",
        "Lucion", "Salamander", "Chameleon", "Landturtle", "Anaconda", "Cobra", "Phyton", "Viper", "Coralsnake", "Basilisk",
        "Gecko", "Boaconstrictor", "Gilamonster", "JingleBell", "galapagostortoise"
    };
    
    public String[] insectBreed = new String[]{"Cicada", "Dragon-fly", "Mantis", "Cockroach", "Termite", "Locust", "Grasshopper",
        "Cricket", "Beetle", "Mosquito", "Fly", "Butterfly", "Moth", "Wasp", "Bee", "Ant", "Ladybug", "Flea", "Sessia", "Cochineal",
        "Zinega", "Argy", "Torimido", "Phlebotomist", "Worm"
    };
    
    public String[] mamAqBreed = new String[]{"White Whale", "Mule Dolphin", "Befeo", "Commonseal", "Lamantino North American",
        "California Fur Seal", "Walrus", "Bufeo", "Hippopotamus", "Grayseal", "Killerwhale", "Sealion", "SeaWolf", "Shark", "Elephantseal",
        "Jacobita", "Platypus", "HumpbackWhale"
    };
    
    public String[] mamAvBreed = new String[]{"Egyptian Fruit Bat", "California Leaf-nosed Bat", "Honduran White Bat",
        "Indian Flying Fox", "Big Brown Bat", "Dwarf Epauletted Fruit Bat", "Split-nosed Bat", "Mediterranean Horseshoe Bat",
        "Desert Long-eared Bat", "Pygmy Pipistrelle"
    };
    
    public String[] repAqBreed = new String[]{"Marine Iguana", "Coral Reef Snake", "Sea Turtle", "Saltwater Crocodile",
        "Yellow-lipped Sea Krait", "Kloss's Sea Snake", "Persian Gulf Sea Snake", "Russell's Sea Snake", "Olive Ridley",
        "Olive Sea Snake"
    };
      
    public String[] aquAvBreed = new String[]{"Trumpeter Swan", "Common Loon", "Emperor Penguin", "Flamingo",
        "Atlantic Puffin", "Razorbill", "Blue-footed Booby", "Duck", "Diving Petrel", "Arctic Tern",
        "Pelican", "Northern Fulmar", "Great Cormorant", "Double-crested Cormorant", "Magnificent Frigatebird"
    };

    public String [] gender = new String[] {"M","F"};
    
    public String [] arrivalDate = new String[] {"19/06/2018","24/07/2018","19/04/2018",
        "22/06/2018","21/07/2018","01/07/2018","30/04/2018","29/07/2018","08/07/2018",
        "12/07/2018","24/04/2018","25/04/2018","27/05/2018","29/05/2018","22/06/2018",
        "29/06/2018","25/05/2018","14/07/2018","30/04/2018","06/06/2018","18/05/2018",
        "13/04/2018","02/08/2018","08/05/2018","02/08/2018","03/04/2018","26/04/2018",
        "26/07/2018","26/04/2018","05/05/2018","24/04/2018","04/06/2018","28/07/2018",
        "27/04/2018","09/05/2018","21/07/2018","17/05/2018","12/04/2018","02/07/2018",
        "30/07/2018","17/06/2018","06/04/2018","06/04/2018","06/07/2018","12/04/2018",
        "13/05/2018","02/04/2018","03/07/2018","27/06/2018","25/06/2018","12/07/2018",
        "26/07/2018","03/06/2018","29/04/2018","20/05/2018","14/07/2018","30/04/2018",
        "26/07/2018","04/07/2018","04/06/2018","14/06/2018","02/04/2018","04/04/2018",
        "25/06/2018","11/07/2018","09/07/2018","07/06/2018","19/07/2018","20/07/2018",
        "11/07/2018","19/04/2018","12/05/2018","11/07/2018","18/04/2018","25/07/2018",
        "14/04/2018","06/04/2018","10/04/2018","26/04/2018","28/04/2018","02/05/2018",
        "25/05/2018","21/06/2018","26/07/2018","09/07/2018","23/05/2018","04/05/2018",
        "03/04/2018","05/07/2018","24/07/2018","13/06/2018","08/07/2018","04/07/2018",
        "10/07/2018","12/07/2018","02/04/2018","28/06/2018","15/05/2018","29/04/2018",
        "16/05/2018"
    };
        
    public String [] medication = {"","Marbofloxacin","Apomorphine","Ciprofloxacin","Morphine","Ofloxacin"};
    
    public boolean [] vaccine = {true, false}; 
    
    public String [] keeperFN ={"Diana","Jane","George","Roger","Joyce","Fred","Albert","Susan","Phillip",
        "Julia","Lori","Gary","Wayne","Carlos","Bobby","Louis","Jimmy","Martha","Jennifer","Melissa","Heather",
        "Jessica","Donna","Keith","Frances","Theresa","Brenda","Sharon","Matthew","Janice","Linda","Gloria","Mary",
        "Barbara","Eric","Aaron","Shawn","Deborah","Arthur","Ernest","Jesse","Jason","Christina","Richard","Larry","Rachel",
        "Edward","Katherine","Rose","Billy"
    };
    
    public String [] keeperLN ={"Brown","Diaz","Henderson","Edwards","Flores","Moore","Peterson","Davis","Jackson","Long",
        "Foster","Bryant","Anderson","Young","Martinez","Howard","Williams","James","Jenkins","Rodriguez","Simmons","Hughes",
        "Wright","Lee","Perez","Sanchez","Walker","Richardson","Campbell","Jones","Gray","Butler","Kelly","Reed","White",
        "Evans","Miller","Ramirez","Robinson","Ward","Coleman","Murphy","Carter","Morgan","Roberts","Russell","Washington",
        "Griffin","Rivera","Green"
    };
    
    public String [] keeperSpec = {"Mammal","Aquatic","Avian","Reptile","Insect","MammalAquatic","MammalAvian",
        "ReptileAquatic","AquaticAvian"
    };
    
}
