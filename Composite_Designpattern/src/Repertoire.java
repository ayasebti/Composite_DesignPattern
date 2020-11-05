import java.util.ArrayList;
import java.util.List;

public class Repertoire implements FichierComposant{
	String nomR;
	List<FichierComposant> repertoire;
	
	public Repertoire(String nomR) {
		this.nomR=nomR;
		repertoire= new ArrayList<>(); 
	}
	public void ajouter(FichierComposant fc) {
		if(!repertoire.contains(fc)){
            repertoire.add(fc);
        }
	}
	public void supprimer(FichierComposant fc) {
		int index=repertoire.indexOf(fc);
		repertoire.remove(index);
		System.out.println("Le fichier a été supprimer.");
	}
	public void getchild() {
		for (FichierComposant fc:repertoire) {
			System.out.println (fc.nom());
		}
	}

	public String getNomR() {
		return nomR;
	}
	public void setNomR(String nomR) {
		this.nomR = nomR;
	}
	public void calculer_taille() {
		System.out.println("La taille du "+this.nomR+" est: "+this.taille());
	}
	
	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		System.out.println ("Le nom de ce repertoire est: "+nomR);
		
	}
	@Override
	public byte taille() {
		// TODO Auto-generated method stub
		byte taille=0;
		for (FichierComposant fc:repertoire) {
			taille= (byte) (taille+fc.taille());
		}
		return taille;
	}
	@Override
	public String nom() {
		// TODO Auto-generated method stub
		return nomR;
	}
	

}
