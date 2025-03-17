package es.cesur.aprendiendoInterfaces;

public interface INumerico {
	double NUMERO_E = 2.7;
	void setPrecision (int precision);
	void setMaximo (int maximo);
}

//las interfaces solo contienen constantes y metodos sin llaves
//las interfaces permiten utilizar polimorfismo