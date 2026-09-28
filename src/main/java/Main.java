public class Main {

    public static void main(String[] args) {

        Vendedor vendedor = new Vendedor(
                "Ivan",
                1000.00,
                new ComisionPersonalizada()
        );

        vendedor.mostrarDetalle();
    }
}
