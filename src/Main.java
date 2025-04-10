public class Main {
    public static void main(String[] args) {
        System.out.println("Bienvenido(a) a Screen Match");
        System.out.println("Película: Matrix");

        int fechaDeLanzamiento = 1999;
        boolean incluidoEnElPlan = true;
        double notaDeLaPelicula = 8.2;

        double media = (9.2 + 9.7 + 9.0) / 3;
        System.out.println("media="+media);

        String sinopsis = """
                Matrix es una paradoja
                La mejor película del fin del milenio
                Fue lanzada en:
                """ + fechaDeLanzamiento;

        System.out.println("sinopsis = " + sinopsis);

        int clasificacion = (int) (media / 2);
        System.out.println("clasificacion = " + clasificacion);

    }
}