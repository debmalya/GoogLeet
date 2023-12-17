package daily.medium;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class FoodRatingsTest {
    FoodRatings foodRatings;

    @BeforeEach
    private void init() {
        String[] foods = new String[]{"kimchi", "miso", "sushi", "moussaka", "ramen", "bulgogi"};
        String[] cuisines = new String[]{"korean", "japanese", "japanese", "greek", "japanese", "korean"};
        int[] ratings = new int[]{9, 12, 8, 15, 14, 7};
        foodRatings = new FoodRatings(foods, cuisines, ratings);
    }

    @Test
    void changeRating() {
        foodRatings.changeRating("sushi", 16);
        assertEquals("sushi", foodRatings.highestRated("japanese"));
        foodRatings.changeRating("ramen", 16);
        assertEquals("ramen", foodRatings.highestRated("japanese"));
    }

    @Test
    void highestRated() {
        assertEquals("kimchi", foodRatings.highestRated("korean"));
        assertEquals("ramen", foodRatings.highestRated("japanese"));
    }
}