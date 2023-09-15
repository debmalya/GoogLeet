package hard;

import java.util.*;

public class ReconstructItinerary {
    /**
     * You are given a list of airline tickets where tickets[i] = [fromi, toi]
     * represent the departure and the arrival airports of one flight.
     * Reconstruct the itinerary in order and return it.
     * <p>
     * All of the tickets belong to a man who departs from "JFK", thus, the itinerary must begin with "JFK".
     * If there are multiple valid itineraries,
     * you should return the itinerary that has the smallest lexical order when read as a single string.
     *
     * @param tickets airline tickets where tickets[i] = [fromi, toi].
     * @return
     */
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, PriorityQueue<String>> graph = new HashMap<>();

        for (List<String> ticket : tickets) {
            graph.putIfAbsent(ticket.get(0), new PriorityQueue<>());
            graph.get(ticket.get(0)).add(ticket.get(1));
        }

        LinkedList<String> itinerary = new LinkedList<>();

        dfs("JFK", graph, itinerary);

        return itinerary;
    }

    private void dfs(String airport, Map<String, PriorityQueue<String>> graph, LinkedList<String> itinerary) {
        PriorityQueue<String> nextAirports = graph.get(airport);
        while (nextAirports != null && !nextAirports.isEmpty()) {
            dfs(nextAirports.poll(), graph, itinerary);
        }
        itinerary.addFirst(airport);
    }

    public List<String> findItinerary0(List<List<String>> tickets) {
        List<String> strList = new ArrayList<>();
        String finalDestination = "";
        Map<String, String> sourceTodestination = new HashMap<>();
        for (List<String> eachJourney : tickets) {
            sourceTodestination.put(eachJourney.get(0), eachJourney.get(1));
        }
        System.out.println(sourceTodestination);
        return strList;
    }
}
