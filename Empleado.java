class Empleado{

	private int legajo;
	private int cantHoras;
	private float valorHoras;

	public Empleado( int leg){
		legajo=leg;
		cantHoras=0;
		valorHoras=0;
	}

	public Empleado(int leg, int canth, float valorh){
		legajo=leg;
		cantHoras=canth;
		valorHoras=valorh;
	}


	public void establecerValorHora(float s){
		valorHoras=s;
	}

	public void establecerCantHoras( int ch){
		cantHoras=ch;
	}

	public int obtenerLegajo(){
		return legajo;
	}

	public float obtenerSueldo(){
		return cantHoras*valorHoras;
	}

	public int obtenerCantHoras(){
		return cantHoras;
	}

	public float obtenerValorHoras(){
		return valorHoras;
	}
}