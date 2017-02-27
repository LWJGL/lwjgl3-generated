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
 * <pre><code>struct VREvent_PerformanceTest_t {
    uint32_t m_nFidelityLevel;
}</code></pre>
 */
public class VREventPerformanceTest extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		M_NFIDELITYLEVEL;

	static {
		Layout layout = __struct(
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		M_NFIDELITYLEVEL = layout.offsetof(0);
	}

	VREventPerformanceTest(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VREventPerformanceTest} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VREventPerformanceTest(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code m_nFidelityLevel} field. */
	public int m_nFidelityLevel() { return nm_nFidelityLevel(address()); }

	/** Sets the specified value to the {@code m_nFidelityLevel} field. */
	public VREventPerformanceTest m_nFidelityLevel(int value) { nm_nFidelityLevel(address(), value); return this; }

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VREventPerformanceTest set(VREventPerformanceTest src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link VREventPerformanceTest} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VREventPerformanceTest malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VREventPerformanceTest} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VREventPerformanceTest calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VREventPerformanceTest} instance allocated with {@link BufferUtils}. */
	public static VREventPerformanceTest create() {
		return new VREventPerformanceTest(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VREventPerformanceTest} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VREventPerformanceTest create(long address) {
		return address == NULL ? null : new VREventPerformanceTest(address, null);
	}

	/**
	 * Returns a new {@link VREventPerformanceTest.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VREventPerformanceTest.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VREventPerformanceTest.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VREventPerformanceTest.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VREventPerformanceTest} instance allocated on the thread-local {@link MemoryStack}. */
	public static VREventPerformanceTest mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VREventPerformanceTest} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VREventPerformanceTest callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VREventPerformanceTest} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VREventPerformanceTest mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VREventPerformanceTest} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VREventPerformanceTest callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VREventPerformanceTest.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VREventPerformanceTest.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VREventPerformanceTest.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VREventPerformanceTest.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #m_nFidelityLevel}. */
	public static int nm_nFidelityLevel(long struct) { return memGetInt(struct + VREventPerformanceTest.M_NFIDELITYLEVEL); }

	/** Unsafe version of {@link #m_nFidelityLevel(int) m_nFidelityLevel}. */
	public static void nm_nFidelityLevel(long struct, int value) { memPutInt(struct + VREventPerformanceTest.M_NFIDELITYLEVEL, value); }

	// -----------------------------------

	/** An array of {@link VREventPerformanceTest} structs. */
	public static class Buffer extends StructBuffer<VREventPerformanceTest, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VREventPerformanceTest.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VREventPerformanceTest#SIZEOF}, and its mark will be undefined.
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
		protected VREventPerformanceTest newInstance(long address) {
			return new VREventPerformanceTest(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code m_nFidelityLevel} field. */
		public int m_nFidelityLevel() { return VREventPerformanceTest.nm_nFidelityLevel(address()); }

		/** Sets the specified value to the {@code m_nFidelityLevel} field. */
		public VREventPerformanceTest.Buffer m_nFidelityLevel(int value) { VREventPerformanceTest.nm_nFidelityLevel(address(), value); return this; }

	}

}