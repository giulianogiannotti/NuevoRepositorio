class Empleado{

	private int legajo;
	private int cantHoras;
	private float valorHoras;

	public Empleado( int leg){
		legajo=leg;
		cantHoras=0;
		valorHoras=0;
	}

<<<<<<< HEAD
	public Empleado(int legajo, int canth, float valorh){
		this.legajo=legajo;
		cantHoras=canth;
=======
	public Empleado(int leg, int cantHoras, float valorh){
		legajo=leg;
		this.cantHoras=cantHoras;
>>>>>>> a95aee93e7dd65adc5bd60e31f0600e814c9d592
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