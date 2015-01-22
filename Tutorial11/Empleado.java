public class Empleado {

	private short id;
	protected String nombre;
	public int edad;

	public Empleado(String nombre, short id, int edad) {
		this.nombre = nombre;
		this.id = id;
		this.edad = edad;
	}

	public Empleado() {
		id = 13;
		nombre = "Krupf";
		edad = 60;
	}

	public void setId(short id) {
		this.id = id;
	}

	public short getId() {
		return this.id;
	}

	public int getEdad() {
		return this.edad;
	}

	public String getNombre() {
		return this.nombre;
	}
}