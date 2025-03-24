public class Autocomplete {
    private String foo(long n, long maxN) {
            if (n > maxN) {
                return "número fuera de rango";
            }
            if (n == 1) {
                return "foo";
            }
            else if (n == 2) {
                return "bar";
            } else {
                return "unknow";
            }
    }

    public static void main(String[] args) {
        Autocomplete autocomplete = new Autocomplete();
        System.out.println(autocomplete.foo(1, 2));
        System.out.println(autocomplete.foo(2, 2));
        System.out.println(autocomplete.foo(3, 2));
    }
}
