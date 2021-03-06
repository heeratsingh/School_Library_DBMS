import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pranshu Pranjal
 */
public class Publisher_Master extends javax.swing.JFrame {

    /**
     * Creates new form Publisher_Master
     */
    public Publisher_Master() {
        initComponents();
        String s=new java.util.Date().toString();
       Date.setText(s.substring(8,10)+" "+s.substring(4,7)+" "+s.substring(24,28));
       albus();
    }
    public void close() {
        WindowEvent winClosingEvent = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(winClosingEvent);
    }

Connection c;
ResultSet rs;
Statement stmt;

private void albus()
            {       
DefaultTableModel model =(DefaultTableModel) jTable1.getModel();   
int rows=model.getRowCount();
if (rows>0)
{  
  for(int i=0;i<rows;i++)
  {
    model.removeRow(0);     
  }
}
try
{
c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","1234");
stmt= c.createStatement();
String query= "select publisher_no,publisher_name from publisher order by publisher_no";
rs=stmt.executeQuery(query);
 while(rs.next())
 {
 model.addRow(new Object [] { rs.getInt(1),rs.getString(2) } );
 }
rs.close();
stmt.close();
c.close();
}
catch(Exception e)
{       
JOptionPane.showMessageDialog(this,"Something doesn't feel right, why don't you try opening the application again ?");
}
            }
private void resetting()
{
jTextField1.setText("");
jTextField2.setText("");
jTable1.clearSelection();
}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        Date = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel11 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jMenuBar1 = new javax.swing.JMenuBar();
        jFile = new javax.swing.JMenu();
        Start_Page = new javax.swing.JMenuItem();
        Log_Out = new javax.swing.JMenuItem();
        Exit = new javax.swing.JMenuItem();
        jMasters = new javax.swing.JMenu();
        jAuthor = new javax.swing.JMenuItem();
        jGenre = new javax.swing.JMenuItem();
        jPublisher = new javax.swing.JMenuItem();
        jStudent = new javax.swing.JMenuItem();
        jBooks = new javax.swing.JMenu();
        jNewBook = new javax.swing.JMenuItem();
        jIssueBooks = new javax.swing.JMenuItem();
        jBookWanted = new javax.swing.JMenuItem();
        jReturnBooks = new javax.swing.JMenuItem();
        jSearch = new javax.swing.JMenu();
        jSAuthor = new javax.swing.JMenuItem();
        jSBook = new javax.swing.JMenuItem();
        jSPublisher = new javax.swing.JMenuItem();
        jSStudent = new javax.swing.JMenuItem();
        jHelp = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Olympus Library");

        jLabel9.setFont(new java.awt.Font("Parchment", 0, 48)); // NOI18N
        jLabel9.setText("The   Olympus   Library ");

        Date.setText("Date");

        jLabel12.setText("Patron :        Athena");

        jLabel11.setText("The Olympus Library");

        jLabel4.setText("© 2017 -2018               All Rights Reserved");

