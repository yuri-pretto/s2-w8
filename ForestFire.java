import java.util.*;
import java.io.*;

public class ForestFire {
    public static void main(String[] args) throws IOException{
        // Step 1: Read in the data file (forests.csv) and create Forest objects.
        //   - Open the CSV file.
        //   - Skip/read the header row.
        //   - Parse each line into fields and construct a Forest.
        //   - Store forests in an ArrayList: ArrayList<Forest> forests = ...
        ArrayList<Forest> forests = new ArrayList<>();
        Scanner scan = new Scanner(new File("forests.csv"));
        if(scan.hasNextLine()){
            scan.nextLine();
        }
        while(scan.hasNextLine()){
            String line = scan.nextLine();
            String[] parts = line.split(",");
            String name = parts[0];
            String type = parts[1];
            String vegetation = parts[2];
            double area = Double.parseDouble(parts[3]);
            double cellArea = Double.parseDouble(parts[4]);
            int gridRows = Integer.parseInt(parts[5]);
            int gridCols = Integer.parseInt(parts[6]);
            double burnRate = Double.parseDouble(parts[7]);
            int initialTreeCount = Integer.parseInt(parts[8]);
            int burnDuration = Integer.parseInt(parts[9]);
            Forest f = new Forest(name, type, vegetation, burnRate, burnDuration, initialTreeCount, gridRows, gridCols);
            forests.add(f);
        }

        // Step 2: Pick one forest to run the simulation.
        //   - Choose by index.
        //   - Start at least one burning tree to begin the fire.
        Forest f = forests.get(0);

        // Step 3: Run the simulation.
        //   - Repeat spreadFire() for a fixed number of steps (or until fire ends).
        //   - At the end, print percentBurned() and summary stats.
        //   - At the end of each simulation step, you should write the current state of the Tree[][] grid to a file

        // Step 4: We will vibe code our way to visualization

    }

}
