import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static void main(String[] args) {
        int n = 4;
        List<int[]> connections = new ArrayList<>();
        connections.add(new int[]{0, 1});
        connections.add(new int[]{0, 2});
        connections.add(new int[]{1, 2});

        // Find the index of the connection between workstations 1 and 2
        int indexToRemove = -1;
        for (int i = 0; i < connections.size(); i++) {
            int[] connection = connections.get(i);
            if ((connection[0] == 1 && connection[1] == 2) || (connection[0] == 2 && connection[1] == 1)) {
                indexToRemove = i;
                break;
            }
        }

        // Remove the connection between workstations 1 and 2
        if (indexToRemove != -1) {
            connections.remove(indexToRemove);
        }

        // Add the connection between workstations 1 and 3
        connections.add(new int[]{1, 3});
        
        // Print the updated connections
        for (int[] connection : connections) {
            System.out.println("[" + connection[0] + ", " + connection[1] + "]");
        }
    }
}