import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Path path = Paths.get("/home/dmitry/IdeaProjects/files/src/main/resources/text.txt");
        try {
            List<String> lines = Files.readAllLines(path);

            ArrayList<RowDTO> dtos = new ArrayList<>();
            for (String line: lines) {
                String[] split = line.split(",");
                RowDTO rowDTO = new RowDTO(
                        Integer.parseInt(split[0]),
                        split[1],
                        Double.parseDouble(split[2]),
                        Boolean.parseBoolean(split[3]));
                System.out.println("first= " + rowDTO.first);
                System.out.println("first= " + rowDTO.second);
                System.out.println("first= " + rowDTO.third);
                System.out.println("first= " + rowDTO.fourth);
                System.out.println(" ");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

class RowDTO{
    int first;
    String second;
    Double third;
    Boolean fourth;

    public RowDTO(int first, String second, Double third, Boolean fourth) {
        this.first = first;
        this.second = second;
        this.third = third;
        this.fourth = fourth;
    }
}