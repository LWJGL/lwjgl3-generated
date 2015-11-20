/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.ovr;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * A 2D vector with integer components.
 * 
 * <h3>ovrVector2i members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>x</td><td class="nw">int</td><td>the vector x component</td></tr>
 * <tr><td>y</td><td class="nw">int</td><td>the vector y component</td></tr>
 * </table>
 */
public class OVRVector2i extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		X,
		Y;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		X = layout.offsetof(0);
		Y = layout.offsetof(1);
	}

	OVRVector2i(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRVector2i} instance at the specified memory address. */
	public OVRVector2i(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRVector2i} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRVector2i(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code x} field. */
	public int x() { return nx(address()); }
	/** Returns the value of the {@code y} field. */
	public int y() { return ny(address()); }

	/** Sets the specified value to the {@code x} field. */
	public OVRVector2i x(int value) { nx(address(), value); return this; }
	/** Sets the specified value to the {@code y} field. */
	public OVRVector2i y(int value) { ny(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public OVRVector2i set(
		int x,
		int y
	) {
		x(x);
		y(y);

		return this;
	}

	/** Unsafe version of {@link #set(OVRVector2i) set}. */
	public OVRVector2i nset(long struct) {
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
	public OVRVector2i set(OVRVector2i src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(OVRVector2i) set}. */
	public OVRVector2i set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRVector2i} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRVector2i malloc() {
		return new OVRVector2i(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRVector2i} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRVector2i calloc() {
		return new OVRVector2i(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRVector2i} instance allocated with {@link BufferUtils}. */
	public static OVRVector2i create() {
		return new OVRVector2i(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRVector2i.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRVector2i.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRVector2i.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link OVRVector2i.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #x}. */
	public static int nx(long struct) { return memGetInt(struct + OVRVector2i.X); }
	/** Unsafe version of {@link #y}. */
	public static int ny(long struct) { return memGetInt(struct + OVRVector2i.Y); }

	/** Unsafe version of {@link #x(int) x}. */
	public static void nx(long struct, int value) { memPutInt(struct + OVRVector2i.X, value); }
	/** Unsafe version of {@link #y(int) y}. */
	public static void ny(long struct, int value) { memPutInt(struct + OVRVector2i.Y, value); }

	// -----------------------------------

	/** An array of {@link OVRVector2i} structs. */
	public static final class Buffer extends StructBuffer<OVRVector2i, Buffer> {

		/**
		 * Creates a new {@link OVRVector2i.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRVector2i#SIZEOF}, and its mark will be undefined.
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
		protected OVRVector2i newInstance(long address) {
			return new OVRVector2i(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code x} field. */
		public int x() { return nx(address()); }
		/** Returns the value of the {@code y} field. */
		public int y() { return ny(address()); }

		/** Sets the specified value to the {@code x} field. */
		public OVRVector2i.Buffer x(int value) { nx(address(), value); return this; }
		/** Sets the specified value to the {@code y} field. */
		public OVRVector2i.Buffer y(int value) { ny(address(), value); return this; }

	}

}