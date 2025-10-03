import java.util.Arrays;

public class ShufflePlaylist {
    public static String[] shuffle(String[] playlist){
        for (int i = 0; i < playlist.length - 1 ; i++){
            int j = (int)(Math.random() * playlist.length);
            String temp = playlist[i];
            playlist[i] = playlist[j];
            playlist[j] = temp;
        }
        for (String song : playlist){
            System.out.println(song + " ");
        }
        return playlist;
    }
    public static void main(String[] args) {
        String[] playlist = {"Gangnam Style – PSY","I Love You – Barney","Never Gonna Give You Up – Rick Astley", "Shake It Off – Taylor Swift","Baby Shark – Pinkfong","Axel F (Crazy Frog) – Crazy Frog","What Does the Fox Say? – Ylvis"};
        String[] testing = shuffle(playlist);
    }
}
