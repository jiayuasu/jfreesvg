package org.jfree.graphics2d.serializable;

import java.awt.font.FontRenderContext;
import java.awt.geom.AffineTransform;
import java.io.Serializable;

public class SerializableFontRenderContext extends FontRenderContext implements Serializable {

	public SerializableFontRenderContext(AffineTransform tx,
            boolean isAntiAliased,
            boolean usesFractionalMetrics)
	{
		super(tx,isAntiAliased,usesFractionalMetrics);
	}
}
