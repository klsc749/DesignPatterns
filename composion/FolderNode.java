package composion;

import java.util.LinkedList;
import java.util.List;

public class FolderNode extends FileSystemNode {
    private List<FileSystemNode> children = new LinkedList<>();

    public FolderNode(String name) {
        super(name);
    }

    public void add(FileSystemNode node) {
        children.add(node);
    }

    public void remove(FileSystemNode node) {
        children.remove(node);
    }

    @Override
    public void print(int space) {
        super.print(space);
        space++;
        for (FileSystemNode child : children) {
            child.print(space);
        }
    }
}
