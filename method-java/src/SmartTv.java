public class SmartTv {

    boolean on = true;
    int channel = 1;
    int volume = 45;

// ##################################################

    public void turnChannel( int newChannel) {
        channel = newChannel;
    }

    public void upTvVolume(){
        volume ++;
    }

    public void downTvVolume(){
        volume --;
    }

    public void on() {
        on = true;
    }

    public void off() {
        on = false;
    }
}