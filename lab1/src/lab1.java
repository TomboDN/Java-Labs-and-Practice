public class lab1 {
    public static void main(String[] args)
    {
        int[] b = new int[10];
        for (int i = 0; i<10;i++)
        {
            b[i] = (int)(Math.random() * 10);
        }
        for (int i = 0; i < 10; i++)
        {
            System.out.print(b[i] + " ");
        }
        System.out.println();
        int j = 0;
        while (j < 10)
        {
            System.out.print(b[j] + " ");
            j += 1;
        }
        System.out.println();
        int k = 0;
        do {
            System.out.print(b[k] + " ");
            k += 1;
        } while (k<10);
    }
}