        jLabel1.setText("Publisher :");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, ""},
                {null, ""},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "Publisher_No", "Publisher"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setAutoResizeMode(javax.swing.JTable.AUTO_RESIZE_ALL_COLUMNS);
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Delete");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Update");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel2.setText("Publisher_No :");

        jButton4.setText("Reset");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setText("Note:\n\nPublisherno cannot be updated directly.\nIf you want to update it you must first delete it then create a new one.");
        jTextArea1.setWrapStyleWord(true);
        jTextArea1.setEnabled(false);
        jScrollPane2.setViewportView(jTextArea1);

        jFile.setText("File");

        Start_Page.setText("Start Page");
        Start_Page.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Start_PageActionPerformed(evt);
            }
        });
        jFile.add(Start_Page);

        Log_Out.setText("Log Out");
        Log_Out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Log_OutActionPerformed(evt);
            }
        });
        jFile.add(Log_Out);

        Exit.setText("Exit");
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });
        jFile.add(Exit);

        jMenuBar1.add(jFile);

        jMasters.setText("Masters");

        jAuthor.setText("Author Master");
        jAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jAuthorActionPerformed(evt);
            }
        });
        jMasters.add(jAuthor);

        jGenre.setText("Genre Master");
        jGenre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jGenreActionPerformed(evt);
            }
        });
        jMasters.add(jGenre);

        jPublisher.setText("Publisher Master");
        jPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPublisherActionPerformed(evt);
            }
        });
        jMasters.add(jPublisher);

        jStudent.setText("Student Master");
        jStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jStudentActionPerformed(evt);
            }
        });
        jMasters.add(jStudent);

        jMenuBar1.add(jMasters);

        jBooks.setText("Books");

        jNewBook.setText("Add New Book");
        jNewBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jNewBookActionPerformed(evt);
            }
        });
        jBooks.add(jNewBook);

        jIssueBooks.setText("Issue Books");
        jIssueBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jIssueBooksActionPerformed(evt);
            }
        });
        jBooks.add(jIssueBooks);

        jBookWanted.setText("Remove Book");
        jBookWanted.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBookWantedActionPerformed(evt);
            }
        });
        jBooks.add(jBookWanted);

        jReturnBooks.setText("Return Books");
        jReturnBooks.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jReturnBooksActionPerformed(evt);
            }
        });
        jBooks.add(jReturnBooks);

        jMenuBar1.add(jBooks);

        jSearch.setText("Search");

        jSAuthor.setText("Search Author");
        jSAuthor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSAuthorActionPerformed(evt);
            }
        });
        jSearch.add(jSAuthor);

        jSBook.setText("Search Books");
        jSBook.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSBookActionPerformed(evt);
            }
        });
        jSearch.add(jSBook);

        jSPublisher.setText("Search Publisher");
        jSPublisher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSPublisherActionPerformed(evt);
            }
        });
        jSearch.add(jSPublisher);

        jSStudent.setText("Search Student");
        jSStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jSStudentActionPerformed(evt);
            }
        });
        jSearch.add(jSStudent);

        jMenuBar1.add(jSearch);

        jHelp.setText("Help");

        jMenuItem1.setText("About");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jHelp.add(jMenuItem1);

        jMenuBar1.add(jHelp);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jSeparator2)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addComponent(jLabel12)
                .addGap(414, 414, 414)
                .addComponent(jLabel11)
                .addGap(438, 438, 438)
                .addComponent(jLabel4)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 838, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(242, 242, 242)
                                .addComponent(jButton1)
                                .addGap(67, 67, 67)
                                .addComponent(jButton2)
                                .addGap(81, 81, 81)
                                .addComponent(jButton3)
                                .addGap(79, 79, 79)
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(184, 184, 184)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 558, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(34, 34, 34))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(35, 35, 35)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(1195, Short.MAX_VALUE))
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jSeparator1)
                    .addContainerGap()))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 102, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton1)
                            .addComponent(jButton2)
                            .addComponent(jButton3)
                            .addComponent(jButton4))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(27, 27, 27)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(67, 67, 67)
                    .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(568, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
int p=jTable1.getSelectedRow();
    jTextField1.setText(jTable1.getValueAt(p,0).toString());
    jTextField2.setText(jTable1.getValueAt(p,1).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String publishername=jTextField2.getText();
String publisherno=jTextField1.getText();
try
  {
c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","1234");
stmt= c.createStatement();
String query="insert into publisher values('"+publisherno+"','"+publishername+"');";
stmt.executeUpdate(query);
JOptionPane.showMessageDialog(this,"Data successfully added. Click 'Ok' to continue!!!");
albus();
  }
catch (Exception e)
  {
JOptionPane.showMessageDialog(this,"Something went haywire there, why don't you try again ?");
  }
resetting();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
String publisherno=jTextField1.getText();
int res= JOptionPane.showConfirmDialog(null,"Want to delete the record?");
if(res==JOptionPane.YES_OPTION)
    {
try
 {
c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","1234");
stmt= c.createStatement();
String query="delete from publisher where publisher_no="+publisherno+";";
stmt.executeUpdate(query);
JOptionPane.showMessageDialog(null,"Record Deleted!");
albus();
 }
catch (Exception e)
 {
JOptionPane.showMessageDialog(this,"Something went haywire there, why don't you try again ?");
 }    
    }
resetting();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
String publisherno=jTextField1.getText();
String publishername=jTextField2.getText();
int res= JOptionPane.showConfirmDialog(null,"Want to update the record?");
if(res==JOptionPane.YES_OPTION)
    {
try
 {
c=DriverManager.getConnection("jdbc:mysql://localhost:3306/project","root","1234");
stmt= c.createStatement();
String query="update publisher set publisher_name= '"+publishername+"' where publisher_no='"+publisherno+"';";
stmt.executeUpdate(query);
JOptionPane.showMessageDialog(null,"Record Updated!");
albus();
 }
catch (Exception e)
 {
JOptionPane.showMessageDialog(this,"Something went haywire there, why don't you try again ?");
 }    
    }
resetting();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
resetting();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void Start_PageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Start_PageActionPerformed
        close();
        Home_Screen s= new Home_Screen();
        s.setVisible(true);
    }//GEN-LAST:event_Start_PageActionPerformed

    private void Log_OutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Log_OutActionPerformed
        JOptionPane.showMessageDialog(this,"Please wait a few moments while we tidy up your workstation !!");
        close();
        Security_Screen s= new Security_Screen();
        s.setVisible(true);
    }//GEN-LAST:event_Log_OutActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ExitActionPerformed

    private void jAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jAuthorActionPerformed
        close();
        Author_Master s= new Author_Master();
        s.setVisible(true);
    }//GEN-LAST:event_jAuthorActionPerformed

    private void jGenreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jGenreActionPerformed
        close();
        Genre_Master s= new Genre_Master();
        s.setVisible(true);
    }//GEN-LAST:event_jGenreActionPerformed

    private void jPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPublisherActionPerformed
        close();
        Publisher_Master s= new Publisher_Master();
        s.setVisible(true);
    }//GEN-LAST:event_jPublisherActionPerformed

    private void jStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jStudentActionPerformed

    }//GEN-LAST:event_jStudentActionPerformed

    private void jNewBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jNewBookActionPerformed
        close();
        File_in_a_new_book s= new File_in_a_new_book();
        s.setVisible(true);
    }//GEN-LAST:event_jNewBookActionPerformed

    private void jIssueBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jIssueBooksActionPerformed
        close();
        Book_Issue s= new Book_Issue();
        s.setVisible(true);
    }//GEN-LAST:event_jIssueBooksActionPerformed

    private void jBookWantedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBookWantedActionPerformed
        close();
        Book_Remove s= new Book_Remove();
        s.setVisible(true);
    }//GEN-LAST:event_jBookWantedActionPerformed

    private void jReturnBooksActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jReturnBooksActionPerformed
        close();
        Book_Return s= new Book_Return();
        s.setVisible(true);
    }//GEN-LAST:event_jReturnBooksActionPerformed

    private void jSAuthorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSAuthorActionPerformed
        close();
        Author_Search s= new Author_Search();
        s.setVisible(true);
    }//GEN-LAST:event_jSAuthorActionPerformed

    private void jSBookActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSBookActionPerformed
        close();
        Book_Search s= new Book_Search();
        s.setVisible(true);
    }//GEN-LAST:event_jSBookActionPerformed

    private void jSPublisherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSPublisherActionPerformed
        close();
        Publisher_Search s= new Publisher_Search();
        s.setVisible(true);
    }//GEN-LAST:event_jSPublisherActionPerformed

    private void jSStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jSStudentActionPerformed
        close();
        Student_Search s= new Student_Search();
        s.setVisible(true);
    }//GEN-LAST:event_jSStudentActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        About s= new About();
        s.setVisible(true);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Publisher_Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Publisher_Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Publisher_Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Publisher_Master.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Publisher_Master().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Date;
    private javax.swing.JMenuItem Exit;
    private javax.swing.JMenuItem Log_Out;
    private javax.swing.JMenuItem Start_Page;
    private javax.swing.JMenuItem jAuthor;
    private javax.swing.JMenuItem jBookWanted;
    private javax.swing.JMenu jBooks;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JMenu jFile;
    private javax.swing.JMenuItem jGenre;
    private javax.swing.JMenu jHelp;
    private javax.swing.JMenuItem jIssueBooks;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMasters;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jNewBook;
    private javax.swing.JMenuItem jPublisher;
    private javax.swing.JMenuItem jReturnBooks;
    private javax.swing.JMenuItem jSAuthor;
    private javax.swing.JMenuItem jSBook;
    private javax.swing.JMenuItem jSPublisher;
    private javax.swing.JMenuItem jSStudent;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JMenu jSearch;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JMenuItem jStudent;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
