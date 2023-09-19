package com.blobs.quickstart.GUI;

import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import com.azure.storage.blob.BlobClient;
import com.azure.storage.blob.BlobContainerClient;
import com.azure.storage.blob.BlobServiceClient;

import com.blobs.quickstart.metodos.AzureMetodos;

public class Gui extends javax.swing.JFrame {
    // Variables declaration - do not modify
    private javax.swing.JButton connectB;
    private javax.swing.JLabel connectL;
    private javax.swing.JButton fileB;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField keyC;
    private javax.swing.JTextField nameContainer;
    private javax.swing.JButton submitB;
    // End of variables declaration

    public Gui() {
        initComponents();
    }

    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        fileB = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        keyC = new javax.swing.JTextField();
        connectB = new javax.swing.JButton();
        connectL = new javax.swing.JLabel();
        submitB = new javax.swing.JButton();
        nameContainer = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 36)); // NOI18N
        jLabel1.setText("Java Blob Storage");

        fileB.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        fileB.setText("Choose your file");
        fileB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fileBActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("icon.png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 12, Short.MAX_VALUE)
                                .addComponent(jLabel2)));

        keyC.setForeground(new java.awt.Color(0, 153, 153));
        keyC.setText("Enter key connection");

        connectB.setText("Connect to");
        connectB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                connectBActionPerformed(evt);
            }
        });

        connectL.setText("The connection is: ");

        submitB.setText("Submit");
        submitB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitBActionPerformed(evt);
            }
        });

        nameContainer.setForeground(new java.awt.Color(0, 153, 153));
        nameContainer.setText("Enter name container");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(95, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(nameContainer, javax.swing.GroupLayout.PREFERRED_SIZE, 165,
                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(keyC, javax.swing.GroupLayout.PREFERRED_SIZE, 165,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addComponent(connectB)
                                .addGap(97, 97, 97))
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addComponent(jLabel1))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout
                                                .createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(fileB)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(submitB)
                                .addGap(167, 167, 167))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(connectL, javax.swing.GroupLayout.DEFAULT_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap()));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(9, 9, 9)
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(17, 17, 17)
                                                .addComponent(connectB))
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(nameContainer, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(keyC, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(connectL)
                                                .addGap(22, 22, 22)
                                                .addComponent(fileB))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING,
                                                layout.createSequentialGroup()
                                                        .addGap(45, 45, 45)
                                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGap(31, 31, 31)
                                .addComponent(submitB)
                                .addContainerGap(55, Short.MAX_VALUE)));

        pack();
    }// </editor-fold>

    private void connectBActionPerformed(java.awt.event.ActionEvent evt) {
        // TODO add your handling code here:
        keyConnection = keyC.getText();
        if (keyConnection.isEmpty()) {
            connectL.setText("No proporciono la key ");
        } else {
            blobServiceClient = azureMetodos.getBlobServiceClient(keyConnection);
            container = nameContainer.getText();
            if (container.isEmpty()) {
                connectL.setText("No proporciono el nombre del container");

            } else {
                blobContainerClient = azureMetodos.getBlobContainerClient(blobServiceClient, container);
                if (blobContainerClient.exists()) {
                    connectL.setText("El enlace con el container esta activa, puede escoger su archivo");

                }
            }

        }

    }

    /* -------- */
    private void fileBActionPerformed(java.awt.event.ActionEvent evt) {
        JFileChooser chooser = new JFileChooser();
        FileNameExtensionFilter filter = new FileNameExtensionFilter(
                "JPG & GIF Images", "jpg", "gif");
        chooser.setFileFilter(filter);
        int returnVal = chooser.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            nameFile = chooser.getSelectedFile().getName();
            pathFile = chooser.getSelectedFile().getAbsolutePath();
        }
    }

    /* ------- */
    private void submitBActionPerformed(java.awt.event.ActionEvent evt) {

        blobClient = azureMetodos.getBlobClient(blobContainerClient, nameFile);
        if (!blobClient.exists()) {
            blobClient.uploadFromFile(pathFile);
            connectL.setText("Tu archivo se subio");

        } else {
            connectL.setText("Algo fallo y no existe");

        }

    }

    String keyConnection, nameFile, pathFile, container;
    BlobContainerClient blobContainerClient;
    BlobServiceClient blobServiceClient;
    BlobClient blobClient;
    AzureMetodos azureMetodos = new AzureMetodos();

}
