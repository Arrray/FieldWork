import javax.swing.*;
public class Test {

    public static void main(String[] args) {
        //创建2个窗口--2个对象
        JFrame f=new JFrame();//窗口有默认格局
        f.setBounds(500, 300, 440, 300);
        f.setLayout(null);//取消窗口的布局

        JButton btn=new JButton();
        btn.setBounds(5, 5, 60, 40); //想让这句话有效，需要把窗口的布局取消
        btn.setText("你好");
        f.add(btn); //按钮放在窗口上

        f.setVisible(true);//显示窗口

        JFrame m=new JFrame();
        m.setBounds(1140, 600, 300, 300);
        m.setVisible(true);

    }
}
