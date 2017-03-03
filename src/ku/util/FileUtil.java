package ku.util;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;

/**
 * FileUtil is a class to copy input text and convert it to output.
 * @author Narut Poovorakit
 * @version 03.03.2017
 */
public class FileUtil {

	/**
	 * Copy the input to the output by byte to byte at a time.
	 * @param in is an input of a file
	 * @param out is an output of a file
	 * @throws IOException
	 */
	static void copy(InputStream in, OutputStream out) throws IOException {
		int i = in.read();
		while ((i = in.read()) >= 0) {
			out.write(i);
		}
		in.close();
		out.close();
	}

	/**
	 * Copy the input to the output using a byte array that size are blocksize.
	 * @param in is an input of a file
	 * @param out is an output of a file
	 * @param blocksize is a size of an array
	 * @throws IOException
	 */
	static void copy(InputStream in, OutputStream out, int blocksize) throws IOException {
		byte[] byteArr = new byte[blocksize];
		int count;
		while ((count =  in.read(byteArr)) >= 0) {
			out.write(byteArr, 0, count);
		}
		in.close();
		out.close();
	}

	/**
	 * Copy the input to the output using BufferedReader and PrintWriter
	 * @param in is an input of a file
	 * @param out is an output of a file
	 * @throws IOException
	 */
	static void bcopy(InputStream in, OutputStream out) throws IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
		String line = null;
		while ((line = br.readLine()) != null) {
			pw.println(line);
		}
		br.close();
		pw.close();
	}
}
