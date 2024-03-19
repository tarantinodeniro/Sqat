import org.junit.Test;
import static org.junit.Assert.*;

public class VisaApplicationTest {

    @Test(expected = NullPointerException.class)
    public void testBothNull() {
        VisaApplication.applicantsForBothVisas(null, null);
    }

    @Test(expected = NullPointerException.class)
    public void testUkNull() {
        VisaApplication.applicantsForBothVisas(null, new ArrayList<>(List.of("1", "2")));
    }

    @Test(expected = NullPointerException.class)
    public void testUsaNull() {
        VisaApplication.applicantsForBothVisas(new ArrayList<>(List.of("1", "2")), null);
    }

    @Test
    public void testNoApplicantsForBoth() {
        List<String> ukList = new ArrayList<>(List.of("1", "2"));
        List<String> usaList = new ArrayList<>(List.of("3", "4"));
        List<String> result = VisaApplication.applicantsForBothVisas(ukList, usaList);
        assertNull(result);
    }

    @Test
    public void testApplicantsForBoth() {
        List<String> ukList = new ArrayList<>(List.of("1", "2", "3"));
        List<String> usaList = new ArrayList<>(List.of("2", "3", "4"));
        List<String> result = VisaApplication.applicantsForBothVisas(ukList, usaList);
        assertNotNull(result);
        assertEquals(2, result.size());
        assertTrue(result.contains("2"));
        assertTrue(result.contains("3"));
    }
}
