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
 * 
 * <h3>ovrTimewarpProjectionDesc members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>Projection22</td><td class="nw">float</td><td>projection matrix element [2][2]</td></tr>
 * <tr><td>Projection23</td><td class="nw">float</td><td>projection matrix element [2][3]</td></tr>
 * <tr><td>Projection32</td><td class="nw">float</td><td>projection matrix element [3][2]</td></tr>
 * </table>
 */
public class OVRTimewarpProjectionDesc extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		PROJECTION22,
		PROJECTION23,
		PROJECTION32;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		PROJECTION22 = layout.offsetof(0);
		PROJECTION23 = layout.offsetof(1);
		PROJECTION32 = layout.offsetof(2);
	}

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

	/** Returns the value of the {@code Projection22} field. */
	public float Projection22() { return nProjection22(address()); }
	/** Returns the value of the {@code Projection23} field. */
	public float Projection23() { return nProjection23(address()); }
	/** Returns the value of the {@code Projection32} field. */
	public float Projection32() { return nProjection32(address()); }

	/** Sets the specified value to the {@code Projection22} field. */
	public OVRTimewarpProjectionDesc Projection22(float value) { nProjection22(address(), value); return this; }
	/** Sets the specified value to the {@code Projection23} field. */
	public OVRTimewarpProjectionDesc Projection23(float value) { nProjection23(address(), value); return this; }
	/** Sets the specified value to the {@code Projection32} field. */
	public OVRTimewarpProjectionDesc Projection32(float value) { nProjection32(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public OVRTimewarpProjectionDesc set(
		float Projection22,
		float Projection23,
		float Projection32
	) {
		Projection22(Projection22);
		Projection23(Projection23);
		Projection32(Projection32);

		return this;
	}

	/** Unsafe version of {@link #set(OVRTimewarpProjectionDesc) set}. */
	public OVRTimewarpProjectionDesc nset(long struct) {
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
	public OVRTimewarpProjectionDesc set(OVRTimewarpProjectionDesc src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(OVRTimewarpProjectionDesc) set}. */
	public OVRTimewarpProjectionDesc set(ByteBuffer struct) {
		if ( CHECKS )
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

	/**
	 * Create a {@link OVRTimewarpProjectionDesc.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #Projection22}. */
	public static float nProjection22(long struct) { return memGetFloat(struct + OVRTimewarpProjectionDesc.PROJECTION22); }
	/** Unsafe version of {@link #Projection23}. */
	public static float nProjection23(long struct) { return memGetFloat(struct + OVRTimewarpProjectionDesc.PROJECTION23); }
	/** Unsafe version of {@link #Projection32}. */
	public static float nProjection32(long struct) { return memGetFloat(struct + OVRTimewarpProjectionDesc.PROJECTION32); }

	/** Unsafe version of {@link #Projection22(float) Projection22}. */
	public static void nProjection22(long struct, float value) { memPutFloat(struct + OVRTimewarpProjectionDesc.PROJECTION22, value); }
	/** Unsafe version of {@link #Projection23(float) Projection23}. */
	public static void nProjection23(long struct, float value) { memPutFloat(struct + OVRTimewarpProjectionDesc.PROJECTION23, value); }
	/** Unsafe version of {@link #Projection32(float) Projection32}. */
	public static void nProjection32(long struct, float value) { memPutFloat(struct + OVRTimewarpProjectionDesc.PROJECTION32, value); }

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

		/** Returns the value of the {@code Projection22} field. */
		public float Projection22() { return nProjection22(address()); }
		/** Returns the value of the {@code Projection23} field. */
		public float Projection23() { return nProjection23(address()); }
		/** Returns the value of the {@code Projection32} field. */
		public float Projection32() { return nProjection32(address()); }

		/** Sets the specified value to the {@code Projection22} field. */
		public OVRTimewarpProjectionDesc.Buffer Projection22(float value) { nProjection22(address(), value); return this; }
		/** Sets the specified value to the {@code Projection23} field. */
		public OVRTimewarpProjectionDesc.Buffer Projection23(float value) { nProjection23(address(), value); return this; }
		/** Sets the specified value to the {@code Projection32} field. */
		public OVRTimewarpProjectionDesc.Buffer Projection32(float value) { nProjection32(address(), value); return this; }

	}

}