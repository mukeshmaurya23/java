class phone {
    public void call() {
        System.out.println("Calling...");
    }

    public void message() {
        System.out.println("Messaging...");
    }
}

interface camera {
    void takePicture();

    void recordVideo();
}

interface musicPlayer {
    void play();

    void pause();

    void next();
}

class smartPhone extends phone implements camera, musicPlayer {
    void VideoCall() {
        System.out.println("Video call features");

    }

    public void takePicture() {
        System.out.println("picture is taking");
    }

    public void recordVideo() {
        System.out.println("record videooo..");
    }

    public void play() {
        System.out.println("Play music");
    }

    public void pause() {
        System.out.println("pause music..");
    }

    public void next() {
        System.out.println("play next music");
    }
}

public class InterfaceExample {
    public static void main(String[] args) {
        musicPlayer p = new smartPhone();
        // p.call();
        // p.message();
        // p.VideoCall();
        // p.recordVideo();
        // p.takePicture();
        p.pause();
        p.play();
        p.next();
    }
}
