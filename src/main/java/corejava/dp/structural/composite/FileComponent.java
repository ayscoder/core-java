package corejava.dp.structural.composite;

public class FileComponent extends FileSystem {
	private int size;

	public FileComponent(String name, int size) {
		super(name);
		this.size = size;
	}

	@Override
	public int getComponentSize() {
		return size;
	}

}
