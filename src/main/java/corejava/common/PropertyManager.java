package corejava.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

public class PropertyManager {
	private static volatile PropertyManager instance = new PropertyManager();
	private static Map<String, String> parameterMap;

	private PropertyManager() {
	}

	private Map<String, String> getPropertyMap() {
		if (parameterMap == null) {
			parameterMap = new HashMap<>();
			Properties prop = new Properties();
			try (InputStream inStream = getClass().getClassLoader().getResourceAsStream("app.conf")) {
				prop.load(inStream);

				for (Object key : prop.keySet()) {
					parameterMap.put(key.toString(), prop.get(key).toString());
				}
			} catch (IOException e) {
			}
		} else {
			System.out.println("Load is already done!");
		}
		return parameterMap;
	}

	public static String getPropertyValue(String key) {
		return PropertyManager.instance.getPropertyMap().get(key);
	}

	public static void main(String[] args) {
		System.out.println(PropertyManager.getPropertyValue("max_pool_size"));
		System.out.println(PropertyManager.getPropertyValue("core_pool_size"));
	}
}
