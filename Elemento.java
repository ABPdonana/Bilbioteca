import java.sql.Date;

abstract class Elemento{

    int codigo;
    String titulo;
    int anyo;


    public Elemento(int codigo, String titulo, int anyo) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.anyo = anyo;
    }

    public int getCodigo() {
        return this.codigo;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public int getAnyo() {
        return this.anyo;
    }

    @Override
    public String toString() {
        return
            " codigo='" + getCodigo() + "'" +
            " titulo='" + getTitulo() + "'" +
            " anyo='" + getAnyo() + "'";
    }

}
