
import java.io.Serializable;

public class WriteReview extends javax.swing.JFrame implements Serializable {


    private User user;
    private Game game;
    boolean exist;
    int k;
    public WriteReview(User user, Game game) {

        this.user = user;
        this.game = game;
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        graphicsSlider = new javax.swing.JSlider();
        graphicsLabel = new javax.swing.JLabel();
        gameplaySlider = new javax.swing.JSlider();
        gameplayLabel = new javax.swing.JLabel();
        performanceSlider = new javax.swing.JSlider();
        performanceLabel = new javax.swing.JLabel();
        audioSlider = new javax.swing.JSlider();
        audioLabel = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTextArea2.setColumns(20);
        jTextArea2.setFont(new java.awt.Font("Helvetica Neue", 0, 18)); // NOI18N
        jTextArea2.setLineWrap(true);
        jTextArea2.setRows(5);
        jTextArea2.setWrapStyleWord(true);
        jScrollPane2.setViewportView(jTextArea2);

        jLabel1.setFont(new java.awt.Font("Helvetica Neue", 1, 36)); // NOI18N
        jLabel1.setText("Review for " + game.getName());

        graphicsSlider.setMajorTickSpacing(25);
        graphicsSlider.setMinorTickSpacing(10);
        graphicsSlider.setPaintLabels(true);
        graphicsSlider.setPaintTicks(true);
        graphicsSlider.setSize(new java.awt.Dimension(200, 200));
        graphicsSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                graphicsSliderStateChanged(evt);
            }
        });

        graphicsLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        graphicsLabel.setText("Graphics: " + graphicsSlider.getValue()
        );

        gameplaySlider.setMajorTickSpacing(25);
        gameplaySlider.setMinorTickSpacing(10);
        gameplaySlider.setPaintLabels(true);
        gameplaySlider.setPaintTicks(true);
        gameplaySlider.setSize(new java.awt.Dimension(200, 200));
        gameplaySlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                gameplaySliderStateChanged(evt);
            }
        });

        gameplayLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        gameplayLabel.setText("Gameplay: " + gameplaySlider.getValue()
        );

        performanceSlider.setMajorTickSpacing(25);
        performanceSlider.setMinorTickSpacing(10);
        performanceSlider.setPaintLabels(true);
        performanceSlider.setPaintTicks(true);
        performanceSlider.setSize(new java.awt.Dimension(200, 200));
        performanceSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                performanceSliderStateChanged(evt);
            }
        });

        performanceLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        performanceLabel.setText("Performance: " + performanceSlider.getValue()
        );

        audioSlider.setMajorTickSpacing(25);
        audioSlider.setMinorTickSpacing(10);
        audioSlider.setPaintLabels(true);
        audioSlider.setPaintTicks(true);
        audioSlider.setSize(new java.awt.Dimension(200, 200));
        audioSlider.addChangeListener(new javax.swing.event.ChangeListener() {
            public void stateChanged(javax.swing.event.ChangeEvent evt) {
                audioSliderStateChanged(evt);
            }
        });

        audioLabel.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        audioLabel.setText("Audio: " + audioSlider.getValue()
        );

        jButton1.setFont(new java.awt.Font("Helvetica Neue", 1, 24)); // NOI18N
        jButton1.setText("Create Review");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 84, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(graphicsSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(graphicsLabel)
                            .addComponent(gameplaySlider, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(gameplayLabel)
                            .addComponent(performanceSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(performanceLabel)
                            .addComponent(audioSlider, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(audioLabel))
                        .addGap(85, 85, 85))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addGap(124, 124, 124))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(graphicsLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(graphicsSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gameplayLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(gameplaySlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(performanceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(performanceSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(audioLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(audioSlider, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void graphicsSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_graphicsSliderStateChanged
        graphicsLabel.setText("Graphics: " + graphicsSlider.getValue());
    }//GEN-LAST:event_graphicsSliderStateChanged

    private void gameplaySliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_gameplaySliderStateChanged
        gameplayLabel.setText("Gameplay: " + gameplaySlider.getValue());
    }//GEN-LAST:event_gameplaySliderStateChanged

    private void performanceSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_performanceSliderStateChanged
        performanceLabel.setText("Performance: " + performanceSlider.getValue());
    }//GEN-LAST:event_performanceSliderStateChanged

    private void audioSliderStateChanged(javax.swing.event.ChangeEvent evt) {//GEN-FIRST:event_audioSliderStateChanged
        audioLabel.setText("Audio: " + audioSlider.getValue());
    }//GEN-LAST:event_audioSliderStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
     
        for(int i = 0; i < user.user_reviews.size(); i++){
            if(game.review_list.size() > 0){
            if(user.getReview(i).getName().equals((game.getReview(i).getName()))){
                exist = true;
                k = i;
                break;
            }
            if(user.getReview(i).getName() != (game.getReview(i).getName())){
                exist = false;
                break;
            }
            }
        }   
        if(exist == false){
        String name = user.getUsername();
        String description = jTextArea2.getText();
        double graphics = (graphicsSlider.getValue()) / 10;
        double gameplay = (gameplaySlider.getValue()) / 10;
        double performance = (performanceSlider.getValue()) / 10;
        double audio = (audioSlider.getValue()) / 10;
        Review review = new Review();
        review.setReview(user.getUsername(),description,game.getName(),graphics,gameplay,performance,audio);
        
        game.addReview(review);
        user.addReview(review);
        this.dispose();
        }
        
        if(exist == true){
            String name = user.getUsername();
            String description = jTextArea2.getText();
            double graphics = (graphicsSlider.getValue()) / 10;
            double gameplay = (gameplaySlider.getValue()) / 10;
            double performance = (performanceSlider.getValue()) / 10;
            double audio = (audioSlider.getValue()) / 10;
            game.getReview(k).setReview(user.getUsername(),description,game.getName(),graphics,gameplay,performance,audio);
            user.getReview(k).setReview(user.getUsername(),description,game.getName(),graphics,gameplay,performance,audio);
            this.dispose();
        }
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel audioLabel;
    private javax.swing.JSlider audioSlider;
    private javax.swing.JLabel gameplayLabel;
    private javax.swing.JSlider gameplaySlider;
    private javax.swing.JLabel graphicsLabel;
    private javax.swing.JSlider graphicsSlider;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JLabel performanceLabel;
    private javax.swing.JSlider performanceSlider;
    // End of variables declaration//GEN-END:variables
}
