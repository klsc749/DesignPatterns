package composion;
public class FileNode extends FileSystemNode{
    public FileNode(String name) {
        super(name);
    }
    @Override
    public void print(int space) {
        for (int i = 0; i < space; i++) {
            System.out.print("-");
        }
        System.out.println(name);
    }
}