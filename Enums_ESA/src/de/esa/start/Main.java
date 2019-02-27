package de.esa.start;

import de.esa.sonne.Planet;
import de.esa.sonne.PlanetImSonnensystem;
import de.esa.sonne.Sonnensystem;
import java.lang.*;
import java.time.*;
import static java.lang.System.out;

//import static de.esa.sonne.PlanetImSonnensystem.URANUS;
import static de.esa.sonne.PlanetImSonnensystem.*;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Test 1");
		System.out.println("Test 2");
		System.out.println("Test 1");
		System.out.println("Test 2");
		for (Planet p : Sonnensystem.ALLE_PLANETEN) {
			System.out.println(p);
		}

		// values() gibt das Array aller Elemente der enum
		for (PlanetImSonnensystem ps : PlanetImSonnensystem.values()) {
			System.out.println(ps);
		}

		double spatzAufDerErde = 0.05;
		double elefantAufDerErde = 1000;

		System.out.println("Spatz auf dem Jupiter: " + JUPITER.oberflaechenGewicht(spatzAufDerErde));
		System.out.println("Spatz auf dem Uranus: " + URANUS.oberflaechenGewicht(spatzAufDerErde));
		// System.out.println(PlanetImSonnensystem.ERDE.toString());
		System.out.println("Die " + ERDE + " ist der " + (ERDE.ordinal() + 1) + ". Planet im Sonnensystem");

		System.out.println(Month.APRIL.toString());

		PlanetImSonnensystem zuHause = ERDE;
		switch (zuHause) {
		case ERDE:
			System.out.println("Erde");
			break;
		case MERKUR:
			System.out.println("Merkur");
			break;
		default:
			System.out.println(".....");
		}
		
		System.out.println(PlanetImSonnensystem.values()[1 + 1].oberflaechenSchwerkraft()); //PlanetImSonnensystem.values() ist ein Array
		// Übung out.println("Das klappt") als aufgabe auf Console
		out.println("Das klappt");
	}

}