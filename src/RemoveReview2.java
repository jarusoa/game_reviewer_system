
import java.io.Serializable;
import java.util.ArrayList;
import javax.swing.DefaultListModel;

import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class RemoveReview2 extends javax.swing.JFrame implements ListSelectionListener, Serializable{
    ArrayList<Game> game_list;
    ArrayList<User> user_list;
    int i;
    DefaultListModel dlm = new DefaultListModel();
    
    public RemoveReview2(ArrayList<User> user_list,ArrayList<Game> game_list, int i) {
        this.game_list = game_list;
        this.i = i;
        this.user_list = user_list;
        initComponents();
        
        for(int k = 0; k < game_list.get(i).review_list.size(); k++){
            String name = game_list.get(i).review_list.get(k).getName();
            dlm.addElement(name);
        }
        jList1.addListSelectionListener(this);
    }
                
        

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jList1.setFont(new java.awt.Font("Helvetica Neue", 1, 18)); // NOI18N
        jList1.setModel(dlm);
        jScrollPane1.setViewportView(jList1);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setText("Select a User's Review");

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jButton1.setText("Remove");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setEditable(false);
        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Helvetica Neue", 1, 16)); // NOI18N
        jTextArea1.setLineWrap(true);
        jTextArea1.setRows(5);
        jTextArea1.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 425, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(16, 16, 16)))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String selected_user = jList1.getSelectedValue();
        for(int y = 0; y < user_list.size(); y++){
            if(user_list.get(y).getUsername().equals(selected_user)){
                for(int w = 0; w < user_list.get(y).user_reviews.size(); w++){
                    if(user_list.get(y).user_reviews.get(w).getGame().equals(game_list.get(i).getName())){
                        user_list.get(y).user_reviews.remove(w);
                        this.dispose();
                    }
                }
            }
            
        }
        
        for(int k = 0; k < game_list.get(i).review_list.size(); k++){
                
            if(game_list.get(i).review_list.get(k).getName().equals(selected_user)){
                game_list.get(i).review_list.remove(k); 
            }
        }

            
        
       
    }//GEN-LAST:event_jButton1ActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void valueChanged(ListSelectionEvent e) {
        
        String selected_user = jList1.getSelectedValue();
        for(int k = 0; k < game_list.get(i).review_list.size(); k++){
            if(!e.getValueIsAdjusting()){
            break;
        }         
            if(game_list.get(i).review_list.get(k).getName() == selected_user){
                jTextArea1.setText("");
                game_list.get(i).review_list.get(k).printReview(jTextArea1);  
            }      
        } 
        
    }
    
}