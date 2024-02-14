package Composition;

import java.util.ArrayList;
import java.util.List;

class Folder {
    private String name;
    private List<Folder> subFolders;
    private List<File> files;

    public Folder(String name) {
        this.name = name;
        this.subFolders = new ArrayList<>();
        this.files = new ArrayList<>();
    }

    public void addSubFolder(Folder subFolder) {
        this.subFolders.add(subFolder);
    }

    public void addFile(File file) {
        this.files.add(file);
    }

    public void delete() {
        for (Folder subFolder : new ArrayList<>(subFolders)) {
            subFolder.delete();
            this.subFolders.remove(subFolder);
        }
        for (File file : new ArrayList<>(files)) {
            file.delete();
            this.files.remove(file);
        }
    }

    public void removeFile(File file){
        files.remove(file);
    }

    public void print() {
        System.out.println(name);
        for (Folder subFolder : subFolders) {
            subFolder.print();
        }
        for (File file : files) {
            file.print();
        }
    }
}

class File {
    private String name;
    private Folder parentFolder;

    public File(String name, Folder parentFolder) {
        this.name = name;
        this.parentFolder = parentFolder;
    }

    public void delete() {
        parentFolder.removeFile(this);
    }

    public void print() {
        System.out.println(name);
    }
}

public class Main {
    public static void main(String[] args) {
        // Create folder structure
        Folder php_demo1 = new Folder("php_demo1");
        Folder sourceFiles = new Folder("Source Files");
        php_demo1.addSubFolder(sourceFiles);

        Folder app = new Folder("app");
        Folder cache = new Folder("cache");
        Folder publicFolder = new Folder("public");
        sourceFiles.addSubFolder(app);
        sourceFiles.addSubFolder(cache);
        sourceFiles.addSubFolder(publicFolder);

        Folder includePath = new Folder("Include Path");
        Folder remoteFiles = new Folder("Remote Files");
        php_demo1.addSubFolder(includePath);
        php_demo1.addSubFolder(remoteFiles);

        Folder appConfig = new Folder("config");
        Folder controllers = new Folder("controllers");
        Folder library = new Folder("Library");
        Folder migrations = new Folder("migrations");
        Folder models = new Folder("models");
        Folder views = new Folder("views");
        app.addSubFolder(appConfig);
        app.addSubFolder(controllers);
        app.addSubFolder(library);
        app.addSubFolder(migrations);
        app.addSubFolder(models);
        app.addSubFolder(views);

        File htaccess = new File(".htaccess", publicFolder);
        File routerPhp = new File("router.php", publicFolder);
        File indexHtml = new File("index.html", publicFolder);
        publicFolder.addFile(htaccess);
        publicFolder.addFile(routerPhp);
        publicFolder.addFile(indexHtml);

        // Print folder structure
        System.out.println("Folder Structure:");
        php_demo1.print();

        // Delete folder "app" and print structure
        System.out.println("\nAfter deleting folder \"app\":");
        app.delete();
        php_demo1.print();

        // Delete folder "public" and print structure
        System.out.println("\nAfter deleting folder \"public\":");
        publicFolder.delete();
        php_demo1.print();
    }
}
