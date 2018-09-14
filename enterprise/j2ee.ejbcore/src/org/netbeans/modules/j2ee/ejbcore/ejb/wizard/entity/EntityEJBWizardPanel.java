/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */

package org.netbeans.modules.j2ee.ejbcore.ejb.wizard.entity;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.SwingUtilities;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
//import org.netbeans.modules.j2ee.common.FQNSearch;

/**
 *
 * @author  ChrisWebster
 * @author Martin Adamek
 */
public class EntityEJBWizardPanel extends javax.swing.JPanel {

    private final ChangeListener listener;

    /** Creates new form EntityEJBWizardPanel */
    public EntityEJBWizardPanel(ChangeListener changeListener) {
        this.listener = changeListener;
        initComponents();

        localCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                listener.stateChanged(null);
            }
        });

        remoteCheckBox.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent actionEvent) {
                listener.stateChanged(null);
            }
        });

        primaryKeyTextField.getDocument().addDocumentListener(new DocumentListener() {
            public void changedUpdate(DocumentEvent documentEvent) {
                listener.stateChanged(null);
            }
            public void insertUpdate(DocumentEvent documentEvent) {
                listener.stateChanged(null);
            }
            public void removeUpdate(DocumentEvent documentEvent) {
                listener.stateChanged(null);
            }
        });
        
        //TODO: RETOUCHE
        jButton1.setVisible(false);
        
    }
    
    public boolean isCMP() {
        return cmpButton.isSelected();
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        persistenceGroup = new javax.swing.ButtonGroup();
        persistenceTypeLabel = new javax.swing.JLabel();
        cmpButton = new javax.swing.JRadioButton();
        bmpButton = new javax.swing.JRadioButton();
        createInterfaceLabel = new javax.swing.JLabel();
        remoteCheckBox = new javax.swing.JCheckBox();
        localCheckBox = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        primaryKeyTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setLayout(new java.awt.GridBagLayout());

        org.openide.awt.Mnemonics.setLocalizedText(persistenceTypeLabel, org.openide.util.NbBundle.getMessage(EntityEJBWizardPanel.class, "LBL_PersistenceType")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        add(persistenceTypeLabel, gridBagConstraints);

        persistenceGroup.add(cmpButton);
        cmpButton.setMnemonic(java.util.ResourceBundle.getBundle("org/netbeans/modules/j2ee/ejbcore/ejb/wizard/entity/Bundle").getString("MN_Container").charAt(0));
        cmpButton.setSelected(true);
        cmpButton.setText(org.openide.util.NbBundle.getMessage(EntityEJBWizardPanel.class, "LBL_Container")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        add(cmpButton, gridBagConstraints);
        java.util.ResourceBundle bundle = java.util.ResourceBundle.getBundle("org/netbeans/modules/j2ee/ejbcore/ejb/wizard/entity/Bundle"); // NOI18N
        cmpButton.getAccessibleContext().setAccessibleName(bundle.getString("LBL_Container")); // NOI18N
        cmpButton.getAccessibleContext().setAccessibleDescription(bundle.getString("LBL_Container")); // NOI18N

        persistenceGroup.add(bmpButton);
        bmpButton.setMnemonic(java.util.ResourceBundle.getBundle("org/netbeans/modules/j2ee/ejbcore/ejb/wizard/entity/Bundle").getString("MN_Bean").charAt(0));
        bmpButton.setText(org.openide.util.NbBundle.getMessage(EntityEJBWizardPanel.class, "LBL_Bean")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        add(bmpButton, gridBagConstraints);
        bmpButton.getAccessibleContext().setAccessibleName(bundle.getString("LBL_Bean")); // NOI18N
        bmpButton.getAccessibleContext().setAccessibleDescription(bundle.getString("LBL_Bean")); // NOI18N

        org.openide.awt.Mnemonics.setLocalizedText(createInterfaceLabel, org.openide.util.NbBundle.getMessage(EntityEJBWizardPanel.class, "LBL_Interface")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(15, 0, 0, 0);
        add(createInterfaceLabel, gridBagConstraints);

        remoteCheckBox.setMnemonic(java.util.ResourceBundle.getBundle("org/netbeans/modules/j2ee/ejbcore/ejb/wizard/entity/Bundle").getString("MN_Remote").charAt(0));
        remoteCheckBox.setText(org.openide.util.NbBundle.getMessage(EntityEJBWizardPanel.class, "LBL_Remote")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        add(remoteCheckBox, gridBagConstraints);
        remoteCheckBox.getAccessibleContext().setAccessibleName(bundle.getString("LBL_Remote")); // NOI18N
        remoteCheckBox.getAccessibleContext().setAccessibleDescription(bundle.getString("LBL_Remote")); // NOI18N

        localCheckBox.setMnemonic(java.util.ResourceBundle.getBundle("org/netbeans/modules/j2ee/ejbcore/ejb/wizard/entity/Bundle").getString("MN_Local").charAt(0));
        localCheckBox.setSelected(true);
        localCheckBox.setText(org.openide.util.NbBundle.getMessage(EntityEJBWizardPanel.class, "LBL_Local")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        gridBagConstraints.gridwidth = java.awt.GridBagConstraints.REMAINDER;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 15, 0, 0);
        add(localCheckBox, gridBagConstraints);
        localCheckBox.getAccessibleContext().setAccessibleName(bundle.getString("LBL_Local")); // NOI18N
        localCheckBox.getAccessibleContext().setAccessibleDescription(bundle.getString("LBL_Local")); // NOI18N

        jLabel1.setDisplayedMnemonic(java.util.ResourceBundle.getBundle("org/netbeans/modules/j2ee/ejbcore/ejb/wizard/entity/Bundle").getString("MN_PrimaryKey").charAt(0));
        jLabel1.setLabelFor(primaryKeyTextField);
        jLabel1.setText(org.openide.util.NbBundle.getBundle(EntityEJBWizardPanel.class).getString("LBL_PrimaryKeyClass")); // NOI18N
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 8, 8);
        add(jLabel1, gridBagConstraints);

        primaryKeyTextField.setText("java.lang.Long");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.WEST;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 8, 8);
        add(primaryKeyTextField, gridBagConstraints);
        primaryKeyTextField.getAccessibleContext().setAccessibleName(bundle.getString("ACS_PrimaryKeyField")); // NOI18N
        primaryKeyTextField.getAccessibleContext().setAccessibleDescription(bundle.getString("ACS_PrimaryKeyField")); // NOI18N

        jButton1.setMnemonic(java.util.ResourceBundle.getBundle("org/netbeans/modules/j2ee/ejbcore/ejb/wizard/entity/Bundle").getString("MN_Browse").charAt(0));
        jButton1.setText("...");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 2;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.insets = new java.awt.Insets(0, 0, 8, 0);
        add(jButton1, gridBagConstraints);
        jButton1.getAccessibleContext().setAccessibleName(bundle.getString("ACS_BrowsePK")); // NOI18N
        jButton1.getAccessibleContext().setAccessibleDescription(bundle.getString("ACS_BrowsePK")); // NOI18N
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        SwingUtilities.invokeLater (new Runnable() {
            public void run() {
                //TODO: RETOUCHE FQNSearch
//                FQNSearch.showFastOpen(primaryKeyTextField);
            }
        });
    }//GEN-LAST:event_jButton1ActionPerformed
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton bmpButton;
    private javax.swing.JRadioButton cmpButton;
    private javax.swing.JLabel createInterfaceLabel;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JCheckBox localCheckBox;
    private javax.swing.ButtonGroup persistenceGroup;
    private javax.swing.JLabel persistenceTypeLabel;
    private javax.swing.JTextField primaryKeyTextField;
    private javax.swing.JCheckBox remoteCheckBox;
    // End of variables declaration//GEN-END:variables

    public boolean isRemote() {
        return remoteCheckBox.isSelected();
    }

    public boolean isLocal() {
        return localCheckBox.isSelected();
    }
    
    public String getPrimaryKeyClassName() {
        return primaryKeyTextField.getText();
    }
    
}