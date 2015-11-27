
public class TrackEquality
{
    
    public static void testEquality(){
        Track track1 = new Track("Madonna","Like a Virgin","m.mp3");
        Track track2 = new Track("Madonna","Like a Virgin","m.mp3");
        
        System.out.println("track1 == track2: "+(track1 == track2));
    
        Track track3 = track1;
        System.out.println("track1 == track3: "+(track1 == track3));
    
        System.out.println("track1.equals(track2): "+(track1.equals(track2)));
     
    }
}
