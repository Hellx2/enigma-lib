package org.enigma.util.game;

import java.awt.Image;

public interface GUIButtonComponent extends GUIComponent {
    public void onclick();
    public Image texture=null;
}