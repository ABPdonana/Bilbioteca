public class Libro extends Elemento implements Prestable {

    boolean prestado = false;


    public Libro(int codigo, String titulo, int anyo) {
        super(codigo, titulo, anyo);
    }

    @Override
    public String toString() {
        return super.toString() +
            " prestado='" + prestado() + "'";
    }

    @Override
    public void prestar() {
        this.prestado = true;
    }

    @Override
    public void devolver() {
        this.prestado = false;
    }

    @Override
    public boolean prestado() {
        return this.prestado;
    }

}
