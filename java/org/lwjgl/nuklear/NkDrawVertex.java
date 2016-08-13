/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>struct nk_draw_vertex {
    {@link NkVec2 struct nk_vec2} pos;
    {@link NkVec2 struct nk_vec2} uv;
    nk_draw_vertex_color col;
}</code></pre>
 */
public class NkDrawVertex extends Struct {

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

	// -----------------------------------

	/** Returns a new {@link NkDrawVertex} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkDrawVertex create(long address) {
		return address == NULL ? null : new NkDrawVertex(address, null);
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

	/** Unsafe version of {@link #pos}. */
	public static NkVec2 npos(long struct) { return NkVec2.create(struct + NkDrawVertex.POS); }
	/** Unsafe version of {@link #uv}. */
	public static NkVec2 nuv(long struct) { return NkVec2.create(struct + NkDrawVertex.UV); }
	/** Unsafe version of {@link #col}. */
	public static int ncol(long struct) { return memGetInt(struct + NkDrawVertex.COL); }

	// -----------------------------------

	/** An array of {@link NkDrawVertex} structs. */
	public static final class Buffer extends StructBuffer<NkDrawVertex, Buffer> {

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

	}

}