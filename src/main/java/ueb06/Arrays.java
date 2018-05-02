package ueb06;

class Arrays {
	/**
	 * Gibt eine Stringrepraesentation des Arrays zurueck, z.B. [] oder [1, 2, 3]
	 */
	static <T> String toString(T[] array) {
		if (array.length == 0)
			return "[]";
		else
			return null;
	}

	private static <T> String toString (T[]array, int a){
		if (a == array.length-1)
			return array[a].toString();
		else
			return array[a].toString() + ", " 

	}

	/**
	 * Gib zurück, ob ein Objekt in dem Array enthalten ist; verwendet `equals`
	 */
	static <T> boolean contains(T[] array, T object) {

		return false;
	}
}
