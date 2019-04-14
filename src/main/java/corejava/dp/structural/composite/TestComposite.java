package corejava.dp.structural.composite;

/**
 * Allows both individual objects and composite objects to be treated uniformly
 */
public class TestComposite {

	public TestComposite() {
	}

	public static void main(String[] args) {

		FileSystem ddrive = new DirComponent("D-Drive");
		FileSystem file1 = new FileComponent("file-1", 10);
		FileSystem file2 = new FileComponent("file-2", 20);
		ddrive.addComponent(file1);
		ddrive.addComponent(file2);
		System.out.println("drive size=" + ddrive.getComponentSize());
		System.out.println("file-1 size=" + file1.getComponentSize());
	}

}
