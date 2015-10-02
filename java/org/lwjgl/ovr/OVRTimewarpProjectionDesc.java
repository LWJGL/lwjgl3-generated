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
 * Projection information for {@link OVRLayerEyeFovDepth}.
 * 
 * <p>Use the utility function {@link OVRUtil#ovrTimewarpProjectionDesc_FromProjection} to generate this structure from the application's projection matrix.</p>
 */
public class OVRTimewarpProjectionDesc extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	/** The struct member offsets. */
	public static final int
		PROJECTION22,
		PROJECTION23,
		PROJECTION32;

	static {
		IntBuffer offsets = memAllocInt(3);

		SIZEOF = offsets(memAddress(offsets));

		PROJECTION22 = offsets.get(0);
		PROJECTION23 = offsets.get(1);
		PROJECTION32 = offsets.get(2);

		memFree(offsets);
	}

	private static native int offsets(long buffer);

	OVRTimewarpProjectionDesc(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRTimewarpProjectionDesc} instance at the specified memory address. */
	public OVRTimewarpProjectionDesc(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRTimewarpProjectionDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRTimewarpProjectionDesc(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	public float getProjection22() { return ngetProjection22(address()); }
	public float getProjection23() { return ngetProjection23(address()); }
	public float getProjection32() { return ngetProjection32(address()); }

	public OVRTimewarpProjectionDesc setProjection22(float Projection22) { nsetProjection22(address(), Projection22); return this; }
	public OVRTimewarpProjectionDesc setProjection23(float Projection23) { nsetProjection23(address(), Projection23); return this; }
	public OVRTimewarpProjectionDesc setProjection32(float Projection32) { nsetProjection32(address(), Projection32); return this; }

	/** Initializes this struct with the specified values. */
	public OVRTimewarpProjectionDesc set(
		float Projection22,
		float Projection23,
		float Projection32
	) {
		setProjection22(Projection22);
		setProjection23(Projection23);
		setProjection32(Projection32);

		return this;
	}

	/** Unsafe version of {@link #set}. */
	public OVRTimewarpProjectionDesc nset(long struct) {
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
	public OVRTimewarpProjectionDesc set(OVRTimewarpProjectionDesc src) {
		return nset(address());
	}

	/** {@link ByteBuffer} version of {@link #set}. */
	public OVRTimewarpProjectionDesc set(ByteBuffer struct) {
		if ( LWJGLUtil.CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRTimewarpProjectionDesc} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRTimewarpProjectionDesc malloc() {
		return new OVRTimewarpProjectionDesc(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRTimewarpProjectionDesc} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRTimewarpProjectionDesc calloc() {
		return new OVRTimewarpProjectionDesc(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRTimewarpProjectionDesc} instance allocated with {@link BufferUtils}. */
	public static OVRTimewarpProjectionDesc create() {
		return new OVRTimewarpProjectionDesc(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRTimewarpProjectionDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRTimewarpProjectionDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRTimewarpProjectionDesc.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	public static float ngetProjection22(long struct) { return memGetFloat(struct + PROJECTION22); }
	public static float getProjection22(ByteBuffer struct) { return ngetProjection22(memAddress(struct)); }
	public static float ngetProjection23(long struct) { return memGetFloat(struct + PROJECTION23); }
	public static float getProjection23(ByteBuffer struct) { return ngetProjection23(memAddress(struct)); }
	public static float ngetProjection32(long struct) { return memGetFloat(struct + PROJECTION32); }
	public static float getProjection32(ByteBuffer struct) { return ngetProjection32(memAddress(struct)); }

	public static void nsetProjection22(long struct, float Projection22) { memPutFloat(struct + PROJECTION22, Projection22); }
	public static void setProjection22(ByteBuffer struct, float Projection22) { nsetProjection22(memAddress(struct), Projection22); }
	public static void nsetProjection23(long struct, float Projection23) { memPutFloat(struct + PROJECTION23, Projection23); }
	public static void setProjection23(ByteBuffer struct, float Projection23) { nsetProjection23(memAddress(struct), Projection23); }
	public static void nsetProjection32(long struct, float Projection32) { memPutFloat(struct + PROJECTION32, Projection32); }
	public static void setProjection32(ByteBuffer struct, float Projection32) { nsetProjection32(memAddress(struct), Projection32); }

	// -----------------------------------

	/** An array of {@link OVRTimewarpProjectionDesc} structs. */
	public static final class Buffer extends StructBuffer<OVRTimewarpProjectionDesc, Buffer> {

		/**
		 * Creates a new {@link OVRTimewarpProjectionDesc.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRTimewarpProjectionDesc#SIZEOF}, and its mark will be undefined.
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
		protected OVRTimewarpProjectionDesc newInstance(long address) {
			return new OVRTimewarpProjectionDesc(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		public float getProjection22() { return ngetProjection22(address()); }
		public float getProjection23() { return ngetProjection23(address()); }
		public float getProjection32() { return ngetProjection32(address()); }

		public OVRTimewarpProjectionDesc.Buffer setProjection22(float Projection22) { nsetProjection22(address(), Projection22); return this; }
		public OVRTimewarpProjectionDesc.Buffer setProjection23(float Projection23) { nsetProjection23(address(), Projection23); return this; }
		public OVRTimewarpProjectionDesc.Buffer setProjection32(float Projection32) { nsetProjection32(address(), Projection32); return this; }

	}

}