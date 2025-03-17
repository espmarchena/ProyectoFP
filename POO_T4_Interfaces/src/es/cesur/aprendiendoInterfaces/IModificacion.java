package es.cesur.aprendiendoInterfaces;

public interface IModificacion {
	public abstract void incremento (int cantidadIncrementar);
	//void incremento (int cantidadIncrementar); //tambien se puede indicar asi, ya que eclipse sobrentiende que es publico y abstracto
}


//las interfaces solo contienen constantes y metodos sin llaves
//las interfaces permiten utilizar polimorfismo