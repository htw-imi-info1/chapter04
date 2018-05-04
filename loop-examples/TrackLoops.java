import java.util.ArrayList;
public class TrackLoops
{
    public void listAllTracks(){
        ArrayList<Track> tracks = new ArrayList<>();
        tracks.add(new Track("Bob Dylan","Like a Rolling Stone","a.mp3"));    
        tracks.add(new Track("Bob Dylan","Blowin' in the Wind","x.mp3"));    
        tracks.add(new Track("Bob Dylan","Subterranean Homesick Blues","x.mp3"));    
        tracks.add(new Track("Bob Dylan","Lay, Lady, Lay","x.mp3"));    
        tracks.add(new Track("Bob Dylan","Knockin' On Heaven's Door","x.mp3"));    
        tracks.add(new Track("Bob Dylan","I want you","x.mp3"));    
        tracks.add(new Track("Bob Dylan","All Along the Watchtower","x.mp3"));    
        tracks.add(new Track("Bob Dylan","Tangled up in Blue","x.mp3"));    
        tracks.add(new Track("Bob Dylan","Hurricane","x.mp3"));   
        
        for(Track currentTrack : tracks){
      System.out.println(currentTrack.getArtist() + ": " + currentTrack.getTitle());
      }
       
        for(Track t : tracks){
      System.out.println(t);
      }
      
      int i = 0;
      while(i<5){
          Track currentTrack = tracks.get(i); 
         System.out.println(currentTrack.getArtist() + ": " + currentTrack.getTitle());
     i++;
        }

    }
    public void printJustOne(){
    Track track = new Track("Bob Dylan","Subterranean Homesick Blues","x.mp3");
    System.out.println(track.getArtist() + ": " + track.getTitle());
    }
}
