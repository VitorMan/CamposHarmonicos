package campoharmonico;

public class CampoHarmonicoClass extends Escalas{
		/////
		///
		//Declaração de variaveis
	public int A=0, As=1, B=2, C=3, Cs=4, D=5, Ds=6, E=7, F=8, Fs=9, G=10, Gs=11;
	private int Cont=0;
	private String tom[];
	private String [] Triade;
	private String [] Tetrade;
	private String [][]CampoHarmonico;
	//Fim Declaração de Variaveis
	///
	////
	///
	//Método para Formar Triades
	public String[] getTriade(int Tom){
		tom = getEscalaMaior(Tom);
		Cont =0;
		Triade = new String[3];
		Cont = 0;
		for(int n = 0;n<Triade.length;n++) {
			Triade[n] = tom[Cont];
			Cont+=2;
		}
		return Triade;
	}
	//Fim Metodo Para Formar Triades
	///
	////
	///
	//Metodo para Formar Tetrades
	public String[] getTetrade(int Tom){
		tom = getEscalaMaior(Tom);
		Cont =0;
		Tetrade = new String[4];
		Cont = 0;
		for(int n = 0;n<Tetrade.length;n++) {
			Tetrade[n] = tom[Cont];
			Cont+=2;
		}
		return Tetrade;
	}
	//Fim do Metodo para formar tetrades
	///
	////
	///
	//
	///////////////////////////////////
	public String[][] getTriCH(int Tonante){
		String EscalaMaior[] = new String[14];
		String[] Escala;
		Escala = getEscalaMaior(Tonante);
		//////////////////////////////////
		int ESC = 0;
		int ESCM = 0;
		//////////////////////////////////
		do {
			EscalaMaior[ESCM] = Escala[ESC];
			ESC++;	
			if(ESC==7) {ESC=0;}
			ESCM++;
		}while(ESCM<EscalaMaior.length);
		////////////////////////////////
		CampoHarmonico = new String[7][3];
		//////////////////////////////////
		for(int n=0;n<7;n++) {
			CampoHarmonico[n][0] = EscalaMaior[n];
			CampoHarmonico[n][1] = EscalaMaior[n+2];
			CampoHarmonico[n][2] = EscalaMaior[n+4];
		}
//////////////////////////////////////////////////////
		return CampoHarmonico;
/////////////////////////////////////////////////////
	}
	public String getAcorde(String[] tr) {
		String ter, quin,set;
		String Acorde = "";
		Intervalos Int = new Intervalos();
		if(tr.length==4) {
			ter = Int.getInterv(tr[0], tr[1]);
			quin = Int.getInterv(tr[0], tr[2]);			
			set = Int.getInterv(tr[0], tr[3]);
			
			Acorde = (tr[0]+ter+quin+set);
		}else{
			ter = Int.getInterv(tr[0], tr[1]);
			quin = Int.getInterv(tr[0], tr[2]);			
			Acorde = (tr[0]+ter+quin);
		}
		return Acorde;
	}
/////////////////////////////////////////////////
}