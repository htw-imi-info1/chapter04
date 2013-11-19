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
    // A player for the music files.
    private MusicPlayer player;

    /**
     * Create a MusicOrganizer
     */
    public MusicOrganizer()
    {
        files = new ArrayList<String>();
        player = new MusicPlayer();
    }

    public void addTestData(){
        addFile("../audio/joplin-entertainer.mp3");
        addFile("../audio/mozart-nm-rondo.mp3");
        addFile("../audio/foo.mp3");
        addFile("../audio/bar.mp3");
        addFile("../audio/foobar.mp3");
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
        if(validIndex(index)) {
            String filename = files.get(index);
            System.out.println(filename);
        }
    }

    /**
     * Show a list of all the files in the collection.
     */
    public void listAllFilesWithWhile()
    {
        int index = 0;
        while(index < files.size()) {
            String filename = files.get(index);
            System.out.println(filename);
            index++;
        }
    }

    public void listAllFilesWithWhileShort()
    {
        int position = 0;
        while(position < files.size()) {
            System.out.println(""+position+": "+files.get(position++));
        }
    }

    public void listAllFiles()
    {
        int position = 0;
        for(String filename : files) {
            System.out.println(""+position++ + ": "+filename);
        }
    }

    public String findFirst(String searchString){
        for(String filename : files) {
            if (filename.contains(searchString))
                return filename;
        } 
        return null;
    }

    public String deleteFirst(String searchString){
        for(String filename : files) {
            if (filename.contains(searchString)){
                files.remove(filename);
                return filename;
            }
        } 
        return null;
    }
    /**
     * this doesn't work - throws a concurrent modification 
     * exception - we'll learn next week how to handle this
     */
    public String deleteAll(String searchString){
        for(String filename : files) {
            if (filename.contains(searchString))
                files.remove(filename);
        } 
        return null;
    }
    
    public String findFirstWithWhile(String searchString){
        boolean found = false;
        int index = 0;
        int filesSize = files.size();
        while(!found && index < filesSize) {
            String filename = files.get(index);
            if (filename.contains(searchString))
                found = true;
            else
                index++;
        } 
        return found ? files.get(index) : null;

        /*
        if (found) 
        return files.get(index);
        else
        return null;
         */

    }


    /**
     * Remove a file from the collection.
     * @param index The index of the file to be removed.
     */
    public void removeFile(int index)
    {
        if(validIndex(index)) {
            files.remove(index);
        }
    }

    /**
     * Start playing a file in the collection.
     * Use stopPlaying() to stop it playing.
     * @param index The index of the file to be played.
     */
    public void startPlaying(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            player.startPlaying(filename);
        }
    }

    /**
     * Stop the player.
     */
    public void stopPlaying()
    {
        player.stop();
    }

    /**
     * Play a file in the collection. Only return once playing has finished.
     * @param index The index of the file to be played.
     */
    public void playAndWait(int index)
    {
        if(validIndex(index)) {
            String filename = files.get(index);
            player.playSample(filename);
        }
    }

    /**
     * Determine whether the given index is valid for the collection.
     * Print an error message if it is not.
     * @param index The index to be checked.
     * @return true if the index is valid, false otherwise.
     */
    private boolean validIndex(int index)
    {
        // The return value.
        // Set according to whether the index is valid or not.
        boolean valid;

        if(index < 0) {
            System.out.println("Index cannot be negative: " + index);
            valid = false;
        }
        else if(index >= files.size()) {
            System.out.println("Index is too large: " + index);
            valid = false;
        }
        else {
            valid = true;
        }
        return valid;
    }
}
