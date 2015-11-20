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
 * A 4x4 matrix with float components.
 * 
 * <h3>ovrMatrix4f members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>M</td><td class="nw">float[16]</td><td>the matrix components</td></tr>
 * </table>
 */
public class OVRMatrix4f extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		M;

	static {
		Layout layout = __struct(
			__array(4, 16)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		M = layout.offsetof(0);
	}

	OVRMatrix4f(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRMatrix4f} instance at the specified memory address. */
	public OVRMatrix4f(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRMatrix4f} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRMatrix4f(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link FloatBuffer} view of the {@code M} field. */
	public FloatBuffer M() { return nM(address()); }
	/** Returns the value at the specified index of the {@code M} field. */
	public float M(int index) { return nM(address(), index); }

	/** Copies the specified {@link FloatBuffer} to the {@code M} field. */
	public OVRMatrix4f M(FloatBuffer value) { nM(address(), value); return this; }
	/** Sets the specified value at the specified index of the {@code M} field. */
	public OVRMatrix4f M(int index, float value) { nM(address(), index, value); return this; }

	/** Unsafe version of {@link #set(OVRMatrix4f) set}. */
	public OVRMatrix4f nset(long struct) {
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
	public OVRMatrix4f set(OVRMatrix4f src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(OVRMatrix4f) set}. */
	public OVRMatrix4f set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRMatrix4f} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRMatrix4f malloc() {
		return new OVRMatrix4f(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRMatrix4f} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRMatrix4f calloc() {
		return new OVRMatrix4f(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRMatrix4f} instance allocated with {@link BufferUtils}. */
	public static OVRMatrix4f create() {
		return new OVRMatrix4f(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRMatrix4f.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRMatrix4f.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRMatrix4f.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link OVRMatrix4f.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #M}. */
	public static FloatBuffer nM(long struct) {
		return memFloatBuffer(struct + OVRMatrix4f.M, 16);
	}
	/** Unsafe version of {@link #M(int) M}. */
	public static float nM(long struct, int index) { return memGetFloat(struct + OVRMatrix4f.M + index * 4); }

	/** Unsafe version of {@link #M(FloatBuffer) M}. */
	public static void nM(long struct, FloatBuffer value) {
		if ( CHECKS ) checkBufferGT(value, 16);
		memCopy(memAddress(value), struct + OVRMatrix4f.M, value.remaining() * 4);
	}
	/** Unsafe version of {@link #M(int, float) M}. */
	public static void nM(long struct, int index, float value) { memPutFloat(struct + OVRMatrix4f.M + index * 4, value); }

	// -----------------------------------

	/** An array of {@link OVRMatrix4f} structs. */
	public static final class Buffer extends StructBuffer<OVRMatrix4f, Buffer> {

		/**
		 * Creates a new {@link OVRMatrix4f.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRMatrix4f#SIZEOF}, and its mark will be undefined.
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
		protected OVRMatrix4f newInstance(long address) {
			return new OVRMatrix4f(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link FloatBuffer} view of the {@code M} field. */
		public FloatBuffer M() { return nM(address()); }
		/** Returns the value at the specified index of the {@code M} field. */
		public float M(int index) { return nM(address(), index); }

		/** Copies the specified {@link FloatBuffer} to the {@code M} field. */
		public OVRMatrix4f.Buffer M(FloatBuffer value) { nM(address(), value); return this; }
		/** Sets the specified value at the specified index of the {@code M} field. */
		public OVRMatrix4f.Buffer M(int index, float value) { nM(address(), index, value); return this; }

	}

}