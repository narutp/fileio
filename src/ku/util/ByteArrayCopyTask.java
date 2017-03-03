package ku.util;

import java.io.IOException;

public class ByteArrayCopyTask extends FileCopyTask {

	private int blocksize;

	public ByteArrayCopyTask(String infilename, String outfilename, int blocksize) {
		super.setInput(infilename);
		super.setOutput(outfilename);
		this.blocksize = blocksize;
	}

	@Override
	public void run() {
		try {
			FileUtil.copy(in, out, blocksize);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public String toString() {
		return "Copy a file using byte array of size " + blocksize/Byte.SIZE + "KB";
	}

}
