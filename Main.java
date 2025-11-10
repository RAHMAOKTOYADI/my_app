/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author kitsunne
 */
package com.sisteminformasiklinikkampus;

import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import com.formdev.flatlaf.FlatLightLaf;
import java.util.logging.Logger;
import java.util.logging.Level;

/**
 * Main class for starting the Sistem Informasi Klinik Kampus application
 */
public class MainApp {
    private static final Logger logger = Logger.getLogger(MainApp.class.getName());
    
    public static void main(String[] args) {
        // Set the look and feel to FlatLaf Light
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception e) {
            logger.log(Level.SEVERE, "Failed to initialize LaF", e);
        }

        // Start the application
        SwingUtilities.invokeLater(() -> {
            try {
                // Create and display the login form
                halamanLogin loginForm = new halamanLogin();
                loginForm.setLocationRelativeTo(null); // Center on screen
                loginForm.setVisible(true);
            } catch (Exception e) {
                logger.log(Level.SEVERE, "Failed to start application", e);
            }
        });
    }
}
