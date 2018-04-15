import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * Created by rok on 2018. 4. 15..
 */
public class Search {
    public int binarySearch(int[] data, int MAX) throws Exception {
        Arrays.sort(data);
        System.out.println(Arrays.toString(data));
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line = bufferedReader.readLine();
        int target = Integer.parseInt(line);
        System.out.println(target);
        int begin = 0;
        int end = MAX-1;

        while(begin <= end){
            int middle = (begin + end) / 2;

            if(data[middle] == target){
                return middle;
            }else if(data[middle] < target){
                begin = middle+1;
            }else {
                end = middle-1;
            }
        }
        return -1;
    }
}
