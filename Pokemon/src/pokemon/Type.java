package pokemon;

interface PokemonType {
    boolean isWeakAgainst(Pokemon other);

    boolean isStrongAgainst(Pokemon other);
}

interface FlyingType extends PokemonType {
    default boolean isWeakAgainst(Pokemon other) {
        return other instanceof GrassType;
    }

    default boolean isStrongAgainst(Pokemon other) {
        return false;
    }
}

interface FireType extends PokemonType {
    default boolean isWeakAgainst(Pokemon other) {
        return other instanceof WaterType;
    }

    default boolean isStrongAgainst(Pokemon other) {
        return other instanceof GrassType;
    }
}

interface WaterType extends PokemonType {
    default boolean isWeakAgainst(Pokemon other) {
        return other instanceof GrassType;
    }

    default boolean isStrongAgainst(Pokemon other) {
        return other instanceof FireType;
    }
}

interface GrassType extends PokemonType {
    default boolean isWeakAgainst(Pokemon other) {
        return other instanceof FireType;
    }

    default boolean isStrongAgainst(Pokemon other) {
        return other instanceof WaterType;
    }
}

interface ElectricType extends PokemonType {

    default boolean isWeakAgainst(Pokemon other) {return  other instanceof GrassType;}
    // Wassertype muss auch noch in isStrongAgainst abgebildet werden scheint noch seltsam zu sein
    default boolean isStrongAgainst(Pokemon other) {return  other instanceof FlyingType  WaterType;}

}

interface IceType extends PokemonType {

    default boolean isWeakAgainst(Pokemon other) {return  other instanceof WaterType;}

    default boolean isStrongAgainst(Pokemon other) {return other instanceof FlyingType GrasType;}

}
