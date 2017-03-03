package ku.util;

import java.io.IOException;

/**
 * A buffered printer copy the input to output by using BufferedReader and
 * PrintWriter
 * 
 * @author Narut Poovorakit
 * @version 03.03.2017
 *
 */
public class BufferedPrinterCopyTask extends FileCopyTask {
	/**
	 * Initialize object and set the input and output
	 * 
	 * @param infilename
	 *            is a file name
	 * @param outfilename
	 *            is the directory that will be save to
	 */
	public BufferedPrinterCopyTask(String infilename, String outfilename) {
		super.setInput(infilename);
		super.setOutput(outfilename);
	}

	/**
	 * Run the copy method.
	 */
	@Override
	public void run() {
		FileUtil.bcopy(in, out);
	}

	/**
	 * Print a copy message
	 */
	@Override
	public String toString() {
		return "Copy a file using BufferedReader and PrintWriter";
	}
}
