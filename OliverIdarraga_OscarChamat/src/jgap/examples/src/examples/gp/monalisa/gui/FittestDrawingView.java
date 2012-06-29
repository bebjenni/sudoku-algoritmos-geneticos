/*
 * This file is part of JGAP.
 *
 * JGAP offers a dual license model containing the LGPL as well as the MPL.
 *
 * For licensing information please see the file license.txt included with JGAP
 * or have a look at the top of class org.jgap.Chromosome which representatively
 * includes the JGAP license policy applicable for any file delivered with JGAP.
 */
package jgap.examples.src.examples.gp.monalisa.gui;

/**
 *
 * @author Yann N. Dauphin
 * @since 3.4
 */
public class FittestDrawingView
    extends javax.swing.JFrame {
  /** String containing the CVS revision. Read out via reflection!*/
  private final static String CVS_REVISION = "$Revision: 1.1 $";

  public FittestDrawingView() {
    initComponents();
  }

  public javax.swing.JPanel getMainPanel() {
    return mainPanel;
  }

  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  @SuppressWarnings("unchecked")
  // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
  private void initComponents() {
    mainPanel = new javax.swing.JPanel();
    setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
    org.jdesktop.application.ResourceMap resourceMap = org.jdesktop.application.
        Application.getInstance(examples.gp.monalisa.gui.GeneticDrawingApp.class).
        getContext().getResourceMap(FittestDrawingView.class);
    setTitle(resourceMap.getString("Form.title")); // NOI18N
    setName("Form"); // NOI18N
    setResizable(false);
    mainPanel.setName("mainPanel"); // NOI18N
    org.jdesktop.layout.GroupLayout mainPanelLayout = new org.jdesktop.layout.
        GroupLayout(mainPanel);
    mainPanel.setLayout(mainPanelLayout);
    mainPanelLayout.setHorizontalGroup(
        mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.
        LEADING)
        .add(0, 400, Short.MAX_VALUE)
        );
    mainPanelLayout.setVerticalGroup(
        mainPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.
        LEADING)
        .add(0, 300, Short.MAX_VALUE)
        );
    org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.
        GroupLayout(getContentPane());
    getContentPane().setLayout(layout);
    layout.setHorizontalGroup(
        layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
        .add(org.jdesktop.layout.GroupLayout.TRAILING, mainPanel,
             org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
             org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    layout.setVerticalGroup(
        layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
        .add(mainPanel, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE,
             org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    pack();
  } // </editor-fold>//GEN-END:initComponents

  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JPanel mainPanel;
  // End of variables declaration//GEN-END:variables
}
