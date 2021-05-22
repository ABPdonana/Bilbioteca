public class Revista extends Elemento {

    int numero;


    public Revista(int codigo, String titulo, int anyo, int numero) {
        super(codigo, titulo, anyo);
        this.numero = numero;
    }

    public int getNumero() {
        return this.numero;
    }

    @Override
    public String toString() {
        return super.toString() +
            " numero='" + getNumero() + "'";
    }

}
