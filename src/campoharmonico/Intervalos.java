package campoharmonico;

public class Intervalos extends Escalas{
	private String TerMai="";
	private String TerMen="m";
	private String QuinJus="";
	private String QuinBem = "♭5";
	private String Sexta = "6";
	@SuppressWarnings("unused")
	private String SetDb = "°";
	private String SetMen = "7";
	private String SetMai = "7+";
	private String Nona = "9";
	public String getInterv(String nota1 , String nota2){
		String InterSt = null;
		int p=0;
		int s=0; 
		int interIn;
		for(int n =0;n<24;n++) {
			if(nota1.equals(escalaCromatica[n])) {
				p = n;
				break;
			}else {
				p=0;
			}
		}
		for(int n =4;n<24;n++) {
			if(nota2.equals(escalaCromatica[n])) {
				s = n;
				break;
			}
		}
		if(s>=4&&p>=5&&p<=9) {
			s+=12;
		}
		if(s>=21) {
			s-=12;
		}
		if(p>=9&&s>=4&&s!=13) {
			s+=12;
		}
		if(s>=26) {
			s-=12;
		}
		interIn = ((s)-(p));
		if(interIn<0) {
			interIn = (interIn*(-1));
		}
		switch(interIn) {
		case 3:
			InterSt = TerMen;
			break;
		case 4:
			InterSt = TerMai;
			break;
		case 6:
			InterSt = QuinBem;
			break;
		case 7:
			InterSt = QuinJus;
			break;
		case 9:
			InterSt = Sexta;
			break;
		case 10:
			InterSt = SetMen;
			break;
		case 11:
			InterSt = SetMai;
			break;
		case 14:
			InterSt = Nona;
			break;
		}
		return InterSt;
	}
}
