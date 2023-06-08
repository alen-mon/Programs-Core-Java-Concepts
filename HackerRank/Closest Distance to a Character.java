
import java.util.*;
/**
 * @author 19epci004- Alen Morres
 *
 */
class Solution {
    public int[] solve(String s, String c) {
        Integer[] ret = new Integer[s.length()];
        Queue<Integer> q = new LinkedList();
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).equals(c)) {
                q.offer(i);
            }
        }
        Set<Integer> vis = new HashSet();
        int dist = 0;
        while (!q.isEmpty()) {
            int size = q.size();
            for (int x = 0; x < size; x++) {
                int temp = q.poll();
                if (temp < 0 || temp >= s.length() || vis.contains(temp) || ret[temp] != null) {
                    continue;
                }
                ret[temp] = dist;
                q.offer(temp + 1);
                q.offer(temp - 1);
            }
            dist++;
        }
        int[] convert = new int[ret.length];
        for (int i = 0; i < ret.length; i++) convert[i] = ret[i];
        return convert;
    }
}
