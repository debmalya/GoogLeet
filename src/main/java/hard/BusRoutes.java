package hard;

import java.util.*;

public class BusRoutes {
    /**
     * You are given an array routes representing bus routes where routes[i] is a bus route that the ith bus repeats forever.
     * <p>
     * For example, if routes[0] = [1, 5, 7], this means that the 0th bus travels in the sequence 1 -> 5 -> 7 -> 1 -> 5 -> 7 -> 1 ->
     * ... forever.
     * <p>
     * You will start at the bus stop source (You are not on any bus initially), and you want to go to the bus stop target.
     * You can travel between bus stops by buses only.
     *
     * @param routes array of bus routes.
     * @param source starting stop.
     * @param target ending stop.
     * @return the least number of buses you must take to travel from source to target. Return -1 if it is not possible.
     */
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if (source == target) {
            return 0;
        }
        int maxStop = -1;
        for (int[] route : routes) {
            for (int stop : route) {
                maxStop = Math.max(maxStop, stop);
            }
        }
        if (maxStop < target) {
            return -1;
        }
        int n = routes.length;
        int[] minBusesToReach = new int[maxStop + 1];
        Arrays.fill(minBusesToReach, n + 1);
        minBusesToReach[source] = 0;
        boolean flag = true;
        while (flag) {
            flag = false;
            for (int[] route : routes) {
                int min = n + 1;
                for (int stop : route) {
                    min = Math.min(min, minBusesToReach[stop]);
                }
                min++;
                for (int stop : route) {
                    if (minBusesToReach[stop] > min) {
                        minBusesToReach[stop] = min;
                        flag = true;
                    }
                }
            }

        }
        return (minBusesToReach[target] < n + 1 ? minBusesToReach[target] : -1);
    }

    static class Path {
        List<Integer> busStops;
        int noOfBuses;
    }

    public int numBusesToDestination0(int[][] routes, int source, int target) {
        int leastNumberOfBuses = -1;
        // key bus stop, set of routes goes through that stop.
        Map<Integer, Set<Integer>> busStopRouteMap = new HashMap<>();
        // Bus stops in multiple routes
        Set<Integer> junctions = new HashSet<>();
        // Route which contains source
        Set<Integer> sourceRoutes = new HashSet<>();
        // Route which contains target
        Set<Integer> targetRoutes = new HashSet<>();
        int routeIndex = 0;
        for (int[] eachRoute : routes) {
            boolean sourcePresent = false;
            boolean targetPresent = false;
            for (int eachStop : eachRoute) {
                if (eachStop == source) {
                    sourcePresent = true;
                    sourceRoutes.add(routeIndex);
                }
                if (eachStop == target) {
                    targetPresent = true;
                    targetRoutes.add(routeIndex);
                }
                if (sourcePresent && targetPresent) {
                    // both source and target are in same route
                    return 1;
                }
                var routesForBusStop = busStopRouteMap.getOrDefault(eachStop, new HashSet<>());
                routesForBusStop.add(routeIndex);
                busStopRouteMap.put(eachStop, routesForBusStop);


                if (routesForBusStop.size() > 1) {
                    junctions.add(eachStop);
                    if (targetRoutes.contains(routeIndex)) {
                        // can be useful junction to reach source
                        for (int route : sourceRoutes) {
                            if (routesForBusStop.contains(route)) {
                                leastNumberOfBuses = 2;
                                break;
                            }
                        }
                    } else if (sourceRoutes.contains(routeIndex)) {
                        // can be useful junction to reach target
                        for (int route : targetRoutes) {
                            if (routesForBusStop.contains(route)) {
                                leastNumberOfBuses = 2;
                                break;
                            }
                        }
                    }
                }


            }
            routeIndex++;
        }


        if (leastNumberOfBuses == -1) {
            // not in the same route, have to go through the junction
            // not a single junction, there may be multiple junctions
            for (int busStop : junctions) {
                var junctionRoutes = busStopRouteMap.get(busStop);
            }
        }

        return leastNumberOfBuses;
    }
}
