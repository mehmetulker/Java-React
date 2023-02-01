import java.util.Arrays;

public class Driver {
	public static void main(String[] args) {
		String message = "";
		Selam nesne = new Selam();

		if (args.length == 0 || args[0] == null) {

			String cevap = nesne.selamSoyle("Ali");
			System.out.println(cevap);

		}

		else {

//			for (int i = 0; i < args.length; i++) {
//			// System.out.println(args[i]);
//				message = message + args[i];
//			}
			message=Arrays.toString(args);
			String cevap = nesne.selamSoyle(message);
			System.out.println(cevap);

		}

	}
}
