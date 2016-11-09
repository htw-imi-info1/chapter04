import java.util.ArrayList;
public class ArrayListExample
{
    public void arrayListPlayground(){
        // files initialisieren
        ArrayList<String> files = new ArrayList<String>();
        files.add("a.mp3");
        files.add("b.mp3");
        files.add("c.mp3");
        // d zwischen b und c einfügen
        files.add(2,"d.mp3");
        System.out.println("element an 2: "+files.get(2));
        // delete b.mp3
        files.remove(1);
        // what is the index of d?
        System.out.println("Index of d: "+files.indexOf("d.mp3"));
        

    }
}
