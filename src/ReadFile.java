import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;


public class ReadFile {
public static void main(String[] args) throws IOException {

	String content = new String(Files.readAllBytes(Paths.get("notes")));
	System.out.println(content);
	//absolute path
	System.out.println(Paths.get("notes").toAbsolutePath().toString());

	List<String> lines = Files.readAllLines(Paths.get("notes"));
	
	lines.forEach(line -> System.out.println(line));
	
	Files.lines(Paths.get("notes"))
	.map(line -> line.trim())
	.filter(line -> !line.isEmpty())
	.forEach(line -> System.out.println(line));
	
	System.out.println("\nGet lines containing \"nikhil\"");
	Files.lines(Paths.get("notes"))
	.map(line-> line.trim())
	.filter(line -> line.matches("(.*)nikhil(.*)"))
	.forEach(System.out::println);
	
	}
}
