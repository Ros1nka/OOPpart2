public class Truck extends Car{
    private Trailer trailer;

    public Truck(String modelName, int wheelsCount, Trailer trailer) {
        super(modelName, wheelsCount);
        this.trailer = trailer;
    }

    @Override
    public void check() {
        super.check();
        this.checkTrailer();
    }

    public void checkTrailer() {
        trailer.check();
    }
}