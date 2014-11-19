public class TestMusicOrganizer
{
    public static MusicOrganizer createMusicOrganizerWithTestData(){
        MusicOrganizer organizer = new MusicOrganizer();
        organizer.addFile("../audio/Dragonfly-Dash-Berlin.mp3");
        organizer.addFile("../audio/Storytelling2012.mp3");
        organizer.addFile("Berlin.mp3");
        organizer.addFile("A.mp3");
        organizer.addFile("B.mp3");
        organizer.addFile("AB.mp3");
        organizer.addFile("ABC.mp3");
        organizer.addFile("ABCD.mp3");
        return organizer;
    }
}
