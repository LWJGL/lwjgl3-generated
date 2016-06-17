/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>struct nk_menu_state {
    float x;
    float y;
    float w;
    float h;
    {@link NkScroll struct nk_scroll} offset;
}</code></pre>
 */
public class NkMenuState extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		X,
		Y,
		W,
		H,
		OFFSET;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(NkScroll.SIZEOF, NkScroll.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		X = layout.offsetof(0);
		Y = layout.offsetof(1);
		W = layout.offsetof(2);
		H = layout.offsetof(3);
		OFFSET = layout.offsetof(4);
	}

	NkMenuState(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkMenuState} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkMenuState(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code x} field. */
	public float x() { return nx(address()); }
	/** Returns the value of the {@code y} field. */
	public float y() { return ny(address()); }
	/** Returns the value of the {@code w} field. */
	public float w() { return nw(address()); }
	/** Returns the value of the {@code h} field. */
	public float h() { return nh(address()); }
	/** Returns a {@link NkScroll} view of the {@code offset} field. */
	public NkScroll offset() { return noffset(address()); }

	/** Sets the specified value to the {@code x} field. */
	public NkMenuState x(float value) { nx(address(), value); return this; }
	/** Sets the specified value to the {@code y} field. */
	public NkMenuState y(float value) { ny(address(), value); return this; }
	/** Sets the specified value to the {@code w} field. */
	public NkMenuState w(float value) { nw(address(), value); return this; }
	/** Sets the specified value to the {@code h} field. */
	public NkMenuState h(float value) { nh(address(), value); return this; }
	/** Copies the specified {@link NkScroll} to the {@code offset} field. */
	public NkMenuState offset(NkScroll value) { noffset(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkMenuState set(
		float x,
		float y,
		float w,
		float h,
		NkScroll offset
	) {
		x(x);
		y(y);
		w(w);
		h(h);
		offset(offset);

		return this;
	}

	/** Unsafe version of {@link #set(NkMenuState) set}. */
	public NkMenuState nset(long struct) {
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
	public NkMenuState set(NkMenuState src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkMenuState} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkMenuState malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkMenuState} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkMenuState calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkMenuState} instance allocated with {@link BufferUtils}. */
	public static NkMenuState create() {
		return new NkMenuState(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkMenuState} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkMenuState create(long address) {
		return address == NULL ? null : new NkMenuState(address, null);
	}

	/**
	 * Returns a new {@link NkMenuState.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkMenuState.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkMenuState.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkMenuState.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkMenuState} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkMenuState mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkMenuState} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkMenuState callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkMenuState} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkMenuState mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkMenuState} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkMenuState callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkMenuState.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkMenuState.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkMenuState.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkMenuState.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #x}. */
	public static float nx(long struct) { return memGetFloat(struct + NkMenuState.X); }
	/** Unsafe version of {@link #y}. */
	public static float ny(long struct) { return memGetFloat(struct + NkMenuState.Y); }
	/** Unsafe version of {@link #w}. */
	public static float nw(long struct) { return memGetFloat(struct + NkMenuState.W); }
	/** Unsafe version of {@link #h}. */
	public static float nh(long struct) { return memGetFloat(struct + NkMenuState.H); }
	/** Unsafe version of {@link #offset}. */
	public static NkScroll noffset(long struct) { return NkScroll.create(struct + NkMenuState.OFFSET); }

	/** Unsafe version of {@link #x(float) x}. */
	public static void nx(long struct, float value) { memPutFloat(struct + NkMenuState.X, value); }
	/** Unsafe version of {@link #y(float) y}. */
	public static void ny(long struct, float value) { memPutFloat(struct + NkMenuState.Y, value); }
	/** Unsafe version of {@link #w(float) w}. */
	public static void nw(long struct, float value) { memPutFloat(struct + NkMenuState.W, value); }
	/** Unsafe version of {@link #h(float) h}. */
	public static void nh(long struct, float value) { memPutFloat(struct + NkMenuState.H, value); }
	/** Unsafe version of {@link #offset(NkScroll) offset}. */
	public static void noffset(long struct, NkScroll value) { memCopy(value.address(), struct + NkMenuState.OFFSET, NkScroll.SIZEOF); }

	// -----------------------------------

	/** An array of {@link NkMenuState} structs. */
	public static final class Buffer extends StructBuffer<NkMenuState, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link NkMenuState.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkMenuState#SIZEOF}, and its mark will be undefined.
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
		protected NkMenuState newInstance(long address) {
			return new NkMenuState(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code x} field. */
		public float x() { return NkMenuState.nx(address()); }
		/** Returns the value of the {@code y} field. */
		public float y() { return NkMenuState.ny(address()); }
		/** Returns the value of the {@code w} field. */
		public float w() { return NkMenuState.nw(address()); }
		/** Returns the value of the {@code h} field. */
		public float h() { return NkMenuState.nh(address()); }
		/** Returns a {@link NkScroll} view of the {@code offset} field. */
		public NkScroll offset() { return NkMenuState.noffset(address()); }

		/** Sets the specified value to the {@code x} field. */
		public NkMenuState.Buffer x(float value) { NkMenuState.nx(address(), value); return this; }
		/** Sets the specified value to the {@code y} field. */
		public NkMenuState.Buffer y(float value) { NkMenuState.ny(address(), value); return this; }
		/** Sets the specified value to the {@code w} field. */
		public NkMenuState.Buffer w(float value) { NkMenuState.nw(address(), value); return this; }
		/** Sets the specified value to the {@code h} field. */
		public NkMenuState.Buffer h(float value) { NkMenuState.nh(address(), value); return this; }
		/** Copies the specified {@link NkScroll} to the {@code offset} field. */
		public NkMenuState.Buffer offset(NkScroll value) { NkMenuState.noffset(address(), value); return this; }

	}

}