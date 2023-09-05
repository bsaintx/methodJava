public class User {
    public static void main(String[] args) throws Exception {
        SmartTv control = new SmartTv();

        System.out.println("Channel: " + control.channel);
        System.out.println("Volume: " + control.volume);

        control.on();
        System.out.println("Status TV -> " + control.on);

        System.out.println("  ");
        System.out.println("###############################################");
        System.out.println("  ");
        
        control.off();
        System.out.println ("New Status on TV -> " + control.on);

        control.downTvVolume();
        control.downTvVolume();
        control.downTvVolume();
        control.downTvVolume();
        control.upTvVolume();
        control.upTvVolume();
        System.out.println("New volume: " + control.volume);

        control.turnChannel(12);
        System.out.println("New channel: " + control.channel);

    }
}
