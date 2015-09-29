/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * Rendering information for each eye. Computed by either {@link OVR#ovrHmd_GetRenderDesc} based on the specified FOV. Note that the rendering viewport is not
 * included here as it can be specified separately and modified per frame by passing different viewport values in the layer structure.
 */
public final class OVREyeRenderDesc extends Struct {

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

	private static native int offsets(long buffer);

	OVREyeRenderDesc(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVREyeRenderDesc} instance at the specified memory address. */
	public OVREyeRenderDesc(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVREyeRenderDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVREyeRenderDesc(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public int getEye() { return ngetEye(address()); }
	public OVRFovPort getFov() { return ngetFov(address()); }
	public float getFovUpTan() { return ngetFovUpTan(address()); }
	public float getFovDownTan() { return ngetFovDownTan(address()); }
	public float getFovLeftTan() { return ngetFovLeftTan(address()); }
	public float getFovRightTan() { return ngetFovRightTan(address()); }
	public OVRRecti getDistortedViewport() { return ngetDistortedViewport(address()); }
	public OVRVector2i getDistortedViewportPos() { return ngetDistortedViewportPos(address()); }
	public int getDistortedViewportPosX() { return ngetDistortedViewportPosX(address()); }
	public int getDistortedViewportPosY() { return ngetDistortedViewportPosY(address()); }
	public OVRSizei getDistortedViewportSize() { return ngetDistortedViewportSize(address()); }
	public int getDistortedViewportSizeW() { return ngetDistortedViewportSizeW(address()); }
	public int getDistortedViewportSizeH() { return ngetDistortedViewportSizeH(address()); }
	public OVRVector2f getPixelsPerTanAngleAtCenter() { return ngetPixelsPerTanAngleAtCenter(address()); }
	public float getPixelsPerTanAngleAtCenterX() { return ngetPixelsPerTanAngleAtCenterX(address()); }
	public float getPixelsPerTanAngleAtCenterY() { return ngetPixelsPerTanAngleAtCenterY(address()); }
	public OVRVector3f getHmdToEyeViewOffset() { return ngetHmdToEyeViewOffset(address()); }
	public float getHmdToEyeViewOffsetX() { return ngetHmdToEyeViewOffsetX(address()); }
	public float getHmdToEyeViewOffsetY() { return ngetHmdToEyeViewOffsetY(address()); }
	public float getHmdToEyeViewOffsetZ() { return ngetHmdToEyeViewOffsetZ(address()); }

	public OVREyeRenderDesc setEye(int Eye) { nsetEye(address(), Eye); return this; }
	public OVREyeRenderDesc setFov(OVRFovPort Fov) { nsetFov(address(), Fov); return this; }
	public OVREyeRenderDesc setFovUpTan(float UpTan) { nsetFovUpTan(address(), UpTan); return this; }
	public OVREyeRenderDesc setFovDownTan(float DownTan) { nsetFovDownTan(address(), DownTan); return this; }
	public OVREyeRenderDesc setFovLeftTan(float LeftTan) { nsetFovLeftTan(address(), LeftTan); return this; }
	public OVREyeRenderDesc setFovRightTan(float RightTan) { nsetFovRightTan(address(), RightTan); return this; }
	public OVREyeRenderDesc setDistortedViewport(OVRRecti DistortedViewport) { nsetDistortedViewport(address(), DistortedViewport); return this; }
	public OVREyeRenderDesc setDistortedViewportPos(OVRVector2i Pos) { nsetDistortedViewportPos(address(), Pos); return this; }
	public OVREyeRenderDesc setDistortedViewportPosX(int x) { nsetDistortedViewportPosX(address(), x); return this; }
	public OVREyeRenderDesc setDistortedViewportPosY(int y) { nsetDistortedViewportPosY(address(), y); return this; }
	public OVREyeRenderDesc setDistortedViewportSize(OVRSizei Size) { nsetDistortedViewportSize(address(), Size); return this; }
	public OVREyeRenderDesc setDistortedViewportSizeW(int w) { nsetDistortedViewportSizeW(address(), w); return this; }
	public OVREyeRenderDesc setDistortedViewportSizeH(int h) { nsetDistortedViewportSizeH(address(), h); return this; }
	public OVREyeRenderDesc setPixelsPerTanAngleAtCenter(OVRVector2f PixelsPerTanAngleAtCenter) { nsetPixelsPerTanAngleAtCenter(address(), PixelsPerTanAngleAtCenter); return this; }
	public OVREyeRenderDesc setPixelsPerTanAngleAtCenterX(float x) { nsetPixelsPerTanAngleAtCenterX(address(), x); return this; }
	public OVREyeRenderDesc setPixelsPerTanAngleAtCenterY(float y) { nsetPixelsPerTanAngleAtCenterY(address(), y); return this; }
	public OVREyeRenderDesc setHmdToEyeViewOffset(OVRVector3f HmdToEyeViewOffset) { nsetHmdToEyeViewOffset(address(), HmdToEyeViewOffset); return this; }
	public OVREyeRenderDesc setHmdToEyeViewOffsetX(float x) { nsetHmdToEyeViewOffsetX(address(), x); return this; }
	public OVREyeRenderDesc setHmdToEyeViewOffsetY(float y) { nsetHmdToEyeViewOffsetY(address(), y); return this; }
	public OVREyeRenderDesc setHmdToEyeViewOffsetZ(float z) { nsetHmdToEyeViewOffsetZ(address(), z); return this; }

	/** Initializes this struct with the specified values. */
	public OVREyeRenderDesc set(
		int Eye,
		OVRFovPort Fov,
		OVRRecti DistortedViewport,
		OVRVector2f PixelsPerTanAngleAtCenter,
		OVRVector3f HmdToEyeViewOffset
	) {
		setEye(Eye);
		setFov(Fov);
		setDistortedViewport(DistortedViewport);
		setPixelsPerTanAngleAtCenter(PixelsPerTanAngleAtCenter);
		setHmdToEyeViewOffset(HmdToEyeViewOffset);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public OVREyeRenderDesc nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @returns this struct
	 */
	public OVREyeRenderDesc set(OVREyeRenderDesc src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public OVREyeRenderDesc set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVREyeRenderDesc} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVREyeRenderDesc malloc() {
		return new OVREyeRenderDesc(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVREyeRenderDesc} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVREyeRenderDesc calloc() {
		return new OVREyeRenderDesc(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVREyeRenderDesc} instance allocated with {@link BufferUtils}. */
	public static OVREyeRenderDesc create() {
		return new OVREyeRenderDesc(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVREyeRenderDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVREyeRenderDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVREyeRenderDesc.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static int ngetEye(long struct) { return memGetInt(struct + EYE); }
	public static int getEye(ByteBuffer struct) { return ngetEye(memAddress(struct)); }
	public static OVRFovPort ngetFov(long struct) { return OVRFovPort.malloc().nset(struct + FOV); }
	/** Returns a copy of the {@code Fov} {@link OVRFovPort} struct. */
	public static OVRFovPort getFov(ByteBuffer struct) { return ngetFov(memAddress(struct)); }
	public static float ngetFovUpTan(long struct) { return memGetFloat(struct + FOV + OVRFovPort.UPTAN); }
	public static float getFovUpTan(ByteBuffer struct) { return ngetFovUpTan(memAddress(struct)); }
	public static float ngetFovDownTan(long struct) { return memGetFloat(struct + FOV + OVRFovPort.DOWNTAN); }
	public static float getFovDownTan(ByteBuffer struct) { return ngetFovDownTan(memAddress(struct)); }
	public static float ngetFovLeftTan(long struct) { return memGetFloat(struct + FOV + OVRFovPort.LEFTTAN); }
	public static float getFovLeftTan(ByteBuffer struct) { return ngetFovLeftTan(memAddress(struct)); }
	public static float ngetFovRightTan(long struct) { return memGetFloat(struct + FOV + OVRFovPort.RIGHTTAN); }
	public static float getFovRightTan(ByteBuffer struct) { return ngetFovRightTan(memAddress(struct)); }
	public static OVRRecti ngetDistortedViewport(long struct) { return OVRRecti.malloc().nset(struct + DISTORTEDVIEWPORT); }
	/** Returns a copy of the {@code DistortedViewport} {@link OVRRecti} struct. */
	public static OVRRecti getDistortedViewport(ByteBuffer struct) { return ngetDistortedViewport(memAddress(struct)); }
	public static OVRVector2i ngetDistortedViewportPos(long struct) { return OVRVector2i.malloc().nset(struct + DISTORTEDVIEWPORT + OVRRecti.POS); }
	/** Returns a copy of the {@code Pos} {@link OVRVector2i} struct. */
	public static OVRVector2i getDistortedViewportPos(ByteBuffer struct) { return ngetDistortedViewportPos(memAddress(struct)); }
	public static int ngetDistortedViewportPosX(long struct) { return memGetInt(struct + DISTORTEDVIEWPORT + OVRRecti.POS + OVRVector2i.X); }
	public static int getDistortedViewportPosX(ByteBuffer struct) { return ngetDistortedViewportPosX(memAddress(struct)); }
	public static int ngetDistortedViewportPosY(long struct) { return memGetInt(struct + DISTORTEDVIEWPORT + OVRRecti.POS + OVRVector2i.Y); }
	public static int getDistortedViewportPosY(ByteBuffer struct) { return ngetDistortedViewportPosY(memAddress(struct)); }
	public static OVRSizei ngetDistortedViewportSize(long struct) { return OVRSizei.malloc().nset(struct + DISTORTEDVIEWPORT + OVRRecti.SIZE); }
	/** Returns a copy of the {@code Size} {@link OVRSizei} struct. */
	public static OVRSizei getDistortedViewportSize(ByteBuffer struct) { return ngetDistortedViewportSize(memAddress(struct)); }
	public static int ngetDistortedViewportSizeW(long struct) { return memGetInt(struct + DISTORTEDVIEWPORT + OVRRecti.SIZE + OVRSizei.W); }
	public static int getDistortedViewportSizeW(ByteBuffer struct) { return ngetDistortedViewportSizeW(memAddress(struct)); }
	public static int ngetDistortedViewportSizeH(long struct) { return memGetInt(struct + DISTORTEDVIEWPORT + OVRRecti.SIZE + OVRSizei.H); }
	public static int getDistortedViewportSizeH(ByteBuffer struct) { return ngetDistortedViewportSizeH(memAddress(struct)); }
	public static OVRVector2f ngetPixelsPerTanAngleAtCenter(long struct) { return OVRVector2f.malloc().nset(struct + PIXELSPERTANANGLEATCENTER); }
	/** Returns a copy of the {@code PixelsPerTanAngleAtCenter} {@link OVRVector2f} struct. */
	public static OVRVector2f getPixelsPerTanAngleAtCenter(ByteBuffer struct) { return ngetPixelsPerTanAngleAtCenter(memAddress(struct)); }
	public static float ngetPixelsPerTanAngleAtCenterX(long struct) { return memGetFloat(struct + PIXELSPERTANANGLEATCENTER + OVRVector2f.X); }
	public static float getPixelsPerTanAngleAtCenterX(ByteBuffer struct) { return ngetPixelsPerTanAngleAtCenterX(memAddress(struct)); }
	public static float ngetPixelsPerTanAngleAtCenterY(long struct) { return memGetFloat(struct + PIXELSPERTANANGLEATCENTER + OVRVector2f.Y); }
	public static float getPixelsPerTanAngleAtCenterY(ByteBuffer struct) { return ngetPixelsPerTanAngleAtCenterY(memAddress(struct)); }
	public static OVRVector3f ngetHmdToEyeViewOffset(long struct) { return OVRVector3f.malloc().nset(struct + HMDTOEYEVIEWOFFSET); }
	/** Returns a copy of the {@code HmdToEyeViewOffset} {@link OVRVector3f} struct. */
	public static OVRVector3f getHmdToEyeViewOffset(ByteBuffer struct) { return ngetHmdToEyeViewOffset(memAddress(struct)); }
	public static float ngetHmdToEyeViewOffsetX(long struct) { return memGetFloat(struct + HMDTOEYEVIEWOFFSET + OVRVector3f.X); }
	public static float getHmdToEyeViewOffsetX(ByteBuffer struct) { return ngetHmdToEyeViewOffsetX(memAddress(struct)); }
	public static float ngetHmdToEyeViewOffsetY(long struct) { return memGetFloat(struct + HMDTOEYEVIEWOFFSET + OVRVector3f.Y); }
	public static float getHmdToEyeViewOffsetY(ByteBuffer struct) { return ngetHmdToEyeViewOffsetY(memAddress(struct)); }
	public static float ngetHmdToEyeViewOffsetZ(long struct) { return memGetFloat(struct + HMDTOEYEVIEWOFFSET + OVRVector3f.Z); }
	public static float getHmdToEyeViewOffsetZ(ByteBuffer struct) { return ngetHmdToEyeViewOffsetZ(memAddress(struct)); }

	public static void nsetEye(long struct, int Eye) { memPutInt(struct + EYE, Eye); }
	public static void setEye(ByteBuffer struct, int Eye) { nsetEye(memAddress(struct), Eye); }
	public static void nsetFov(long struct, OVRFovPort Fov) { memCopy(Fov.address(), struct + FOV, OVRFovPort.SIZEOF); }
	/** Copies the specified {@link OVRFovPort} struct to the nested {@code Fov} struct. */
	public static void setFov(ByteBuffer struct, OVRFovPort Fov) { nsetFov(memAddress(struct), Fov); }
	public static void nsetFovUpTan(long struct, float UpTan) { memPutFloat(struct + FOV + OVRFovPort.UPTAN, UpTan); }
	public static void setFovUpTan(ByteBuffer struct, float UpTan) { nsetFovUpTan(memAddress(struct), UpTan); }
	public static void nsetFovDownTan(long struct, float DownTan) { memPutFloat(struct + FOV + OVRFovPort.DOWNTAN, DownTan); }
	public static void setFovDownTan(ByteBuffer struct, float DownTan) { nsetFovDownTan(memAddress(struct), DownTan); }
	public static void nsetFovLeftTan(long struct, float LeftTan) { memPutFloat(struct + FOV + OVRFovPort.LEFTTAN, LeftTan); }
	public static void setFovLeftTan(ByteBuffer struct, float LeftTan) { nsetFovLeftTan(memAddress(struct), LeftTan); }
	public static void nsetFovRightTan(long struct, float RightTan) { memPutFloat(struct + FOV + OVRFovPort.RIGHTTAN, RightTan); }
	public static void setFovRightTan(ByteBuffer struct, float RightTan) { nsetFovRightTan(memAddress(struct), RightTan); }
	public static void nsetDistortedViewport(long struct, OVRRecti DistortedViewport) { memCopy(DistortedViewport.address(), struct + DISTORTEDVIEWPORT, OVRRecti.SIZEOF); }
	/** Copies the specified {@link OVRRecti} struct to the nested {@code DistortedViewport} struct. */
	public static void setDistortedViewport(ByteBuffer struct, OVRRecti DistortedViewport) { nsetDistortedViewport(memAddress(struct), DistortedViewport); }
	public static void nsetDistortedViewportPos(long struct, OVRVector2i Pos) { memCopy(Pos.address(), struct + DISTORTEDVIEWPORT + OVRRecti.POS, OVRVector2i.SIZEOF); }
	/** Copies the specified {@link OVRVector2i} struct to the nested {@code Pos} struct. */
	public static void setDistortedViewportPos(ByteBuffer struct, OVRVector2i Pos) { nsetDistortedViewportPos(memAddress(struct), Pos); }
	public static void nsetDistortedViewportPosX(long struct, int x) { memPutInt(struct + DISTORTEDVIEWPORT + OVRRecti.POS + OVRVector2i.X, x); }
	public static void setDistortedViewportPosX(ByteBuffer struct, int x) { nsetDistortedViewportPosX(memAddress(struct), x); }
	public static void nsetDistortedViewportPosY(long struct, int y) { memPutInt(struct + DISTORTEDVIEWPORT + OVRRecti.POS + OVRVector2i.Y, y); }
	public static void setDistortedViewportPosY(ByteBuffer struct, int y) { nsetDistortedViewportPosY(memAddress(struct), y); }
	public static void nsetDistortedViewportSize(long struct, OVRSizei Size) { memCopy(Size.address(), struct + DISTORTEDVIEWPORT + OVRRecti.SIZE, OVRSizei.SIZEOF); }
	/** Copies the specified {@link OVRSizei} struct to the nested {@code Size} struct. */
	public static void setDistortedViewportSize(ByteBuffer struct, OVRSizei Size) { nsetDistortedViewportSize(memAddress(struct), Size); }
	public static void nsetDistortedViewportSizeW(long struct, int w) { memPutInt(struct + DISTORTEDVIEWPORT + OVRRecti.SIZE + OVRSizei.W, w); }
	public static void setDistortedViewportSizeW(ByteBuffer struct, int w) { nsetDistortedViewportSizeW(memAddress(struct), w); }
	public static void nsetDistortedViewportSizeH(long struct, int h) { memPutInt(struct + DISTORTEDVIEWPORT + OVRRecti.SIZE + OVRSizei.H, h); }
	public static void setDistortedViewportSizeH(ByteBuffer struct, int h) { nsetDistortedViewportSizeH(memAddress(struct), h); }
	public static void nsetPixelsPerTanAngleAtCenter(long struct, OVRVector2f PixelsPerTanAngleAtCenter) { memCopy(PixelsPerTanAngleAtCenter.address(), struct + PIXELSPERTANANGLEATCENTER, OVRVector2f.SIZEOF); }
	/** Copies the specified {@link OVRVector2f} struct to the nested {@code PixelsPerTanAngleAtCenter} struct. */
	public static void setPixelsPerTanAngleAtCenter(ByteBuffer struct, OVRVector2f PixelsPerTanAngleAtCenter) { nsetPixelsPerTanAngleAtCenter(memAddress(struct), PixelsPerTanAngleAtCenter); }
	public static void nsetPixelsPerTanAngleAtCenterX(long struct, float x) { memPutFloat(struct + PIXELSPERTANANGLEATCENTER + OVRVector2f.X, x); }
	public static void setPixelsPerTanAngleAtCenterX(ByteBuffer struct, float x) { nsetPixelsPerTanAngleAtCenterX(memAddress(struct), x); }
	public static void nsetPixelsPerTanAngleAtCenterY(long struct, float y) { memPutFloat(struct + PIXELSPERTANANGLEATCENTER + OVRVector2f.Y, y); }
	public static void setPixelsPerTanAngleAtCenterY(ByteBuffer struct, float y) { nsetPixelsPerTanAngleAtCenterY(memAddress(struct), y); }
	public static void nsetHmdToEyeViewOffset(long struct, OVRVector3f HmdToEyeViewOffset) { memCopy(HmdToEyeViewOffset.address(), struct + HMDTOEYEVIEWOFFSET, OVRVector3f.SIZEOF); }
	/** Copies the specified {@link OVRVector3f} struct to the nested {@code HmdToEyeViewOffset} struct. */
	public static void setHmdToEyeViewOffset(ByteBuffer struct, OVRVector3f HmdToEyeViewOffset) { nsetHmdToEyeViewOffset(memAddress(struct), HmdToEyeViewOffset); }
	public static void nsetHmdToEyeViewOffsetX(long struct, float x) { memPutFloat(struct + HMDTOEYEVIEWOFFSET + OVRVector3f.X, x); }
	public static void setHmdToEyeViewOffsetX(ByteBuffer struct, float x) { nsetHmdToEyeViewOffsetX(memAddress(struct), x); }
	public static void nsetHmdToEyeViewOffsetY(long struct, float y) { memPutFloat(struct + HMDTOEYEVIEWOFFSET + OVRVector3f.Y, y); }
	public static void setHmdToEyeViewOffsetY(ByteBuffer struct, float y) { nsetHmdToEyeViewOffsetY(memAddress(struct), y); }
	public static void nsetHmdToEyeViewOffsetZ(long struct, float z) { memPutFloat(struct + HMDTOEYEVIEWOFFSET + OVRVector3f.Z, z); }
	public static void setHmdToEyeViewOffsetZ(ByteBuffer struct, float z) { nsetHmdToEyeViewOffsetZ(memAddress(struct), z); }

	// -----------------------------------

	/** An array of {@link OVREyeRenderDesc} structs. */
	public static final class Buffer extends StructBuffer<OVREyeRenderDesc, Buffer> {

		/**
		 * Creates a new {@link OVREyeRenderDesc.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVREyeRenderDesc#SIZEOF}, and its mark will be undefined.
		 *
		 * <p>The created buffer instance holds a strong reference to the container object.</p>
		 */
		public Buffer(ByteBuffer container) {
			this(container.slice(), SIZEOF);
		}

		Buffer(ByteBuffer container, int SIZEOF) {
			super(container, SIZEOF);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(ByteBuffer buffer) {
			return new Buffer(buffer);
		}

		@Override
		protected OVREyeRenderDesc newInstance(long address) {
			return new OVREyeRenderDesc(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

	}

}