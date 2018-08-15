import db.DBHelper;
import models.File;
import models.Folder;

import java.util.ArrayList;
import java.util.List;

public class Runner {


    public static void main(String[] args) {

        Folder folder1 = new Folder("Folder1");
        DBHelper.save(folder1);
        Folder folder2 = new Folder("Folder2");
        DBHelper.save(folder2);

        File file1 = new File("File1", "txt", 2, folder1);
        DBHelper.save(file1);
        File file2 = new File("File2", "rb", 1, folder1);
        DBHelper.save(file1);
        File file3 = new File("File3", "java", 4, folder1);
        DBHelper.save(file1);
        File file4 = new File("File4", "ppt", 3, folder1);
        DBHelper.save(file1);

        ArrayList<File> files = new ArrayList<File>();
        files.add(file1);
        files.add(file2);





        List<File> foundFiles = DBHelper.getAll(File.class);

        List<Folder> foulders = DBHelper.getAll(Folder.class);

        File foundFile = DBHelper.find(File.class, file1.getId());

    }
}
