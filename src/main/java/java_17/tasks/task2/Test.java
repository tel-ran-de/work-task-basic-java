package java_17.tasks.task2;

public class Test {
    public static void main(String[] args) {
        Pen green = new Pen();
        Pen red = new Pen();
        Pen black = new Pen();

        Pen[] pens = new Pen[3];
        pens[0] = green;
        pens[1] = red;
        pens[2] = black;

        for (int i = 0; i < pens.length; i++) {
            System.out.println(pens[i]);
        }

        green.setColor("green");
        green.setColor("red");
        green.setColor("black");

        for (int i = 0; i < pens.length; i++) {
            System.out.println(pens[i].getColor());
        }
    }
}
