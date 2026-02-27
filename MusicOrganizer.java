import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 7.0
 */
public class MusicOrganizer
{
    // An ArrayList for storing the file names of music files.
    private ArrayList<String> files;
    
    
    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<>();

    }
    
    /**
     * Add a file to the collection.
     * @param filename The file to be added.
     */
    public void addFile(String filename)
    {
        files.add(filename);
    }
    
    /**
     * Return the number of files in the collection.
     * @return The number of files in the collection.
     */
    public int getNumberOfFiles()
    {
        return files.size();
    }
    
    public void checkIndex(int index) {
        if (index < 0 && index > files.size()) {
            System.out.println("The valid range is " + files.size());
        }
    }
    
    public boolean validIndex(int index) {
        return index >= 0 && index < files.size();
    }
    
    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }
    
    public void listAllFiles() {
        int pos;
        String filename;
        for (int index = 0; index < files.size(); index++) {
            pos = index + 1;
            filename = files.get(index);
            System.out.println(pos + ": " + filename);
        }
    }
    
    public void listWithIndex() {
        String filename;
        for (int index = 0; index < files.size(); index++) {
            filename = files.get(index);
            System.out.println(index + ": " + filename);
        }
    }
    
    public boolean listMatchigng(String searchString) {
        for(String filename : files) {
            if (filename.contains(searchString)) {
                System.out.println(filename);
                return true;
            }
        }
        System.out.println("There is no match to that filename");
        return false;
    }
    
    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index) {
        if(validIndex (index)) {
            files.remove(index);
        }
    }
}
