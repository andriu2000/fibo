
import java.io.*;

public class Main {
    // ------------------------- фибоначи через цикл ----------------------------------
    static void fibo(int n) {
        int i, m0, m1, t;
        m0 = 0;
        m1 = 1;
        System.out.print(m0 + ", " + m1 + ", ");
        String str = ",";
        for (i = 1; i <= n; i++) {
            t = m0;
            m0 = m1;
            m1 = m0 + t;
            if (i==n) str="";
            System.out.print(m1 + str);

        }
    }

    public static void main(String[] args) throws IOException{
        //------------------------------ ввод данных-----------------------------------------------
        System.out.print("Введите число n: ");
        BufferedReader reader =new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        int n = Integer.parseInt(str);
        //--------------------------
        fibo(n);
    }
}