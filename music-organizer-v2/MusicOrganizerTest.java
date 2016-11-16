
public class MusicOrganizerTest
{
    public void testListAll(){
        MusicOrganizer mo = new MusicOrganizer();
        mo.addFile("../audio/Storytelling2012.mp3");
        mo.addFile("../audio/Dragonfly-Dash-Berlin.mp3");
        mo.listAllTracks();
    }
    
    
}
