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
 * Baked character data, returned by {@link STBTruetype#stbtt_BakeFontBitmap}.
 * 
 * <h3>stbtt_bakedchar members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>x0</td><td class="nw">unsigned short</td><td></td></tr>
 * <tr><td>y0</td><td class="nw">unsigned short</td><td></td></tr>
 * <tr><td>x1</td><td class="nw">unsigned short</td><td></td></tr>
 * <tr><td>y1</td><td class="nw">unsigned short</td><td></td></tr>
 * <tr><td>xoff</td><td class="nw">float</td><td></td></tr>
 * <tr><td>yoff</td><td class="nw">float</td><td></td></tr>
 * <tr><td>xadvance</td><td class="nw">float</td><td></td></tr>
 * </table>
 */
public class STBTTBakedChar extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		X0,
		Y0,
		X1,
		Y1,
		XOFF,
		YOFF,
		XADVANCE;

	static {
		Layout layout = __struct(
			__member(2),
			__member(2),
			__member(2),
			__member(2),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		X0 = layout.offsetof(0);
		Y0 = layout.offsetof(1);
		X1 = layout.offsetof(2);
		Y1 = layout.offsetof(3);
		XOFF = layout.offsetof(4);
		YOFF = layout.offsetof(5);
		XADVANCE = layout.offsetof(6);
	}

	STBTTBakedChar(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link STBTTBakedChar} instance at the specified memory address. */
	public STBTTBakedChar(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link STBTTBakedChar} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public STBTTBakedChar(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code x0} field. */
	public short x0() { return nx0(address()); }
	/** Returns the value of the {@code y0} field. */
	public short y0() { return ny0(address()); }
	/** Returns the value of the {@code x1} field. */
	public short x1() { return nx1(address()); }
	/** Returns the value of the {@code y1} field. */
	public short y1() { return ny1(address()); }
	/** Returns the value of the {@code xoff} field. */
	public float xoff() { return nxoff(address()); }
	/** Returns the value of the {@code yoff} field. */
	public float yoff() { return nyoff(address()); }
	/** Returns the value of the {@code xadvance} field. */
	public float xadvance() { return nxadvance(address()); }

	// -----------------------------------

	/** Returns a new {@link STBTTBakedChar} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static STBTTBakedChar malloc() {
		return new STBTTBakedChar(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link STBTTBakedChar} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static STBTTBakedChar calloc() {
		return new STBTTBakedChar(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link STBTTBakedChar} instance allocated with {@link BufferUtils}. */
	public static STBTTBakedChar create() {
		return new STBTTBakedChar(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link STBTTBakedChar.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link STBTTBakedChar.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link STBTTBakedChar.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link STBTTBakedChar.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #x0}. */
	public static short nx0(long struct) { return memGetShort(struct + STBTTBakedChar.X0); }
	/** Unsafe version of {@link #y0}. */
	public static short ny0(long struct) { return memGetShort(struct + STBTTBakedChar.Y0); }
	/** Unsafe version of {@link #x1}. */
	public static short nx1(long struct) { return memGetShort(struct + STBTTBakedChar.X1); }
	/** Unsafe version of {@link #y1}. */
	public static short ny1(long struct) { return memGetShort(struct + STBTTBakedChar.Y1); }
	/** Unsafe version of {@link #xoff}. */
	public static float nxoff(long struct) { return memGetFloat(struct + STBTTBakedChar.XOFF); }
	/** Unsafe version of {@link #yoff}. */
	public static float nyoff(long struct) { return memGetFloat(struct + STBTTBakedChar.YOFF); }
	/** Unsafe version of {@link #xadvance}. */
	public static float nxadvance(long struct) { return memGetFloat(struct + STBTTBakedChar.XADVANCE); }

	// -----------------------------------

	/** An array of {@link STBTTBakedChar} structs. */
	public static final class Buffer extends StructBuffer<STBTTBakedChar, Buffer> {

		/**
		 * Creates a new {@link STBTTBakedChar.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link STBTTBakedChar#SIZEOF}, and its mark will be undefined.
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
		protected STBTTBakedChar newInstance(long address) {
			return new STBTTBakedChar(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code x0} field. */
		public short x0() { return nx0(address()); }
		/** Returns the value of the {@code y0} field. */
		public short y0() { return ny0(address()); }
		/** Returns the value of the {@code x1} field. */
		public short x1() { return nx1(address()); }
		/** Returns the value of the {@code y1} field. */
		public short y1() { return ny1(address()); }
		/** Returns the value of the {@code xoff} field. */
		public float xoff() { return nxoff(address()); }
		/** Returns the value of the {@code yoff} field. */
		public float yoff() { return nyoff(address()); }
		/** Returns the value of the {@code xadvance} field. */
		public float xadvance() { return nxadvance(address()); }

	}

}