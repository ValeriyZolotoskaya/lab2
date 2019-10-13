package Ball;
public class Ball {
    private double z = 0.0;
    private double v = 0.0;

    public Ball () {}
    public Ball (double z, double v) {
        this.z = z;
        this.v = v;
    }

    public double getZ() {
        return z;
    }

    public double getV() {
        return v;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public void setV(double v) {
        this.v = v;
    }

    public void setZV(double z, double v){
        this.z = z;
        this.v = v;
    }

    public void move( double zDisp, double vDisp){
        z+=zDisp;
        v+=vDisp;
    }

    @Override
    public String toString() {
        return "Ball @ ("+this.z+", "+this.v+").";
    }
}
