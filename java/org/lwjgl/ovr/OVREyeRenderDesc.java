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
 * Rendering information for each eye. Computed by either {@link OVR#ovrHmd_GetRenderDesc} based on the specified FOV. Note that the rendering viewport is not
 * included here as it can be specified separately and modified per frame by passing different viewport values in the layer structure.
 */
public final class OVREyeRenderDesc implements Pointer {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		EYE,
		FOV,
		DISTORTEDVIEWPORT,
		PIXELSPERTANANGLEATCENTER,
		HMDTOEYEVIEWOFFSET;

	static {
		IntBuffer offsets = memAllocInt(5);

		SIZEOF = offsets(memAddress(offsets));

		EYE = offsets.get(0);
		FOV = offsets.get(1);
		DISTORTEDVIEWPORT = offsets.get(2);
		PIXELSPERTANANGLEATCENTER = offsets.get(3);
		HMDTOEYEVIEWOFFSET = offsets.get(4);

		memFree(offsets);
	}

	private final ByteBuffer struct;

	public OVREyeRenderDesc() {
		this(malloc());
	}

	public OVREyeRenderDesc(ByteBuffer struct) {
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

	public OVREyeRenderDesc setEye(int Eye) { Eye(struct, Eye); return this; }
	public OVREyeRenderDesc setFov(ByteBuffer Fov) { FovSet(struct, Fov); return this; }
	public OVREyeRenderDesc setFovUpTan(float UpTan) { FovUpTan(struct, UpTan); return this; }
	public OVREyeRenderDesc setFovDownTan(float DownTan) { FovDownTan(struct, DownTan); return this; }
	public OVREyeRenderDesc setFovLeftTan(float LeftTan) { FovLeftTan(struct, LeftTan); return this; }
	public OVREyeRenderDesc setFovRightTan(float RightTan) { FovRightTan(struct, RightTan); return this; }
	public OVREyeRenderDesc setDistortedViewport(ByteBuffer DistortedViewport) { DistortedViewportSet(struct, DistortedViewport); return this; }
	public OVREyeRenderDesc setDistortedViewportPos(ByteBuffer Pos) { DistortedViewportPosSet(struct, Pos); return this; }
	public OVREyeRenderDesc setDistortedViewportPosX(int x) { DistortedViewportPosX(struct, x); return this; }
	public OVREyeRenderDesc setDistortedViewportPosY(int y) { DistortedViewportPosY(struct, y); return this; }
	public OVREyeRenderDesc setDistortedViewportSize(ByteBuffer Size) { DistortedViewportSizeSet(struct, Size); return this; }
	public OVREyeRenderDesc setDistortedViewportSizeW(int w) { DistortedViewportSizeW(struct, w); return this; }
	public OVREyeRenderDesc setDistortedViewportSizeH(int h) { DistortedViewportSizeH(struct, h); return this; }
	public OVREyeRenderDesc setPixelsPerTanAngleAtCenter(ByteBuffer PixelsPerTanAngleAtCenter) { PixelsPerTanAngleAtCenterSet(struct, PixelsPerTanAngleAtCenter); return this; }
	public OVREyeRenderDesc setPixelsPerTanAngleAtCenterX(float x) { PixelsPerTanAngleAtCenterX(struct, x); return this; }
	public OVREyeRenderDesc setPixelsPerTanAngleAtCenterY(float y) { PixelsPerTanAngleAtCenterY(struct, y); return this; }
	public OVREyeRenderDesc setHmdToEyeViewOffset(ByteBuffer HmdToEyeViewOffset) { HmdToEyeViewOffsetSet(struct, HmdToEyeViewOffset); return this; }
	public OVREyeRenderDesc setHmdToEyeViewOffsetX(float x) { HmdToEyeViewOffsetX(struct, x); return this; }
	public OVREyeRenderDesc setHmdToEyeViewOffsetY(float y) { HmdToEyeViewOffsetY(struct, y); return this; }
	public OVREyeRenderDesc setHmdToEyeViewOffsetZ(float z) { HmdToEyeViewOffsetZ(struct, z); return this; }

	public int getEye() { return Eye(struct); }
	public void getFov(ByteBuffer Fov) { FovGet(struct, Fov); }
	public float getFovUpTan() { return FovUpTan(struct); }
	public float getFovDownTan() { return FovDownTan(struct); }
	public float getFovLeftTan() { return FovLeftTan(struct); }
	public float getFovRightTan() { return FovRightTan(struct); }
	public void getDistortedViewport(ByteBuffer DistortedViewport) { DistortedViewportGet(struct, DistortedViewport); }
	public void getDistortedViewportPos(ByteBuffer Pos) { DistortedViewportPosGet(struct, Pos); }
	public int getDistortedViewportPosX() { return DistortedViewportPosX(struct); }
	public int getDistortedViewportPosY() { return DistortedViewportPosY(struct); }
	public void getDistortedViewportSize(ByteBuffer Size) { DistortedViewportSizeGet(struct, Size); }
	public int getDistortedViewportSizeW() { return DistortedViewportSizeW(struct); }
	public int getDistortedViewportSizeH() { return DistortedViewportSizeH(struct); }
	public void getPixelsPerTanAngleAtCenter(ByteBuffer PixelsPerTanAngleAtCenter) { PixelsPerTanAngleAtCenterGet(struct, PixelsPerTanAngleAtCenter); }
	public float getPixelsPerTanAngleAtCenterX() { return PixelsPerTanAngleAtCenterX(struct); }
	public float getPixelsPerTanAngleAtCenterY() { return PixelsPerTanAngleAtCenterY(struct); }
	public void getHmdToEyeViewOffset(ByteBuffer HmdToEyeViewOffset) { HmdToEyeViewOffsetGet(struct, HmdToEyeViewOffset); }
	public float getHmdToEyeViewOffsetX() { return HmdToEyeViewOffsetX(struct); }
	public float getHmdToEyeViewOffsetY() { return HmdToEyeViewOffsetY(struct); }
	public float getHmdToEyeViewOffsetZ() { return HmdToEyeViewOffsetZ(struct); }

	// -----------------------------------

	private static native int offsets(long buffer);

	/** Returns a new {@link ByteBuffer} instance with a capacity equal to {@link #SIZEOF}. */
	public static ByteBuffer malloc() { return BufferUtils.createByteBuffer(SIZEOF); }

	/** Virtual constructor. Calls {@link #malloc} and initializes the returned {@link ByteBuffer} instance with the specified values. */
	public static ByteBuffer malloc(
		int Eye,
		ByteBuffer Fov,
		ByteBuffer DistortedViewport,
		ByteBuffer PixelsPerTanAngleAtCenter,
		ByteBuffer HmdToEyeViewOffset
	) {
		ByteBuffer ovreyerenderdesc = malloc();

		Eye(ovreyerenderdesc, Eye);
		FovSet(ovreyerenderdesc, Fov);
		DistortedViewportSet(ovreyerenderdesc, DistortedViewport);
		PixelsPerTanAngleAtCenterSet(ovreyerenderdesc, PixelsPerTanAngleAtCenter);
		HmdToEyeViewOffsetSet(ovreyerenderdesc, HmdToEyeViewOffset);

		return ovreyerenderdesc;
	}

	public static void Eye(ByteBuffer ovreyerenderdesc, int Eye) { ovreyerenderdesc.putInt(ovreyerenderdesc.position() + EYE, Eye); }
	public static void FovSet(ByteBuffer ovreyerenderdesc, ByteBuffer Fov) { if ( Fov != null ) memCopy(memAddress(Fov), memAddress(ovreyerenderdesc) + FOV, OVRFovPort.SIZEOF); }
	public static void FovUpTan(ByteBuffer ovreyerenderdesc, float UpTan) { ovreyerenderdesc.putFloat(ovreyerenderdesc.position() + FOV + OVRFovPort.UPTAN, UpTan); }
	public static void FovDownTan(ByteBuffer ovreyerenderdesc, float DownTan) { ovreyerenderdesc.putFloat(ovreyerenderdesc.position() + FOV + OVRFovPort.DOWNTAN, DownTan); }
	public static void FovLeftTan(ByteBuffer ovreyerenderdesc, float LeftTan) { ovreyerenderdesc.putFloat(ovreyerenderdesc.position() + FOV + OVRFovPort.LEFTTAN, LeftTan); }
	public static void FovRightTan(ByteBuffer ovreyerenderdesc, float RightTan) { ovreyerenderdesc.putFloat(ovreyerenderdesc.position() + FOV + OVRFovPort.RIGHTTAN, RightTan); }
	public static void DistortedViewportSet(ByteBuffer ovreyerenderdesc, ByteBuffer DistortedViewport) { if ( DistortedViewport != null ) memCopy(memAddress(DistortedViewport), memAddress(ovreyerenderdesc) + DISTORTEDVIEWPORT, OVRRecti.SIZEOF); }
	public static void DistortedViewportPosSet(ByteBuffer ovreyerenderdesc, ByteBuffer Pos) { if ( Pos != null ) memCopy(memAddress(Pos), memAddress(ovreyerenderdesc) + DISTORTEDVIEWPORT + OVRRecti.POS, OVRVector2i.SIZEOF); }
	public static void DistortedViewportPosX(ByteBuffer ovreyerenderdesc, int x) { ovreyerenderdesc.putInt(ovreyerenderdesc.position() + DISTORTEDVIEWPORT + OVRRecti.POS + OVRVector2i.X, x); }
	public static void DistortedViewportPosY(ByteBuffer ovreyerenderdesc, int y) { ovreyerenderdesc.putInt(ovreyerenderdesc.position() + DISTORTEDVIEWPORT + OVRRecti.POS + OVRVector2i.Y, y); }
	public static void DistortedViewportSizeSet(ByteBuffer ovreyerenderdesc, ByteBuffer Size) { if ( Size != null ) memCopy(memAddress(Size), memAddress(ovreyerenderdesc) + DISTORTEDVIEWPORT + OVRRecti.SIZE, OVRSizei.SIZEOF); }
	public static void DistortedViewportSizeW(ByteBuffer ovreyerenderdesc, int w) { ovreyerenderdesc.putInt(ovreyerenderdesc.position() + DISTORTEDVIEWPORT + OVRRecti.SIZE + OVRSizei.W, w); }
	public static void DistortedViewportSizeH(ByteBuffer ovreyerenderdesc, int h) { ovreyerenderdesc.putInt(ovreyerenderdesc.position() + DISTORTEDVIEWPORT + OVRRecti.SIZE + OVRSizei.H, h); }
	public static void PixelsPerTanAngleAtCenterSet(ByteBuffer ovreyerenderdesc, ByteBuffer PixelsPerTanAngleAtCenter) { if ( PixelsPerTanAngleAtCenter != null ) memCopy(memAddress(PixelsPerTanAngleAtCenter), memAddress(ovreyerenderdesc) + PIXELSPERTANANGLEATCENTER, OVRVector2f.SIZEOF); }
	public static void PixelsPerTanAngleAtCenterX(ByteBuffer ovreyerenderdesc, float x) { ovreyerenderdesc.putFloat(ovreyerenderdesc.position() + PIXELSPERTANANGLEATCENTER + OVRVector2f.X, x); }
	public static void PixelsPerTanAngleAtCenterY(ByteBuffer ovreyerenderdesc, float y) { ovreyerenderdesc.putFloat(ovreyerenderdesc.position() + PIXELSPERTANANGLEATCENTER + OVRVector2f.Y, y); }
	public static void HmdToEyeViewOffsetSet(ByteBuffer ovreyerenderdesc, ByteBuffer HmdToEyeViewOffset) { if ( HmdToEyeViewOffset != null ) memCopy(memAddress(HmdToEyeViewOffset), memAddress(ovreyerenderdesc) + HMDTOEYEVIEWOFFSET, OVRVector3f.SIZEOF); }
	public static void HmdToEyeViewOffsetX(ByteBuffer ovreyerenderdesc, float x) { ovreyerenderdesc.putFloat(ovreyerenderdesc.position() + HMDTOEYEVIEWOFFSET + OVRVector3f.X, x); }
	public static void HmdToEyeViewOffsetY(ByteBuffer ovreyerenderdesc, float y) { ovreyerenderdesc.putFloat(ovreyerenderdesc.position() + HMDTOEYEVIEWOFFSET + OVRVector3f.Y, y); }
	public static void HmdToEyeViewOffsetZ(ByteBuffer ovreyerenderdesc, float z) { ovreyerenderdesc.putFloat(ovreyerenderdesc.position() + HMDTOEYEVIEWOFFSET + OVRVector3f.Z, z); }

	public static int Eye(ByteBuffer ovreyerenderdesc) { return ovreyerenderdesc.getInt(ovreyerenderdesc.position() + EYE); }
	public static void FovGet(ByteBuffer ovreyerenderdesc, ByteBuffer Fov) { if ( LWJGLUtil.CHECKS ) checkBuffer(Fov, OVRFovPort.SIZEOF); memCopy(memAddress(ovreyerenderdesc) + FOV, memAddress(Fov), OVRFovPort.SIZEOF); }
	public static float FovUpTan(ByteBuffer ovreyerenderdesc) { return ovreyerenderdesc.getFloat(ovreyerenderdesc.position() + FOV + OVRFovPort.UPTAN); }
	public static float FovDownTan(ByteBuffer ovreyerenderdesc) { return ovreyerenderdesc.getFloat(ovreyerenderdesc.position() + FOV + OVRFovPort.DOWNTAN); }
	public static float FovLeftTan(ByteBuffer ovreyerenderdesc) { return ovreyerenderdesc.getFloat(ovreyerenderdesc.position() + FOV + OVRFovPort.LEFTTAN); }
	public static float FovRightTan(ByteBuffer ovreyerenderdesc) { return ovreyerenderdesc.getFloat(ovreyerenderdesc.position() + FOV + OVRFovPort.RIGHTTAN); }
	public static void DistortedViewportGet(ByteBuffer ovreyerenderdesc, ByteBuffer DistortedViewport) { if ( LWJGLUtil.CHECKS ) checkBuffer(DistortedViewport, OVRRecti.SIZEOF); memCopy(memAddress(ovreyerenderdesc) + DISTORTEDVIEWPORT, memAddress(DistortedViewport), OVRRecti.SIZEOF); }
	public static void DistortedViewportPosGet(ByteBuffer ovreyerenderdesc, ByteBuffer Pos) { if ( LWJGLUtil.CHECKS ) checkBuffer(Pos, OVRVector2i.SIZEOF); memCopy(memAddress(ovreyerenderdesc) + DISTORTEDVIEWPORT + OVRRecti.POS, memAddress(Pos), OVRVector2i.SIZEOF); }
	public static int DistortedViewportPosX(ByteBuffer ovreyerenderdesc) { return ovreyerenderdesc.getInt(ovreyerenderdesc.position() + DISTORTEDVIEWPORT + OVRRecti.POS + OVRVector2i.X); }
	public static int DistortedViewportPosY(ByteBuffer ovreyerenderdesc) { return ovreyerenderdesc.getInt(ovreyerenderdesc.position() + DISTORTEDVIEWPORT + OVRRecti.POS + OVRVector2i.Y); }
	public static void DistortedViewportSizeGet(ByteBuffer ovreyerenderdesc, ByteBuffer Size) { if ( LWJGLUtil.CHECKS ) checkBuffer(Size, OVRSizei.SIZEOF); memCopy(memAddress(ovreyerenderdesc) + DISTORTEDVIEWPORT + OVRRecti.SIZE, memAddress(Size), OVRSizei.SIZEOF); }
	public static int DistortedViewportSizeW(ByteBuffer ovreyerenderdesc) { return ovreyerenderdesc.getInt(ovreyerenderdesc.position() + DISTORTEDVIEWPORT + OVRRecti.SIZE + OVRSizei.W); }
	public static int DistortedViewportSizeH(ByteBuffer ovreyerenderdesc) { return ovreyerenderdesc.getInt(ovreyerenderdesc.position() + DISTORTEDVIEWPORT + OVRRecti.SIZE + OVRSizei.H); }
	public static void PixelsPerTanAngleAtCenterGet(ByteBuffer ovreyerenderdesc, ByteBuffer PixelsPerTanAngleAtCenter) { if ( LWJGLUtil.CHECKS ) checkBuffer(PixelsPerTanAngleAtCenter, OVRVector2f.SIZEOF); memCopy(memAddress(ovreyerenderdesc) + PIXELSPERTANANGLEATCENTER, memAddress(PixelsPerTanAngleAtCenter), OVRVector2f.SIZEOF); }
	public static float PixelsPerTanAngleAtCenterX(ByteBuffer ovreyerenderdesc) { return ovreyerenderdesc.getFloat(ovreyerenderdesc.position() + PIXELSPERTANANGLEATCENTER + OVRVector2f.X); }
	public static float PixelsPerTanAngleAtCenterY(ByteBuffer ovreyerenderdesc) { return ovreyerenderdesc.getFloat(ovreyerenderdesc.position() + PIXELSPERTANANGLEATCENTER + OVRVector2f.Y); }
	public static void HmdToEyeViewOffsetGet(ByteBuffer ovreyerenderdesc, ByteBuffer HmdToEyeViewOffset) { if ( LWJGLUtil.CHECKS ) checkBuffer(HmdToEyeViewOffset, OVRVector3f.SIZEOF); memCopy(memAddress(ovreyerenderdesc) + HMDTOEYEVIEWOFFSET, memAddress(HmdToEyeViewOffset), OVRVector3f.SIZEOF); }
	public static float HmdToEyeViewOffsetX(ByteBuffer ovreyerenderdesc) { return ovreyerenderdesc.getFloat(ovreyerenderdesc.position() + HMDTOEYEVIEWOFFSET + OVRVector3f.X); }
	public static float HmdToEyeViewOffsetY(ByteBuffer ovreyerenderdesc) { return ovreyerenderdesc.getFloat(ovreyerenderdesc.position() + HMDTOEYEVIEWOFFSET + OVRVector3f.Y); }
	public static float HmdToEyeViewOffsetZ(ByteBuffer ovreyerenderdesc) { return ovreyerenderdesc.getFloat(ovreyerenderdesc.position() + HMDTOEYEVIEWOFFSET + OVRVector3f.Z); }

}