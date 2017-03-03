package ku.util;

import java.io.IOException;

/**
 * A byte array copy task that copy the input to output by limit the array size.
 * 
 * @author Narut Poovorakit
 * @version 03.03.2017
 *
 */
public class ByteArrayCopyTask extends FileCopyTask {

	/** is a limit size of an array */
	private int blocksize;

	/**
	 * Initialize object and set the input and output
	 * 
	 * @param infilename
	 *            is a file name
	 * @param outfilename
	 *            is the directory that will be save to
	 * @param blocksize
	 *            is a limit size of an array.
	 */
	public ByteArrayCopyTask(String infilename, String outfilename, int blocksize) {
		super.setInput(infilename);
		super.setOutput(outfilename);
		this.blocksize = blocksize;
	}

	/**
	 * Run the copy method.
	 */
	@Override
	public void run() {
		FileUtil.copy(in, out, blocksize);
	}

	/**
	 * Print a copy message
	 */
	@Override
	public String toString() {
		return "Copy a file using byte array of size " + blocksize / Byte.SIZE + "KB";
	}

}
