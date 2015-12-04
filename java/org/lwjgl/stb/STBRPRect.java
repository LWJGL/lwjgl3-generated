/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.stb;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * A packed rectangle.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * struct stbrp_rect {
 *     int id;
 *     stbrp_coord w;
 *     stbrp_coord h;
 *     stbrp_coord x;
 *     stbrp_coord y;
 *     int was_packed;
 * }</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><td>id</td><td>reserved for your use</td></tr>
 * <tr><td>w</td><td>input width</td></tr>
 * <tr><td>h</td><td>input height</td></tr>
 * <tr><td>x</td><td>output x coordinate</td></tr>
 * <tr><td>y</td><td>output y coordinate</td></tr>
 * <tr><td>was_packed</td><td>non-zero if valid packing</td></tr>
 * </table>
 */
public class STBRPRect extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		ID,
		W,
		H,
		X,
		Y,
		WAS_PACKED;

	static {
		Layout layout = __struct(
			__member(4),
			__member(2),
			__member(2),
			__member(2),
			__member(2),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		ID = layout.offsetof(0);
		W = layout.offsetof(1);
		H = layout.offsetof(2);
		X = layout.offsetof(3);
		Y = layout.offsetof(4);
		WAS_PACKED = layout.offsetof(5);
	}

	STBRPRect(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link STBRPRect} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public STBRPRect(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code id} field. */
	public int id() { return nid(address()); }
	/** Returns the value of the {@code w} field. */
	public short w() { return nw(address()); }
	/** Returns the value of the {@code h} field. */
	public short h() { return nh(address()); }
	/** Returns the value of the {@code x} field. */
	public short x() { return nx(address()); }
	/** Returns the value of the {@code y} field. */
	public short y() { return ny(address()); }
	/** Returns the value of the {@code was_packed} field. */
	public int was_packed() { return nwas_packed(address()); }

	/** Sets the specified value to the {@code id} field. */
	public STBRPRect id(int value) { nid(address(), value); return this; }
	/** Sets the specified value to the {@code w} field. */
	public STBRPRect w(short value) { nw(address(), value); return this; }
	/** Sets the specified value to the {@code h} field. */
	public STBRPRect h(short value) { nh(address(), value); return this; }
	/** Sets the specified value to the {@code x} field. */
	public STBRPRect x(short value) { nx(address(), value); return this; }
	/** Sets the specified value to the {@code y} field. */
	public STBRPRect y(short value) { ny(address(), value); return this; }
	/** Sets the specified value to the {@code was_packed} field. */
	public STBRPRect was_packed(int value) { nwas_packed(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public STBRPRect set(
		int id,
		short w,
		short h,
		short x,
		short y,
		int was_packed
	) {
		id(id);
		w(w);
		h(h);
		x(x);
		y(y);
		was_packed(was_packed);

		return this;
	}

	/** Unsafe version of {@link #set(STBRPRect) set}. */
	public STBRPRect nset(long struct) {
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
	public STBRPRect set(STBRPRect src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(STBRPRect) set}. */
	public STBRPRect set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link STBRPRect} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static STBRPRect malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link STBRPRect} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static STBRPRect calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link STBRPRect} instance allocated with {@link BufferUtils}. */
	public static STBRPRect create() {
		return new STBRPRect(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link STBRPRect} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static STBRPRect create(long address) {
		return address == NULL ? null : new STBRPRect(address, null);
	}

	/**
	 * Returns a new {@link STBRPRect.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link STBRPRect.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link STBRPRect.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link STBRPRect.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #id}. */
	public static int nid(long struct) { return memGetInt(struct + STBRPRect.ID); }
	/** Unsafe version of {@link #w}. */
	public static short nw(long struct) { return memGetShort(struct + STBRPRect.W); }
	/** Unsafe version of {@link #h}. */
	public static short nh(long struct) { return memGetShort(struct + STBRPRect.H); }
	/** Unsafe version of {@link #x}. */
	public static short nx(long struct) { return memGetShort(struct + STBRPRect.X); }
	/** Unsafe version of {@link #y}. */
	public static short ny(long struct) { return memGetShort(struct + STBRPRect.Y); }
	/** Unsafe version of {@link #was_packed}. */
	public static int nwas_packed(long struct) { return memGetInt(struct + STBRPRect.WAS_PACKED); }

	/** Unsafe version of {@link #id(int) id}. */
	public static void nid(long struct, int value) { memPutInt(struct + STBRPRect.ID, value); }
	/** Unsafe version of {@link #w(short) w}. */
	public static void nw(long struct, short value) { memPutShort(struct + STBRPRect.W, value); }
	/** Unsafe version of {@link #h(short) h}. */
	public static void nh(long struct, short value) { memPutShort(struct + STBRPRect.H, value); }
	/** Unsafe version of {@link #x(short) x}. */
	public static void nx(long struct, short value) { memPutShort(struct + STBRPRect.X, value); }
	/** Unsafe version of {@link #y(short) y}. */
	public static void ny(long struct, short value) { memPutShort(struct + STBRPRect.Y, value); }
	/** Unsafe version of {@link #was_packed(int) was_packed}. */
	public static void nwas_packed(long struct, int value) { memPutInt(struct + STBRPRect.WAS_PACKED, value); }

	// -----------------------------------

	/** An array of {@link STBRPRect} structs. */
	public static final class Buffer extends StructBuffer<STBRPRect, Buffer> {

		/**
		 * Creates a new {@link STBRPRect.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link STBRPRect#SIZEOF}, and its mark will be undefined.
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
		protected STBRPRect newInstance(long address) {
			return new STBRPRect(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code id} field. */
		public int id() { return STBRPRect.nid(address()); }
		/** Returns the value of the {@code w} field. */
		public short w() { return STBRPRect.nw(address()); }
		/** Returns the value of the {@code h} field. */
		public short h() { return STBRPRect.nh(address()); }
		/** Returns the value of the {@code x} field. */
		public short x() { return STBRPRect.nx(address()); }
		/** Returns the value of the {@code y} field. */
		public short y() { return STBRPRect.ny(address()); }
		/** Returns the value of the {@code was_packed} field. */
		public int was_packed() { return STBRPRect.nwas_packed(address()); }

		/** Sets the specified value to the {@code id} field. */
		public STBRPRect.Buffer id(int value) { STBRPRect.nid(address(), value); return this; }
		/** Sets the specified value to the {@code w} field. */
		public STBRPRect.Buffer w(short value) { STBRPRect.nw(address(), value); return this; }
		/** Sets the specified value to the {@code h} field. */
		public STBRPRect.Buffer h(short value) { STBRPRect.nh(address(), value); return this; }
		/** Sets the specified value to the {@code x} field. */
		public STBRPRect.Buffer x(short value) { STBRPRect.nx(address(), value); return this; }
		/** Sets the specified value to the {@code y} field. */
		public STBRPRect.Buffer y(short value) { STBRPRect.ny(address(), value); return this; }
		/** Sets the specified value to the {@code was_packed} field. */
		public STBRPRect.Buffer was_packed(int value) { STBRPRect.nwas_packed(address(), value); return this; }

	}

}