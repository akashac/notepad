import java.awt.*;
import javax.swing.*;

class Shortcuts extends JFrame
{	
	JPanel pp;
	JScrollPane p;
	public Shortcuts()
	{
		//this.setSize(160,200);
		//this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pp=new JPanel();
		p=new JScrollPane(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		pp.setLayout(new BoxLayout(pp, BoxLayout.Y_AXIS));	
				JLabel l1=new JLabel("New File	:		ctrl+N");
				JLabel l2=new JLabel("Open File	:		ctrl+O");
				JLabel l3=new JLabel("Save	:		ctrl+S");
				JLabel l4=new JLabel("Save As	:		alt+S");
				JLabel l5=new JLabel("Save All	:		ctrl+shift+N");
				JLabel l6=new JLabel("Close	:		alt+C");
				JLabel l7=new JLabel("Close All:		ctrl+shift+C	");
				JLabel l8=new JLabel("Exit	:		ctrl+E");				
				JLabel l9=new JLabel("Copy	:		ctrl+C");
				JLabel l10=new JLabel("Past	:		ctrl+P");
				JLabel l11=new JLabel("Cut	:		ctrl+X");
				JLabel l12=new JLabel("Undo	:		ctrl+U");
				JLabel l13=new JLabel("Redo	:		ctrl+Z");
				JLabel l14=new JLabel("Goto	:		ctrl+shift+G");
				JLabel l15=new JLabel("Find	:		ctrl+F");
				JLabel l16=new JLabel("Replace	:		ctrl+R");
				JLabel l17=new JLabel("Select All:		ctrl+A");
				JLabel l18=new JLabel("Font	:		ctrl+shift+F");
				JLabel l19=new JLabel("Run	:		alt+R");
				JLabel l20=new JLabel("Run in Browser:		ctrl+shift+R");
				JLabel l21=new JLabel("Run	:		ctrl+G");	
		pp.add(l1);
		pp.add(l2);
		pp.add(l3);
		pp.add(l4);
		pp.add(l5);
		pp.add(l6);
		pp.add(l7);
		pp.add(l8);
		pp.add(l9);
		pp.add(l10);
		pp.add(l11);
		pp.add(l12);
		pp.add(l13);
		pp.add(l14);
		pp.add(l15);
		pp.add(l16);
		pp.add(l17);
		pp.add(l18);
		pp.add(l19);
		pp.add(l20);
		pp.add(l21);
		
		p.getViewport().add(pp);
		this.add(p);
		//this.setVisible(true);
	}
}
