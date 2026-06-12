import java.io.*;
public class buff {

    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); // BufferedWriter is used to write text to a character-output stream, buffering characters for efficient writing of characters, arrays, and strings. It provides methods to write characters, arrays, and strings, and it can be used to write to various destinations like files, output streams, etc. In this example, we are using OutputStreamWriter to write to the console (System.out).

        // Usable methods of BufferedWriter: 
        // write(), newLine(), flush(), close()
        bw.write("Hello Parikshit"); // write() is used to write a string to the output stream. In this example, we are writing the string "Hello Parikshit" to the console.


        bw.newLine(); // newLine() is used to write a platform-specific line separator to the output stream. It is equivalent to writing "\n" on Unix/Linux/Mac systems and "\r\n" on Windows systems. In this example, we are adding a new line after writing "Hello Parikshit" to the console.


        char[] arr = {'J', 'A', 'V', 'A'};
        bw.write(arr); // write() can also be used to write an array of characters to the output stream. In this example, we are writing the character array {'J', 'A', 'V', 'A'} to the console, which will output "JAVA".

        bw.newLine();

        bw.write("BufferedWriterExample", 0, 15); // write() can also be used to write a portion of a string to the output stream. The parameters are the 
        // (string to write, the starting index, and the number of characters to write).
        //  In this example, we are writing the first 15 characters of the string "BufferedWriterExample" to the console, which will output "BufferedWriterE".

        bw.newLine();

        bw.write(65); // write() can also be used to write a single character to the output stream by passing its integer ASCII value. In this example, we are writing the integer 65, which corresponds to the character 'A' in the ASCII character set, so it will output 'A'.

        bw.newLine();

        bw.flush(); // flush() is used to flush the stream, which means it forces any buffered output to be written out to the destination. In this example, we are flushing the BufferedWriter to ensure that all the written content is sent to the console before we close the stream.

        bw.close();
    }
}
