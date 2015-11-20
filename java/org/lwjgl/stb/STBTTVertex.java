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

/**
 * Vertex data.
 * 
 * <h3>stbtt_vertex members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>x</td><td class="nw">stbtt_vertex_type</td><td></td></tr>
 * <tr><td>y</td><td class="nw">stbtt_vertex_type</td><td></td></tr>
 * <tr><td>cx</td><td class="nw">stbtt_vertex_type</td><td></td></tr>
 * <tr><td>cy</td><td class="nw">stbtt_vertex_type</td><td></td></tr>
 * <tr><td>type</td><td class="nw">unsigned char</td><td></td></tr>
 * </table>
 */
public class STBTTVertex extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

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
		__ALIGNMENT = layout.getAlignment();

		X = layout.offsetof(0);
		Y = layout.offsetof(1);
		CX = layout.offsetof(2);
		CY = layout.offsetof(3);
		TYPE = layout.offsetof(4);
	}

	STBTTVertex(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link STBTTVertex} instance at the specified memory address. */
	public STBTTVertex(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link STBTTVertex} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public STBTTVertex(ByteBuffer container) {
		this(memAddress(container), container);
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

	/** Returns a new {@link STBTTVertex} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static STBTTVertex malloc() {
		return new STBTTVertex(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link STBTTVertex} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static STBTTVertex calloc() {
		return new STBTTVertex(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link STBTTVertex} instance allocated with {@link BufferUtils}. */
	public static STBTTVertex create() {
		return new STBTTVertex(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link STBTTVertex.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link STBTTVertex.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link STBTTVertex.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link STBTTVertex.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

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
		protected STBTTVertex newInstance(long address) {
			return new STBTTVertex(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

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

	}

}