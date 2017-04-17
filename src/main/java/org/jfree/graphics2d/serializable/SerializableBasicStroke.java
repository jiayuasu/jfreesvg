package org.jfree.graphics2d.serializable;

import java.awt.BasicStroke;
import java.io.Serializable;

public class SerializableBasicStroke extends BasicStroke implements Serializable{
    public SerializableBasicStroke(float width) {
    	super(width);
    }
}
