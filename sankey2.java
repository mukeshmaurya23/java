class sankey2 {
    public static void calculate(int sum) {
        int r50 = sum / 50;
        System.out.println("50 rupee notes: " + r50);
        sum = sum % 50;
        int r20 = sum / 20;
        System.out.println("20 rupee notes: " + r20);
        sum = sum % 20;
        int r5 = sum / 5;
        System.out.println("5 rupee notes: " + r5);
        sum = sum % 5;
        int r1 = sum / 1;
        System.out.println("1 rupee notes: " + r1);
    }

    public static void main(String[] args) {
        int sum = 455;
        calculate(sum);

    }
}