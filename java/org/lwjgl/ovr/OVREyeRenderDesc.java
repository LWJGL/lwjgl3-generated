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
public class OVREyeRenderDesc extends Struct {

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

	/**
	 * Create a {@link OVREyeRenderDesc.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
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

	}

}