public class Principal {
    public static void main(String[] args) {
        Libro libro1 = new Libro(0, "Marco Polo", 1956);
        Revista revista1 = new Revista(1, "Corazon Rojo", 2003, 1);

        System.out.println(libro1.toString());
        System.out.println(revista1.toString());
    }
}
