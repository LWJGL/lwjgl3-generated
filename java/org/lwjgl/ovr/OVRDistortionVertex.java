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

/**
 * Describes a full set of distortion mesh data, filled in by {@link OVR#ovrHmd_CreateDistortionMesh}. Contents of this data structure, if not null, should be
 * freed by {@link OVR#ovrHmd_DestroyDistortionMesh}.
 */
public final class OVRDistortionVertex implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		SCREENPOSNDC,
		TIMEWARPFACTOR,
		VIGNETTEFACTOR,
		TANEYEANGLESR,
		TANEYEANGLESG,
		TANEYEANGLESB;

	static {
		IntBuffer offsets = BufferUtils.createIntBuffer(6);

		SIZEOF = offsets(memAddress(offsets));

		SCREENPOSNDC = offsets.get(0);
		TIMEWARPFACTOR = offsets.get(1);
		VIGNETTEFACTOR = offsets.get(2);
		TANEYEANGLESR = offsets.get(3);
		TANEYEANGLESG = offsets.get(4);
		TANEYEANGLESB = offsets.get(5);
	}

	private final ByteBuffer struct;

	public OVRDistortionVertex() {
		this(malloc());
	}

	public OVRDistortionVertex(ByteBuffer struct) {
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

	public void setScreenPosNDC(ByteBuffer ScreenPosNDC) { ScreenPosNDCSet(struct, ScreenPosNDC); }
	public void setScreenPosNDCX(float x) { ScreenPosNDCX(struct, x); }
	public void setScreenPosNDCY(float y) { ScreenPosNDCY(struct, y); }
	public void setTimeWarpFactor(float TimeWarpFactor) { TimeWarpFactor(struct, TimeWarpFactor); }
	public void setVignetteFactor(float VignetteFactor) { VignetteFactor(struct, VignetteFactor); }
	public void setTanEyeAnglesR(ByteBuffer TanEyeAnglesR) { TanEyeAnglesRSet(struct, TanEyeAnglesR); }
	public void setTanEyeAnglesRX(float x) { TanEyeAnglesRX(struct, x); }
	public void setTanEyeAnglesRY(float y) { TanEyeAnglesRY(struct, y); }
	public void setTanEyeAnglesG(ByteBuffer TanEyeAnglesG) { TanEyeAnglesGSet(struct, TanEyeAnglesG); }
	public void setTanEyeAnglesGX(float x) { TanEyeAnglesGX(struct, x); }
	public void setTanEyeAnglesGY(float y) { TanEyeAnglesGY(struct, y); }
	public void setTanEyeAnglesB(ByteBuffer TanEyeAnglesB) { TanEyeAnglesBSet(struct, TanEyeAnglesB); }
	public void setTanEyeAnglesBX(float x) { TanEyeAnglesBX(struct, x); }
	public void setTanEyeAnglesBY(float y) { TanEyeAnglesBY(struct, y); }

	public void getScreenPosNDC(ByteBuffer ScreenPosNDC) { ScreenPosNDCGet(struct, ScreenPosNDC); }
	public float getScreenPosNDCX() { return ScreenPosNDCX(struct); }
	public float getScreenPosNDCY() { return ScreenPosNDCY(struct); }
	public float getTimeWarpFactor() { return TimeWarpFactor(struct); }
	public float getVignetteFactor() { return VignetteFactor(struct); }
	public void getTanEyeAnglesR(ByteBuffer TanEyeAnglesR) { TanEyeAnglesRGet(struct, TanEyeAnglesR); }
	public float getTanEyeAnglesRX() { return TanEyeAnglesRX(struct); }
	public float getTanEyeAnglesRY() { return TanEyeAnglesRY(struct); }
	public void getTanEyeAnglesG(ByteBuffer TanEyeAnglesG) { TanEyeAnglesGGet(struct, TanEyeAnglesG); }
	public float getTanEyeAnglesGX() { return TanEyeAnglesGX(struct); }
	public float getTanEyeAnglesGY() { return TanEyeAnglesGY(struct); }
	public void getTanEyeAnglesB(ByteBuffer TanEyeAnglesB) { TanEyeAnglesBGet(struct, TanEyeAnglesB); }
	public float getTanEyeAnglesBX() { return TanEyeAnglesBX(struct); }
	public float getTanEyeAnglesBY() { return TanEyeAnglesBY(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		ByteBuffer ScreenPosNDC,
		float TimeWarpFactor,
		float VignetteFactor,
		ByteBuffer TanEyeAnglesR,
		ByteBuffer TanEyeAnglesG,
		ByteBuffer TanEyeAnglesB
	) {
		ByteBuffer ovrdistortionvertex = malloc();

		ScreenPosNDCSet(ovrdistortionvertex, ScreenPosNDC);
		TimeWarpFactor(ovrdistortionvertex, TimeWarpFactor);
		VignetteFactor(ovrdistortionvertex, VignetteFactor);
		TanEyeAnglesRSet(ovrdistortionvertex, TanEyeAnglesR);
		TanEyeAnglesGSet(ovrdistortionvertex, TanEyeAnglesG);
		TanEyeAnglesBSet(ovrdistortionvertex, TanEyeAnglesB);

		return ovrdistortionvertex;
	}

	public static void ScreenPosNDCSet(ByteBuffer ovrdistortionvertex, ByteBuffer ScreenPosNDC) { if ( ScreenPosNDC != null ) memCopy(memAddress(ScreenPosNDC), memAddress(ovrdistortionvertex) + SCREENPOSNDC, OVRVector2f.SIZEOF); }
	public static void ScreenPosNDCX(ByteBuffer ovrdistortionvertex, float x) { ovrdistortionvertex.putFloat(ovrdistortionvertex.position() + SCREENPOSNDC + OVRVector2f.X, x); }
	public static void ScreenPosNDCY(ByteBuffer ovrdistortionvertex, float y) { ovrdistortionvertex.putFloat(ovrdistortionvertex.position() + SCREENPOSNDC + OVRVector2f.Y, y); }
	public static void TimeWarpFactor(ByteBuffer ovrdistortionvertex, float TimeWarpFactor) { ovrdistortionvertex.putFloat(ovrdistortionvertex.position() + TIMEWARPFACTOR, TimeWarpFactor); }
	public static void VignetteFactor(ByteBuffer ovrdistortionvertex, float VignetteFactor) { ovrdistortionvertex.putFloat(ovrdistortionvertex.position() + VIGNETTEFACTOR, VignetteFactor); }
	public static void TanEyeAnglesRSet(ByteBuffer ovrdistortionvertex, ByteBuffer TanEyeAnglesR) { if ( TanEyeAnglesR != null ) memCopy(memAddress(TanEyeAnglesR), memAddress(ovrdistortionvertex) + TANEYEANGLESR, OVRVector2f.SIZEOF); }
	public static void TanEyeAnglesRX(ByteBuffer ovrdistortionvertex, float x) { ovrdistortionvertex.putFloat(ovrdistortionvertex.position() + TANEYEANGLESR + OVRVector2f.X, x); }
	public static void TanEyeAnglesRY(ByteBuffer ovrdistortionvertex, float y) { ovrdistortionvertex.putFloat(ovrdistortionvertex.position() + TANEYEANGLESR + OVRVector2f.Y, y); }
	public static void TanEyeAnglesGSet(ByteBuffer ovrdistortionvertex, ByteBuffer TanEyeAnglesG) { if ( TanEyeAnglesG != null ) memCopy(memAddress(TanEyeAnglesG), memAddress(ovrdistortionvertex) + TANEYEANGLESG, OVRVector2f.SIZEOF); }
	public static void TanEyeAnglesGX(ByteBuffer ovrdistortionvertex, float x) { ovrdistortionvertex.putFloat(ovrdistortionvertex.position() + TANEYEANGLESG + OVRVector2f.X, x); }
	public static void TanEyeAnglesGY(ByteBuffer ovrdistortionvertex, float y) { ovrdistortionvertex.putFloat(ovrdistortionvertex.position() + TANEYEANGLESG + OVRVector2f.Y, y); }
	public static void TanEyeAnglesBSet(ByteBuffer ovrdistortionvertex, ByteBuffer TanEyeAnglesB) { if ( TanEyeAnglesB != null ) memCopy(memAddress(TanEyeAnglesB), memAddress(ovrdistortionvertex) + TANEYEANGLESB, OVRVector2f.SIZEOF); }
	public static void TanEyeAnglesBX(ByteBuffer ovrdistortionvertex, float x) { ovrdistortionvertex.putFloat(ovrdistortionvertex.position() + TANEYEANGLESB + OVRVector2f.X, x); }
	public static void TanEyeAnglesBY(ByteBuffer ovrdistortionvertex, float y) { ovrdistortionvertex.putFloat(ovrdistortionvertex.position() + TANEYEANGLESB + OVRVector2f.Y, y); }

	public static void ScreenPosNDCGet(ByteBuffer ovrdistortionvertex, ByteBuffer ScreenPosNDC) { checkBuffer(ScreenPosNDC, OVRVector2f.SIZEOF); memCopy(memAddress(ovrdistortionvertex) + SCREENPOSNDC, memAddress(ScreenPosNDC), OVRVector2f.SIZEOF); }
	public static float ScreenPosNDCX(ByteBuffer ovrdistortionvertex) { return ovrdistortionvertex.getFloat(ovrdistortionvertex.position() + SCREENPOSNDC + OVRVector2f.X); }
	public static float ScreenPosNDCY(ByteBuffer ovrdistortionvertex) { return ovrdistortionvertex.getFloat(ovrdistortionvertex.position() + SCREENPOSNDC + OVRVector2f.Y); }
	public static float TimeWarpFactor(ByteBuffer ovrdistortionvertex) { return ovrdistortionvertex.getFloat(ovrdistortionvertex.position() + TIMEWARPFACTOR); }
	public static float VignetteFactor(ByteBuffer ovrdistortionvertex) { return ovrdistortionvertex.getFloat(ovrdistortionvertex.position() + VIGNETTEFACTOR); }
	public static void TanEyeAnglesRGet(ByteBuffer ovrdistortionvertex, ByteBuffer TanEyeAnglesR) { checkBuffer(TanEyeAnglesR, OVRVector2f.SIZEOF); memCopy(memAddress(ovrdistortionvertex) + TANEYEANGLESR, memAddress(TanEyeAnglesR), OVRVector2f.SIZEOF); }
	public static float TanEyeAnglesRX(ByteBuffer ovrdistortionvertex) { return ovrdistortionvertex.getFloat(ovrdistortionvertex.position() + TANEYEANGLESR + OVRVector2f.X); }
	public static float TanEyeAnglesRY(ByteBuffer ovrdistortionvertex) { return ovrdistortionvertex.getFloat(ovrdistortionvertex.position() + TANEYEANGLESR + OVRVector2f.Y); }
	public static void TanEyeAnglesGGet(ByteBuffer ovrdistortionvertex, ByteBuffer TanEyeAnglesG) { checkBuffer(TanEyeAnglesG, OVRVector2f.SIZEOF); memCopy(memAddress(ovrdistortionvertex) + TANEYEANGLESG, memAddress(TanEyeAnglesG), OVRVector2f.SIZEOF); }
	public static float TanEyeAnglesGX(ByteBuffer ovrdistortionvertex) { return ovrdistortionvertex.getFloat(ovrdistortionvertex.position() + TANEYEANGLESG + OVRVector2f.X); }
	public static float TanEyeAnglesGY(ByteBuffer ovrdistortionvertex) { return ovrdistortionvertex.getFloat(ovrdistortionvertex.position() + TANEYEANGLESG + OVRVector2f.Y); }
	public static void TanEyeAnglesBGet(ByteBuffer ovrdistortionvertex, ByteBuffer TanEyeAnglesB) { checkBuffer(TanEyeAnglesB, OVRVector2f.SIZEOF); memCopy(memAddress(ovrdistortionvertex) + TANEYEANGLESB, memAddress(TanEyeAnglesB), OVRVector2f.SIZEOF); }
	public static float TanEyeAnglesBX(ByteBuffer ovrdistortionvertex) { return ovrdistortionvertex.getFloat(ovrdistortionvertex.position() + TANEYEANGLESB + OVRVector2f.X); }
	public static float TanEyeAnglesBY(ByteBuffer ovrdistortionvertex) { return ovrdistortionvertex.getFloat(ovrdistortionvertex.position() + TANEYEANGLESB + OVRVector2f.Y); }

}