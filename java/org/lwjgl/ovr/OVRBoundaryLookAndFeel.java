/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Boundary system look and feel.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code Color} &ndash; Boundary color (alpha channel is ignored)</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct ovrBoundaryLookAndFeel {
    {@link OVRColorf ovrColorf} Color;
}</code></pre>
 */
public class OVRBoundaryLookAndFeel extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		COLOR;

	static {
		Layout layout = __struct(
			__member(OVRColorf.SIZEOF, OVRColorf.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		COLOR = layout.offsetof(0);
	}

	OVRBoundaryLookAndFeel(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link OVRBoundaryLookAndFeel} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRBoundaryLookAndFeel(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link OVRColorf} view of the {@code Color} field. */
	public OVRColorf Color() { return nColor(address()); }

	/** Copies the specified {@link OVRColorf} to the {@code Color} field. */
	public OVRBoundaryLookAndFeel Color(OVRColorf value) { nColor(address(), value); return this; }

	/** Unsafe version of {@link #set(OVRBoundaryLookAndFeel) set}. */
	public OVRBoundaryLookAndFeel nset(long struct) {
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
	public OVRBoundaryLookAndFeel set(OVRBoundaryLookAndFeel src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link OVRBoundaryLookAndFeel} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static OVRBoundaryLookAndFeel malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRBoundaryLookAndFeel} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static OVRBoundaryLookAndFeel calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRBoundaryLookAndFeel} instance allocated with {@link BufferUtils}. */
	public static OVRBoundaryLookAndFeel create() {
		return new OVRBoundaryLookAndFeel(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link OVRBoundaryLookAndFeel} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static OVRBoundaryLookAndFeel create(long address) {
		return address == NULL ? null : new OVRBoundaryLookAndFeel(address, null);
	}

	/**
	 * Returns a new {@link OVRBoundaryLookAndFeel.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRBoundaryLookAndFeel.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRBoundaryLookAndFeel.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link OVRBoundaryLookAndFeel.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link OVRBoundaryLookAndFeel} instance allocated on the thread-local {@link MemoryStack}. */
	public static OVRBoundaryLookAndFeel mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link OVRBoundaryLookAndFeel} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static OVRBoundaryLookAndFeel callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link OVRBoundaryLookAndFeel} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRBoundaryLookAndFeel mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRBoundaryLookAndFeel} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRBoundaryLookAndFeel callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRBoundaryLookAndFeel.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRBoundaryLookAndFeel.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRBoundaryLookAndFeel.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRBoundaryLookAndFeel.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #Color}. */
	public static OVRColorf nColor(long struct) { return OVRColorf.create(struct + OVRBoundaryLookAndFeel.COLOR); }

	/** Unsafe version of {@link #Color(OVRColorf) Color}. */
	public static void nColor(long struct, OVRColorf value) { memCopy(value.address(), struct + OVRBoundaryLookAndFeel.COLOR, OVRColorf.SIZEOF); }

	// -----------------------------------

	/** An array of {@link OVRBoundaryLookAndFeel} structs. */
	public static class Buffer extends StructBuffer<OVRBoundaryLookAndFeel, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link OVRBoundaryLookAndFeel.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRBoundaryLookAndFeel#SIZEOF}, and its mark will be undefined.
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
		protected OVRBoundaryLookAndFeel newInstance(long address) {
			return new OVRBoundaryLookAndFeel(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link OVRColorf} view of the {@code Color} field. */
		public OVRColorf Color() { return OVRBoundaryLookAndFeel.nColor(address()); }

		/** Copies the specified {@link OVRColorf} to the {@code Color} field. */
		public OVRBoundaryLookAndFeel.Buffer Color(OVRColorf value) { OVRBoundaryLookAndFeel.nColor(address(), value); return this; }

	}

}