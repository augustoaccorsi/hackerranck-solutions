import org.json.JSONArray;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class Main {
    // 1) Return the best rated hotel names, a best rated hotel has a rating higher than 7.0 and more than 1000 reviews;

    public static void main(String[] args) {
        String hotels = "[{ \"hotels\" : [{\"name\": \"Blue Three Miami\", \"city\": \"Miami\", \"state\": \"Florida\", \"country\": \"US\","+
                "\"amenities\": \"Free Wifi|Garden|Cleaning services|Laundry|Breakfest\", \"rating\": 7.3, \"reviews\": \"1236\"},"+
                "{\"name\": \"University Inn\", \"city\": \"San Jose\", \"state\": \"California\", \"country\": \"US\","+
                "\"amenities\": \"Free Wifi|Cleaning services|Bike tours|Parking\", \"rating\": 7.3, \"reviews\": \"5251\"},"+
                "{\"name\": \"Sunset Lodge\", \"city\": \"Long Beach\", \"state\": \"California\", \"country\": \"US\","+
                "\"amenities\": \"Cleaning services|Laundry|Garden|Breakfest|Parking\", \"rating\": 7.6, \"reviews\": \"859\"},"+
                "{\"name\": \"Four Seasons\", \"city\": \"Orlando\", \"state\": \"Florida\", \"country\": \"US\","+
                "\"amenities\": \"Cleaning services|Laundry|Wifi\", \"rating\": 6.7, \"reviews\": \"1037\"},"+
                "{\"name\": \"Mountain Plaza\", \"city\": \"Denver\", \"state\": \"Colorado\", \"country\": \"US\","+
                "\"amenities\": \"Cleaning services|Laundry|Garden|Breakfest|Wifi|Bike tours\", \"rating\": 7.8, \"reviews\": \"3876\"} ] }]";

        System.out.println(getBestHotels(hotels));
    }

    public static List<String> getBestHotels(String hotels){
        List<String> bestHotels = new ArrayList<>();

        JSONArray array = new JSONArray(hotels);
        JSONArray hotelsArray = (JSONArray) array.getJSONObject(0).get("hotels");

        for(int i=0; i < hotelsArray.length(); i++) {
            double rating = (double) hotelsArray.getJSONObject(i).get("rating");
            int reviews = Integer.parseInt((String) hotelsArray.getJSONObject(i).get("reviews"));
            if((rating>7.0) && (reviews>1000)){
                bestHotels.add((String)hotelsArray.getJSONObject(i).get("name"));
            }
        }

        return bestHotels;
    }
}