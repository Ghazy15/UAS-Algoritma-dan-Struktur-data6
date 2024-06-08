import java.util.*;

public class LegolasBerlian {
	public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	List<Integer> input = new ArrayList<>();

    	while (true) {
        	int nKota = scanner.nextInt();
        	int nAliansi = scanner.nextInt();
        	if (nKota == 0 && nAliansi == 0) {
            	break;
        	}

        	List<List<Integer>> aliansiKota = new ArrayList<>();
        	for (int i = 0; i < nAliansi; i++) {
            	int aliansiNKota = scanner.nextInt();
            	List<Integer> aliansiIni = new ArrayList<>();
            	for (int j = 0; j < aliansiNKota; j++) {
                	aliansiIni.add(scanner.nextInt());
            	}
            	aliansiKota.add(aliansiIni);
        	}

        	int inputNow = kotaAwalDanTiket(nKota, nAliansi, aliansiKota);
        	input.add(inputNow);
    	}

    	for (int inputNow : input) {
        	System.out.println(inputNow);
    	}
    	scanner.close();
	}
}
