package april27.Interfaces.MediaPlayers;

public class YoutubePremium extends Youtube implements VideoMediaPlayer{

    @Override
    public void playAudioOnly() {
        super.playAudioOnly();
    }

    @Override
    public void play() {
        super.play();
    }

    @Override
    public void pause() {
        super.pause();
    }

    @Override
    public void resume() {
        super.resume();
    }

    @Override
    public void stop() {
        super.stop();
    }

    @Override
    public void playVideoOnly() {
        super.playVideoOnly();
    }

    @Override
    public void playYoutube() {
        super.playYoutube();
    }

    public void playWithoutAds(){
        System.out.println("PLay without Ads");
    }

}
