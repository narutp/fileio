package ku.util;

import java.io.IOException;

public class BufferedPrinterCopyTask extends FileCopyTask {
	public BufferedPrinterCopyTask(String infilename, String outfilename) {
		super.setInput(infilename);
		super.setOutput(outfilename);
	}

	@Override
	public void run() {
		try {
			FileUtil.bcopy(in, out);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Copy a file using BufferedReader and PrintWriter";
	}
}
