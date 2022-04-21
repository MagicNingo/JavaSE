package Day0805.Test;

import java.io.File;
import java.io.FileFilter;

public class MyFile implements FileFilter {
    @Override
    public boolean accept(File file) {
        String name = file.getName();
        if (name.endsWith(".txt")) {
            return true;
        }
        return false;
    }
}
