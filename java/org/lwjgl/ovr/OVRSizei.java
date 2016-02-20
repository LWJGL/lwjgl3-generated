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
 * A 2D size with integer components.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code style="font-family: monospace">
 * struct ovrSizei {
 *     int w;
 *     int h;
 * }</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><td>w</td><td>the width</td></tr>
 * <tr><td>h</td><td>the height</td></tr>
 * </table>
 */
public class OVRSizei extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		W,
		H;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		W = layout.offsetof(0);
		H = layout.offsetof(1);
	}

	OVRSizei(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link OVRSizei} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRSizei(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code w} field. */
	public int w() { return nw(address()); }
	/** Returns the value of the {@code h} field. */
	public int h() { return nh(address()); }

	/** Sets the specified value to the {@code w} field. */
	public OVRSizei w(int value) { nw(address(), value); return this; }
	/** Sets the specified value to the {@code h} field. */
	public OVRSizei h(int value) { nh(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public OVRSizei set(
		int w,
		int h
	) {
		w(w);
		h(h);

		return this;
	}

	/** Unsafe version of {@link #set(OVRSizei) set}. */
	public OVRSizei nset(long struct) {
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
	public OVRSizei set(OVRSizei src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link OVRSizei} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRSizei malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRSizei} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRSizei calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRSizei} instance allocated with {@link BufferUtils}. */
	public static OVRSizei create() {
		return new OVRSizei(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link OVRSizei} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static OVRSizei create(long address) {
		return address == NULL ? null : new OVRSizei(address, null);
	}

	/**
	 * Returns a new {@link OVRSizei.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRSizei.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRSizei.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link OVRSizei.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #w}. */
	public static int nw(long struct) { return memGetInt(struct + OVRSizei.W); }
	/** Unsafe version of {@link #h}. */
	public static int nh(long struct) { return memGetInt(struct + OVRSizei.H); }

	/** Unsafe version of {@link #w(int) w}. */
	public static void nw(long struct, int value) { memPutInt(struct + OVRSizei.W, value); }
	/** Unsafe version of {@link #h(int) h}. */
	public static void nh(long struct, int value) { memPutInt(struct + OVRSizei.H, value); }

	// -----------------------------------

	/** An array of {@link OVRSizei} structs. */
	public static final class Buffer extends StructBuffer<OVRSizei, Buffer> {

		/**
		 * Creates a new {@link OVRSizei.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRSizei#SIZEOF}, and its mark will be undefined.
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
		protected OVRSizei newInstance(long address) {
			return new OVRSizei(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code w} field. */
		public int w() { return OVRSizei.nw(address()); }
		/** Returns the value of the {@code h} field. */
		public int h() { return OVRSizei.nh(address()); }

		/** Sets the specified value to the {@code w} field. */
		public OVRSizei.Buffer w(int value) { OVRSizei.nw(address(), value); return this; }
		/** Sets the specified value to the {@code h} field. */
		public OVRSizei.Buffer h(int value) { OVRSizei.nh(address(), value); return this; }

	}

}