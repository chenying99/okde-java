package de.tuhh.luethke.oKDE.utility;

import org.ejml.simple.SimpleMatrix;
import org.ejml.simple.SimpleSVD;

public class ProjectionData {

	public SimpleSVD<?> mSVD;
	public Double[] mValidElements;
	public int mCountValidElements;
	public SimpleMatrix mBandwidthMatrix;
}
