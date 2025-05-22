
package guiaejercicios1;


public class Libro {
    private String titulo;
    private String autor;
    private int numeroDePaginas;
    private int paginaActual = 1;

    public Libro(String titulo, String autor, int numeroDePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numeroDePaginas = numeroDePaginas;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroDePaginas() {
        return numeroDePaginas;
    }

    public void setNumeroDePaginas(int numeroDePaginas) {
        this.numeroDePaginas = numeroDePaginas;
    }

    public int getPaginaActual() {
        return paginaActual;
    }

    public void setPaginaActual(int paginaActual) {
        this.paginaActual = paginaActual;
    }

    //metodos

    public int moverPagina(int movimiento ){
        if(movimiento < 0){
            paginaActual += movimiento;
        }else {
            paginaActual += movimiento;
        }
        return paginaActual;
    }

    public boolean terminarLibro() {
        return paginaActual == numeroDePaginas;
    }
}
