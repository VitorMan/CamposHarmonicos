package campoharmonico;

public class Escalas extends Notas {

	protected final String escalaCromatica[] = new String[24];
	private String escalaMaior[] = new String[7];
	private int contF = 0;
	
	public String[] getEscalaMaior(int PrimeiroGrau) {
		for(int n = 0;n<escalaMaior.length;n++) {
			escalaMaior[n] = escalaCromatica[PrimeiroGrau];
			if(n == 2 || n ==6) {
				PrimeiroGrau++;
			}else {
				PrimeiroGrau+=2;
			}
			//System.out.println("Cont = "+cont+"\n"+"PG = "+ PrimeiroGrau);
		}
		return escalaMaior;
	}
	public Escalas() {
		escalaCromatica[0] = A; escalaCromatica[1]=As; escalaCromatica[2]=B; escalaCromatica[3]=C;
		escalaCromatica[4]=Cs; escalaCromatica[5]=D; escalaCromatica[6]=Ds; escalaCromatica[7]=E;
		escalaCromatica[8]=F; escalaCromatica[9]=Fs; escalaCromatica[10]=G; escalaCromatica[11]=Gs;
		for(int a =12;a<escalaCromatica.length;a++) {
		escalaCromatica[a] = escalaCromatica[contF];
		contF++;
		}
		for(int n= 0;n<escalaMaior.length;n++) {			
			String M[] = new String[7];
			M[n] = new String();
			M=getEscalaMaior(0);
		}
	}

  	public static void main(String args[]) {
		new Escalas();
	}
}