import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class randnum2 {
    /**
     * 
     * @Dibuat Oleh Riko Primacipta NBI 1461900293
     * @Program menampilkan 10 angka acak tidak identik dgn rentang 1-100
     */
    public static void main(String[] args) {
        int range;
        int limit=10;
        
        //membuat objects
        ArrayList<Integer> list = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Please enter maximum range: "); 
            range=sc.nextInt();
            for (int i=1; i<=range; i++) {
                //konstruktor Integer(i) sudah tidak dipakai sejak Java SE 9, tapi tetap bisa override
                list.add(new Integer(i));
            }
            Collections.shuffle(list);
            for (int i=1; i<=limit; i++) {
                System.out.println("Random number " + i + ": "+(list.get(i)));
            }
        } finally {
            sc.close();
        }
    }
}