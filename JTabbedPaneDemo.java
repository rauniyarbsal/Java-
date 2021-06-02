import java.awt.*;
import javax.swing.*;

public class JTabbedPaneDemo extends JApplet{
	public void init() {
		try {
			SwingUtilities.invokeAndWait(new Runnable() {
				public void run() {
					makeGUI();
				}
			});
		}catch(Exception e) {
			System.out.println("can't run because of"+e);
		}
	}
	private void makeGUI() {
		JTabbedPane j=new JTabbedPane();
		j.addTab("Semester", new SemesterPanel());
		j.addTab("Course", new CoursePanel());
		j.addTab("Electives", new ElectivePanel());
		add(j);
	}
}

class SemesterPanel extends JPanel{
	public SemesterPanel() {
		JRadioButton B1=new JRadioButton("1");
		add(B1);
		JRadioButton B2=new JRadioButton("3");
		add(B2);
		JRadioButton B3=new JRadioButton("5");
		add(B3);
		JRadioButton B4=new JRadioButton("7");
		add(B4);
	}
}
class CoursePanel extends JPanel{
	public CoursePanel() {
		JCheckBox CB1=new JCheckBox("Java");
		add(CB1);
		JCheckBox CB2=new JCheckBox("Compiler Design");
		add(CB2);
		JCheckBox CB3=new JCheckBox("Machine Learning");
		add(CB3);
	}
}
class ElectivePanel extends JPanel{
	public ElectivePanel() {
		JComboBox jcb=new JComboBox();
		jcb.addItem("AI");
		jcb.addItem("IOT");
		jcb.addItem("Big Data");
		add(jcb);
	}
}