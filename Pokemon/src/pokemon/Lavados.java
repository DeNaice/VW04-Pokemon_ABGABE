package pokemon;

public class Lavados extends Pokemon implements FlyingType, FireType{

    public Lavados(int hp, int attack) {super("Lavados", hp, attack);}

    @Override
    public boolean isWeakAgainst(Pokemon other){
        return FlyingType.super.isWeakAgainst(other);
    }

    @Override
    public boolean isStrongAgainst(Pokemon other) {
        return FlyingType.super.isStrongAgainst(other) || FireType.super.isStrongAgainst(other);

    }
}