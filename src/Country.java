public class Country implements  Interfaces {
    private  double area;

    public  Country(double area){
        this.area = area;

    }
    public double getArea() {
        return area;
    }

    @Override
    public double getMeasure() {
        return (this.getArea());
    }
    @Override
    public String getData(){
        return "This is of type Country";
    }
}
