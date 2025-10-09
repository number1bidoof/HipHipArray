/*
Name: Ayah Abdalla
Date: 10/03/2025
Description: A method that shuffles a playlist of songs
*/

import java.lang.Math;

public class ShufflePlaylist {
    public static String[] shuffle(String[] playlist){
        for (int i = 0; i < playlist.length - 1 ; i++){ 
            int j = (int)(Math.random() * playlist.length); // gets a valid random index value for the playlist
            String temp = playlist[i]; // sets a temporary varrible to the given song of the playlist (based on i)
            playlist[i] = playlist[j]; // sets the song in the for loop to the random song (based on j)
            playlist[j] = temp; // swaps the random song to the given song (based on i)
        }
        return playlist; // returns the shuffled playlist
    }
    public static void main(String[] args) {
        String[] playlist = {"Gangnam Style – PSY",
        "I Love You – Barney",
        "Never Gonna Give You Up – Rick Astley",
        "Shake It Off – Taylor Swift",
        "Baby Shark – Pinkfong",
        "Axel F (Crazy Frog) – Crazy Frog",
        "What Does the Fox Say? – Ylvis"};
        String[] shuffledPlaylist = shuffle(playlist); // shuffles the playlist

        for (int i = 0; i < shuffledPlaylist.length; i++){ // helps format the output 
            System.out.println((i + 1) + ". " + shuffledPlaylist[i]+" ");
        }
    }
}
