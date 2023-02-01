public class Selam {
	String world = "millet";

	public String selamSoyle(String kime) {
		String cumle;
		if (kime.equals("")) {
			cumle = "Selam  " + world + ":)";
		} else {

			cumle = "Selam   " + kime + ":)";
		}
		return cumle;
	}
}
