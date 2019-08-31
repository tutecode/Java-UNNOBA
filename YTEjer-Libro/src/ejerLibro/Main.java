package ejerLibro;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Libro libro_1 = new Libro(1, 10, "Autor 1", "Titulo 1");
		Libro libro_2 = new Libro(2, 20, "Autor 2", "Titulo 2");
	
		System.out.println(libro_1.toString());
		System.out.println(libro_2.toString());
	
		//Modificar atributo del libro_1
		libro_1.setNumPaginas(30);
		
		//Comparacion
		if(libro_1.getNumPaginas() > libro_2.getNumPaginas()) {
			System.out.println(libro_1.getTitulo() + " tiene mas paginas");
		} else {
			System.out.println(libro_2.getTitulo() + " tiene mas paginas");
		}
	}

}
