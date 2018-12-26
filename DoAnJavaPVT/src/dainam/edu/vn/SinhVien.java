package dainam.edu.vn;


import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.GroupLayout;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.event.MenuKeyListener;
import javax.swing.event.MenuKeyEvent;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JComboBox;
import javax.swing.SwingConstants;


@SuppressWarnings("serial")
public class SinhVien extends javax.swing.JFrame {

   
    public SinhVien() {
    	setTitle("PHẦN MỀM QUẢN LÝ SINH VIÊN - PHẠM VĂN THƯƠNG- Mọi thắc mắc, góp ý vui lòng liên hệ trong mục hỗ trợ . !                                                              Dainam.edu.vn");
    	getContentPane().setBackground(Color.WHITE);
    	
    	menuBar = new JMenuBar();
    	setJMenuBar(menuBar);
    	
    	mnMenu = new JMenu("Menu");
    	mnMenu.setIcon(new ImageIcon(SinhVien.class.getResource("/icon/hethongsys.png")));
    	menuBar.add(mnMenu);
    	
    	mntmThot = new JMenuItem("Thoát");
    	mntmThot.setIcon(new ImageIcon(SinhVien.class.getResource("/icon/exit.png")));
    	mntmThot.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
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
    	
    	mntmThot.addMenuKeyListener(new MenuKeyListener() {
    		public void menuKeyPressed(MenuKeyEvent arg0) {
    		}
    		public void menuKeyReleased(MenuKeyEvent arg0) {
    		}
    		public void menuKeyTyped(MenuKeyEvent arg0) {
    		}
    	});
    	mnMenu.add(mntmThot);
    	
    	mnBoCo = new JMenu();
    	mnBoCo.setIcon(new ImageIcon(SinhVien.class.getResource("/icon/user-male-edit-icon.png")));
    	mnBoCo.setText("Báo Cáo");
    	menuBar.add(mnBoCo);
    	
    	mntmDsSinhVin = new JMenuItem();
    	mntmDsSinhVin.addActionListener(new ActionListener() {
    		public void actionPerformed(ActionEvent arg0) {
    			
    		
    			
    		}
    	});
    	mntmDsSinhVin.setIcon(new ImageIcon(SinhVien.class.getResource("/icon/hethongsys.png")));
    	mntmDsSinhVin.setText("Ds Sinh Viên");
    	mnBoCo.add(mntmDsSinhVin);
    	
    	menuItem_1 = new JMenuItem();
    	menuItem_1.setIcon(new ImageIcon(SinhVien.class.getResource("/icon/pencil-red-icon.png")));
    	menuItem_1.setText("Xuất thông tin");
    	mnBoCo.add(menuItem_1);
    	
    	mnHTr = new JMenu();
    	mnHTr.setHorizontalAlignment(SwingConstants.RIGHT);
    	mnHTr.setIcon(new ImageIcon(SinhVien.class.getResource("/icon/iconfinder_Phone_3336937.png")));
    	mnHTr.setText("Hỗ Trợ");
    	menuBar.add(mnHTr);
    	
    	mntmLinH = new JMenuItem();
    	mntmLinH.setIcon(new ImageIcon(SinhVien.class.getResource("/icon/iconfinder_19_330401.png")));
    	mntmLinH.addActionListener(new ActionListener() {
    		@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
    			 LienHe frmql = new LienHe();
                 frmql.show();
                
                 
    		}
    	});
    	mntmLinH.setText("Liên Hệ");
    	mnHTr.add(mntmLinH);
        initComponents();
        menuItem_1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
            	menuItem_1ActionPerformed(evt);
            	
            	
                               
            	 
            }
        });
    }
   
    private void menuItem_1ActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
        
        File file= null;

        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Chọn thư mục lưu file");

        int userSelection = fileChooser.showSaveDialog(null);

        if (userSelection == JFileChooser.APPROVE_OPTION) {
             file = fileChooser.getSelectedFile();

        }

        try {

            if( ! file.exists())
            {
                file.createNewFile() ;
            }
            FileWriter fw = new FileWriter(file.getAbsoluteFile()) ;
            BufferedWriter bw = new BufferedWriter(fw) ;
            bw.write("\n\n ===========       DANH SÁCH SINH VIÊN      =========== \n\n ");
            bw.write("\n Mã SV ||   Họ Tên   ||  Ngày Sinh || Giới Tính || Lớp || Quê Quán || \n\n ");
            for(int i = 0 ; i < tblSinhVien.getRowCount() ; i++)
            {
                for( int j = 0 ; j < tblSinhVien.getColumnCount() ; j++)
                {
                    bw.write(tblSinhVien.getModel().getValueAt(i, j) + "  " );
                
                }
                bw.write("\n\n ------------------------------------ \n\n ");
             
            }
            bw.close() ;
            fw.close(); 
            JOptionPane.showMessageDialog(null, " Xuất dữ liệu thành công . ");
        } catch (Exception e) {
            e.printStackTrace(); 
            
        }
       
    }             

   
    @SuppressWarnings({ "unchecked", "rawtypes" })
   
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        pnlform = new javax.swing.JPanel();
        pnlform.setBackground(new Color(204, 204, 255));
        lblMaSV = new javax.swing.JLabel();
        txtMaSV = new javax.swing.JTextField();
        lblName = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtName.setToolTipText("");
        btnThem = new javax.swing.JButton();
        btnThem.setIcon(new ImageIcon(SinhVien.class.getResource("/icon/Button-Add-icon.png")));
        btnThem.setForeground(Color.WHITE);
        btnThem.setBackground(new Color(0, 153, 255));
        btnThem.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnXoa = new javax.swing.JButton();
        btnXoa.setIcon(new ImageIcon(SinhVien.class.getResource("/icon/Delete-icon.png")));
        btnXoa.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnXoa.setBackground(new Color(0, 153, 255));
        btnXoa.setForeground(Color.WHITE);
        btnSua = new javax.swing.JButton();
        btnSua.setIcon(new ImageIcon(SinhVien.class.getResource("/icon/pencil-red-icon.png")));
        btnSua.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnSua.setBackground(new Color(0, 153, 255));
        btnSua.setForeground(Color.WHITE);
        btnTaoMoi = new javax.swing.JButton();
        btnTaoMoi.setIcon(new ImageIcon(SinhVien.class.getResource("/icon/refresh-icon.png")));
        btnTaoMoi.setFont(new Font("Tahoma", Font.BOLD, 12));
        btnTaoMoi.setBackground(new Color(0, 153, 255));
        btnTaoMoi.setForeground(Color.WHITE);
        lblTimKiem = new javax.swing.JLabel();
        lblTimKiem.setIcon(new ImageIcon(SinhVien.class.getResource("/icon/timkiem.png")));
        lblTimKiem.setFont(new Font("Tahoma", Font.BOLD, 12));
        txtTimKiem = new javax.swing.JTextField();
        lblGioiTinh = new javax.swing.JLabel();
        lblQuequan = new javax.swing.JLabel();
        lblNgaySinh = new javax.swing.JLabel();
        lblLop = new javax.swing.JLabel();
        txtNgaySinh = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        rdbNam = new javax.swing.JRadioButton();
        rdbNu = new javax.swing.JRadioButton();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblSinhVien = new javax.swing.JTable();
        tblSinhVien.setBackground(new Color(255, 255, 204));
     

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        pnlform.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        lblMaSV.setText("Mã Sinh Viên :");

        lblName.setText("Tên Sinh Viên :");

       
        btnThem.setText("Thêm");
        btnThem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnThemActionPerformed(evt);
            }
        });
        
       
        btnXoa.setText("Xóa");
        btnXoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnXoaActionPerformed(evt);
            }
        });

       
        btnSua.setText("Sửa");
        btnSua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSuaActionPerformed(evt);
            }
        });

       
        btnTaoMoi.setText("Làm Mới");
        btnTaoMoi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTaoMoiActionPerformed(evt);
            }
        });

       
        lblTimKiem.setText("Search: ");

        txtTimKiem.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtTimKiemKeyReleased(evt);
            }
        });

        lblGioiTinh.setText("Giới Tính :");

        lblQuequan.setText("Quê Quán :");

        lblNgaySinh.setText("Ngày Sinh :");

        lblLop.setText("Lớp :");

        

        buttonGroup1.add(rdbNam);
        rdbNam.setText("Nam");

        buttonGroup1.add(rdbNu);
        rdbNu.setText("Nữ");
        
        lblNhpM = new JLabel();
        lblNhpM.setText("( : Nhập mã Sinh viên hoặc tên Sinh viên cần tìm . )");
        lblNhpM.setFont(new Font("Tahoma", Font.ITALIC, 11));
        
        String[] Lop = {"CNTT 09-01","CNTT 09-02"};
        
        cbxLop = new JComboBox(Lop);
        String[] que = { 
        		"Hồ Chí Minh"
        		,"Hà Nội"
        		,"Hà Tây"
        		,"Hải Phòng"
        		,"Đà Nẵng"
        		,"Cần Thơ"
        		,"Phú Yên"
        		,"Yên Bái"
        		,"Vĩnh Phúc"
        		,"Vĩnh Long"
        		,"Tuyên Quang"
        		,"Trà Vinh"
        		,"Tiền Giang"
        		,"Thừa Thiên Huế"
        		,"Thanh Hóa"
        		,"Thái Nguyên"
        		,"Thái Bình"
        		,"Tây Ninh"
        		,"Sơn La"
        		,"Sóc Trăng"
        		,"Quảng Trị"
        		,"Quảng Ninh"
        		,"Quảng Ngãi"
        		,"Quảng Nam"
        		,"Quảng Bình"
        		,"Phú Thọ"
        		,"Ninh Thuận"
        		,"Ninh Bình"
        		,"Nghệ An"
        		,"Nam Định"
        		,"Long An"
        		,"Lào Cai"
        		,"Lạng Sơn"
        		,"Lâm Đồng"
        		,"Lai Châu"
        		,"Kon Tum"
        		,"Kiên Giang"
        		,"Khánh Hòa"
        		,"Hưng Yên"
        		,"Hòa Bình"
        		,"Hậu Giang"
        		,"Hải Dương"
        		,"Hà Tĩnh"
        		,"Hà Nam"
        		,"Hà Giang"
        		,"Gia Lai"
        		,"Đồng Tháp"
        		,"Đồng Nai"
        		,"Điện Biên"
        		,"Đắk Nông"
        		,"Đắk Lắk"
        		,"Cao Bằng"
        		,"Cà Mau"
        		,"Bình Thuận"
        		,"Bình Phước"
        		,"Bình Dương"
        		,"Bình Định"
        		,"Bến Tre"
        		,"Bắc Ninh"
        		,"Bạc Liêu"
        		,"Bắc Kạn"
        		,"Bắc Giang"
        		,"Bà Rịa - Vũng Tàu"
        		,"An Giang"
        };
        cbxQue = new JComboBox(que);
      

        javax.swing.GroupLayout pnlformLayout = new javax.swing.GroupLayout(pnlform);
        pnlformLayout.setHorizontalGroup(
        	pnlformLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(pnlformLayout.createSequentialGroup()
        			.addGap(20)
        			.addGroup(pnlformLayout.createParallelGroup(Alignment.TRAILING)
        				.addGroup(pnlformLayout.createSequentialGroup()
        					.addComponent(lblTimKiem)
        					.addGap(18))
        				.addGroup(pnlformLayout.createSequentialGroup()
        					.addGroup(pnlformLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(lblName)
        						.addComponent(lblMaSV))
        					.addPreferredGap(ComponentPlacement.RELATED)))
        			.addGroup(pnlformLayout.createParallelGroup(Alignment.LEADING)
        				.addGroup(pnlformLayout.createSequentialGroup()
        					.addGroup(pnlformLayout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(pnlformLayout.createSequentialGroup()
        							.addComponent(btnThem, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
        							.addComponent(btnSua, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE))
        						.addGroup(pnlformLayout.createSequentialGroup()
        							.addGap(45)
        							.addGroup(pnlformLayout.createParallelGroup(Alignment.TRAILING)
        								.addComponent(txtName, 134, 134, 134)
        								.addComponent(txtMaSV, GroupLayout.PREFERRED_SIZE, 134, GroupLayout.PREFERRED_SIZE))
        							.addPreferredGap(ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
        							.addGroup(pnlformLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(lblNgaySinh, Alignment.TRAILING)
        								.addComponent(lblGioiTinh, Alignment.TRAILING))
        							.addGap(34)))
        					.addGap(37))
        				.addComponent(txtTimKiem, 309, 309, 309))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(pnlformLayout.createParallelGroup(Alignment.TRAILING)
        				.addComponent(jLabel2)
        				.addGroup(pnlformLayout.createSequentialGroup()
        					.addGroup(pnlformLayout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(pnlformLayout.createSequentialGroup()
        							.addGroup(pnlformLayout.createParallelGroup(Alignment.TRAILING)
        								.addGroup(pnlformLayout.createSequentialGroup()
        									.addGroup(pnlformLayout.createParallelGroup(Alignment.LEADING, false)
        										.addGroup(pnlformLayout.createSequentialGroup()
        											.addComponent(rdbNam)
        											.addPreferredGap(ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        											.addComponent(rdbNu))
        										.addComponent(txtNgaySinh, GroupLayout.PREFERRED_SIZE, 132, GroupLayout.PREFERRED_SIZE))
        									.addGap(116)
        									.addGroup(pnlformLayout.createParallelGroup(Alignment.TRAILING)
        										.addComponent(lblQuequan)
        										.addComponent(lblLop)))
        								.addComponent(lblNhpM, GroupLayout.PREFERRED_SIZE, 306, GroupLayout.PREFERRED_SIZE))
        							.addGap(68))
        						.addGroup(pnlformLayout.createSequentialGroup()
        							.addComponent(btnXoa, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        							.addGap(76)))
        					.addGroup(pnlformLayout.createParallelGroup(Alignment.LEADING)
        						.addComponent(btnTaoMoi, GroupLayout.PREFERRED_SIZE, 120, GroupLayout.PREFERRED_SIZE)
        						.addGroup(pnlformLayout.createSequentialGroup()
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(pnlformLayout.createParallelGroup(Alignment.LEADING)
        								.addComponent(cbxQue, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE)
        								.addComponent(cbxLop, GroupLayout.PREFERRED_SIZE, 140, GroupLayout.PREFERRED_SIZE))))
        					.addGap(64)))
        			.addContainerGap())
        );
        pnlformLayout.setVerticalGroup(
        	pnlformLayout.createParallelGroup(Alignment.LEADING)
        		.addGroup(pnlformLayout.createSequentialGroup()
        			.addComponent(jLabel2)
        			.addGap(40)
        			.addGroup(pnlformLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblMaSV)
        				.addComponent(txtMaSV, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtNgaySinh, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblNgaySinh)
        				.addComponent(cbxLop, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblLop))
        			.addGap(48)
        			.addGroup(pnlformLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(rdbNam)
        				.addComponent(lblGioiTinh)
        				.addComponent(rdbNu)
        				.addComponent(lblQuequan)
        				.addComponent(txtName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblName)
        				.addComponent(cbxQue, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
        			.addGap(63)
        			.addGroup(pnlformLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(btnThem, GroupLayout.PREFERRED_SIZE, 41, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnTaoMoi, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnSua, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
        				.addComponent(btnXoa, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE))
        			.addGap(47)
        			.addGroup(pnlformLayout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblTimKiem, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        				.addComponent(lblNhpM, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
        				.addComponent(txtTimKiem, GroupLayout.PREFERRED_SIZE, 30, GroupLayout.PREFERRED_SIZE))
        			.addContainerGap(23, Short.MAX_VALUE))
        );
        pnlform.setLayout(pnlformLayout);

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        tblSinhVien.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tblSinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Mã Sinh Viên", "Họ Tên", "Ngày Sinh",  "Giới Tính", "Lớp", "Quê Quán"}
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.Double.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblSinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblSinhVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblSinhVien);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1Layout.setHorizontalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 1019, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
        	jPanel1Layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(jPanel1Layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jScrollPane1, GroupLayout.PREFERRED_SIZE, 219, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1.setLayout(jPanel1Layout);
        
        label = new JLabel();
        label.setText("QUẢN LÝ SINH VIÊN");
        label.setForeground(new Color(20, 0, 102));
        label.setFont(new Font("Tahoma", Font.BOLD, 18));
        
        lblNewLabel = new JLabel("Danh Sách Sinh Viên");
        lblNewLabel.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 11));
        lblNewLabel.setForeground(new Color(0, 51, 255));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.TRAILING)
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, 1074, Short.MAX_VALUE)
        			.addContainerGap())
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addGap(20)
        			.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(949, Short.MAX_VALUE))
        		.addGroup(Alignment.LEADING, layout.createSequentialGroup()
        			.addContainerGap()
        			.addComponent(pnlform, GroupLayout.DEFAULT_SIZE, 1074, Short.MAX_VALUE)
        			.addContainerGap())
        		.addGroup(layout.createSequentialGroup()
        			.addContainerGap(434, Short.MAX_VALUE)
        			.addComponent(label, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
        			.addGap(424))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addComponent(label, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(pnlform, GroupLayout.PREFERRED_SIZE, 353, GroupLayout.PREFERRED_SIZE)
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(lblNewLabel)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(jPanel1, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE)
        			.addContainerGap(33, Short.MAX_VALUE))
        );
        getContentPane().setLayout(layout);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        LayDuLieu();
    }//GEN-LAST:event_formWindowOpened

    private void tblSinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblSinhVienMouseClicked
        // TODO add your handling code here:
       
        int index = tblSinhVien.getSelectedRow();
        txtMaSV.setText(tblSinhVien.getValueAt(index, 0).toString());
        txtName.setText(tblSinhVien.getValueAt(index, 1).toString());
        txtNgaySinh.setText(tblSinhVien.getValueAt(index, 2).toString());
       
        if(tblSinhVien.getValueAt(index, 3).equals("Nam")){
            rdbNam.setSelected(true);
        }
        else{
            rdbNu.setSelected(true);
        }
        
       
        cbxLop.setToolTipText(tblSinhVien.getValueAt(index, 4).toString());
        cbxQue.setToolTipText(tblSinhVien.getValueAt(index, 5).toString());
      
    }//GEN-LAST:event_tblSinhVienMouseClicked

    private void btnThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnThemActionPerformed
        // TODO add your handling code here:
 
        String maSinhVien,tenSinhVien,ngaySinh,gioiTinh,que,lop;

		

		
        tenSinhVien = txtName.getText();
        maSinhVien=txtMaSV.getText();
        ngaySinh = txtNgaySinh.getText();
      
       
        
      
        if(rdbNam.isSelected()){
            gioiTinh = "1";
        }
        else{
            gioiTinh = "0";
        }
      lop=cbxLop.getSelectedItem().toString();
    
        que = cbxQue.getSelectedItem().toString();
        
        
        String SQL = "insert into SINHVIEN(MaSV,Name,NgaySinh,GioiTinh,Lop,QueQuan)"
                + " values(N'"+maSinhVien+"','"+tenSinhVien+"',N'"+ngaySinh+"',"+gioiTinh+","
                + "N'"+lop+"','"+que+"')";
        
        Main.connection.ExcuteQueryUpdateDB(SQL);
        JOptionPane.showMessageDialog(this, " Thêm thông tin thành công ! ");
        LayDuLieu();
    }//GEN-LAST:event_btnThemActionPerformed

    private void btnXoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnXoaActionPerformed
        // TODO add your handling code here:
       
        int[] index = tblSinhVien.getSelectedRows();
        for(int i = 0; i < index.length; i++){
            String indexDelete = tblSinhVien.getValueAt(index[i], 0).toString();
            String SQL = "delete from SINHVIEN where MaSV = "+indexDelete;
            Main.connection.ExcuteQueryUpdateDB(SQL);
            JOptionPane.showMessageDialog(this, " Xóa thành công ! ");
          
        }
        LayDuLieu();
    }//GEN-LAST:event_btnXoaActionPerformed

    private void btnSuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSuaActionPerformed
        // TODO add your handling code here:
       
        String maSinhVien,tenSinhVien,ngaySinh,gioiTinh,lop,que;
       
        
        maSinhVien = txtMaSV.getText();
        tenSinhVien = txtName.getText();
        ngaySinh = txtNgaySinh.getText();
       
        if(rdbNam.isSelected()){
            gioiTinh = "1";
        }
        else{
            gioiTinh = "0";
        }
        lop=cbxLop.getSelectedItem().toString();
        
        que = cbxQue.getSelectedItem().toString();
        
       
        
      
        String SQL = "update SINHVIEN set Name = N'"+tenSinhVien+"' , "
        		 + "GioiTinh = "+gioiTinh+" , Lop = N'"+lop+"' ,"
                 + " NgaySinh = '"+ngaySinh+"' , QueQuan = '"+que+"'"
                 + " where MaSV = "+maSinhVien;
        Main.connection.ExcuteQueryUpdateDB(SQL);
        JOptionPane.showMessageDialog(this, " Sửa thành công ! ");
        LayDuLieu();        
    }//GEN-LAST:event_btnSuaActionPerformed

    private void btnTaoMoiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTaoMoiActionPerformed
        // TODO add your handling code here:
        
        txtMaSV.setText("");
        txtName.setText("");
      
        cbxLop.setToolTipText("");
        rdbNam.setSelected(true);
        cbxQue.setToolTipText("");
        txtNgaySinh.setText("");
       
    }//GEN-LAST:event_btnTaoMoiActionPerformed

    private void txtTimKiemKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtTimKiemKeyReleased
        // TODO add your handling code here:
      
        String keySearch = txtTimKiem.getText();
        String SQL = "select * from SINHVIEN where "
                + "MaSV like N'%"+keySearch+"%' or Name like N'%"+keySearch+"%' ";
             
        ResultSet rs = Main.connection.ExcuteQueryGetTable(SQL);
        Object[] obj = new Object[]{"Mã Sinh Viên", "Họ Tên", "Ngày Sinh",  "Giới Tính", "Lớp", "Quê Quán"};
        DefaultTableModel tableModel = new DefaultTableModel(obj,0);
        tblSinhVien.setModel(tableModel);
        try{
            while(rs.next()){
                Object[] item = new Object[7];
                item[0] = rs.getInt("MaSV");
              
                item[1] = rs.getString("Name");
                item[2] = rs.getDate("NgaySinh");
                
                if(rs.getInt("GioiTinh") == 1){
                    item[3] = "Nam";
                }
                else{
                    item[3] = "Nữ";
                }
                item[4] = rs.getString("Lop");
                item[5] = rs.getString("QueQuan");
            
                
               
                tableModel.addRow(item);
            }
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }//GEN-LAST:event_txtTimKiemKeyReleased
    private void LayDuLieu(){
        String SQL = "select * from SINHVIEN";
        ResultSet rs = Main.connection.ExcuteQueryGetTable(SQL);
        Object[] obj = new Object[]{"Mã Sinh Viên", "Họ Tên", "Ngày Sinh",  "Giới Tính", "Lớp", "Quê Quán"};
        DefaultTableModel tableModel = new DefaultTableModel(obj,0);
        tblSinhVien.setModel(tableModel);
        try{
            while(rs.next()){
            	Object[] item = new Object[7];
                item[0] = rs.getInt("MaSV");
              
                item[1] = rs.getString("Name");
                item[2] = rs.getDate("NgaySinh");
                
                if(rs.getInt("GioiTinh") == 1){
                    item[3] = "Nam";
                }
                else{
                    item[3] = "Nữ";
                }
                item[4] = rs.getString("Lop");
                item[5] = rs.getString("QueQuan");
               
                
               
                tableModel.addRow(item);
            
            }
        }
        catch (Exception e) {
            System.out.println(e.toString());
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
       
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SinhVien.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SinhVien().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSua;
    private javax.swing.JButton btnTaoMoi;
    private javax.swing.JButton btnThem;
    private javax.swing.JButton btnXoa;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblQuequan;
    private javax.swing.JLabel lblGioiTinh;
    private javax.swing.JLabel lblMaSV;
    private javax.swing.JLabel lblNgaySinh;
    private javax.swing.JLabel lblLop;
    private javax.swing.JLabel lblName;
    private javax.swing.JLabel lblTimKiem;
    private javax.swing.JPanel pnlform;
    private javax.swing.JRadioButton rdbNam;
    private javax.swing.JRadioButton rdbNu;
    private javax.swing.JTable tblSinhVien;
    private javax.swing.JTextField txtMaSV;
    private javax.swing.JTextField txtNgaySinh;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtTimKiem;
    private JLabel label;
    private JMenuBar menuBar;
    private JMenu mnMenu;
    private JMenuItem mntmThot;
    private JLabel lblNhpM;
    private JLabel lblNewLabel;
    private JMenu mnBoCo;
    private JMenuItem mntmDsSinhVin;
    private JMenuItem menuItem_1;
    @SuppressWarnings("rawtypes")
	private JComboBox cbxLop;
    @SuppressWarnings("rawtypes")
	private JComboBox cbxQue;
    private JMenu mnHTr;
    private JMenuItem mntmLinH;
}
