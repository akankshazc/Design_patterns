package hf_6.remoteWL;

public class Stereo {
    String location;

    public Stereo(String location) {
        this.location = location;
    }

    public void on() {
        System.out.println(location + " stereo is on");
    }

    public void off() {
        System.out.println(location + " stereo is off");
    }

    public void setCD() {
        System.out.println(location + " stereo is set for CD input");
    }

    public void setDVD() {
        System.out.println(location + " stereo is set for DVD input");
    }

    public void setRadio() {
        System.out.println(location + " stereo is set for Radio");
    }

    public void setVolume(int volume) {
        // valid range: 1 to 11
        if (volume < 1 || volume > 11) {
            System.out.println(location + " stereo volume must be between 1 and 11");
        } else {
            System.out.println(location + " stereo volume set to " + volume);
        }
    }
}
