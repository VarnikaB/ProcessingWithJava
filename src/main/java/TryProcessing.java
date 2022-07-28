import processing.core.PApplet;
public class TryProcessing extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int RGB1 = 255;
    public static final int DIAMETER = 10;
    int circlex1 = 0;
    int circlex2 = 0;
    int circlex3 = 0;
    int circlex4 = 0;

    public static void main(String[] args){
        PApplet.main("TryProcessing", args);
    }

    @Override
    public void settings() {
        super.settings();
        size(WIDTH, HEIGHT);
    }

    @Override
    public void setup() {
        paintWhite();
        drawCircle(); // width: xpos, height: ypos, c = widthOfEllipse, d = heightOfEllipse
    }

    @Override
    public void draw() {
        drawCircle();
    }

    private void drawCircle() {
        ellipse(circlex1, HEIGHT / 5, DIAMETER, DIAMETER);
        circlex1++;
        ellipse(circlex2, HEIGHT * 2 / 5, DIAMETER, DIAMETER);
        circlex2 += 2;
        ellipse(circlex3, HEIGHT * 3 / 5, DIAMETER, DIAMETER);
        circlex3 += 3;
        ellipse(circlex4, HEIGHT * 4 / 5, DIAMETER, DIAMETER);
        circlex4 += 4;

    }

    private void paintWhite() {
        background(RGB1);
    }
}
