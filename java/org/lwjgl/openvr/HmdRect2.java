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
 * <pre><code>struct HmdRect2_t {
    {@link HmdVector2 HmdVector2_t} vTopLeft;
    {@link HmdVector2 HmdVector2_t} vBottomRight;
}</code></pre>
 */
public class HmdRect2 extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		VTOPLEFT,
		VBOTTOMRIGHT;

	static {
		Layout layout = __struct(
			__member(HmdVector2.SIZEOF, HmdVector2.ALIGNOF),
			__member(HmdVector2.SIZEOF, HmdVector2.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		VTOPLEFT = layout.offsetof(0);
		VBOTTOMRIGHT = layout.offsetof(1);
	}

	HmdRect2(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link HmdRect2} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public HmdRect2(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link HmdVector2} view of the {@code vTopLeft} field. */
	public HmdVector2 vTopLeft() { return nvTopLeft(address()); }
	/** Returns a {@link HmdVector2} view of the {@code vBottomRight} field. */
	public HmdVector2 vBottomRight() { return nvBottomRight(address()); }

	/** Copies the specified {@link HmdVector2} to the {@code vTopLeft} field. */
	public HmdRect2 vTopLeft(HmdVector2 value) { nvTopLeft(address(), value); return this; }
	/** Copies the specified {@link HmdVector2} to the {@code vBottomRight} field. */
	public HmdRect2 vBottomRight(HmdVector2 value) { nvBottomRight(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public HmdRect2 set(
		HmdVector2 vTopLeft,
		HmdVector2 vBottomRight
	) {
		vTopLeft(vTopLeft);
		vBottomRight(vBottomRight);

		return this;
	}

	/** Unsafe version of {@link #set(HmdRect2) set}. */
	public HmdRect2 nset(long struct) {
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
	public HmdRect2 set(HmdRect2 src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link HmdRect2} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static HmdRect2 malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link HmdRect2} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static HmdRect2 calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link HmdRect2} instance allocated with {@link BufferUtils}. */
	public static HmdRect2 create() {
		return new HmdRect2(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link HmdRect2} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static HmdRect2 create(long address) {
		return address == NULL ? null : new HmdRect2(address, null);
	}

	/**
	 * Returns a new {@link HmdRect2.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link HmdRect2.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link HmdRect2.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link HmdRect2.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link HmdRect2} instance allocated on the thread-local {@link MemoryStack}. */
	public static HmdRect2 mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link HmdRect2} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static HmdRect2 callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link HmdRect2} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static HmdRect2 mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link HmdRect2} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static HmdRect2 callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link HmdRect2.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link HmdRect2.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link HmdRect2.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link HmdRect2.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #vTopLeft}. */
	public static HmdVector2 nvTopLeft(long struct) { return HmdVector2.create(struct + HmdRect2.VTOPLEFT); }
	/** Unsafe version of {@link #vBottomRight}. */
	public static HmdVector2 nvBottomRight(long struct) { return HmdVector2.create(struct + HmdRect2.VBOTTOMRIGHT); }

	/** Unsafe version of {@link #vTopLeft(HmdVector2) vTopLeft}. */
	public static void nvTopLeft(long struct, HmdVector2 value) { memCopy(value.address(), struct + HmdRect2.VTOPLEFT, HmdVector2.SIZEOF); }
	/** Unsafe version of {@link #vBottomRight(HmdVector2) vBottomRight}. */
	public static void nvBottomRight(long struct, HmdVector2 value) { memCopy(value.address(), struct + HmdRect2.VBOTTOMRIGHT, HmdVector2.SIZEOF); }

	// -----------------------------------

	/** An array of {@link HmdRect2} structs. */
	public static class Buffer extends StructBuffer<HmdRect2, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link HmdRect2.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link HmdRect2#SIZEOF}, and its mark will be undefined.
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
		protected HmdRect2 newInstance(long address) {
			return new HmdRect2(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link HmdVector2} view of the {@code vTopLeft} field. */
		public HmdVector2 vTopLeft() { return HmdRect2.nvTopLeft(address()); }
		/** Returns a {@link HmdVector2} view of the {@code vBottomRight} field. */
		public HmdVector2 vBottomRight() { return HmdRect2.nvBottomRight(address()); }

		/** Copies the specified {@link HmdVector2} to the {@code vTopLeft} field. */
		public HmdRect2.Buffer vTopLeft(HmdVector2 value) { HmdRect2.nvTopLeft(address(), value); return this; }
		/** Copies the specified {@link HmdVector2} to the {@code vBottomRight} field. */
		public HmdRect2.Buffer vBottomRight(HmdVector2 value) { HmdRect2.nvBottomRight(address(), value); return this; }

	}

}