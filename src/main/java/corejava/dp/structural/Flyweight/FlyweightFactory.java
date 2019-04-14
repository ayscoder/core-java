package corejava.dp.structural.Flyweight;

import java.util.HashMap;
import java.util.Map;

public class FlyweightFactory {
	private static FlyweightFactory instance = new FlyweightFactory();
	private Map<String, IFlyweight> flyweightMap;

	private FlyweightFactory() {
		flyweightMap = new HashMap<>();
	}

	public static FlyweightFactory getFlyweightFactoryInstance() {
		return instance;
	}

	public IFlyweight getFlyweightObject(String key) {
		IFlyweight flyweightObj = null;
		flyweightObj = flyweightMap.get(key);
		if (flyweightObj != null) {
			return flyweightObj;
		} else {
			switch (key) {
			case "adder":
				flyweightObj = new AdderFlyweight();
				flyweightMap.put("adder", flyweightObj);
				break;
			case "multiplier":
				flyweightObj = new MultiplierFlyweight();
				flyweightMap.put("mutliplier", flyweightObj);
				break;
			}
		}
		return flyweightObj;
	}
}
