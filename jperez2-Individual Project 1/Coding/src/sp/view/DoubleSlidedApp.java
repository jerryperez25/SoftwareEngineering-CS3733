package sp.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import com.jgoodies.forms.factories.DefaultComponentFactory;

import sp.controller.FlipController;
import sp.controller.ResetController;
import sp.controller.WinLossController;
import sp.model.Model;

public class DoubleSlidedApp extends JFrame {

	private JPanel contentPane;
	
	PuzzleView panel;
	Model model;
	JLabel lblNewLabel = new JLabel(" ");


	/**
	 * Create the frame.
	 */
	public DoubleSlidedApp(Model model) {
		this.model = model;
		setTitle("Double Slided");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 405, 389);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		panel = new PuzzleView(model);
		panel.addMouseListener(new FlipController(this,model));
		panel.addMouseListener(new WinLossController(this,model));
		
		JButton btnReset = new JButton("Reset");
		btnReset.addMouseListener(new ResetController(this,model));
		
		JLabel lblMoveCounter = DefaultComponentFactory.getInstance().createLabel("Move Counter:");
		
		
	
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(panel, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnReset, GroupLayout.PREFERRED_SIZE, 59, GroupLayout.PREFERRED_SIZE))
						.addGroup(Alignment.LEADING, gl_contentPane.createSequentialGroup()
							.addComponent(lblMoveCounter)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblNewLabel)))
					.addContainerGap())
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnReset)
						.addComponent(panel, GroupLayout.PREFERRED_SIZE, 300, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMoveCounter)
						.addComponent(lblNewLabel))
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
	}
	public void setMoveCount(String num) {
		lblNewLabel.setText(num);
	}
	public void freezePanel() {panel.setEnabled(false);}
}
