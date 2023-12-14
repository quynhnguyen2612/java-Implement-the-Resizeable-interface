public class Square implements Resizeable {
    private double side;

    public Square(double side) {
        this.side = side;
    }

    @Override
    public void resize(double percent) {
        side *= (1 + percent / 100);
    }
}