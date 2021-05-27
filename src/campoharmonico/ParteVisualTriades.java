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
public class ParteVisualTriades extends JFrame{
	private String tr[] = new String[3];
	private int Cont = 0;
//////////////////////////////////////////////////////
	private Dimension d;
	private Dimension d2;
	private Dimension pslbl;
	private Dimension psPn;
	private Font f;
	private Font f2;
	private FlowLayout fl;
	private FlowLayout fl2;
	private FlowLayout fl3;
///////////////////////////
	private Escalas esc;
	private CampoHarmonicoClass CHC;
////////////////////////////////////
	private JDesktopPane PaneSpr;
	private JPanel paneLblTxt;
	private JPanel paneTonantes;
	private JPanel paneTriades[];
	private JPanel paneAcordes[];
	//private JPanel paneTxt;
	private JLabel ACORDES;
	private JLabel lblTexto;
	private JLabel lblTonante[];
	private JLabel lblTriade[];
	private JLabel lblAcordes[];
	protected JButton btn;
//////////////////////////
	public ParteVisualTriades(){
///////////////////////////////////////
		super.setTitle("Triades");
		//Implementação das Variaveis/OBJ
		/////////////////////////////////
		esc = new Escalas();
		CHC = new CampoHarmonicoClass();
		d = new Dimension(1346,70);
		d2 = new Dimension(1347,90);
		pslbl = new Dimension(80,80);
		psPn = new Dimension(80,270);
		f = new Font("arial", 2, 50);
		f2 = new Font("arial", 2, 25);
		fl2 = new FlowLayout(FlowLayout.LEADING);
		fl = new FlowLayout(FlowLayout.CENTER,30,5);
		fl3 = new FlowLayout(FlowLayout.CENTER,10,5);
		/////////////////////////////////////////////
		lblTexto = new JLabel("                                    Triades", JLabel.CENTER);
		///////////////
		lblTonante = new JLabel[12];
		lblTriade = new JLabel[36];
		lblAcordes = new JLabel[12];
		btn = new JButton(" Voltar ");
		PaneSpr = new JDesktopPane();
		paneLblTxt = new JPanel();
		paneTonantes = new JPanel();
		paneTriades = new JPanel[12];
		paneAcordes = new JPanel[12];
		ACORDES = new JLabel("Acordes Formados", JLabel.CENTER);
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
			tr = CHC.getTriade(n);
			paneTriades[n] = new JPanel();
			paneTriades[n].setBorder(BorderFactory.createLineBorder(Color.black, 5, true));
			paneTriades[n].setLayout(fl);
			//paneTriades[n].setBackground(Color.black);
			PaneSpr.add(paneTriades[n]);
			paneTriades[n].setPreferredSize(psPn);
			paneTriades[n].setVisible(true);
			for(int PN = 0;PN<3;PN++) {
				paneTriades[n].add(lblTriade[Cont]);
				lblTriade[Cont].setText((PN+1)+"°"+tr[PN]);
				Cont++;
			}
		}
		//ConfigPaneTriades
		///
		////
		///
		//
		Cont = 0;
		PaneSpr.add(ACORDES);
		ACORDES.setFont(f);
		ACORDES.setPreferredSize(d);
		ACORDES.setVisible(true);
		for(int n =0;n<lblAcordes.length;n++){
			lblAcordes[n] = new JLabel(CHC.getAcorde(CHC.getTriade(n)));
			lblAcordes[n].setPreferredSize(pslbl);
			lblAcordes[n].setFont(f2);
			lblAcordes[n].setHorizontalTextPosition(SwingConstants.CENTER);
			lblAcordes[n].setBorder(BorderFactory.createLineBorder(Color.black, 5, true));
		}
		for(int n =0;n<paneAcordes.length;n++) {
			tr = CHC.getTriade(n);
			paneAcordes[n] = new JPanel();
			paneAcordes[n].setBorder(BorderFactory.createLineBorder(Color.black, 5, true));
			paneAcordes[n].setLayout(fl3);
			//paneAcordes[n].setBackground(Color.black);
			PaneSpr.add(paneAcordes[n]);
			paneAcordes[n].setPreferredSize(pslbl);
			paneAcordes[n].setVisible(true);
			paneAcordes[n].add(lblAcordes[n]);
		}
		//FimCodigoClasse
		}
}