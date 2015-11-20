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
 * <h3>ovrSizei members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>w</td><td class="nw">int</td><td>the width</td></tr>
 * <tr><td>h</td><td class="nw">int</td><td>the height</td></tr>
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
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRSizei} instance at the specified memory address. */
	public OVRSizei(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRSizei} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRSizei(ByteBuffer container) {
		this(memAddress(container), container);
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

	/** {@link ByteBuffer} version of {@link #set(OVRSizei) set}. */
	public OVRSizei set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRSizei} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRSizei malloc() {
		return new OVRSizei(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRSizei} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRSizei calloc() {
		return new OVRSizei(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRSizei} instance allocated with {@link BufferUtils}. */
	public static OVRSizei create() {
		return new OVRSizei(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRSizei.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRSizei.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRSizei.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link OVRSizei.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
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
		protected OVRSizei newInstance(long address) {
			return new OVRSizei(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code w} field. */
		public int w() { return nw(address()); }
		/** Returns the value of the {@code h} field. */
		public int h() { return nh(address()); }

		/** Sets the specified value to the {@code w} field. */
		public OVRSizei.Buffer w(int value) { nw(address(), value); return this; }
		/** Sets the specified value to the {@code h} field. */
		public OVRSizei.Buffer h(int value) { nh(address(), value); return this; }

	}

}