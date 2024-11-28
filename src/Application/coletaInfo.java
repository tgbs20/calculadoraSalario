
package Application;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class coletaInfo extends javax.swing.JFrame {


    public coletaInfo() {
        initComponents();
        this.setResizable(false); // Impede o redimensionamento
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel jPanel1 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel1 = new javax.swing.JLabel();
        javax.swing.JPanel jPanel2 = new javax.swing.JPanel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        tfHoras = new javax.swing.JTextField();
        tfDias = new javax.swing.JTextField();
        javax.swing.JButton btnAdd = new javax.swing.JButton();
        javax.swing.JButton btnCalc = new javax.swing.JButton();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        comboBox = new javax.swing.JComboBox<>();
        javax.swing.JButton btnDelete = new javax.swing.JButton();
        javax.swing.JScrollPane jScrollPane1 = new javax.swing.JScrollPane();
        tableFuncionarios = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Dashboard");
        setMinimumSize(new java.awt.Dimension(1071, 642));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(51, 153, 255));

        jLabel1.setBackground(new java.awt.Color(51, 153, 255));
        jLabel1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Elizandra M\\Downloads\\calculadora (1).png")); // NOI18N
        jLabel1.setText("Calculadora de Salário");
        jLabel1.setIconTextGap(10);

        jPanel2.setBackground(new java.awt.Color(51, 153, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Digite as informações necessárias:", javax.swing.border.TitledBorder.CENTER, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Dialog", 1, 18), new java.awt.Color(255, 255, 255))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nome do funcionário:");

        tfName.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Horas trabalhadas por dia (sem hora extra):");

        tfHoras.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tfHoras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfHorasActionPerformed(evt);
            }
        });

        tfDias.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        tfDias.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfDiasActionPerformed(evt);
            }
        });

        btnAdd.setBackground(new java.awt.Color(255, 255, 255));
        btnAdd.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Application/botao-adicionar.png"))); // NOI18N
        btnAdd.setText("Adicionar funcionário");
        btnAdd.setIconTextGap(10);
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        btnCalc.setBackground(new java.awt.Color(255, 255, 255));
        btnCalc.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        btnCalc.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Application/despesas.png"))); // NOI18N
        btnCalc.setText("Calcular salário");
        btnCalc.setIconTextGap(10);
        btnCalc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCalcActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Dias trabalhados:");

        jLabel4.setFont(new java.awt.Font("Dialog", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Selecione o mês:");

        comboBox.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        comboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Janeiro", "Fevereiro", "Março", "Abril", "Maio", "Junho", "Julho", "Agosto", "Setembro", "Outubro", "Novembro", "Dezembro", " " }));
        comboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfName)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tfHoras)
                    .addComponent(tfDias)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(22, 22, 22))
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(btnAdd)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(44, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(comboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfHoras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tfDias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCalc, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        btnDelete.setBackground(new java.awt.Color(255, 255, 255));
        btnDelete.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Application/trash.png"))); // NOI18N
        btnDelete.setText("Delete");
        btnDelete.setIconTextGap(10);
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jScrollPane1.setBackground(new java.awt.Color(255, 255, 255));

        tableFuncionarios.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        tableFuncionarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Horas trabalhadas", "Dias trabalhados", "Mês"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableFuncionarios.setGridColor(new java.awt.Color(204, 204, 204));
        tableFuncionarios.setSelectionBackground(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tableFuncionarios);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(99, 99, 99)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 14, Short.MAX_VALUE))
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel1)
                .addGap(72, 72, 72)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tfHorasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfHorasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfHorasActionPerformed

    private void tfDiasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfDiasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfDiasActionPerformed

    @SuppressWarnings("empty-statement")
    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        String name = tfName.getText();
        String horas = tfHoras.getText();
        String dias = tfDias.getText();
        String mes = (String) comboBox.getSelectedItem();
        if (name.isEmpty() || horas.isEmpty() || dias.isEmpty() || mes.isEmpty()) {
            JOptionPane.showMessageDialog(this,
                    "Por favor, preencha todos os campos",
                    "Tente novamente",
                    JOptionPane.ERROR_MESSAGE);
        }
        
        else {
            DefaultTableModel model = (DefaultTableModel) tableFuncionarios.getModel();
            model.addRow (new Object [] {name, horas, dias,mes } );
            
            tfName.setText("");
            tfHoras.setText("");    
            tfDias.setText("");

        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
      int row = tableFuncionarios.getSelectedRow();
      
      if (row < 0) {
          JOptionPane.showMessageDialog(this,
                  "Nenhum funcionário  foi selecionado",
                  "Selecione uma linha",
                  JOptionPane.ERROR_MESSAGE);
      }

      else {
          DefaultTableModel model = (DefaultTableModel) tableFuncionarios.getModel();
          model.removeRow (row);
          JOptionPane.showMessageDialog(this,
                "Funcionário removido com sucesso.",
                "Sucesso",
                JOptionPane.INFORMATION_MESSAGE);
      }
    }//GEN-LAST:event_btnDeleteActionPerformed


    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        DefaultTableModel model = (DefaultTableModel) tableFuncionarios.getModel();
        Vector < Vector > tableData = model.getDataVector();
        
        try {
            FileOutputStream file = new FileOutputStream ("file.bin");
            ObjectOutputStream output = new ObjectOutputStream (file);
            
            output.writeObject(tableData);
            
            output.close();
            file.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_formWindowClosing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        try {
            FileInputStream file = new FileInputStream ("file.bin");
            ObjectInputStream input = new ObjectInputStream (file);
            
                Vector < Vector  > tableData = (Vector < Vector >) input.readObject();
                
                input.close();
                file.close();
                
                DefaultTableModel model = (DefaultTableModel) tableFuncionarios.getModel();
                for (int i = 0; i< tableData.size(); i++) {
                    Vector row = tableData.get(i);
                    model.addRow (new Object [] {row.get(0), row.get(1), row.get(2), row.get(3) } );
                }
                 } catch (Exception ex) {
                ex.printStackTrace();
            }
    }//GEN-LAST:event_formWindowOpened

    private void btnCalcActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCalcActionPerformed
   this.dispose();
        try {
        // Cria a instância da telaExibir
        exibirInfo telaExibir = new exibirInfo();
        
        // Obtém os dados de todos os funcionários na tabela original
        DefaultTableModel model = (DefaultTableModel) tableFuncionarios.getModel();
        int rowCount = model.getRowCount();

        for (int i = 0; i < rowCount; i++) {
            String nome = model.getValueAt(i, 0).toString();
            double horas = Double.parseDouble(model.getValueAt(i, 1).toString());
            int dias = Integer.parseInt(model.getValueAt(i, 2).toString());
            String mes = model.getValueAt(i, 3).toString();
            
            double salario = horas * dias * 23.83;
                String texto = String.format("%.2f", salario);
            
            // Passa os dados para a telaExibir
            telaExibir.adicionarInformacao(nome, texto, mes); // Adiciona os dados na tabela da nova tela
        }

        // Exibe a nova tela
        telaExibir.setVisible(true);
    } catch (Exception e) {
        JOptionPane.showMessageDialog(this, "Erro ao exibir os salários. Verifique os dados inseridos.", "Erro", JOptionPane.ERROR_MESSAGE);
    }
                                          
    }//GEN-LAST:event_btnCalcActionPerformed

    private void comboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxActionPerformed

    }//GEN-LAST:event_comboBoxActionPerformed



public static void main (String[] args) {
    java.awt.EventQueue.invokeLater (new Runnable () {
        @Override
        public void run() {
                new coletaInfo () .setVisible(true);
        }
    });

}

  

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBox;
    private javax.swing.JTable tableFuncionarios;
    private javax.swing.JTextField tfDias;
    private javax.swing.JTextField tfHoras;
    private javax.swing.JTextField tfName;
    // End of variables declaration//GEN-END:variables
 
}