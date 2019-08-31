package ejerLibro;

public class Libro {
	//Atributos
	private int ISBN, numPaginas;
	private String titulo, autor;
	
	//Constructor
	public Libro(int ISBN, int numPaginas, String autor, String titulo) {
		super();
		this.ISBN = ISBN;
		this.numPaginas = numPaginas;
		this.titulo = titulo;
		this.autor = autor;
	}
	
	//Metodos
	public int getISBN() {
		return ISBN;
	}

	public void setISBN(int iSBN) {
		ISBN = iSBN;
	}

	public int getNumPaginas() {
		return numPaginas;
	}

	public void setNumPaginas(int numPaginas) {
		this.numPaginas = numPaginas;
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
	
	public String toString() {
		return "El libro " + titulo +" con ISBN " + ISBN + 
				" creado por el autor " + autor + 
				" tiene " + numPaginas + " paginas";
	}
	
	
}
