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
private static int kotaAwalDanTiket(int nKota, int nAliansi, List<List<Integer>>aliansiKota) {
         Map<Integer, List<Integer>> mapAliansi = new HashMap<>();
	 Map<String, List<String>> graphLink = new HashMap<>();

for (int aliansiIndex = 0; aliansiIndex < aliansiKota.size(); aliansiIndex++) {
         List<Integer> aliansiIni = aliansiKota.get(aliansiIndex);

for (int kotaNow : aliansiIni) {
         mapAliansi.putIfAbsent(kotaNow, new ArrayList<>());
         mapAliansi.get(kotaNow).add(aliansiIndex);
     }
}
	
for (int aliansiIndex = 0; aliansiIndex < aliansiKota.size(); aliansiIndex++) {

            List<Integer> aliansiIni = aliansiKota.get(aliansiIndex);

            for (int i = 0; i < aliansiIni.size(); i++) {

                for (int j = i + 1; j < aliansiIni.size(); j++) {

                    String key1 = aliansiIni.get(i) + "-" + aliansiIndex;

                    String key2 = aliansiIni.get(j) + "-" + aliansiIndex;

                    graphLink.putIfAbsent(key1, new ArrayList<>());

                    graphLink.putIfAbsent(key2, new ArrayList<>());

                    graphLink.get(key1).add(key2);

                    graphLink.get(key2).add(key1);

                }

            }

        }


        for (int kotaNow = 0; kotaNow < nKota; kotaNow++) {

            for (int aliansiIni : mapAliansi.getOrDefault(kotaNow, new ArrayList<>())) {

                if (jalurHamiltonian(kotaNow, aliansiIni, nKota, mapAliansi, graphLink)) {

                    return kotaNow;

                }

            }

        }


        return -1;

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


	List<Integer> aliansiDaftar = mapAliansi.getOrDefault(kotaSt, new ArrayList<>());
    	for (int aliansiNext : aliansiDaftar) {
        	if (aliansiNext != aliansiSt || aliansiDaftar.size() == 1) {
            	String kunci = kotaSt + "-" + aliansiNext;
            	List<String> tetanggaDaftar = graph.getOrDefault(kunci, new ArrayList<>());
            	for (String tetangga : tetanggaDaftar) {
                	int tetanggaKota = Integer.parseInt(tetangga.split("-")[0]);
                	int tetanggaAliansi = Integer.parseInt(tetangga.split("-")[1]);
                	if (!kotaThen.contains(tetanggaKota)) {
                    	Set<Integer> kotaNew = new HashSet<>(kotaThen);
                    	kotaNew.add(tetanggaKota);
                    	List<Integer> linkNew = new ArrayList<>(link);
                    	linkNew.add(tetanggaKota);
                    	stack.push(new Node(tetanggaKota, tetanggaAliansi, kotaNew, linkNew));
                	}
            	}
        	}
    	}
	}

	return false;
}

static class Node {
    int kotaNow;
    int aliansiIni;
    Set<Integer> kotaThen;
    List<Integer> link;

    Node(int kotaNow, int aliansiIni, Set<Integer> kotaThen, List<Integer> link) {
        this.kotaNow = kotaNow;
        this.aliansiIni = aliansiIni;
        this.kotaThen = kotaThen;
        this.link = link;
    }
}



