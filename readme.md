
Class: Implemented Various Loops 
========================================================
in music-organizer-v3


Worksheet 
========================================================
1. a) items.get(5-1) oder auch: items.get(4)
   b) files.add(favoriteTrack);
   c) 

    public boolean validIndex(int i){
        return ((i >= 0) && (i < files.size());
    }

2: see music-organizer-v3 (listAllFilesWithIndexForWorksheet - noch unvollständig)



About the Various MusicOrganizer Projects:
========================================================

* V1 Demonstrates ArrayLists.
* V2 Can also Play Music:
  I've deleted the individual audio subfolders in the original projects and created a common audio folder containing example files from the public domain. You can thus use those filenames in the collection:

      ../audio/Dragonfly-Dash-Berlin.mp3
      ../audio/Storytelling2012.mp3

* V3 demonstrates iterating through the whole collection with for-each. It also has the validIndex method.
* V4 uses a while loop to search for tracks
* V5 improves structure by introducing a track class


the included mp3s are from soundcloud:

https://soundcloud.com/krlos-reyes/dragonfly-dash-berlin
https://soundcloud.com/mrpaulofficial/storytelling2012