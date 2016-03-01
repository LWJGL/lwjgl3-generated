/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * rendering information for each eye. Computed by either {@link OVR#ovr_GetRenderDesc OVR.ovr_GetRenderDesc} based on the specified FOV. Note that the rendering viewport is not
 * included here as it can be specified separately and modified per frame by passing different viewport values in the layer structure.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct ovrEyeRenderDesc {
    ovrEyeType Eye;
    {@link OVRFovPort ovrFovPort} Fov;
    {@link OVRRecti ovrRecti} DistortedViewport;
    {@link OVRVector2f ovrVector2f} PixelsPerTanAngleAtCenter;
    {@link OVRVector3f ovrVector3f} HmdToEyeViewOffset;
}</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table class=lwjgl>
 * <tr><td>Eye</td><td>the eye index this instance corresponds to</td></tr>
 * <tr><td>Fov</td><td>the field of view</td></tr>
 * <tr><td>DistortedViewport</td><td>distortion viewport</td></tr>
 * <tr><td>PixelsPerTanAngleAtCenter</td><td>wow many display pixels will fit in tan(angle) = 1</td></tr>
 * <tr><td>HmdToEyeViewOffset</td><td>translation to be applied to view matrix for each eye offset</td></tr>
 * </table>
 */
public class OVREyeRenderDesc extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		EYE,
		FOV,
		DISTORTEDVIEWPORT,
		PIXELSPERTANANGLEATCENTER,
		HMDTOEYEVIEWOFFSET;

	static {
		Layout layout = __struct(
			__member(4),
			__member(OVRFovPort.SIZEOF, OVRFovPort.__ALIGNMENT),
			__member(OVRRecti.SIZEOF, OVRRecti.__ALIGNMENT),
			__member(OVRVector2f.SIZEOF, OVRVector2f.__ALIGNMENT),
			__member(OVRVector3f.SIZEOF, OVRVector3f.__ALIGNMENT)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		EYE = layout.offsetof(0);
		FOV = layout.offsetof(1);
		DISTORTEDVIEWPORT = layout.offsetof(2);
		PIXELSPERTANANGLEATCENTER = layout.offsetof(3);
		HMDTOEYEVIEWOFFSET = layout.offsetof(4);
	}

	OVREyeRenderDesc(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link OVREyeRenderDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVREyeRenderDesc(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code Eye} field. */
	public int Eye() { return nEye(address()); }
	/** Returns a {@link OVRFovPort} view of the {@code Fov} field. */
	public OVRFovPort Fov() { return nFov(address()); }
	/** Returns a {@link OVRRecti} view of the {@code DistortedViewport} field. */
	public OVRRecti DistortedViewport() { return nDistortedViewport(address()); }
	/** Returns a {@link OVRVector2f} view of the {@code PixelsPerTanAngleAtCenter} field. */
	public OVRVector2f PixelsPerTanAngleAtCenter() { return nPixelsPerTanAngleAtCenter(address()); }
	/** Returns a {@link OVRVector3f} view of the {@code HmdToEyeViewOffset} field. */
	public OVRVector3f HmdToEyeViewOffset() { return nHmdToEyeViewOffset(address()); }

	// -----------------------------------

	/** Returns a new {@link OVREyeRenderDesc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static OVREyeRenderDesc malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVREyeRenderDesc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static OVREyeRenderDesc calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVREyeRenderDesc} instance allocated with {@link BufferUtils}. */
	public static OVREyeRenderDesc create() {
		return new OVREyeRenderDesc(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link OVREyeRenderDesc} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static OVREyeRenderDesc create(long address) {
		return address == NULL ? null : new OVREyeRenderDesc(address, null);
	}

	/**
	 * Returns a new {@link OVREyeRenderDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVREyeRenderDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVREyeRenderDesc.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link OVREyeRenderDesc.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #Eye}. */
	public static int nEye(long struct) { return memGetInt(struct + OVREyeRenderDesc.EYE); }
	/** Unsafe version of {@link #Fov}. */
	public static OVRFovPort nFov(long struct) { return OVRFovPort.create(struct + OVREyeRenderDesc.FOV); }
	/** Unsafe version of {@link #DistortedViewport}. */
	public static OVRRecti nDistortedViewport(long struct) { return OVRRecti.create(struct + OVREyeRenderDesc.DISTORTEDVIEWPORT); }
	/** Unsafe version of {@link #PixelsPerTanAngleAtCenter}. */
	public static OVRVector2f nPixelsPerTanAngleAtCenter(long struct) { return OVRVector2f.create(struct + OVREyeRenderDesc.PIXELSPERTANANGLEATCENTER); }
	/** Unsafe version of {@link #HmdToEyeViewOffset}. */
	public static OVRVector3f nHmdToEyeViewOffset(long struct) { return OVRVector3f.create(struct + OVREyeRenderDesc.HMDTOEYEVIEWOFFSET); }

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
			super(container, container.remaining() / SIZEOF);
		}

		Buffer(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			super(address, container, mark, pos, lim, cap);
		}

		@Override
		protected Buffer self() {
			return this;
		}

		@Override
		protected Buffer newBufferInstance(long address, ByteBuffer container, int mark, int pos, int lim, int cap) {
			return new Buffer(address, container, mark, pos, lim, cap);
		}

		@Override
		protected OVREyeRenderDesc newInstance(long address) {
			return new OVREyeRenderDesc(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code Eye} field. */
		public int Eye() { return OVREyeRenderDesc.nEye(address()); }
		/** Returns a {@link OVRFovPort} view of the {@code Fov} field. */
		public OVRFovPort Fov() { return OVREyeRenderDesc.nFov(address()); }
		/** Returns a {@link OVRRecti} view of the {@code DistortedViewport} field. */
		public OVRRecti DistortedViewport() { return OVREyeRenderDesc.nDistortedViewport(address()); }
		/** Returns a {@link OVRVector2f} view of the {@code PixelsPerTanAngleAtCenter} field. */
		public OVRVector2f PixelsPerTanAngleAtCenter() { return OVREyeRenderDesc.nPixelsPerTanAngleAtCenter(address()); }
		/** Returns a {@link OVRVector3f} view of the {@code HmdToEyeViewOffset} field. */
		public OVRVector3f HmdToEyeViewOffset() { return OVREyeRenderDesc.nHmdToEyeViewOffset(address()); }

	}

}