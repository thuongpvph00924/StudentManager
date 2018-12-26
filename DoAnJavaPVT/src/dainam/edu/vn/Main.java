package dainam.edu.vn;




import javax.swing.JFrame;
import javax.swing.JOptionPane;


public class Main {
    
    public static MyConnect connection = new MyConnect();
   
    
    @SuppressWarnings("deprecation")
	public static void main(String[] args) {
        // TODO code application logic here
    	DangNhap frmLogin = new DangNhap();
        frmLogin.show();
    }
    public static void thongBao(String noiDungThongBao,String tieuDeThongBao,int icon){
        JOptionPane.showMessageDialog(new JFrame(),noiDungThongBao,tieuDeThongBao,icon);
    }
    
}
