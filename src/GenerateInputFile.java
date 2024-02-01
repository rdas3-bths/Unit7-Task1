public class GenerateInputFile {
    public static void main(String[] args) {
        int current = 1;
        for (int i = 0; i < 100; i++) {
            int random = (int)(Math.random()*3);
            current += random;
            int end = (int)(Math.random()*10 + 2);
            int brickStart = current;
            int brickEnd = current + end;

            System.out.println(brickStart + "," + brickEnd);
        }
    }
}
