package pokemon;

public class Arktos extends Pokemon implements FlyingType, IceType{

    public Arktos(int hp, int attack) {super("Arktos", hp, attack);}

    @Override
    public boolean isWeakAgainst(Pokemon other){
        return FlyingType.super.isWeakAgainst(other);
    }

    @Override
    public boolean isStrongAgainst(Pokemon other) {
        return FlyingType.super.isStrongAgainst(other) || IceType.super.isStrongAgainst(other);

    }
}
