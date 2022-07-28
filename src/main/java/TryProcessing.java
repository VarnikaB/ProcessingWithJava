import processing.core.PApplet;
public class TryProcessing extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;
    public static final int RGB1 = 255;
    public static final int DIAMETER = 100;
    int x = 0;

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
        //System.out.println("Setup method");
        drawCircle(WIDTH / 2); // width: xpos, height: ypos, c = widthOfEllipse, d = heightOfEllipse
    }

    @Override
    public void draw() {
        //System.out.println("Draw Method");
        //mouseX represents the current position of mouse in X direction
        //mouseY represents the current position of mouse in Y direction
        paintWhite();  //This will keep replacing the background to white
        drawCircle(mouseX);
    }

    private void drawCircle(int mouseX) {
        ellipse(x, HEIGHT / 2, DIAMETER, DIAMETER);
        x++;
        if(x == WIDTH)
            x = 0;
    }

    private void paintWhite() {
        background(RGB1);
    }
}
