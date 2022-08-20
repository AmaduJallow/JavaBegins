public class Measurer {

    Interfaces measurer;


    public String summer(Interfaces[] measurer) {
        double sum =0;
        for(int i = 0; i < measurer.length; i++) {
            sum += measurer[i].getMeasure();
        }
      return "The total is "+ sum;
      }

    public String average(Interfaces[] measurer) {
        double sum =0;
        for(int i = 0; i < measurer.length; i++) {
            sum += measurer[i].getMeasure();

        }
        return "The average is "+(int)(sum/measurer.length);
    }


}

