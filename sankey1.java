public class sankey1 {
    public static void main(String[] args) {
        // take amount and find the number of notes of 50 20 5 1 from 455
        // output 8 2 3 0

        int amount = 455;
        int[] notes = { 50, 20, 5, 1 };

        for (int i = 0; i < notes.length; i++) {
            if (notes[i] == 50) {
            } else if (notes[i] == 20) {
                System.out.print(amount / notes[i] + " ");
                amount = amount % notes[i];
            } else if (notes[i] == 5) {
                System.out.print(amount / notes[i] + " ");
                amount = amount % notes[i];
            } else if (notes[i] == 1) {
                System.out.print(amount / notes[i] + " ");
                amount = amount % notes[i];
            }
        }

    }

}
