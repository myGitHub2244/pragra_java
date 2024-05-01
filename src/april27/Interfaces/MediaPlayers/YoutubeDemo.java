package april27.Interfaces.MediaPlayers;

public class YoutubeDemo {

    public static void main(String[] args) {

        VideoMediaPlayer youtube = new Youtube();
        youtube.play();
        youtube.pause();
        youtube.resume();
        youtube.stop();

        youtube.playVideoOnly();        //Can call Child Class methods implemented from parent Interface

//        youtube.playYoutube();        //Cannot call Child Class exclusive methods using Parent Interface Obj ref
//        youtube.playAudioOnly();      //Cannot call AudioMediaPlayer Interface methods using Obj ref of VideoMediaPLayer

        YoutubePremium youtubePremium = new YoutubePremium();
        youtubePremium.playYoutube();
        youtubePremium.playVideoOnly();
        youtubePremium.playWithoutAds();

    }
}
