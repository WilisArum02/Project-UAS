/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package projectuas;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.Icon;

/**
 *
 * @author HP
 */
public class MenuItem extends javax.swing.JPanel {

    /**
     * @return the subMenu
     */
    public ArrayList<MenuItem> getSubMenu() {
        return subMenu;
    }

    private final ArrayList<MenuItem> subMenu = new ArrayList<>();
    
    private ActionListener act;
    
    public MenuItem(Icon icon,  boolean sbm, Icon iconSub, String menuName, ActionListener act, MenuItem...subMenu) {
        initComponents();
        
        jLabelicon.setIcon(icon);
        jLButtonMenuName.setText(menuName);
        jLabeliconSub.setIcon(iconSub);
        jLabeliconSub.setVisible(sbm);
        
        if (act != null){
            this.act = act;
           
        }
        this.setSize(new Dimension(Integer.MAX_VALUE, 45));
        this.setMaximumSize(new Dimension(Integer.MAX_VALUE,45));
        this.setMinimumSize(new Dimension(Integer.MAX_VALUE,45));
        for(int i = 0; i < subMenu.length; i++){
            this.subMenu.add(subMenu[i]);
            subMenu[i].setVisible(false);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanelLine = new javax.swing.JPanel();
        jLButtonMenuName = new javax.swing.JLabel();
        jLabeliconSub = new javax.swing.JLabel();
        jLabelicon = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanelLine.setBackground(new java.awt.Color(255, 255, 255));
        jPanelLine.setPreferredSize(new java.awt.Dimension(5, 30));

        javax.swing.GroupLayout jPanelLineLayout = new javax.swing.GroupLayout(jPanelLine);
        jPanelLine.setLayout(jPanelLineLayout);
        jPanelLineLayout.setHorizontalGroup(
            jPanelLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 5, Short.MAX_VALUE)
        );
        jPanelLineLayout.setVerticalGroup(
            jPanelLineLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 30, Short.MAX_VALUE)
        );

        jLButtonMenuName.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLButtonMenuName.setForeground(new java.awt.Color(0, 0, 102));
        jLButtonMenuName.setText("Menu Item");
        jLButtonMenuName.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLButtonMenuNameMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLButtonMenuNameMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLButtonMenuNameMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLButtonMenuNameMousePressed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(20, 20, 20)
                    .addComponent(jPanelLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabelicon, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLabeliconSub, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                    .addComponent(jLButtonMenuName, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(20, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 45, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanelLine, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabeliconSub, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabelicon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLButtonMenuName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addContainerGap(8, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private boolean showing = false;
    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        if (showing){
            hideMenu();
        } else{
            showMenu();
        }
        if (act != null){
            act.actionPerformed(null);
        }
    }//GEN-LAST:event_formMousePressed

    private void jLButtonMenuNameMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLButtonMenuNameMouseEntered
        jPanel1.setBackground(new Color(250,250,250));
        jPanelLine.setBackground(new Color(0,0,102));
    }//GEN-LAST:event_jLButtonMenuNameMouseEntered

    private void jLButtonMenuNameMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLButtonMenuNameMouseExited
        jPanel1.setBackground(new Color(255,255,255));
        jPanelLine.setBackground(new Color(255,255,255));
    }//GEN-LAST:event_jLButtonMenuNameMouseExited

    private void jLButtonMenuNameMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLButtonMenuNameMouseClicked
        
    }//GEN-LAST:event_jLButtonMenuNameMouseClicked

    private void jLButtonMenuNameMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLButtonMenuNameMousePressed
        if (showing){
            hideMenu();
        } else{
            showMenu();
        }
        if (act != null){
            act.actionPerformed(null);
        }
    }//GEN-LAST:event_jLButtonMenuNameMousePressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLButtonMenuName;
    private javax.swing.JLabel jLabelicon;
    private javax.swing.JLabel jLabeliconSub;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanelLine;
    // End of variables declaration//GEN-END:variables

    private void showMenu() {
        new Thread(new Runnable(){
            @Override
            public void run() {
            for (int i = 0; i < subMenu.size(); i++){
                sleep();
                subMenu.get(i).setVisible(true);
                
            }
            
            showing = true;
            getParent().repaint();
            getParent().revalidate();
        }
    }).start();
}


    private void hideMenu() {
        new Thread(new Runnable(){
            @Override
            public void run() {
            for (int i = subMenu.size()- 1; i >= 0; i--){
                sleep();
                subMenu.get(i).setVisible(false);
                subMenu.get(i).hideMenu();
            }
            getParent().repaint();
            getParent().revalidate();
            showing = false;
        }
    }).start();
}
    
    private void sleep(){
        try{
            Thread.sleep(20);
        }catch (Exception e){
        }
    }
}

