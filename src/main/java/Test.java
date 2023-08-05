public class Test {
    public static void main(String[] args) {
        final StringBuffer a = new StringBuffer();
        final StringBuffer b = new StringBuffer();

        new Thread(() -> {
            System.out.println(a.append("A"));
            synchronized (b) {
                System.out.println(b.append("B"));
            }
        }).start();

        new Thread(() -> {
            System.out.println(b.append("C"));
            synchronized (a) {
                System.out.println(a.append("D"));
            }
        }).start();
    }
}
