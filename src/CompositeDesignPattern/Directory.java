package CompositeDesignPattern;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{
    String dirName;
    List<FileSystem> fileSystemList;

    public Directory(String dirName) {
        this.dirName = dirName;
        this.fileSystemList = new ArrayList<>();
    }
    public void add(FileSystem fileSystem){
        fileSystemList.add(fileSystem);
    }

    @Override
    public void ls() {
        System.out.println("Directory Name: "+ dirName);
        for (FileSystem fileSystem: fileSystemList){
            fileSystem.ls();
        }
    }
}
