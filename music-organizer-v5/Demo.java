
public class Demo
{
    public static MusicOrganizer instanceWithData(){
        MusicOrganizer morg = new MusicOrganizer();
        morg.addTrack(new Track("Bob Dylan","Like a Rolling Stone","a.mp3"));    
        morg.addTrack(new Track("Bob Dylan","Blowin' in the Wind","x.mp3"));    
        morg.addTrack(new Track("Bob Dylan","Subterranean Homesick Blues","x.mp3"));    
        morg.addTrack(new Track("Bob Dylan","Lay, Lady, Lay","x.mp3"));    
        morg.addTrack(new Track("Bob Dylan","Knockin' On Heaven's Door","x.mp3"));    
        morg.addTrack(new Track("Bob Dylan","I want you","x.mp3"));    
        morg.addTrack(new Track("Bob Dylan","All Along the Watchtower","x.mp3"));    
        morg.addTrack(new Track("Bob Dylan","Tangled up in Blue","x.mp3"));    
        morg.addTrack(new Track("Bob Dylan","Hurricane","x.mp3"));   
        return morg;
    }
}
