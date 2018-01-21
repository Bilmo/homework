package lesson9;

/**
 * Created by student on 1/21/2018.
 */
public enum Season {
    WINTER(-13), SUMMER(23){
        public String getDescription (){
            return "Теплое время года";
        }
    },
    SPRING(15), AUTUM(17);
    private double temp;

    Season(double temp) {
        this.temp = temp;
    }

    public double getTemp() {
        return temp;
    }
    public String getDescription (){
        return "Холодное время года";
    }
}
