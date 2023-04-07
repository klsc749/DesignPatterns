package visitor;

public interface Character{
    public void accept(CharacterVisitor visitor);
    public int getHealth();
    public int getAttackPower();
}