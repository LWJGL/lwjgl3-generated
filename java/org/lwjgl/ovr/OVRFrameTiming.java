/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/** Frame timing data reported by {@link OVR#ovrHmd_GetFrameTiming}. */
public final class OVRFrameTiming implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		DISPLAYMIDPOINTSECONDS,
		FRAMEINTERVALSECONDS,
		APPFRAMEINDEX,
		DISPLAYFRAMEINDEX;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(4);

		SIZEOF = offsets(memAddress(offsets));

		DISPLAYMIDPOINTSECONDS = offsets.get(0);
		FRAMEINTERVALSECONDS = offsets.get(1);
		APPFRAMEINDEX = offsets.get(2);
		DISPLAYFRAMEINDEX = offsets.get(3);
	}

	private final ByteBuffer struct;

	public OVRFrameTiming() {
		this(malloc());
	}

	public OVRFrameTiming(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);

		this.struct = struct;
	}

	public ByteBuffer buffer() {
		return struct;
	}

	@Override
	public long getPointer() {
		return memAddress(struct);
	}

	public void setDisplayMidpointSeconds(double DisplayMidpointSeconds) { DisplayMidpointSeconds(struct, DisplayMidpointSeconds); }
	public void setFrameIntervalSeconds(double FrameIntervalSeconds) { FrameIntervalSeconds(struct, FrameIntervalSeconds); }
	public void setAppFrameIndex(double AppFrameIndex) { AppFrameIndex(struct, AppFrameIndex); }
	public void setDisplayFrameIndex(double DisplayFrameIndex) { DisplayFrameIndex(struct, DisplayFrameIndex); }

	public double getDisplayMidpointSeconds() { return DisplayMidpointSeconds(struct); }
	public double getFrameIntervalSeconds() { return FrameIntervalSeconds(struct); }
	public double getAppFrameIndex() { return AppFrameIndex(struct); }
	public double getDisplayFrameIndex() { return DisplayFrameIndex(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		double DisplayMidpointSeconds,
		double FrameIntervalSeconds,
		double AppFrameIndex,
		double DisplayFrameIndex
	) {
		ByteBuffer ovrframetiming = malloc();

		DisplayMidpointSeconds(ovrframetiming, DisplayMidpointSeconds);
		FrameIntervalSeconds(ovrframetiming, FrameIntervalSeconds);
		AppFrameIndex(ovrframetiming, AppFrameIndex);
		DisplayFrameIndex(ovrframetiming, DisplayFrameIndex);

		return ovrframetiming;
	}

	public static void DisplayMidpointSeconds(ByteBuffer ovrframetiming, double DisplayMidpointSeconds) { ovrframetiming.putDouble(ovrframetiming.position() + DISPLAYMIDPOINTSECONDS, DisplayMidpointSeconds); }
	public static void FrameIntervalSeconds(ByteBuffer ovrframetiming, double FrameIntervalSeconds) { ovrframetiming.putDouble(ovrframetiming.position() + FRAMEINTERVALSECONDS, FrameIntervalSeconds); }
	public static void AppFrameIndex(ByteBuffer ovrframetiming, double AppFrameIndex) { ovrframetiming.putDouble(ovrframetiming.position() + APPFRAMEINDEX, AppFrameIndex); }
	public static void DisplayFrameIndex(ByteBuffer ovrframetiming, double DisplayFrameIndex) { ovrframetiming.putDouble(ovrframetiming.position() + DISPLAYFRAMEINDEX, DisplayFrameIndex); }

	public static double DisplayMidpointSeconds(ByteBuffer ovrframetiming) { return ovrframetiming.getDouble(ovrframetiming.position() + DISPLAYMIDPOINTSECONDS); }
	public static double FrameIntervalSeconds(ByteBuffer ovrframetiming) { return ovrframetiming.getDouble(ovrframetiming.position() + FRAMEINTERVALSECONDS); }
	public static double AppFrameIndex(ByteBuffer ovrframetiming) { return ovrframetiming.getDouble(ovrframetiming.position() + APPFRAMEINDEX); }
	public static double DisplayFrameIndex(ByteBuffer ovrframetiming) { return ovrframetiming.getDouble(ovrframetiming.position() + DISPLAYFRAMEINDEX); }

}