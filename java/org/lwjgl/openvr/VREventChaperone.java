/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.openvr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VREvent_Chaperone_t {
    uint64_t m_nPreviousUniverse;
    uint64_t m_nCurrentUniverse;
}</code></pre>
 */
public class VREventChaperone extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		M_NPREVIOUSUNIVERSE,
		M_NCURRENTUNIVERSE;

	static {
		Layout layout = __struct(
			__member(8),
			__member(8)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		M_NPREVIOUSUNIVERSE = layout.offsetof(0);
		M_NCURRENTUNIVERSE = layout.offsetof(1);
	}

	VREventChaperone(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VREventChaperone} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VREventChaperone(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code m_nPreviousUniverse} field. */
	public long m_nPreviousUniverse() { return nm_nPreviousUniverse(address()); }
	/** Returns the value of the {@code m_nCurrentUniverse} field. */
	public long m_nCurrentUniverse() { return nm_nCurrentUniverse(address()); }

	/** Sets the specified value to the {@code m_nPreviousUniverse} field. */
	public VREventChaperone m_nPreviousUniverse(long value) { nm_nPreviousUniverse(address(), value); return this; }
	/** Sets the specified value to the {@code m_nCurrentUniverse} field. */
	public VREventChaperone m_nCurrentUniverse(long value) { nm_nCurrentUniverse(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VREventChaperone set(
		long m_nPreviousUniverse,
		long m_nCurrentUniverse
	) {
		m_nPreviousUniverse(m_nPreviousUniverse);
		m_nCurrentUniverse(m_nCurrentUniverse);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VREventChaperone set(VREventChaperone src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link VREventChaperone} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VREventChaperone malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VREventChaperone} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VREventChaperone calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VREventChaperone} instance allocated with {@link BufferUtils}. */
	public static VREventChaperone create() {
		return new VREventChaperone(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VREventChaperone} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VREventChaperone create(long address) {
		return address == NULL ? null : new VREventChaperone(address, null);
	}

	/**
	 * Returns a new {@link VREventChaperone.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VREventChaperone.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VREventChaperone.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VREventChaperone.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VREventChaperone} instance allocated on the thread-local {@link MemoryStack}. */
	public static VREventChaperone mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VREventChaperone} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VREventChaperone callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VREventChaperone} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VREventChaperone mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VREventChaperone} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VREventChaperone callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VREventChaperone.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VREventChaperone.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VREventChaperone.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VREventChaperone.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #m_nPreviousUniverse}. */
	public static long nm_nPreviousUniverse(long struct) { return memGetLong(struct + VREventChaperone.M_NPREVIOUSUNIVERSE); }
	/** Unsafe version of {@link #m_nCurrentUniverse}. */
	public static long nm_nCurrentUniverse(long struct) { return memGetLong(struct + VREventChaperone.M_NCURRENTUNIVERSE); }

	/** Unsafe version of {@link #m_nPreviousUniverse(long) m_nPreviousUniverse}. */
	public static void nm_nPreviousUniverse(long struct, long value) { memPutLong(struct + VREventChaperone.M_NPREVIOUSUNIVERSE, value); }
	/** Unsafe version of {@link #m_nCurrentUniverse(long) m_nCurrentUniverse}. */
	public static void nm_nCurrentUniverse(long struct, long value) { memPutLong(struct + VREventChaperone.M_NCURRENTUNIVERSE, value); }

	// -----------------------------------

	/** An array of {@link VREventChaperone} structs. */
	public static class Buffer extends StructBuffer<VREventChaperone, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VREventChaperone.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VREventChaperone#SIZEOF}, and its mark will be undefined.
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
		protected VREventChaperone newInstance(long address) {
			return new VREventChaperone(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code m_nPreviousUniverse} field. */
		public long m_nPreviousUniverse() { return VREventChaperone.nm_nPreviousUniverse(address()); }
		/** Returns the value of the {@code m_nCurrentUniverse} field. */
		public long m_nCurrentUniverse() { return VREventChaperone.nm_nCurrentUniverse(address()); }

		/** Sets the specified value to the {@code m_nPreviousUniverse} field. */
		public VREventChaperone.Buffer m_nPreviousUniverse(long value) { VREventChaperone.nm_nPreviousUniverse(address(), value); return this; }
		/** Sets the specified value to the {@code m_nCurrentUniverse} field. */
		public VREventChaperone.Buffer m_nCurrentUniverse(long value) { VREventChaperone.nm_nCurrentUniverse(address(), value); return this; }

	}

}