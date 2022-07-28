import processing.core.PApplet;
public class TryProcessing extends PApplet {
    public static void main(String[] args){
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(640, 480);
    }

    @Override
    public void setup() {
        ellipse(320, 240, 100, 100);
    }
}
