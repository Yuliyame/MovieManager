import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MovieManagerTest {

    @Test
    public void test() {
        MovieManager manager = new MovieManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");

        String[] actual = manager.findAll();
        String[] expected = {"Film I", "Film II", "Film III"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test2() {
        MovieManager manager = new MovieManager();

        manager.add("Film I");
        manager.add("Film II");
        manager.add("Film III");

        String[] actual = manager.findLast();
        String[] expected = {"Film III", "Film II", "Film I"};
        Assertions.assertArrayEquals(expected, actual);
    }
}
