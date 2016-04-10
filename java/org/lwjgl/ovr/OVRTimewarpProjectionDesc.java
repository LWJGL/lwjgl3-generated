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
import static org.lwjgl.system.MemoryStack.*;

/**
 * Projection information for {@link OVRLayerEyeFovDepth}.
 * 
 * <p>Use the utility function {@link OVRUtil#ovrTimewarpProjectionDesc_FromProjection} to generate this structure from the application's projection matrix.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code Projection22} &ndash; projection matrix element [2][2]</li>
 * <li>{@code Projection23} &ndash; projection matrix element [2][3]</li>
 * <li>{@code Projection32} &ndash; projection matrix element [3][2]</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct ovrTimewarpProjectionDesc {
    float Projection22;
    float Projection23;
    float Projection32;
}</code></pre>
 */
public class OVRTimewarpProjectionDesc extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

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
		ALIGNOF = layout.getAlignment();

		PROJECTION22 = layout.offsetof(0);
		PROJECTION23 = layout.offsetof(1);
		PROJECTION32 = layout.offsetof(2);
	}

	OVRTimewarpProjectionDesc(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link OVRTimewarpProjectionDesc} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRTimewarpProjectionDesc(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
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

	// -----------------------------------

	/** Returns a new {@link OVRTimewarpProjectionDesc} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static OVRTimewarpProjectionDesc malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRTimewarpProjectionDesc} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static OVRTimewarpProjectionDesc calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRTimewarpProjectionDesc} instance allocated with {@link BufferUtils}. */
	public static OVRTimewarpProjectionDesc create() {
		return new OVRTimewarpProjectionDesc(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link OVRTimewarpProjectionDesc} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static OVRTimewarpProjectionDesc create(long address) {
		return address == NULL ? null : new OVRTimewarpProjectionDesc(address, null);
	}

	/**
	 * Returns a new {@link OVRTimewarpProjectionDesc.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRTimewarpProjectionDesc.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRTimewarpProjectionDesc.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link OVRTimewarpProjectionDesc.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link OVRTimewarpProjectionDesc} instance allocated on the thread-local {@link MemoryStack}. */
	public static OVRTimewarpProjectionDesc mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link OVRTimewarpProjectionDesc} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static OVRTimewarpProjectionDesc callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link OVRTimewarpProjectionDesc} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRTimewarpProjectionDesc mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRTimewarpProjectionDesc} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRTimewarpProjectionDesc callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRTimewarpProjectionDesc.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRTimewarpProjectionDesc.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRTimewarpProjectionDesc.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRTimewarpProjectionDesc.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

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
		protected OVRTimewarpProjectionDesc newInstance(long address) {
			return new OVRTimewarpProjectionDesc(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code Projection22} field. */
		public float Projection22() { return OVRTimewarpProjectionDesc.nProjection22(address()); }
		/** Returns the value of the {@code Projection23} field. */
		public float Projection23() { return OVRTimewarpProjectionDesc.nProjection23(address()); }
		/** Returns the value of the {@code Projection32} field. */
		public float Projection32() { return OVRTimewarpProjectionDesc.nProjection32(address()); }

		/** Sets the specified value to the {@code Projection22} field. */
		public OVRTimewarpProjectionDesc.Buffer Projection22(float value) { OVRTimewarpProjectionDesc.nProjection22(address(), value); return this; }
		/** Sets the specified value to the {@code Projection23} field. */
		public OVRTimewarpProjectionDesc.Buffer Projection23(float value) { OVRTimewarpProjectionDesc.nProjection23(address(), value); return this; }
		/** Sets the specified value to the {@code Projection32} field. */
		public OVRTimewarpProjectionDesc.Buffer Projection32(float value) { OVRTimewarpProjectionDesc.nProjection32(address(), value); return this; }

	}

}