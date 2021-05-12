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
public class Music {
    
    private String musicGenre;
    private double songLength;
    private String artistName;
    private String nameOfSong;
    
    public String getMusicGenre(){
        return musicGenre; 
    }//close getmusicgenre
    
    public void setMusicGenre(String musicGenre){
        this.musicGenre = musicGenre;
    }//close setmusic
    
    public double getSongLength(){
        return songLength;
    }//close songlength
    
    public void setSongLength(double songLength){
        this.songLength = songLength;
    }//close songlength
    
    public String getArtistName(){
        return artistName;
    }//close artistname
    
    public void setArtistName(String artistName){
        this.artistName = artistName;
    }//close artistname
    
    public String getNameOfSong(){
        return nameOfSong;
    }//close nameofsong
    
    public void setNameOfSong(String nameOfSong){
        this.nameOfSong = nameOfSong;
    }//close nameofsong
    
}//close class
