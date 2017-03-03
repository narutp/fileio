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
 * 
 * @author Narut Poovorakit
 * @version
 */
public class FileUtil {

	static void copy(InputStream in, OutputStream out) throws IOException {
		int i = in.read();
		while ((i = in.read()) >= 0) {
			out.write(i);
		}
		in.close();
		out.close();
	}

	static void copy(InputStream in, OutputStream out, int blocksize) throws IOException {
		byte[] byteArr = new byte[blocksize];
		int count;
		while ((count =  in.read(byteArr)) >= 0) {
			out.write(byteArr, 0, count);
		}
		in.close();
		out.close();
	}

	static void bcopy(InputStream in, OutputStream out) throws IOException {
		BufferedReader br  = new BufferedReader(new InputStreamReader(in));
		PrintWriter pw = new PrintWriter(new OutputStreamWriter(out));
		String line = null;
		while ((line = br.readLine()) != null) {
			pw.write(line);
		}
		br.close();
		pw.close();
	}
}
