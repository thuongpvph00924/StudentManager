package dainam.edu.vn;

import java.awt.Color;
import java.sql.ResultSet;

import javax.swing.JOptionPane;
import java.awt.Font;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

@SuppressWarnings("serial")
public class DangNhap extends javax.swing.JFrame {

    
    public DangNhap() {
        initComponents();
        getContentPane().setBackground(Color.WHITE);
        this.setTitle(" Chào mừng bạn đến với trang quản lý Sinh Viên.                           Dainam.edu.vn");
        getRootPane().setDefaultButton(btnDangNhap);
    }
    
    
 
   
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBackground(Color.WHITE);
        jLabel1 = new javax.swing.JLabel();
        lblTenDangNhap = new javax.swing.JLabel();
        lblTenDangNhap.setFont(new Font("Tahoma", Font.ITALIC, 12));
        txtTenDangNhap = new javax.swing.JTextField();
        lblMatKhau = new javax.swing.JLabel();
        lblMatKhau.setFont(new Font("Tahoma", Font.ITALIC, 12));
        txtMatKhau = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        btnDangNhap = new javax.swing.JButton();
        btnDangNhap.setIcon(new ImageIcon(DangNhap.class.getResource("/icon/user-male-edit-icon.png")));
        btnDangNhap.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnThoat = new javax.swing.JButton();
        btnThoat.setIcon(new ImageIcon(DangNhap.class.getResource("/icon/exit.png")));
        btnThoat.setFont(new Font("Tahoma", Font.BOLD, 12));

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel1.setFont(new Font("Tahoma", Font.BOLD, 18)); // NOI18N
        jLabel1.setForeground(java.awt.SystemColor.activeCaption);
       
        jLabel1.setText("  ĐĂNG NHẬP HỆ THỐNG");

       
        lblTenDangNhap.setText("Tên Đăng Nhập :");

     
        lblMatKhau.setText("Mật Khẩu :");

       

        btnDangNhap.setBackground(new Color(0, 153, 255));
        btnDangNhap.setForeground(Color.WHITE);
       
        btnDangNhap.setText("Đăng Nhập");
        btnDangNhap.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDangNhapMouseEntered(evt);
            }
        });
        btnDangNhap.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDangNhapActionPerformed(evt);
            }
        });

        btnThoat.setBackground(new Color(0, 153, 255));
        btnThoat.setForeground(new java.awt.Color(255, 255, 255));

        btnThoat.setText("Thoát");
        btnThoat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {

                setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
                int kQ = JOptionPane.showConfirmDialog(null,
                        "Bạn có muốn thoát chương trình không ?","Cảnh báo !",JOptionPane.YES_NO_OPTION);
                if(kQ == 0){
                
                    System.exit(0);
                }
                else{
                   
                }
            	
            	
            }
        });
        
        label12 = new JLabel("");
        label12.setIcon(new ImageIcon(DangNhap.class.getResource("/icon/B.JPG"))); 
        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addComponent(jLabel1)
        					.addPreferredGap(ComponentPlacement.RELATED, 460, Short.MAX_VALUE)
        					.addComponent(jLabel2))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(label12)
        					.addGap(18)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblTenDangNhap)
        						.addComponent(lblMatKhau)
        						.addComponent(btnDangNhap, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING, false)
        							.addComponent(txtTenDangNhap)
        							.addComponent(txtMatKhau, GroupLayout.PREFERRED_SIZE, 181, GroupLayout.PREFERRED_SIZE))
        						.addComponent(btnThoat, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE))))
        			.addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addComponent(jLabel1)
        				.addComponent(jLabel2))
        			.addGroup(jPanel1Layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblTenDangNhap)
        						.addComponent(txtTenDangNhap, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(18)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(lblMatKhau)
        						.addComponent(txtMatKhau, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        					.addGap(92)
        					.addGroup(jPanel1Layout.createParallelGroup(Alignment.BASELINE)
        						.addComponent(btnThoat, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        						.addComponent(btnDangNhap, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE))
        					.addGap(63))
        				.addGroup(jPanel1Layout.createSequentialGroup()
        					.addGap(42)
        					.addComponent(label12)
        					.addContainerGap())))
        );
        jPanel1.setLayout(jPanel1Layout);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 596, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

 

    @SuppressWarnings("deprecation")
	private void btnDangNhapActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDangNhapActionPerformed
        
      
        
       
        //-------------------------------------------------------------------------------
        String tenDangNhap = txtTenDangNhap.getText().trim();
        String matKhau = String.valueOf(txtMatKhau.getPassword()).trim();
        if(kiemTra(tenDangNhap,matKhau)){
            try{
                Thread.sleep(2000);
            }
            catch (InterruptedException ex) {
                System.out.println(ex.toString());
            }
            Main.thongBao("Đăng Nhập Thành Công", "Thông Báo", 1);
            SinhVien frmql = new SinhVien();
            frmql.show();
            this.dispose();                
        }
        else if("".equals(txtTenDangNhap.getText())){           
            Main.thongBao("Tên đăng nhập không được bỏ trống", "Thông Báo", 1);
            txtTenDangNhap.requestFocus();
        }
        else if("".equals(txtMatKhau.getText())){
            Main.thongBao("Mật khẩu không được bỏ trống", "Thông Báo", 1);
            txtMatKhau.requestFocus();
        }
        else{
            Main.thongBao("Bạn nhập sai tài khoản hoặc mật khẩu", "Thông Báo", 1);
        }
    }//GEN-LAST:event_btnDangNhapActionPerformed
    
    public static int Quyen = 0;
    
    private boolean kiemTra(String tenDangNhap, String matKhau){
        boolean ketQua = false;
        String cauTruyVan = "select * from USERR where UserId = '"+tenDangNhap+"' "
                + "and PasswordID = '"+matKhau+"'";
        ResultSet rs = Main.connection.ExcuteQueryGetTable(cauTruyVan);
        try{
            if(rs.next()){
                ketQua = true;
                Quyen = rs.getInt("RoleID");
            }
        }
        catch (Exception e) {
            System.out.println("");
        }
        return ketQua;
    }
    
    
    
    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        // TODO add your handling code here:
        confirm();
    }//GEN-LAST:event_formWindowClosing

    private void btnDangNhapMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDangNhapMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnDangNhapMouseEntered
    public void confirm(){
      
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        int kQ = JOptionPane.showConfirmDialog(null,
                "Bạn có muốn thoát chương trình không ?","Cảnh báo !",JOptionPane.YES_NO_OPTION);
        if(kQ == 0){
        
            System.exit(0);
        }
        else{
           
        }
    }
    
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DangNhap.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DangNhap().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnThoat;
    private javax.swing.JButton btnDangNhap;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lblMatKhau;
    private javax.swing.JLabel lblTenDangNhap;
    private javax.swing.JPasswordField txtMatKhau;
    private javax.swing.JTextField txtTenDangNhap;
    private JLabel label12;
    // End of variables declaration//GEN-END:variables
}
