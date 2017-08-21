package Task4_2_2;


public class Triangle {

    private int firstsSide;
    private int secondSide;
    public int thirdSide;
    public String status;

    public Triangle(int firstsSide, int secondSide, int thirdSide) {
        this.firstsSide = firstsSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
    }

    public Triangle(int firstsSide, int secondSide, int thirdSide, String status) {
        this.firstsSide = firstsSide;
        this.secondSide = secondSide;
        this.thirdSide = thirdSide;
        this.status = status;
    }

    public int sumTriangle() {
        return firstsSide + secondSide + thirdSide;
    }

    public int getFirstsSide() {
        return firstsSide;
    }

    public void setFirstsSide(int firstsSide) {
        this.firstsSide = firstsSide;
    }

    public int getSecondSide() {
        return secondSide;
    }

    public void setSecondSide(int secondSide) {
        this.secondSide = secondSide;
    }

    public int getThirdSide() {
        return thirdSide;
    }

    public void setThirdSide(int thirdSide) {
        this.thirdSide = thirdSide;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Triangle{" +
                "firstsSide=" + firstsSide +
                ", secondSide=" + secondSide +
                ", thirdSide=" + thirdSide +
                ", status='" + status + '\'' +
                '}';
    }
}
