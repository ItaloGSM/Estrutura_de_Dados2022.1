package arvore;

public class Arvore_rubro_negra_teste {

	public static void main(String[] args) throws NodeException {
		
		Arvore_rubro_negra arv = new Arvore_rubro_negra();
		
		
		for(int i=0; i<20;i++) {
			arv.insert(i);
		}
		arv.mostraArvore();
		
		arv.remove(7);

		arv.mostraArvore();

}
}
