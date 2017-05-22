package org.minazou67.font.checker;

import java.awt.GraphicsEnvironment;
import java.util.Locale;

import sun.font.Font2D;
import sun.font.FontManager;
import sun.font.FontManagerFactory;
import sun.font.SunFontManager;

public class App {

	public static void main(String[] args) {

		// Output Default locale
		System.out.println("#### Default locale ####");
		System.out.println(Locale.getDefault());

		// Output Available font family names
		System.out.println(System.lineSeparator() + "#### Available font family names ####");

		String fontNames[] = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
		for (String name : fontNames) {
			System.out.println(name);
		}

		// Output Registered fonts
		System.out.println(System.lineSeparator() + "#### Registered fonts ####");

		FontManager fm = FontManagerFactory.getInstance();
		if (fm instanceof SunFontManager) {
			SunFontManager sunFm = (SunFontManager) fm;
			Font2D[] registeredFonts = sunFm.getRegisteredFonts();
			for (Font2D f2d : registeredFonts) {
				if (f2d.getStyle() == 0) {
					System.out.println(f2d);
				}
			}
		}
	}
}
