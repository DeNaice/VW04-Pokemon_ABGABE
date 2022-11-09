package pokemon;

import java.util.Set;

public class Pokedex <T extends Nameable>{

    // TODO wie kriege ich die Informationen aus der Klasse Pokemon ?
    void add(T nameable){
        // Fügt übergebenes Objekt dem Pokedex hinzu


    }

    void swap(String name, Pokedex<T>other, String otherName){
        // Objekt mit Name name in other Pokedex und otherName soll in den this Pokedex


    }

    Set<T> getUniqueObjectsof(Pokedex<T> other){
        // Set mit allen Objekten aus other, die nicht im eigenen Pokedex enthalten sind


        return null;
    }

}
