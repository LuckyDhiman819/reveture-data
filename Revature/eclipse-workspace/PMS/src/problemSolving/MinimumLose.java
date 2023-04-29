package problemSolving;

import java.awt.List;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.stream.Stream;

public class MinimumLose {
	
	public static int minimumLoss(List<Long> price) {
	    // Write your code here
	        int len = price.length;
	        long arr[] = new long[len];
	        for(long x:price){
	            for(long y:price){
	                
	                arr[]
	                
	            }
	        }

	        return 10;
	}
	
	public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<long> price = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(long::parseLong)
            .collect(toList());

        int result = Result.minimumLoss(price);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
	
}


