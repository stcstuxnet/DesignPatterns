/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AdapterPattern;

/**
 *
 * @author Ali-PC
 */
public class AdapterPatternDemo {

    /*
    Burada MediaPlayer ve AdvancedMediaPlayer diye iki sınır var. Ses çalabilen AudioPlayer MediaPlayer'dan türüyor
    VlcPlayer ve Mp4 player ise Advanced. audioPlayer vlc veya mp4 çalsın diye bir arasınıf yani adapter üretiliyor.
    adapter'ın constructer'ında AdvancedMediaPlayer var ve onu döndürüyor.
    AudioPlayer'a mp4 istegi gelirse kendi içinde bir adapter üretiyor ve ona o mp4 isteğini pass ediyor. Adaptörün içindeki
    AdvMP 'da mp4 ü çalıyor.
     */
    public static void main(String[] args) {
        // TODO code application logic here
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "beyond the horizon.mp3");
        audioPlayer.play("mp4", "alone.mp4");
        audioPlayer.play("vlc", "far far away.vlc");
        audioPlayer.play("avi", "mind me.avi");
    }

}
