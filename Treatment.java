package mirea.ru;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;
// 2
public class Treatment {
    //1.1
    public  void randomMas(byte[] m) {
        for (int i = 0; i < m.length; ++i) {
            m[i] = (byte) (Math.random() * 127);
        }
    }
    public  void printMas(byte[] m){
            System.out.println(Arrays.toString(m));
    }
    public  void printRMas(byte[] m){
        byte[] r = new byte[m.length];
        for(int i = m.length - 1 ; i >= 0; --i) {
            r[m.length - i - 1] = m[i];
            //System.out.println(m[i]);
        }
        System.out.println((Arrays.toString(r)));
    }
    void inMas(byte[] m) {
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < m.length; ++i) {
            System.out.println("element:");
            m[i] = in.nextByte();
        }
    }
    //1.2
    /* s нужен для того чтобы массив не был заполнен позже нулями */
    public  int cntSmaller(byte[] m,  int val){
        int cnt = 0;
        byte[] s = new byte[m.length];
        for(int i = 0; i < s.length; ++i){
            s[i] = m[i];
            int sum = 0;
            int sum1 = 0;
            int tmp = val;
            while(s[i] != 0 && tmp != 0 ){
                sum += m[i] % 10;
                s[i] /= 10;
                sum1 += tmp % 10;
                tmp /= 10;
            }
            if (sum < sum1)
                ++cnt;
        }

        return cnt;
    }
    public  boolean symmetryMas(byte[] m){
        int i = 0;
        int j = m.length - 1;

            if (m[i] != m[j])
                return false;

        return true;
    }
}

