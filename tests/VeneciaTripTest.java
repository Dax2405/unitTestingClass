import org.hamcrest.Matcher;
import org.junit.Test;

import javax.print.attribute.standard.Destination;

import java.util.Arrays;

import static org.hamcrest.CoreMatchers.hasItems;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.junit.Assert.assertNotNull;

public class VeneciaTripTest {
    @Test
    public void veryfyCompleteDocuments() {

    }
    @Test
    public void veryfyAprppiateClothes(){
        Person person = new Person("1725");
        TripDestination destination = new Venecia();
        person.packClothes(new String[]{"shirt", "hat"});

        assertThat(Arrays.asList(destination.obtainRecomendedClothes()), hasItems(person.obtainPackedClothes()));
    }


}
