package BufferReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BR {
    public static void main(String[] args) throws IOException {
        // BufferedReader
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(in);

        // input integers using br
        int a = Integer.parseInt(br.readLine()); 
        System.out.println(a);

        // input long using br
        long b = Long.parseLong(br.readLine());
        System.out.println(b);

        String str = br.readLine();
        System.out.println(str);

        String str2 = br.readLine();
        System.out.println(str2);

        String str3 = br.readLine();
        System.out.println(str3);

        // Character using br
        char ch = (char)(br.read());
        System.out.println(ch);
    }
}
