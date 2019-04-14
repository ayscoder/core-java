package corejava.collection;

import java.util.LinkedHashMap;
import java.util.Map;

/**
 * LRU implementation
 */
public class Cache<K, V> extends LinkedHashMap<K, V> {

	private static final long serialVersionUID = 1L;
	private int MAX_ENTRIES = 0;

	Cache() {
	}

	public Cache(int mAX_ENTRIES) {
		super();
		MAX_ENTRIES = mAX_ENTRIES;
	}

	protected boolean removeEldestEntry(Map.Entry<K, V> eldest) {
		return size() > MAX_ENTRIES;
	}

	// private static final int MAX_ENTRIES = 5;
	public static void main(String[] args) {
		// @SuppressWarnings("serial")
		// Map<Integer, String> lhm = new LinkedHashMap<Integer, String>(
		// MAX_ENTRIES + 1, .75F, false) {
		//
		// protected boolean removeEldestEntry(
		// Map.Entry<Integer, String> eldest) {
		// return size() > MAX_ENTRIES;
		// }
		// };
		Cache<Integer, String> lhm = new Cache<>(3);
		// Set<Entry<Integer, String>> entrySet = lhm.entrySet();
		// for(Entry<Integer, String> e:lhm.entrySet()){
		//
		// }
		lhm.put(0, "H");
		lhm.put(1, "E");
		lhm.put(2, "L");
		lhm.put(3, "L");
		// lhm.put(4, "O");
		// lhm.put(5, "P");
		// lhm.put(7, "K");
		// lhm.put(8, "L");

		System.out.println("" + lhm);

	}
}
