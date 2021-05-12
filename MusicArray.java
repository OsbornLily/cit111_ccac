/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collections;

/**
 *
 * @author Happy to See Me
 */
public class MusicArray {

    public static void main(String[] args) throws InterruptedException {

        Music firstSong = new Music();
        firstSong.setMusicGenre("Pop");
        firstSong.setArtistName("Still Woozy");
        firstSong.setNameOfSong("Foolsong");
        firstSong.setSongLength(2.52);

        Music secondSong = new Music();
        secondSong.setMusicGenre("Alternative/Indie");
        secondSong.setArtistName("Vista Kicks");
        secondSong.setNameOfSong("Marceline");
        secondSong.setSongLength(3.51);

        Music thirdSong = new Music();
        thirdSong.setMusicGenre("American Rock");
        thirdSong.setArtistName("OK Go");
        thirdSong.setNameOfSong("Shooting the Moon");
        thirdSong.setSongLength(3.20);

        Music fourthSong = new Music();
        fourthSong.setMusicGenre("Heartland Rock");
        fourthSong.setArtistName("Sam Fender");
        fourthSong.setNameOfSong("Hypersonic Missiles");
        fourthSong.setSongLength(3.57);

        Music fifthSong = new Music();
        fifthSong.setMusicGenre("Rock/Pop");
        fifthSong.setArtistName("Charlotte Lawrence, Nina Nesbitt, and Sasha Sloan");
        fifthSong.setNameOfSong("Girls Just Wanna Have Fun");
        fifthSong.setSongLength(2.43);

        Music[] Songs = new Music[5];

        Songs[0] = firstSong;
        Songs[1] = secondSong;
        Songs[2] = thirdSong;
        Songs[3] = fourthSong;
        Songs[4] = fifthSong;

        for (int s = 0; s <= 4; s += 1) {
            Music accessedSong = Songs[s];
            System.out.println("-------------------------------");
            System.out.println("_______________________________");
            System.out.println("Artist Name: " + accessedSong.getArtistName());
            System.out.println("Song Genre: " + accessedSong.getMusicGenre());
            System.out.println("Name of Song: " + accessedSong.getNameOfSong());
            System.out.println("Song Length: " + accessedSong.getSongLength());
            System.out.println("_______________________________");
            System.out.println("-------------------------------");
        }//close for

    }//close main

}//close class
