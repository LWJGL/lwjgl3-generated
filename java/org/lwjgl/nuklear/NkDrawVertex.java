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
 * <pre><code>struct nk_draw_vertex {
    {@link NkVec2 struct nk_vec2} pos;
    {@link NkVec2 struct nk_vec2} uv;
    nk_draw_vertex_color col;
}</code></pre>
 */
public class NkDrawVertex extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		POS,
		UV,
		COL;

	static {
		Layout layout = __struct(
			__member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
			__member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		POS = layout.offsetof(0);
		UV = layout.offsetof(1);
		COL = layout.offsetof(2);
	}

	NkDrawVertex(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkDrawVertex} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkDrawVertex(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link NkVec2} view of the {@code pos} field. */
	public NkVec2 pos() { return npos(address()); }
	/** Returns a {@link NkVec2} view of the {@code uv} field. */
	public NkVec2 uv() { return nuv(address()); }
	/** Returns the value of the {@code col} field. */
	public int col() { return ncol(address()); }

	/** Copies the specified {@link NkVec2} to the {@code pos} field. */
	public NkDrawVertex pos(NkVec2 value) { npos(address(), value); return this; }
	/** Copies the specified {@link NkVec2} to the {@code uv} field. */
	public NkDrawVertex uv(NkVec2 value) { nuv(address(), value); return this; }
	/** Sets the specified value to the {@code col} field. */
	public NkDrawVertex col(int value) { ncol(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkDrawVertex set(
		NkVec2 pos,
		NkVec2 uv,
		int col
	) {
		pos(pos);
		uv(uv);
		col(col);

		return this;
	}

	/** Unsafe version of {@link #set(NkDrawVertex) set}. */
	public NkDrawVertex nset(long struct) {
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
	public NkDrawVertex set(NkDrawVertex src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkDrawVertex} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkDrawVertex malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkDrawVertex} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkDrawVertex calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkDrawVertex} instance allocated with {@link BufferUtils}. */
	public static NkDrawVertex create() {
		return new NkDrawVertex(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkDrawVertex} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkDrawVertex create(long address) {
		return address == NULL ? null : new NkDrawVertex(address, null);
	}

	/**
	 * Returns a new {@link NkDrawVertex.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkDrawVertex.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkDrawVertex.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkDrawVertex.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkDrawVertex} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkDrawVertex mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkDrawVertex} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkDrawVertex callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkDrawVertex} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkDrawVertex mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkDrawVertex} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkDrawVertex callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkDrawVertex.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkDrawVertex.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkDrawVertex.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkDrawVertex.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #pos}. */
	public static NkVec2 npos(long struct) { return NkVec2.create(struct + NkDrawVertex.POS); }
	/** Unsafe version of {@link #uv}. */
	public static NkVec2 nuv(long struct) { return NkVec2.create(struct + NkDrawVertex.UV); }
	/** Unsafe version of {@link #col}. */
	public static int ncol(long struct) { return memGetInt(struct + NkDrawVertex.COL); }

	/** Unsafe version of {@link #pos(NkVec2) pos}. */
	public static void npos(long struct, NkVec2 value) { memCopy(value.address(), struct + NkDrawVertex.POS, NkVec2.SIZEOF); }
	/** Unsafe version of {@link #uv(NkVec2) uv}. */
	public static void nuv(long struct, NkVec2 value) { memCopy(value.address(), struct + NkDrawVertex.UV, NkVec2.SIZEOF); }
	/** Unsafe version of {@link #col(int) col}. */
	public static void ncol(long struct, int value) { memPutInt(struct + NkDrawVertex.COL, value); }

	// -----------------------------------

	/** An array of {@link NkDrawVertex} structs. */
	public static final class Buffer extends StructBuffer<NkDrawVertex, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link NkDrawVertex.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkDrawVertex#SIZEOF}, and its mark will be undefined.
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
		protected NkDrawVertex newInstance(long address) {
			return new NkDrawVertex(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link NkVec2} view of the {@code pos} field. */
		public NkVec2 pos() { return NkDrawVertex.npos(address()); }
		/** Returns a {@link NkVec2} view of the {@code uv} field. */
		public NkVec2 uv() { return NkDrawVertex.nuv(address()); }
		/** Returns the value of the {@code col} field. */
		public int col() { return NkDrawVertex.ncol(address()); }

		/** Copies the specified {@link NkVec2} to the {@code pos} field. */
		public NkDrawVertex.Buffer pos(NkVec2 value) { NkDrawVertex.npos(address(), value); return this; }
		/** Copies the specified {@link NkVec2} to the {@code uv} field. */
		public NkDrawVertex.Buffer uv(NkVec2 value) { NkDrawVertex.nuv(address(), value); return this; }
		/** Sets the specified value to the {@code col} field. */
		public NkDrawVertex.Buffer col(int value) { NkDrawVertex.ncol(address(), value); return this; }

	}

}