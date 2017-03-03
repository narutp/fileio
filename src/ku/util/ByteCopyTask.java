package ku.util;

import java.io.IOException;

/**
 * A byte copy task that copy the input to output.
 * 
 * @author Narut Poovorakit
 * @version 03.03.2017
 *
 */
public class ByteCopyTask extends FileCopyTask {

	/**
	 * Initialize object and set the input and output
	 * 
	 * @param infilename
	 *            is a file name
	 * @param outfilename
	 *            is the directory that will be save to
	 */
	public ByteCopyTask(String infilename, String outfilename) {
		super.setInput(infilename);
		super.setOutput(outfilename);
	}

	/**
	 * Run the copy method.
	 */
	@Override
	public void run() {
		FileUtil.copy(in, out);
	}

	/**
	 * Print a copy message
	 */
	@Override
	public String toString() {
		return "Copy a file byte-by-byte";
	}

}
