/*
 * HalfNES by Andrew Hoffman
 * Licensed under the GNU GPL Version 3. See LICENSE file
 */
package com.grapeshot.halfnes;

import java.io.*;
import javax.swing.*;

public class halfNES {

    private static final long serialVersionUID = -7269569171056445433L;

    public static void main(String[] args) throws IOException {
        try {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        } catch (Exception e) {
            System.err.println("Could not set system look and feel. Meh.");
        }
        com.grapeshot.halfnes.NES thing = new com.grapeshot.halfnes.NES();
        if (args == null || args.length < 1 || args[0] == null) {
            thing.run();
        } else {
            thing.run(args[0]);
        }

    }
}
