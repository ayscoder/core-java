package corejava.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

class MyValue {
	private long now;
	private String value;

	MyValue(String val) {
		this.value = val;
		now = System.currentTimeMillis();
	}

	public String getValue() {
		return value;
	}

	public long getTimeOfValue() {
		return now;
	}
}

public class CustomCache {

	private ConcurrentMap<String, MyValue> map;

	public CustomCache() {
		map = new ConcurrentHashMap<>();
		Thread cleanupThread = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					try {
						Thread.sleep(10000L);
						cleanup();
					} catch (InterruptedException e) {
						break;
					}
				}
			}
		});
		cleanupThread.start();
	}

	public void put(String key, String value) {
		map.put(key, new MyValue(value));
	}

	public MyValue get(String key) {
		return map.get(key);

	}

	public void cleanup() {
		long now = System.currentTimeMillis();
		List<String> deleteKeyList = new ArrayList<>();
		Set<Entry<String, MyValue>> entry = map.entrySet();
		for (Entry<String, MyValue> e : entry) {
			if (now - e.getValue().getTimeOfValue() > 5000L) {
				deleteKeyList.add(e.getKey());
			}
		}

		for (String k : deleteKeyList) {
			map.remove(k);
			System.out.println("Key is deleted as it is 15 second old, key="
					+ k);
		}
	}

	public static void main(String[] args) {
		CustomCache c = new CustomCache();
		for (int i = 1; i < 100; i++) {
			c.put("" + i, "" + i);
		}
	}

}
