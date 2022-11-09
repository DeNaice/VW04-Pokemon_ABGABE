package pokemon;

public class Zapdos extends Pokemon implements FlyingType, ElectricType{

    public Zapdos(int hp, int attack) {super("Zapdos", hp, attack);}

    @Override
    public boolean isWeakAgainst(Pokemon other){
        return FlyingType.super.isWeakAgainst(other);
    }

    @Override
    public boolean isStrongAgainst(Pokemon other) {
        return FlyingType.super.isStrongAgainst(other) || ElectricType.super.isStrongAgainst(other);

    }
}