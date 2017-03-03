package ku.util;

import java.io.IOException;

public class ByteCopyTask extends FileCopyTask{

	public ByteCopyTask(String infilename, String outfilename) {
		super.setInput(infilename);
		super.setOutput(outfilename);
	}

	@Override
	public void run() {
		try {
			FileUtil.copy(in, out);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Copy a file byte-by-byte";
	}

}
