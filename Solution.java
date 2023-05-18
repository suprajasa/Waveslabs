import java.util.ArrayList;
import java.util.List;

public class CableManagement
{
    public static void main(String[] args)
    {
        int n = 4;
        List<int[]> connections = new ArrayList<>();
        connections.add(new int[]{0, 1});
        connections.add(new int[]{0, 2});
        connections.add(new int[]{1, 2});
        int indexToRemove = -1;
        for (int i = 0; i < connections.size(); i++) 
        {
            int[] connection = connections.get(i);
            if ((connection[0] == 1 && connection[1] == 2) || (connection[0] == 2 && connection[1] == 1))
            {
                indexToRemove = i;
                break;
            }
        }
        if (indexToRemove != -1) {
            connections.remove(indexToRemove);
        }
        connections.add(new int[]{1, 3});
        for (int[] connection : connections) 
        {
            System.out.println("[" + connection[0] + ", " + connection[1] + "]");
        }
    }
}
