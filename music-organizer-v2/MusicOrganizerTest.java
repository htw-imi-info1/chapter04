
public class MusicOrganizerTest
{
    public void testListAll(){
        MusicOrganizer mo = new MusicOrganizer();
        mo.addFile("../audio/Storytelling2012.mp3");
        mo.addFile("../audio/Dragonfly-Dash-Berlin.mp3");
        mo.listAllTracks();
    }
    MusicOrganizer mo = new MusicOrganizer();
    private void generateTestData(){
        mo.addFile("a");
        mo.addFile("b");
        mo.addFile("c");
        mo.addFile("d");}

    public void testFindIndexV1(){
        generateTestData();
        System.out.println(mo.indexOfTrackV1("c"));
    }

    public void testFindIndexV2(){
        generateTestData();
        System.out.println(mo.indexOfTrackV2("c"));
    }

    public void testFindIndexV2_null(){
        generateTestData();
        System.out.println(mo.indexOfTrackV2(null));
    }

   
    
    public void testRemoveTrackFirstOccurrence(){
        generateTestData();
        mo.removeTrackFirst("c");
        mo.listAllTracks();

    }
    
     public void testRemoveTrackAll(){
        generateTestData();
        mo.addFile("d");
        mo.addFile("c");
        mo.removeTrackAll("c");
        mo.listAllTracks();

    }
     public void testRemoveTrackAllAdjacent(){
        generateTestData();
        mo.addFile("d");
        mo.addFile("c");
        mo.removeTrackAll("d");
        mo.listAllTracks();

    }
     public void testRemoveTrackAllAdjacentIterator(){
        generateTestData();
        mo.addFile("d");
        mo.addFile("c");
        mo.removeTrackWithIterator("d");
        mo.listAllTracks();

    }

}
