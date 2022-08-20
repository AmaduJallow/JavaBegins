public class Minimarket implements  Interfaces {
   private double sales;

    public Minimarket(double dailySale){
        this.sales = dailySale;

    }

    public double getSales() {
        return sales;
    }


    @Override
    public double getMeasure() {
        return this.getSales();
    }

    @Override
    public String getData() {
        return "This is a  Mini-Marker";
    }
}
