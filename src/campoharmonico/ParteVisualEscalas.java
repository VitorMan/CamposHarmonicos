package campoharmonico;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JLabel;
import javax.swing.JButton;
///////////////////////////
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;

public class ParteVisualEscalas extends JFrame{
	private static final long serialVersionUID = 0;
//////////////////////
	private JPanel JP,Tonantes,escalas;
	private JPanel[] escala;
	private JLabel lbl[]; 
	private JLabel lblEsc[];
	private JLabel lblJP;
	protected JButton btn;
	private FlowLayout fl,flJP;
	private Font f,f2,f3;
	private Dimension d;
//////////////////////////
	public ParteVisualEscalas(){
//////////////////////////
		d = new Dimension(80,80);
		////////////////////
		btn = new JButton(" Voltar ");
		////////////////////
		Tonantes = new JPanel(); escalas = new JPanel(); JP = new JPanel();
		////////////////////////////////////////////////
		escala = new JPanel[12];
		////////////////////////
		f = new Font("arial", 0, 25); f2 = new Font("arial", 2, 50); f3 = new Font("arial", 0, 25);
		///////////////////////////////////////////////////////////////////////////////////////////
		fl = new FlowLayout(FlowLayout.CENTER,30,10);
		///////////////////////////////////////
		flJP = new FlowLayout(FlowLayout.LEFT);
		///////////////////////////////////////
		lbl = new JLabel[12];
		//////////////////////
		lblEsc = new JLabel[6];
		///////////////////////
		lblJP = new JLabel("                                    Escalas", SwingConstants.CENTER);
		/////////////////////////////////////////////////////
		Escalas esc = new Escalas();
		//
		///
		////
		///
		//
		//ConfigSuper
		super.setTitle("Escalas ");
		super.setExtendedState(MAXIMIZED_BOTH);
		super.setDefaultCloseOperation(3);
		super.setVisible(true);
		super.setLayout(null);
		//FimConfigSuperClasse
		///
		////
		/////
		////
		///
		//ConfigJLabel(escrito "Escalas")
		JP.add(btn);
		JP.setVisible(true);
		JP.setLayout(flJP);
		JP.add(lblJP);
		lblJP.setFont(f2);
		super.add(JP);
		JP.setBounds(10, 10, 1346, 60);
		//FimConfigJLabel(escrito "Escalas")
		///
		////
		///
		///
		////
		///
		//ConfigTonantes
		Tonantes.setVisible(true);
		Tonantes.setLayout(fl);
		super.add(Tonantes);
		Tonantes.setBounds(10, 80, 1346, 90);
		//FimConfigTonantes
		///
		////
		/////
		//////
		/////
		////
		///
		//implementação/Config Do Label Com Cifras
		for(int n = 0;n<lbl.length;n++) {
			lbl[n] = new JLabel();
			Tonantes.add(lbl[n]);
			lbl[n].setVisible(true);
			lbl[n].setFont(f);
			lbl[n].setBorder(BorderFactory.createLineBorder(Color.black, 5, true));
			lbl[n].setPreferredSize(d);
			Tonantes.repaint();
				for(int o = 0;o<6;o++) {
					lbl[n].setText("1°"+esc.escalaCromatica[n]);
				}
		lbl[n].setHorizontalTextPosition(SwingConstants.CENTER);
		}
		//Fim Da Implementação/Config Do Label Com Cifras
		///
		////
		/////
		//////
		/////
		////
		///
		//Escalas Todas Config
		escalas.setVisible(true);
		escalas.setBounds(12, 165, 1346, 768-160);
		escalas.setLayout(null);
		super.add(escalas);
		//FimConfig
		///
		///
		////
		/////
		////
		///
		//escalaPanelConfig
		int X = 25;
		for(int n =0;n<escala.length;n++) {
			escala[n] = new JPanel();
			escala[n].setVisible(true);
			escala[n].setBounds(X, 10, 80, 768-160);
			escalas.add(escala[n]);
			X+=110;
			escala[n].setLayout(fl);
		}
		//FimEscalaPanelConfig
		///
		////
		///
		//LabelsDasEscalasConfig
		String Notas[] = new String[7];
		for(int m =0;m<escala.length;m++) {
		Notas = esc.getEscalaMaior(m);
			for(int n=0;n<lblEsc.length;n++) {
				lblEsc[n] = new JLabel();
				lblEsc[n].setPreferredSize(d);
				lblEsc[n].setBorder(BorderFactory.createLineBorder(Color.black, 5, true));
				lblEsc[n].setFont(f3);
				lblEsc[n].setHorizontalTextPosition(SwingConstants.CENTER);
				lblEsc[n].setVerticalTextPosition(SwingConstants.CENTER);
				/////////////////////////////////////////////////////////
				lblEsc[n].setText((n+2)+"°"+Notas[n+1]);
				escala[m].add(lblEsc[n]);
			}
		}
	//FimLabelDasEscalasConfig
	///
	////
	/////
	////
	///	
	//FimCodigoDaClasse
	}
 }