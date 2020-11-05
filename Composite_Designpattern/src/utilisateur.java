
public class utilisateur {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fichier f1=new Fichier("Fichier1", (byte) 10);
		Fichier f2=new Fichier("Fichier2", (byte) 20);
		Fichier f3=new Fichier("Fichier3", (byte) 15);
		Repertoire R0= new Repertoire("Repertoire");
		Repertoire R1= new Repertoire("Repertoire1");
		Repertoire R2= new Repertoire("Repertoire2");
		R1.ajouter(f1);
		R1.ajouter(f2);
		R2.ajouter(f3);
		R0.ajouter(R1);
		R0.ajouter(R2);
		R0.afficher();
		R0.getchild();
		R0.calculer_taille();

	}

}
