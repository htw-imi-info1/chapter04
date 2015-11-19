
/**
 * Write a description of class MusicOrganizerTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MusicOrganizerTest
{
    public static void test(){
        MusicOrganizer mo = new MusicOrganizer();
        mo.addFile("a.mp3");
        mo.addFile("b.mp3");
        mo.addFile("c.mp3");
        mo.addFile("d.mp3");
        mo.listAllFiles();
    }
}
