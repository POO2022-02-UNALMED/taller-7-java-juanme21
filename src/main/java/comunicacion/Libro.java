package comunicacion;

public class Libro extends Escrito {

	private String co_autor;
	private String editor;
	private String edicion;
	private String interpretacion; 
	
	public Libro(String origen, String titulo, String autor, int paginas, String co_autor, String editor, String edicion,
			String interpretacion) {
		super(origen, titulo, autor, paginas);
		this.co_autor = co_autor;
		this.editor = editor;
		this.edicion = edicion;
		this.interpretacion = interpretacion;
	}
	
	@Override
	public int palabrasTotales(int palabrasPagina) {
		return getPaginas()*palabrasPagina*2;
	}

	@Override
	public String interpretacion() {
		return this.interpretacion;
	}

	@Override
	public String toString() {
		String r = this.getOrigen() + "\n";
		r += this.getTitulo() + "\n";
		r += this.getAutor() + "\n";
		r += this.getPaginas()+ "\n";
		r += this.co_autor + "\n";
		r += this.editor + "\n";
		r += this.edicion + "\n";
		return r;
	}

	public String getCo_autor() {
		return co_autor;
	}

	public void setCo_autor(String co_autor) {
		this.co_autor = co_autor;
	}

	public String getEditor() {
		return editor;
	}

	public void setEditor(String editor) {
		this.editor = editor;
	}

	public String getedicion() {
		return edicion;
	}

	public void setedicion(String edicion) {
		this.edicion = edicion;
	}

	public String getInterpretacion() {
		return interpretacion;
	}

	public void setInterpretacion(String interpretacion) {
		this.interpretacion = interpretacion;
	}
	
	

}
