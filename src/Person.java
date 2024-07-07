import org.hamcrest.Matcher;
import java.util.ArrayList;
import java.util.Arrays;

public class Person {
    final String id;
    Passport passport;
    ArrayList<String> clothes;
    public Person(String id) {
        this.id = id;
        this.clothes = new ArrayList<>();
    }
    public void requestPassport(Embassy embassy){
        passport = embassy.requestPassport();
    }
    public Passport verifyPassport(){
        return passport;
    }
    public void packClothes(String[] clothes){
        this.clothes.addAll(Arrays.asList(clothes));
    }

    public ArrayList<String> obtainPackedClothes() {
        return clothes;
    }
}
