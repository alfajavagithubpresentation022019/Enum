package de.esa.sonne;

public class Sonnensystem {
	public static final Planet ERDE = new Planet("Erde", 5.976e+24 , 6.37814e6);
	public static final Planet MERKUR = new Planet("Merkur", 3.303e+23, 2.4397e6);
	public static final Planet VENUS = new Planet("Venus", 4.869e+24, 6.0518e6);
	public static final Planet MARS = new Planet("MARS",6.421e+23, 3.3972e6);
	public static final Planet JUPITER = new Planet("JUPITER", 1.9e+27, 7.1492e7);
	public static final Planet SATURN = new Planet("SATURN", 5.688e+26, 6.0268e7);
	public static final Planet URANUS = new Planet("URANUS", 8.686e+25, 2.5559e7);
	public static final Planet NEPTUN = new Planet("NEPTUN", 1.024e+26, 2.4746e7);
	
	public static final Planet[] ALLE_PLANETEN = {MERKUR, VENUS, ERDE, MARS, JUPITER, SATURN, URANUS, NEPTUN};
}
