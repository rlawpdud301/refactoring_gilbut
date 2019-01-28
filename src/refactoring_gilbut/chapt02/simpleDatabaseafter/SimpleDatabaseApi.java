package refactoring_gilbut.chapt02.simpleDatabaseafter;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.Reader;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class SimpleDatabaseApi {
	private Map<String, String> map = new HashMap<>();

	public SimpleDatabaseApi(Reader r) throws IOException {
		BufferedReader reader = new BufferedReader(r);
		String line;
		while ((line = reader.readLine()) != null) {
			int equalIndex = line.indexOf("=");
			if (equalIndex > 0) {
				String key = line.substring(0, equalIndex);
				String value = line.substring(equalIndex+1);
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
