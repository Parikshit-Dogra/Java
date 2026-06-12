import java.io.*;
public class buff {

    public static void main(String[] args) throws IOException {

        // BufferedReader is used to read text from a character-input stream, buffering characters for efficient reading of characters, arrays, and lines.

        // It provides methods to read characters, arrays, and lines, and it can be used to read from various sources like files, input streams, etc.

        // It is often used in combination with InputStreamReader to read from the console or files.

        // BufferedReader is more efficient than using a regular Reader because it reduces the number of I/O operations by buffering the input.

        // It provides methods like read(), readLine(), mark(), reset(), and skip() to facilitate reading operations.

        // Example usage of BufferedReader to read from the console:

        // Creating a BufferedReader to read from the console
        BufferedReader br = new BufferedReader( new InputStreamReader(System.in));

        System.out.println("Enter your name:");
        String name = br.readLine(); // readLine() reads a line of text from the console and returns it as a String. It waits for the user to input a line of text and press Enter before returning the input.

        System.out.println("Enter your age:");
        int age = Integer.parseInt(br.readLine()); // readLine() reads a line of text from the console and returns it as a String. Since we want to read an integer (age), we use Integer.parseInt() to convert the input string to an integer.

        System.out.println("Enter a sentence:");
        String sentence = br.readLine();

        



        System.out.println(" \n Mark & Reset Demo");

        BufferedReader br2 = new BufferedReader(new StringReader("JavaIO")); // StringReader is a class that allows you to read characters from a String as if it were a stream. It is often used in conjunction with BufferedReader to read from a string source.

        
        System.out.print("Read chars: ");
        System.out.print((char) br2.read()); // read() reads a single character from the input stream and returns it as an integer. We cast it to char to get the character representation. Each call to read() advances the position in the stream, so subsequent calls will read the next characters in the string.
        System.out.print((char) br2.read());
        System.out.print((char) br2.read());
        br2.mark(1); // mark() is used to mark the current position in the stream. The parameter (1 in this case) specifies the read-ahead limit, which is the maximum number of characters that can be read after marking before the mark becomes invalid. In this example, we mark the position after reading three characters.

        br2.reset(); // reset() is used to reset the stream to the most recent mark. After calling reset(), the next read operation will start from the position where the mark was set. In this example, after calling reset(), the next read will return the character 'a' again, which is the character at the marked position.

        System.out.println("\n After reset: " + (char) br2.read());







        System.out.println("Skip Demo");

        BufferedReader br3 = new BufferedReader(new StringReader("Programming"));

        br3.skip(3); // skip() is used to skip a specified number of characters in the input stream. The parameter (3 in this case) specifies the number of characters to skip. In this example, we skip the first three characters ("Pro") of the string "Programming", so the next read operation will return the character 'g', which is the fourth character in the string.
        System.out.println("After skip(3): " + (char) br3.read());




        

        System.out.println("readLine() Demo");

        BufferedReader br4 = new BufferedReader(new StringReader("Hello\nWorld"));  // The string "Hello\nWorld" contains two lines of text separated by a newline character (\n). When we use readLine() to read from this string, it will read the first line ("Hello") and return it as a String. The next call to readLine() will read the second line ("World") and return it as a String. Each call to readLine() advances the position in the stream to the next line, so subsequent calls will read the next lines in the string until there are no more lines to read.

        System.out.println("Line 1: " + br4.readLine()); 
        System.out.println("Line 2: " + br4.readLine());



        br.close(); // close() is used to close the stream and release any system resources associated with it. It is important to close streams when they are no longer needed to free up resources and avoid potential memory leaks. In this example, we close the BufferedReader instances (br, br2, br3, and br4) after we are done using them to ensure that any resources they were using are properly released.
        br2.close();
        br3.close();
        br4.close();



        System.out.println("Final Output \n");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Sentence: " + sentence);
    }
}
