
public class Fichier implements FichierComposant{
	String nomF;
	byte tailleF;
	public Fichier(String nomF, byte tailleF) {
		this.nomF= nomF;
		this.tailleF=tailleF;
		
	}
	@Override
	public void afficher() {
		// TODO Auto-generated method stub
		System.out.println("Le nom du fichier est: "+this.nomF);
		System.out.println("Le taille du fichier est: "+this.tailleF);
		
	}
	public String getNomF() {
		return nomF;
	}
	public void setNomF(String nomF) {
		this.nomF = nomF;
	}
	public int getTailleF() {
		return tailleF;
	}
	public void setTailleF(byte tailleF) {
		this.tailleF = tailleF;
	}
	@Override
	public byte taille() {
		// TODO Auto-generated method stub
		return tailleF;
	}
	@Override
	public String nom() {
		// TODO Auto-generated method stub
		return nomF;
	}
	
}
