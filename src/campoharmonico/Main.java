package campoharmonico;
//////////////////////////
import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JPanel;

import java.awt.FlowLayout;
import java.awt.Font;
//////////////////////////
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/////////////////////////////////////
public class Main extends JFrame{
	/////////////////////////////////////////////////
	private static final long serialVersionUID = 1L;
	/////////////////////////////////////////////////
	private FlowLayout fl;
	//////////////////////
	private JPanel JP;
	//////////////////
	@SuppressWarnings("unused")
	private JButton btnEsc, btnTri, btnTet, btnCH;
	///////////////////////
	private Font f;
	Runnable escalas = new Runnable() {
		public void run() {
			ParteVisualEscalas PVE = new ParteVisualEscalas();
			PVE.repaint(10);
			PVE.btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Main();
					PVE.dispose();
				}
			});
		}
	};
	Runnable Triades = new Runnable() {
		public void run() {
			ParteVisualTriades CH;
			CH = new ParteVisualTriades();
			CH.btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Main();
					CH.dispose();
				}
			});
			CH.repaint();
		}
	};
	Runnable Tetrades = new Runnable() {
		public void run() {
			ParteVisualTetrades TTR;
			TTR = new ParteVisualTetrades();
			TTR.btn.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					new Main();
					TTR.dispose();
				}
			});
			TTR.repaint();
		}
	};
	public Main() {
		f = new Font("arial", 50, 50);
		btnCH = new JButton(" Campos Harmonicos ");
		btnEsc = new JButton(" ESCALAS ");
		btnTri= new JButton(" Tríades ".toUpperCase());
		btnTet= new JButton(" Tétrades ".toUpperCase());
		fl = new FlowLayout(FlowLayout.CENTER);
		fl.setHgap(200);
		fl.setVgap(325);
		JP = new JPanel();
		///////////////////////////////////////
		super.setDefaultCloseOperation(3);
		super.setExtendedState(MAXIMIZED_BOTH);
		super.setLayout(fl);
		super.add(JP);
		btnEsc.setFont(f);
		btnTri.setFont(f);
		btnTet.setFont(f);
		JP.add(btnEsc);
		JP.add(btnTri);
		JP.add(btnTet);
		super.setVisible(true);
		btnEsc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				escalas.run();
				dispose();
			}
		});
		btnTri.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Triades.run();
				dispose();
			}
		});
		btnTet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Tetrades.run();
				dispose();
			}
		});
	}
	public static void main(String[] args) {
		new Main();
	}
}