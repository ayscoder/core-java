package corejava.dp.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class DirComponent extends FileSystem {
	private List<FileSystem> list = new ArrayList<>();

	public DirComponent(String name) {
		super(name);

	}

	public void addComponent(FileSystem fileSystem) {
		list.add(fileSystem);

	}

	public FileSystem getComponent(int index) {
		return list.get(index);
	}

	@Override
	public int getComponentSize() {
		int s = 0;
		for (FileSystem fs : list) {
			s += fs.getComponentSize();
		}
		return s;
	}

}
