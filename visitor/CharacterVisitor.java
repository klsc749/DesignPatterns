package visitor;

public interface CharacterVisitor {
    public void visit(Witcher witcher);
    public void visit(Human human);
}
