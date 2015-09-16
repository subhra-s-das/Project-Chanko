package FileSystem;

import java.io.File;
import java.util.Collection;
import java.util.Iterator;

import org.apache.commons.io.FileUtils;

public class FileFilterApacheCommonIO {

	public static void main(String[] args) {

		FileFilter F = new FileFilter();
		F.filter();

	}

}

class FileFilter {
	public void filter() {
		String path = "C:/Test";
		File f = new File(path);
		String fileExtensions[] = {"txt","java"};
		Collection<File> filterList = FileUtils.listFiles(f, fileExtensions,
				true);
		Iterator<File> fListIterator = filterList.iterator();
		while (fListIterator.hasNext()) {
			System.out.println(fListIterator.next().getAbsoluteFile());
		}

	}

}