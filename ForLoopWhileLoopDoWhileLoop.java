public class ForLoopWhileLoopDoWhileLoop {
    public static void main(String[] args) {
        /*long sum = 0;
        for (int i = 0; i <= 1000; i++) {
            sum = sum + i;
            System.out.print(sum + " ");
        }*/
        /*long sum = 0;
        int i = 0;
        while( i <= 1000){
            sum = sum + i;
            i++;
            System.out.print(sum + " ");
        }*/
        long sum = 0;
        int i = 0;
        do {
            sum += i;
            i++;
            System.out.print(sum + " ");
        } while (i <= 1000);
    }
}