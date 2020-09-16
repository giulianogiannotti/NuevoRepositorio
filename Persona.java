public class Persona {

protected int dni;
protected int edad;
protected String nombre;
protected String apellido;

public Persona(int dni, int edad, String nombre, String apellido) {
	this.dni = dni;
	this.edad = edad;
	this.nombre = nombre;
	this.apellido = apellido;
}

public int getDni() {
	return dni;
}

public void setDni(int dni) {
	this.dni = dni;
}

public int getEdad() {
	return edad;
}

public void setEdad(int edad) {
	this.edad = edad;
}

public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

}