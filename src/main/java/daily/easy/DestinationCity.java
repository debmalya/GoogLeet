package daily.easy;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DestinationCity {
    /**
     * @param paths
     * @return
     */
    public String destCity(List<List<String>> paths) {
        String destination = "";
        Set<String> source = new HashSet<>();
        for (List<String> path : paths) {
            source.add(path.get(0));
        }
        for (List<String> path : paths) {
            if (!source.contains(path.get(1))) {
                destination = path.get(1);
            }

        }
        return destination;
    }
}
