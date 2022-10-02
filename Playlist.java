//Carl Jason J. Lazaro - BSCPE-301
import java.util.*;
public class Playlist {
    public static void main(String[] args) {
        Playlist m = new Playlist();
        m.playlist();
    }
    public void playlist() {
        LinkedList <String> l1 = new LinkedList();
        String[] song_list = {"My Own Summer", "Semi Charmed Life", "A Horse With No Name", "Sailing", "I Started A Joke"};
        
        for(int i=0;i<song_list.length;i++) {
           l1.add(song_list[i]);
        }
        LinkedList <String> l2 = new LinkedList();
        String[] artist_list = {"Def Tones", "Third Eye Blind", "America", "Christopher Cross", "Bee Gees"};
        for(int i=0;i<artist_list.length;i++) {
            l2.add(artist_list[i]);
        }
        System.out.print(l1 + "\n" + l2 + "\nPlaylist :\n");
        
        for(int i=0;i<5;i++) {
            System.out.println(song_list[i].concat(" - " + artist_list[i]));
        }
    }
}