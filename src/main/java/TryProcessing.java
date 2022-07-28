import processing.core.PApplet;
public class TryProcessing extends PApplet {
    public static final int WIDTH = 640;
    public static final int HEIGHT = 480;

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
        ellipse(WIDTH / 2, HEIGHT / 2, 100, 100); // width: xpos, height: ypos, c = widthOfEllipse, d = heightOfEllipse
    }

    @Override
    public void draw() {
        //System.out.println("Draw Method");
        //mouseX represents the current position of mouse in X direction
        //mouseY represents the current position of mouse in Y direction
        ellipse(mouseX, mouseY, 100, 100);
    }
}
