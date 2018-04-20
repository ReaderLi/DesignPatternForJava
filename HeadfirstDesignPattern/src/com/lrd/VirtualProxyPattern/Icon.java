package com.lrd.VirtualProxyPattern;

import java.awt.*;

public interface Icon {
    public int getIconWidth();
    public int getIconHeight();
    public void paintIcon(final Component c, Graphics g, int x, int y);
}
