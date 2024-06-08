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

private static boolean jalurHamiltonian(int kotaAwal, int aliansiAwal, int nKota, Map<Integer, List<Integer>> mapAliansi, Map<String, List<String>> graph) {
	Stack<Node> stack = new Stack<>();
	stack.push(new Node(kotaAwal, aliansiAwal, new HashSet<>(Collections.singleton(kotaAwal)), new ArrayList<>(Collections.singleton(kotaAwal))));

	while (!stack.isEmpty()) {
    	Node node = stack.pop();
    	int kotaSt = node.kotaNow;
    	int aliansiSt = node.aliansiIni;
    	Set<Integer> kotaThen = node.kotaThen;
    	List<Integer> link = node.link;

    	if (kotaThen.size() == nKota) {
        	return true;
    	}

}
