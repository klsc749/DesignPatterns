package composion;

public abstract class FileSystemNode {
    protected String name;

    public FileSystemNode(String name) {
        this.name = name;
    }

    public void print(int space){
        for (int i = 0; i < space; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }

    public void print(){
        this.print(0);
    }
}
