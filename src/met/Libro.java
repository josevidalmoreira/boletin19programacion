
package met;


public class Libro {
String titulo;
String autor;
String ibsn;
float prezo;
int unidades;

    public Libro(String titulo, String autor, String ibsn, float prezo, int unidades) {
        this.titulo = titulo;
        this.autor = autor;
        this.ibsn = ibsn;
        this.prezo = prezo;
        this.unidades = unidades;
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

    public String getIbsn() {
        return ibsn;
    }

    public void setIbsn(String ibsn) {
        this.ibsn = ibsn;
    }

    public float getPrezo() {
        return prezo;
    }

    public void setPrezo(float prezo) {
        this.prezo = prezo;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    @Override
    public String toString() {
        return "Libro{" + "titulo=" + titulo + ", autor=" + autor + ", ibsn=" + ibsn + ", prezo=" + prezo + ", unidades=" + unidades + '}';
    }



}
