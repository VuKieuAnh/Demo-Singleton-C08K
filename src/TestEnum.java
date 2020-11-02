public class TestEnum {
    static void teste(Banhxa banhxa){
        switch (banhxa){
            case Banhoto:
                System.out.println("tao la banh oto day");
                break;
            case Banhxedap:
                System.out.println("tao la banh xa dap day");
                break;
        }
    }

    public static void main(String[] args) {
        teste(Banhxa.Banhxedap);
    }
}
