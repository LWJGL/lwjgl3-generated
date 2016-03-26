/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Vertex data.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct stbtt_vertex {
    stbtt_vertex_type x;
    stbtt_vertex_type y;
    stbtt_vertex_type cx;
    stbtt_vertex_type cy;
    unsigned char type;
}</code></pre>
 */
public class STBTTVertex extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		X,
		Y,
		CX,
		CY,
		TYPE;

	static {
		Layout layout = __struct(
			__member(2),
			__member(2),
			__member(2),
			__member(2),
			__member(1)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		X = layout.offsetof(0);
		Y = layout.offsetof(1);
		CX = layout.offsetof(2);
		CY = layout.offsetof(3);
		TYPE = layout.offsetof(4);
	}

	STBTTVertex(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link STBTTVertex} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public STBTTVertex(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code x} field. */
	public short x() { return nx(address()); }
	/** Returns the value of the {@code y} field. */
	public short y() { return ny(address()); }
	/** Returns the value of the {@code cx} field. */
	public short cx() { return ncx(address()); }
	/** Returns the value of the {@code cy} field. */
	public short cy() { return ncy(address()); }
	/** Returns the value of the {@code type} field. */
	public byte type() { return ntype(address()); }

	// -----------------------------------

	/** Returns a new {@link STBTTVertex} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static STBTTVertex malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link STBTTVertex} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static STBTTVertex calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link STBTTVertex} instance allocated with {@link BufferUtils}. */
	public static STBTTVertex create() {
		return new STBTTVertex(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link STBTTVertex} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static STBTTVertex create(long address) {
		return address == NULL ? null : new STBTTVertex(address, null);
	}

	/**
	 * Returns a new {@link STBTTVertex.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link STBTTVertex.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link STBTTVertex.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link STBTTVertex.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link STBTTVertex} instance allocated on the thread-local {@link MemoryStack}. */
	public static STBTTVertex mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link STBTTVertex} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static STBTTVertex callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link STBTTVertex} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static STBTTVertex mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link STBTTVertex} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static STBTTVertex callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link STBTTVertex.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link STBTTVertex.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link STBTTVertex.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link STBTTVertex.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #x}. */
	public static short nx(long struct) { return memGetShort(struct + STBTTVertex.X); }
	/** Unsafe version of {@link #y}. */
	public static short ny(long struct) { return memGetShort(struct + STBTTVertex.Y); }
	/** Unsafe version of {@link #cx}. */
	public static short ncx(long struct) { return memGetShort(struct + STBTTVertex.CX); }
	/** Unsafe version of {@link #cy}. */
	public static short ncy(long struct) { return memGetShort(struct + STBTTVertex.CY); }
	/** Unsafe version of {@link #type}. */
	public static byte ntype(long struct) { return memGetByte(struct + STBTTVertex.TYPE); }

	// -----------------------------------

	/** An array of {@link STBTTVertex} structs. */
	public static final class Buffer extends StructBuffer<STBTTVertex, Buffer> {

		/**
		 * Creates a new {@link STBTTVertex.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link STBTTVertex#SIZEOF}, and its mark will be undefined.
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
		protected STBTTVertex newInstance(long address) {
			return new STBTTVertex(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code x} field. */
		public short x() { return STBTTVertex.nx(address()); }
		/** Returns the value of the {@code y} field. */
		public short y() { return STBTTVertex.ny(address()); }
		/** Returns the value of the {@code cx} field. */
		public short cx() { return STBTTVertex.ncx(address()); }
		/** Returns the value of the {@code cy} field. */
		public short cy() { return STBTTVertex.ncy(address()); }
		/** Returns the value of the {@code type} field. */
		public byte type() { return STBTTVertex.ntype(address()); }

	}

}