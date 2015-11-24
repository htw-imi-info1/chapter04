
/**
 * Write a description of class MusicOrganizerTest here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MusicOrganizerTest
{
    public static void testSearch(){
        MusicOrganizer mo = new MusicOrganizer();
        mo.addFile("alpha.mp3");
        mo.addFile("bravo.mp3");
        mo.addFile("charlie.mp3");
        mo.addFile("delta.mp3");
        System.out.println(mo.searchFile("harli"));
         System.out.println(mo.searchFile("harly"));
    }
    public static void test(){
        MusicOrganizer mo = new MusicOrganizer();
        mo.addFile("a.mp3");
        mo.addFile("b.mp3");
        mo.addFile("c.mp3");
        mo.addFile("d.mp3");
        mo.listAllFiles();
    }
}
