package de.esa.sonne;
/**
 * ersetzt die Klassen Planet und Sonnensytem
 * @author Alfa
 *
 */
public enum PlanetImSonnensystem {
	//Erstelle ein Array
	MERKUR(3.303e+23, 2.4397e6), 
	VENUS(4.869e+24, 6.0518e6), 
	/** zu Hause */
	ERDE(5.976e+24 , 6.37814e6), 
	MARS(6.421e+23, 3.3972e6), 
	JUPITER(1.9e+27, 7.1492e7), 
	SATURN(5.688e+26, 6.0268e7), 
	URANUS(8.686e+25, 2.5559e7), 
	NEPTUN(1.024e+26, 2.4746e7);	//Konstruktoraufruf
	
	private final double masse;
	private final double radius;
	
	public static final double G = 6.67300e-11;
	
	private PlanetImSonnensystem(double masse, double radius) {
		this.masse = masse;
		this.radius = radius;
	}
	
	public double oberflaechenSchwerkraft() {
		return G * masse /(radius * radius);
	}
	public double oberflaechenGewicht(double kg) {
		return kg * oberflaechenSchwerkraft();
	}
	
	@Override
	public String toString() {
		String alt = super.toString();
		alt = alt.toLowerCase();
		String eb = alt.substring(0, 1);
		eb = eb.toUpperCase();
		String neu = alt.replaceFirst(alt.substring(0, 1), eb);
		return neu;
	}
}
