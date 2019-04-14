package corejava.dp.structural.composite;

public abstract class FileSystem {

	private String name;

	public FileSystem(String name) {
		this.name = name;
	}

	public void addComponent(FileSystem fileSystem) {
	}

	public FileSystem getComponent(int index) {
		return null;
	}

	public abstract int getComponentSize();

}
