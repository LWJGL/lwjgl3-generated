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

/** Frame timing data reported by ovrHmd_BeginFrameTiming() or ovrHmd_BeginFrame(). */
public final class OVRFrameTiming implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		DELTASECONDS,
		THISFRAMESECONDS,
		TIMEWARPPOINTSECONDS,
		NEXTFRAMESECONDS,
		SCANOUTMIDPOINTSECONDS,
		EYESCANOUTSECONDS;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(6);

		SIZEOF = offsets(memAddress(offsets));

		DELTASECONDS = offsets.get(0);
		THISFRAMESECONDS = offsets.get(1);
		TIMEWARPPOINTSECONDS = offsets.get(2);
		NEXTFRAMESECONDS = offsets.get(3);
		SCANOUTMIDPOINTSECONDS = offsets.get(4);
		EYESCANOUTSECONDS = offsets.get(5);
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

	public void setDeltaSeconds(float DeltaSeconds) { DeltaSeconds(struct, DeltaSeconds); }
	public void setThisFrameSeconds(double ThisFrameSeconds) { ThisFrameSeconds(struct, ThisFrameSeconds); }
	public void setTimewarpPointSeconds(double TimewarpPointSeconds) { TimewarpPointSeconds(struct, TimewarpPointSeconds); }
	public void setNextFrameSeconds(double NextFrameSeconds) { NextFrameSeconds(struct, NextFrameSeconds); }
	public void setScanoutMidpointSeconds(double ScanoutMidpointSeconds) { ScanoutMidpointSeconds(struct, ScanoutMidpointSeconds); }
	public void setEyeScanoutSeconds(ByteBuffer EyeScanoutSeconds) { EyeScanoutSecondsSet(struct, EyeScanoutSeconds); }
	public void setEyeScanoutSeconds(int index, double EyeScanoutSeconds) { EyeScanoutSeconds(struct, index, EyeScanoutSeconds); }

	public float getDeltaSeconds() { return DeltaSeconds(struct); }
	public double getThisFrameSeconds() { return ThisFrameSeconds(struct); }
	public double getTimewarpPointSeconds() { return TimewarpPointSeconds(struct); }
	public double getNextFrameSeconds() { return NextFrameSeconds(struct); }
	public double getScanoutMidpointSeconds() { return ScanoutMidpointSeconds(struct); }
	public void getEyeScanoutSeconds(ByteBuffer EyeScanoutSeconds) { EyeScanoutSecondsGet(struct, EyeScanoutSeconds); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		float DeltaSeconds,
		double ThisFrameSeconds,
		double TimewarpPointSeconds,
		double NextFrameSeconds,
		double ScanoutMidpointSeconds,
		ByteBuffer EyeScanoutSeconds
	) {
		ByteBuffer ovrframetiming = malloc();

		DeltaSeconds(ovrframetiming, DeltaSeconds);
		ThisFrameSeconds(ovrframetiming, ThisFrameSeconds);
		TimewarpPointSeconds(ovrframetiming, TimewarpPointSeconds);
		NextFrameSeconds(ovrframetiming, NextFrameSeconds);
		ScanoutMidpointSeconds(ovrframetiming, ScanoutMidpointSeconds);
		EyeScanoutSecondsSet(ovrframetiming, EyeScanoutSeconds);

		return ovrframetiming;
	}

	public static void DeltaSeconds(ByteBuffer ovrframetiming, float DeltaSeconds) { ovrframetiming.putFloat(ovrframetiming.position() + DELTASECONDS, DeltaSeconds); }
	public static void ThisFrameSeconds(ByteBuffer ovrframetiming, double ThisFrameSeconds) { ovrframetiming.putDouble(ovrframetiming.position() + THISFRAMESECONDS, ThisFrameSeconds); }
	public static void TimewarpPointSeconds(ByteBuffer ovrframetiming, double TimewarpPointSeconds) { ovrframetiming.putDouble(ovrframetiming.position() + TIMEWARPPOINTSECONDS, TimewarpPointSeconds); }
	public static void NextFrameSeconds(ByteBuffer ovrframetiming, double NextFrameSeconds) { ovrframetiming.putDouble(ovrframetiming.position() + NEXTFRAMESECONDS, NextFrameSeconds); }
	public static void ScanoutMidpointSeconds(ByteBuffer ovrframetiming, double ScanoutMidpointSeconds) { ovrframetiming.putDouble(ovrframetiming.position() + SCANOUTMIDPOINTSECONDS, ScanoutMidpointSeconds); }
	public static void EyeScanoutSecondsSet(ByteBuffer ovrframetiming, ByteBuffer EyeScanoutSeconds) {
		checkBufferGT(EyeScanoutSeconds, 2 * 8);
		memCopy(memAddress(EyeScanoutSeconds), memAddress(ovrframetiming) + EYESCANOUTSECONDS, EyeScanoutSeconds.remaining());
	}
	public static void EyeScanoutSeconds(ByteBuffer ovrframetiming, int index, double EyeScanoutSeconds) { ovrframetiming.putDouble(EYESCANOUTSECONDS + index * 8, EyeScanoutSeconds); }

	public static float DeltaSeconds(ByteBuffer ovrframetiming) { return ovrframetiming.getFloat(ovrframetiming.position() + DELTASECONDS); }
	public static double ThisFrameSeconds(ByteBuffer ovrframetiming) { return ovrframetiming.getDouble(ovrframetiming.position() + THISFRAMESECONDS); }
	public static double TimewarpPointSeconds(ByteBuffer ovrframetiming) { return ovrframetiming.getDouble(ovrframetiming.position() + TIMEWARPPOINTSECONDS); }
	public static double NextFrameSeconds(ByteBuffer ovrframetiming) { return ovrframetiming.getDouble(ovrframetiming.position() + NEXTFRAMESECONDS); }
	public static double ScanoutMidpointSeconds(ByteBuffer ovrframetiming) { return ovrframetiming.getDouble(ovrframetiming.position() + SCANOUTMIDPOINTSECONDS); }
	public static void EyeScanoutSecondsGet(ByteBuffer ovrframetiming, ByteBuffer EyeScanoutSeconds) {
		checkBufferGT(EyeScanoutSeconds, 2 * 8);
		memCopy(memAddress(ovrframetiming) + EYESCANOUTSECONDS, memAddress(EyeScanoutSeconds), EyeScanoutSeconds.remaining());
	}
	public static double EyeScanoutSeconds(ByteBuffer ovrframetiming, int index) {
		return ovrframetiming.getDouble(EYESCANOUTSECONDS + index * 8);
	}

}