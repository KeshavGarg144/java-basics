import javax.swing.*;

class Sample_frame
{
	JFrame jf;
	JLabel jl1;

Sample_frame()
{
jf=new JFrame("Demo");
jf.setSize(500,500);
jf.setVisible(true);
jf.setLayout(null);
jl1= new JLabel("Hello world");
jl1.setBounds(100,100,500,100);
jf.add(jl1);

}
public static void main(String s[])
{
new Sample_frame();
}
}