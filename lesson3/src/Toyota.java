public class Toyota extends Car{
    public Toyota(String model, String color, String exter, String fuel_type, String control, int num_wheels, double vol_eng) {
        super("Toyota", model, color, exter, fuel_type, control, num_wheels, vol_eng);

    }

    @Override
    public boolean is_vecsicale(boolean is_vecsicale) {
        return true;
    }

    public void isLight_on(boolean is_light){
        is_light = true;
    }
}
