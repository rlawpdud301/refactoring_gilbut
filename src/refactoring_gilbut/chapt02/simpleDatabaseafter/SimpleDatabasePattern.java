package refactoring_gilbut.chapt02.simpleDatabaseafter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SimpleDatabasePattern {
	private Map<String, String> map = new HashMap<>();
	private static Pattern pattern = Pattern.compile("([^=]+)=(.*)");

	public SimpleDatabasePattern(Reader r) throws IOException {
		BufferedReader reader = new BufferedReader(r);
		String line;
		
		while ((line = reader.readLine()) != null) {
			Matcher matcher = pattern.matcher(line);
			if (matcher.matches()) {
				String key = matcher.group(1);
				String value = matcher.group(2);
				map.put(key, value);
			}  // end if-else
		} // end while

	}// end contructor

	public void putValue(String key, String value) {
		map.put(key, value);
	}

	public String getValue(String key) {
		return map.get(key);
	}

	public Iterator<String> iterator() {
		return map.keySet().iterator();
	}

}
