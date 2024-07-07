import java.util.ArrayList;

public class Venecia extends TripDestination {
    ArrayList<String> recomendedClothes;
    public Venecia() {
        recomendedClothes = new ArrayList<>();
        recomendedClothes.add("shirt");
        recomendedClothes.add("hat");

    }
    @Override
    public ArrayList<String> obtainRecomendedClothes(){

        return recomendedClothes;
    }
}
