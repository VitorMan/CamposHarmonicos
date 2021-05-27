package campoharmonico;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
///////////////////////////
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Color;
import java.awt.Dimension;

public class ParteVisualCampoHarmonico extends JFrame{
	private static final long serialVersionUID = 1L;

	//Declares
	/////////////////
	private String[][] CH;
	private CampoHarmonicoClass CHC;
	///////////////
	private Font f;
	private Font f2;
	private Dimension d;
	private FlowLayout fl;
	//////////////////////
	private JPanel jpSpr;
	private JPanel jplbl;
	private JPanel jplbl2;
	private JPanel jplbl3;
	private JLabel[] lbl;
	private JLabel[] lbl2;
	private JLabel[] lbl3;
	private JLabel lblTT;
	//FimDeclaração
	
	public ParteVisualCampoHarmonico(){
		///
		//Implements
		CH = new String[7][3];
		////////////////////////////////
		CHC = new CampoHarmonicoClass();
		////////////////////////////////
		f = new Font("arial", 0, 25);
		f2 = new Font("arial", 0, 50);
		fl = new FlowLayout(FlowLayout.CENTER,100,5);
		d = new Dimension(80,80);
		/////////
		jpSpr = new JPanel();
		jplbl = new JPanel();
		jplbl2 = new JPanel();
		jplbl3 = new JPanel();
		lbl = new JLabel[7];
		lbl2 = new JLabel[7];
		lbl3 = new JLabel[7];
		lblTT = new JLabel("Triades Do Campo Harmônico De Dó", JLabel.CENTER);
		//FimImplementação
		/////////////////////
		CH = CHC.getTriCH(CHC.C);
		/////////////////////
		///
		//SuperConfig
		super.setTitle("CamposHarmonicos");
		super.setExtendedState(MAXIMIZED_BOTH);
		super.setDefaultCloseOperation(3);
		super.setLayout(fl);
		super.setVisible(true);
		//FimSuperConfig
		///
		//PainelDoSuperConfig
		jpSpr.setLayout(fl);
		jpSpr.setVisible(true);
		super.add(jpSpr);
		jpSpr.add(lblTT);
		jpSpr.setBorder(BorderFactory.createLineBorder(Color.black, 3, true));
		lblTT.setFont(f2);
		
		
///////////////////////////////
		jplbl.setLayout(fl);
		jplbl.setVisible(true);
		super.add(jplbl);
///////////////////////////////
		jplbl2.setLayout(fl);
		jplbl2.setVisible(true);
		super.add(jplbl2);
///////////////////////////////
		jplbl3.setLayout(fl);
		jplbl3.setVisible(true);
		super.add(jplbl3);
///////////////////////////////
		//FimPainelDoSperConfig
		///
		//Array(Label)Config
		for(int n =0;n<7;n++) {
			lbl[n] = new JLabel(CH[n][0],JLabel.CENTER);
			jplbl.add(lbl[n]);
			lbl[n].setPreferredSize(d);
			lbl[n].setBorder(BorderFactory.createLineBorder(Color.black, 3, true));
			lbl[n].setFont(f);
			
		}
		for(int n =0;n<7;n++) {
			lbl2[n] = new JLabel(CH[n][1],JLabel.CENTER);
			jplbl2.add(lbl2[n]);
			lbl2[n].setPreferredSize(d);
			lbl2[n].setBorder(BorderFactory.createLineBorder(Color.black, 3, true));
			lbl2[n].setFont(f);
		}
		for(int n =0;n<7;n++) {
			lbl3[n] = new JLabel(CH[n][2],JLabel.CENTER);
			jplbl3.add(lbl3[n]);
			lbl3[n].setPreferredSize(d);
			lbl3[n].setBorder(BorderFactory.createLineBorder(Color.black, 3, true));
			lbl3[n].setFont(f);
		}
		jplbl.setBorder(BorderFactory.createLineBorder(Color.black, 3, true));
		jplbl2.setBorder(BorderFactory.createLineBorder(Color.black, 3, true));
		jplbl3.setBorder(BorderFactory.createLineBorder(Color.black, 3, true));		
		//FimArray(Label)Config
	}
	public static void main(String args[]) {
		new ParteVisualCampoHarmonico();
	}
}