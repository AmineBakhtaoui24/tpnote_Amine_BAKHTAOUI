package tpnote;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class CompagnieAutoroute {
	List<Route> routes;
	List<Tarif> tarifs;
	public CompagnieAutoroute () {
		this.routes = new ArrayList<Route>();
		this.tarifs = new ArrayList<Tarif>();
	}
	
	public BigDecimal ObtenirTarif(Porte a,Porte b){
		return null;	
	}
	private Tarif getTarifCalculé(Porte a,Porte b) {
		return null;
	}
	private Tarif getTarifExacte(Porte a,Porte b) {
		return null;
	}
	
	
	public void ajouterTarif (Tarif a) {
		this.tarifs.add(a);
	}
	public void ajouterRoute (Route a) {
		this.routes.add(a);
	}
	
}