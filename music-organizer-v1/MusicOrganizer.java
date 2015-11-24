import java.util.ArrayList;

/**
 * A class to hold details of audio files.
 * 
 * @author David J. Barnes and Michael Kölling
 * @version 2011.07.31
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
        files = new ArrayList<String>();
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

    /**
     * List a file from the collection.
     * @param index The index of the file to be listed.
     */
    public void listFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }

    public String searchFileWithWhile(String searchString){
        int index = 0;
        boolean found = false;
        String file  = null;
        while(index < files.size() && !found) {
             file = files.get(index);
            if(file.contains(searchString)) {
                // We don't need to keep looking.
                found = true;
            }
            else {
                index++;
            }
        }
        if (found){
            return file;
        }
        else{
            return null;
        }
        
    }
    public String searchFile(String searchString){ 
        for(String file : files){
            if(file.contains(searchString)) {
                return file;
            }        
        }
        return null;
    }

    public void listAllFiles(){
        for(int i = 0;i < files.size();){
            String filename = files.get(i);
            System.out.println(filename);

        }
    }

    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(index >= 0 && index < files.size()) {
            files.remove(index);
        }
    }
}
