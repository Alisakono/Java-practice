public class Main {
    public static void main(String[] args) {
        AudioPlayer player = new AudioPlayer();
        player.play("Moonlight");
        System.out.println(player.getCurrentTrack());
        player.stop();
        System.out.println(player.getCurrentTrack());
        AudioRecorder recorder =new AudioRecorder();
        recorder.record();
        recorder.play("Gatka");
        System.out.println(recorder.getCurrentTrack());
        recorder.stop();
        System.out.println(recorder.getCurrentTrack());


    }
}
