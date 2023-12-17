package daily.medium;

import java.util.*;

/**
 * Design a food rating system that can do the following:
 * Modify the rating of a food item listed in the system.
 * Return the highest-rated food item for a type of cuisine in the system.
 * Implement the FoodRatings class:
 */
class FoodRatings {
    //Used to uniquely identfied the [food, rating] inside TreeSet to make
    //the search easier inside TreeSet
    private Map<String, FoodInfo> foodInfos;

    private Map<String, TreeSet<FoodInfo>> cuisinesMap;

    public FoodRatings(String[] foods, String[] cuisine, int[] ratings) {
        foodInfos = new HashMap<>();
        cuisinesMap = new HashMap<>();

        for(int i = 0; i < foods.length; i += 1) {
            String name = foods[i], foodStyle = cuisine[i];
            int rating = ratings[i];

            FoodInfo foodObj = new FoodInfo(name, foodStyle, rating);

            cuisinesMap.putIfAbsent(foodStyle, new TreeSet<>((a, b) -> {
                if(a.rating == b.rating) return a.name.compareTo(b.name);
                return Integer.compare(b.rating, a.rating);
            }));

            cuisinesMap.get(foodStyle).add(foodObj);
            foodInfos.put(name, foodObj);
        }
    }

    public void changeRating(String food, int newRating) {
        FoodInfo obj = foodInfos.get(food);
        TreeSet<FoodInfo> nameRatings = cuisinesMap.get(obj.cuisine);
        //Removal & Insertion : This step must be done to re-arrange the data [name, ratings] in TreeSet
        //After Updation in Rating.
        nameRatings.remove(obj);
        obj.rating = newRating;
        nameRatings.add(obj);
    }

    public String highestRated(String cuisine) {
        return cuisinesMap.get(cuisine).first().name;
    }

    private class FoodInfo {
        String name;
        String cuisine;
        int rating;

        FoodInfo(String name, String cuisine, int rating) {
            this.name = name;
            this.cuisine = cuisine;
            this.rating = rating;
        }
    }
}
