public class Summ2 {

}
interface Playable{
    public void play(String trackName);
    public void stop();
    public String  getCurrentTrack();
}
interface Recordable{
    public default void record() {

    }

    public default void stopRecording() {

    }
}
class AudioPlayer implements Playable{
    @Override
    public void play(String trackName) {

    }

    @Override
    public void stop() {

    }

    @Override
    public String getCurrentTrack() {
        return null;
    }
}
class AudioRecorder implements Playable, Recordable{
    @Override
    public void record() {
        Recordable.super.record();
    }

    @Override
    public void stopRecording() {
        Recordable.super.stopRecording();
    }

    @Override
    public void play(String trackName) {
    trackName = trackName;
    }

    @Override
    public void stop() {

    }

    @Override
    public String getCurrentTrack() {
        return null;
    }
}
//    Создайте интерфейс Playable с методами play() и stop(). Затем создайте класс AudioPlayer,
//        который реализует интерфейс Playable. Создайте еще один интерфейс Recordable с методами
//        record() и stopRecording(). Создайте класс AudioRecorder, который реализует оба интерфейса.
//        В методе main создайте объекты AudioPlayer и AudioRecorder и продемонстрируйте их работу.