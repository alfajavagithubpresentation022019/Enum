package de.esa.sonne;

public class Planet {
	private final String name;
	/**
	 *  Masse in kg
	 */
	private final double masse;
	/**
	 * Radius in Meter
	 */
	private final double radius;
	
	public Planet(String name, double masse, double radius) {
		this.name = name;
		this.masse = masse;
		this.radius = radius;
	}

	public String getName() {
		return name;
	}

	public double getMasse() {
		return masse;
	}

	public double getRadius() {
		return radius;
	}
	
	@Override
	public String toString() {
		return name;
	}
}
