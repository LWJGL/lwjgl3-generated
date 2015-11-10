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
 * Contains the data necessary to properly calculate position info for various layer types.
 * <ul>
 * <li>{@code HmdToEyeViewOffset} is the same value pair provided in {@link OVREyeRenderDesc}.</li>
 * <li>{@code HmdSpaceToWorldScaleInMeters} is used to scale player motion into in-application units.</li>
 * </ul>
 * In other words, it is how big an in-application unit is in the player's physical meters. For example, if the application uses inches as its units then
 * {@code HmdSpaceToWorldScaleInMeters} would be 0.0254. Note that if you are scaling the player in size, this must also scale. So if your application
 * units are inches, but you're shrinking the player to half their normal size, then {@code HmdSpaceToWorldScaleInMeters} would be {@code 0.0254*2.0}.
 */
public class OVRViewScaleDesc extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		HMDTOEYEVIEWOFFSET,
		HMDSPACETOWORLDSCALEINMETERS;

	static {
		IntBuffer offsets = memAllocInt(2);

		SIZEOF = offsets(memAddress(offsets));

		HMDTOEYEVIEWOFFSET = offsets.get(0);
		HMDSPACETOWORLDSCALEINMETERS = offsets.get(1);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	OVRViewScaleDesc(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRViewScaleDesc} instance at the specified memory address. */
	public OVRViewScaleDesc(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRViewScaleDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRViewScaleDesc(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public void getHmdToEyeViewOffset(ByteBuffer HmdToEyeViewOffset) { ngetHmdToEyeViewOffset(address(), HmdToEyeViewOffset); }
	public OVRVector3f getHmdToEyeViewOffset(int index) { return ngetHmdToEyeViewOffset(address(), index); }
	public float getHmdSpaceToWorldScaleInMeters() { return ngetHmdSpaceToWorldScaleInMeters(address()); }

	public OVRViewScaleDesc setHmdToEyeViewOffset(ByteBuffer HmdToEyeViewOffset) { nsetHmdToEyeViewOffset(address(), HmdToEyeViewOffset); return this; }
	public OVRViewScaleDesc setHmdToEyeViewOffset(int index, OVRVector3f HmdToEyeViewOffset) { nsetHmdToEyeViewOffset(address(), index, HmdToEyeViewOffset); return this; }
	public OVRViewScaleDesc setHmdSpaceToWorldScaleInMeters(float HmdSpaceToWorldScaleInMeters) { nsetHmdSpaceToWorldScaleInMeters(address(), HmdSpaceToWorldScaleInMeters); return this; }

	/** Initializes this struct with the specified values. */
	public OVRViewScaleDesc set(
		ByteBuffer HmdToEyeViewOffset,
		float HmdSpaceToWorldScaleInMeters
	) {
		setHmdToEyeViewOffset(HmdToEyeViewOffset);
		setHmdSpaceToWorldScaleInMeters(HmdSpaceToWorldScaleInMeters);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public OVRViewScaleDesc nset(long struct) {
		memCopy(struct, address(), SIZEOF);
		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public OVRViewScaleDesc set(OVRViewScaleDesc src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public OVRViewScaleDesc set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRViewScaleDesc} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRViewScaleDesc malloc() {
		return new OVRViewScaleDesc(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRViewScaleDesc} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRViewScaleDesc calloc() {
		return new OVRViewScaleDesc(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRViewScaleDesc} instance allocated with {@link BufferUtils}. */
	public static OVRViewScaleDesc create() {
		return new OVRViewScaleDesc(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRViewScaleDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRViewScaleDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRViewScaleDesc.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link OVRViewScaleDesc.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	public static void ngetHmdToEyeViewOffset(long struct, ByteBuffer HmdToEyeViewOffset) {
		if ( CHECKS ) checkBufferGT(HmdToEyeViewOffset, 2 * OVRVector3f.SIZEOF);
		memCopy(struct + HMDTOEYEVIEWOFFSET, memAddress(HmdToEyeViewOffset), HmdToEyeViewOffset.remaining());
	}
	public static void getHmdToEyeViewOffset(ByteBuffer struct, ByteBuffer HmdToEyeViewOffset) { ngetHmdToEyeViewOffset(memAddress(struct), HmdToEyeViewOffset); }
	public static OVRVector3f ngetHmdToEyeViewOffset(long struct, int index) {
		return OVRVector3f.malloc().nset(struct + HMDTOEYEVIEWOFFSET + index * OVRVector3f.SIZEOF);
	}
	public static OVRVector3f getHmdToEyeViewOffset(ByteBuffer struct, int index) { return ngetHmdToEyeViewOffset(memAddress(struct), index); }
	public static float ngetHmdSpaceToWorldScaleInMeters(long struct) { return memGetFloat(struct + HMDSPACETOWORLDSCALEINMETERS); }
	public static float getHmdSpaceToWorldScaleInMeters(ByteBuffer struct) { return ngetHmdSpaceToWorldScaleInMeters(memAddress(struct)); }

	public static void nsetHmdToEyeViewOffset(long struct, ByteBuffer HmdToEyeViewOffset) {
		if ( CHECKS ) checkBufferGT(HmdToEyeViewOffset, 2 * OVRVector3f.SIZEOF);
		memCopy(memAddress(HmdToEyeViewOffset), struct + HMDTOEYEVIEWOFFSET, HmdToEyeViewOffset.remaining());
	}
	public static void setHmdToEyeViewOffset(ByteBuffer struct, ByteBuffer HmdToEyeViewOffset) { nsetHmdToEyeViewOffset(memAddress(struct), HmdToEyeViewOffset); }
	public static void nsetHmdToEyeViewOffset(long struct, int index, OVRVector3f HmdToEyeViewOffset) {
		memCopy(HmdToEyeViewOffset.address(), struct + HMDTOEYEVIEWOFFSET + index * OVRVector3f.SIZEOF, OVRVector3f.SIZEOF);
	}
	public static void setHmdToEyeViewOffset(ByteBuffer struct, int index, OVRVector3f HmdToEyeViewOffset) { nsetHmdToEyeViewOffset(memAddress(struct), index, HmdToEyeViewOffset); }
	public static void nsetHmdSpaceToWorldScaleInMeters(long struct, float HmdSpaceToWorldScaleInMeters) { memPutFloat(struct + HMDSPACETOWORLDSCALEINMETERS, HmdSpaceToWorldScaleInMeters); }
	public static void setHmdSpaceToWorldScaleInMeters(ByteBuffer struct, float HmdSpaceToWorldScaleInMeters) { nsetHmdSpaceToWorldScaleInMeters(memAddress(struct), HmdSpaceToWorldScaleInMeters); }

	// -----------------------------------

	/** An array of {@link OVRViewScaleDesc} structs. */
	public static final class Buffer extends StructBuffer<OVRViewScaleDesc, Buffer> {

		/**
		 * Creates a new {@link OVRViewScaleDesc.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRViewScaleDesc#SIZEOF}, and its mark will be undefined.
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
		protected OVRViewScaleDesc newInstance(long address) {
			return new OVRViewScaleDesc(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public void getHmdToEyeViewOffset(ByteBuffer HmdToEyeViewOffset) { ngetHmdToEyeViewOffset(address(), HmdToEyeViewOffset); }
		public OVRVector3f getHmdToEyeViewOffset(int index) { return ngetHmdToEyeViewOffset(address(), index); }
		public float getHmdSpaceToWorldScaleInMeters() { return ngetHmdSpaceToWorldScaleInMeters(address()); }

		public OVRViewScaleDesc.Buffer setHmdToEyeViewOffset(ByteBuffer HmdToEyeViewOffset) { nsetHmdToEyeViewOffset(address(), HmdToEyeViewOffset); return this; }
		public OVRViewScaleDesc.Buffer setHmdToEyeViewOffset(int index, OVRVector3f HmdToEyeViewOffset) { nsetHmdToEyeViewOffset(address(), index, HmdToEyeViewOffset); return this; }
		public OVRViewScaleDesc.Buffer setHmdSpaceToWorldScaleInMeters(float HmdSpaceToWorldScaleInMeters) { nsetHmdSpaceToWorldScaleInMeters(address(), HmdSpaceToWorldScaleInMeters); return this; }

	}

}