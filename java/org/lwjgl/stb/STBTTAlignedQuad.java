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
 * Quad used for drawing a baked character, returned by {@link STBTruetype#stbtt_GetBakedQuad}.
 * 
 * <h3>stbtt_aligned_quad members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>x0</td><td class="nw">float</td><td></td></tr>
 * <tr><td>y0</td><td class="nw">float</td><td></td></tr>
 * <tr><td>s0</td><td class="nw">float</td><td></td></tr>
 * <tr><td>t0</td><td class="nw">float</td><td></td></tr>
 * <tr><td>x1</td><td class="nw">float</td><td></td></tr>
 * <tr><td>y1</td><td class="nw">float</td><td></td></tr>
 * <tr><td>s1</td><td class="nw">float</td><td></td></tr>
 * <tr><td>t1</td><td class="nw">float</td><td></td></tr>
 * </table>
 */
public class STBTTAlignedQuad extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		X0,
		Y0,
		S0,
		T0,
		X1,
		Y1,
		S1,
		T1;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		X0 = layout.offsetof(0);
		Y0 = layout.offsetof(1);
		S0 = layout.offsetof(2);
		T0 = layout.offsetof(3);
		X1 = layout.offsetof(4);
		Y1 = layout.offsetof(5);
		S1 = layout.offsetof(6);
		T1 = layout.offsetof(7);
	}

	STBTTAlignedQuad(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link STBTTAlignedQuad} instance at the specified memory address. */
	public STBTTAlignedQuad(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link STBTTAlignedQuad} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public STBTTAlignedQuad(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code x0} field. */
	public float x0() { return nx0(address()); }
	/** Returns the value of the {@code y0} field. */
	public float y0() { return ny0(address()); }
	/** Returns the value of the {@code s0} field. */
	public float s0() { return ns0(address()); }
	/** Returns the value of the {@code t0} field. */
	public float t0() { return nt0(address()); }
	/** Returns the value of the {@code x1} field. */
	public float x1() { return nx1(address()); }
	/** Returns the value of the {@code y1} field. */
	public float y1() { return ny1(address()); }
	/** Returns the value of the {@code s1} field. */
	public float s1() { return ns1(address()); }
	/** Returns the value of the {@code t1} field. */
	public float t1() { return nt1(address()); }

	// -----------------------------------

	/** Returns a new {@link STBTTAlignedQuad} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static STBTTAlignedQuad malloc() {
		return new STBTTAlignedQuad(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link STBTTAlignedQuad} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static STBTTAlignedQuad calloc() {
		return new STBTTAlignedQuad(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link STBTTAlignedQuad} instance allocated with {@link BufferUtils}. */
	public static STBTTAlignedQuad create() {
		return new STBTTAlignedQuad(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link STBTTAlignedQuad.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link STBTTAlignedQuad.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link STBTTAlignedQuad.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link STBTTAlignedQuad.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #x0}. */
	public static float nx0(long struct) { return memGetFloat(struct + STBTTAlignedQuad.X0); }
	/** Unsafe version of {@link #y0}. */
	public static float ny0(long struct) { return memGetFloat(struct + STBTTAlignedQuad.Y0); }
	/** Unsafe version of {@link #s0}. */
	public static float ns0(long struct) { return memGetFloat(struct + STBTTAlignedQuad.S0); }
	/** Unsafe version of {@link #t0}. */
	public static float nt0(long struct) { return memGetFloat(struct + STBTTAlignedQuad.T0); }
	/** Unsafe version of {@link #x1}. */
	public static float nx1(long struct) { return memGetFloat(struct + STBTTAlignedQuad.X1); }
	/** Unsafe version of {@link #y1}. */
	public static float ny1(long struct) { return memGetFloat(struct + STBTTAlignedQuad.Y1); }
	/** Unsafe version of {@link #s1}. */
	public static float ns1(long struct) { return memGetFloat(struct + STBTTAlignedQuad.S1); }
	/** Unsafe version of {@link #t1}. */
	public static float nt1(long struct) { return memGetFloat(struct + STBTTAlignedQuad.T1); }

	// -----------------------------------

	/** An array of {@link STBTTAlignedQuad} structs. */
	public static final class Buffer extends StructBuffer<STBTTAlignedQuad, Buffer> {

		/**
		 * Creates a new {@link STBTTAlignedQuad.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link STBTTAlignedQuad#SIZEOF}, and its mark will be undefined.
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
		protected STBTTAlignedQuad newInstance(long address) {
			return new STBTTAlignedQuad(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code x0} field. */
		public float x0() { return nx0(address()); }
		/** Returns the value of the {@code y0} field. */
		public float y0() { return ny0(address()); }
		/** Returns the value of the {@code s0} field. */
		public float s0() { return ns0(address()); }
		/** Returns the value of the {@code t0} field. */
		public float t0() { return nt0(address()); }
		/** Returns the value of the {@code x1} field. */
		public float x1() { return nx1(address()); }
		/** Returns the value of the {@code y1} field. */
		public float y1() { return ny1(address()); }
		/** Returns the value of the {@code s1} field. */
		public float s1() { return ns1(address()); }
		/** Returns the value of the {@code t1} field. */
		public float t1() { return nt1(address()); }

	}

}