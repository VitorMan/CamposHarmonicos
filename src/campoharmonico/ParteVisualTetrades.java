package campoharmonico;
///////////////////////
import javax.swing.JFrame;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.JDesktopPane;
//////////////////////////
import java.awt.Color;
import java.awt.Font;
import java.awt.FlowLayout;
import java.awt.Dimension;
///////////////////////////
@SuppressWarnings("serial")
public class ParteVisualTetrades extends JFrame{
	private String ttr[] = new String[4];
	private int Cont = 0;
//////////////////////////////////////////////////////
	private Dimension d;
	private Dimension d2;
	private Dimension pslbl;
	private Dimension pslbl2;
	private Dimension pslbl3;
	private Dimension psPn;
	private Dimension pstxt;
	private Font f;
	private Font f2;
	private FlowLayout fl;
	private FlowLayout fl2;
///////////////////////////
	private Escalas esc;
	private CampoHarmonicoClass CHC;
////////////////////////////////////
	private JDesktopPane PaneSpr;
	private JPanel paneLblTxt;
	private JPanel paneTxt;
	private JPanel paneTonantes;
	private JPanel paneTriades[];
	private JPanel paneAcordes[];
	private JLabel lblTexto;
	private JLabel Txt;
	private JLabel lblTonante[];
	private JLabel lblTriade[];
	private JLabel lblAcordes[];
	protected JButton btn;
//////////////////////////
	public ParteVisualTetrades(){
///////////////////////////////////////
		super.setTitle("Tetrades");
		//Implementação das Variaveis/OBJ
		/////////////////////////////////
		esc = new Escalas();
		CHC = new CampoHarmonicoClass();
		d = new Dimension(1346,70);
		d2 = new Dimension(1347,90);
		pslbl = new Dimension(80,80);
		pslbl2 = new Dimension(80,80);
		pslbl3 = new Dimension(90,70);
		pstxt = new Dimension(1346,60);
		psPn = new Dimension(80,355);
		new Dimension(80,80);
		f = new Font("arial", 2, 50);
		f2 = new Font("arial", 2, 25);
		fl2 = new FlowLayout(FlowLayout.LEADING);
		fl = new FlowLayout(FlowLayout.CENTER,30,5);
		/////////////////////////////////////////////
		lblTexto = new JLabel("                                    Tétrades", JLabel.CENTER);
		///////////////
		Txt = new JLabel(" Acordes ", JLabel.CENTER);
		lblTonante = new JLabel[12];
		lblTriade = new JLabel[48];
		lblAcordes = new JLabel[12];
		paneLblTxt = new JPanel();
		paneTonantes = new JPanel();
		paneTriades = new JPanel[12];
		paneAcordes = new JPanel[12];
		paneTxt = new JPanel(fl);
		btn = new JButton(" Voltar ");
		PaneSpr = new JDesktopPane();
		//FimImplementação
		///
		//JFrameConfig
		super.setExtendedState(MAXIMIZED_BOTH);
		super.setDefaultCloseOperation(3);
		super.setLayout(null);
		super.setVisible(true);
		//FimConfigJFrame
		///
		////
		///
		//ConfigJDesktopPane: PaneSpr
		PaneSpr.setBounds(0, 0, 1366, 768);
		PaneSpr.setBackground(super.getBackground());
		super.add(PaneSpr);
		PaneSpr.setVisible(true);
		PaneSpr.setLayout(fl);
		
		//FimConfigJDesktopPane
		///
		//ConfigPanelLblTxt
		paneLblTxt.setLayout(fl2);
		paneLblTxt.setPreferredSize(d);
		PaneSpr.add(paneLblTxt);
		paneLblTxt.add(btn);
		//FimConfigPanelLblTxt
		///
		//ConfigJLabel "Triades"
		lblTexto.setFont(f);
		lblTexto.setBackground(Color.WHITE);
		paneLblTxt.add(lblTexto);
		//FimConfigJLabel
		///
		////
		///
		//ConfigPaneTonantes
		paneTonantes.setLayout(fl);
		paneTonantes.setPreferredSize(d2);
		PaneSpr.add(paneTonantes);
		//lblTonanteConfig
		for(int n =0;n<lblTonante.length;n++) {
			lblTonante[n] = new JLabel(esc.escalaCromatica[n] , JLabel.CENTER);
			lblTonante[n].setPreferredSize(pslbl);
			lblTonante[n].setFont(f2);
			lblTonante[n].setBorder(BorderFactory.createLineBorder(Color.black, 5, true));
			paneTonantes.add(lblTonante[n]);
			lblTonante[n].setVisible(true);
		}
		//fimConfigPaneTonantes
		///
		////
		///
		//ConfiglblTriade
		for(int n =0;n<lblTriade.length;n++){
			lblTriade[n] = new JLabel();
			lblTriade[n].setPreferredSize(pslbl);
			lblTriade[n].setFont(f2);
			lblTriade[n].setHorizontalTextPosition(SwingConstants.CENTER);
			lblTriade[n].setBorder(BorderFactory.createLineBorder(Color.black, 5, true));
		}
		//FimConfiglblTriades
		///
		////
		///
		//ConfigPaneTriades
		for(int n =0;n<paneTriades.length;n++) {
			ttr = CHC.getTetrade(n);
			paneTriades[n] = new JPanel();
			paneTriades[n].setBorder(BorderFactory.createLineBorder(Color.black, 5, true));
			paneTriades[n].setLayout(fl);
			PaneSpr.add(paneTriades[n]);
			paneTriades[n].setPreferredSize(psPn);
			paneTriades[n].setVisible(true);
			for(int PN = 0;PN<4;PN++) {
				paneTriades[n].add(lblTriade[Cont]);
				lblTriade[Cont].setText((PN+1)+"°"+ttr[PN]);
				Cont++;
			}
		}
		Cont =0;
		//FimConfigPaneTriades
		///
		////
		///
		//paneTxtAcordes
		PaneSpr.add(paneTxt);
		paneTxt.setPreferredSize(pstxt);
		paneTxt.setVisible(true);
		paneTxt.add(Txt);
		Txt.setFont(f);
		//FimPaneTxtAcordes
		///
		//
		for(int n =0;n<lblAcordes.length;n++){
			lblAcordes[n] = new JLabel();
			lblAcordes[n].setPreferredSize(pslbl3);
			lblAcordes[n].setFont(f2);
			lblAcordes[n].setBorder(BorderFactory.createLineBorder(Color.black, 5, true));
		}
		for(int n =0;n<paneAcordes.length;n++) {
			ttr = CHC.getTetrade(n);
			paneAcordes[n] = new JPanel();
			//paneAcordes[n].setBorder(BorderFactory.createLineBorder(Color.black, 3, true));
			paneAcordes[n].setLayout(fl);
			PaneSpr.add(paneAcordes[n]);
			paneAcordes[n].setPreferredSize(pslbl2);
			paneAcordes[n].setVisible(true);
			lblAcordes[n].setText(CHC.getAcorde(ttr));
			paneAcordes[n].add(lblAcordes[n]);
		}
		//FimCodigoClasse
		}
}
