package composion;

public class Client {
    public static void main(String[] args) {
        FolderNode root = new FolderNode("root");
        FolderNode image= new FolderNode("image");
        FolderNode video= new FolderNode("video");
        root.add(image);
        root.add(video);
        FileNode image1 = new FileNode("image1.png");
        FileNode image2 = new FileNode("image2.png");
        image.add(image1);
        image.add(image2);
        FileNode video1 = new FileNode("video1.mp4");
        FileNode video2 = new FileNode("video2.avi");
        FileNode video3 = new FileNode("video3.mp4");
        video.add(video1);
        video.add(video2);
        video.add(video3);

        root.print();
    }
}
