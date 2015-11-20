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
 * A 3D vector with float components.
 * 
 * <h3>ovrVector3f members</h3>
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><th>Member</th><th>Type</th><th>Description</th></tr>
 * <tr><td>x</td><td class="nw">float</td><td>the vector x component</td></tr>
 * <tr><td>y</td><td class="nw">float</td><td>the vector y component</td></tr>
 * <tr><td>z</td><td class="nw">float</td><td>the vector z component</td></tr>
 * </table>
 */
public class OVRVector3f extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		X,
		Y,
		Z;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		X = layout.offsetof(0);
		Y = layout.offsetof(1);
		Z = layout.offsetof(2);
	}

	OVRVector3f(long address, ByteBuffer container) {
		super(address, container, SIZEOF);
	}

	/** Creates a {@link OVRVector3f} instance at the specified memory address. */
	public OVRVector3f(long struct) {
		this(struct, null);
	}

	/**
	 * Creates a {@link OVRVector3f} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRVector3f(ByteBuffer container) {
		this(memAddress(container), container);
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code x} field. */
	public float x() { return nx(address()); }
	/** Returns the value of the {@code y} field. */
	public float y() { return ny(address()); }
	/** Returns the value of the {@code z} field. */
	public float z() { return nz(address()); }

	/** Sets the specified value to the {@code x} field. */
	public OVRVector3f x(float value) { nx(address(), value); return this; }
	/** Sets the specified value to the {@code y} field. */
	public OVRVector3f y(float value) { ny(address(), value); return this; }
	/** Sets the specified value to the {@code z} field. */
	public OVRVector3f z(float value) { nz(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public OVRVector3f set(
		float x,
		float y,
		float z
	) {
		x(x);
		y(y);
		z(z);

		return this;
	}

	/** Unsafe version of {@link #set(OVRVector3f) set}. */
	public OVRVector3f nset(long struct) {
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
	public OVRVector3f set(OVRVector3f src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(OVRVector3f) set}. */
	public OVRVector3f set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link OVRVector3f} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static OVRVector3f malloc() {
		return new OVRVector3f(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRVector3f} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static OVRVector3f calloc() {
		return new OVRVector3f(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRVector3f} instance allocated with {@link BufferUtils}. */
	public static OVRVector3f create() {
		return new OVRVector3f(BufferUtils.createByteBuffer(SIZEOF));
	}

	/**
	 * Returns a new {@link OVRVector3f.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocBuffer(int capacity) {
		return new Buffer(memAlloc(capacity * SIZEOF));
	}

	/**
	 * Returns a new {@link OVRVector3f.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocBuffer(int capacity) {
		return new Buffer(memCalloc(capacity, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRVector3f.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF), SIZEOF);
	}

	/**
	 * Create a {@link OVRVector3f.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer createBuffer(long address, int capacity) {
		return address == NULL ? null : new Buffer(memByteBuffer(address, capacity * SIZEOF), SIZEOF);
	}

	/** Unsafe version of {@link #x}. */
	public static float nx(long struct) { return memGetFloat(struct + OVRVector3f.X); }
	/** Unsafe version of {@link #y}. */
	public static float ny(long struct) { return memGetFloat(struct + OVRVector3f.Y); }
	/** Unsafe version of {@link #z}. */
	public static float nz(long struct) { return memGetFloat(struct + OVRVector3f.Z); }

	/** Unsafe version of {@link #x(float) x}. */
	public static void nx(long struct, float value) { memPutFloat(struct + OVRVector3f.X, value); }
	/** Unsafe version of {@link #y(float) y}. */
	public static void ny(long struct, float value) { memPutFloat(struct + OVRVector3f.Y, value); }
	/** Unsafe version of {@link #z(float) z}. */
	public static void nz(long struct, float value) { memPutFloat(struct + OVRVector3f.Z, value); }

	// -----------------------------------

	/** An array of {@link OVRVector3f} structs. */
	public static final class Buffer extends StructBuffer<OVRVector3f, Buffer> {

		/**
		 * Creates a new {@link OVRVector3f.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRVector3f#SIZEOF}, and its mark will be undefined.
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
		protected OVRVector3f newInstance(long address) {
			return new OVRVector3f(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code x} field. */
		public float x() { return nx(address()); }
		/** Returns the value of the {@code y} field. */
		public float y() { return ny(address()); }
		/** Returns the value of the {@code z} field. */
		public float z() { return nz(address()); }

		/** Sets the specified value to the {@code x} field. */
		public OVRVector3f.Buffer x(float value) { nx(address(), value); return this; }
		/** Sets the specified value to the {@code y} field. */
		public OVRVector3f.Buffer y(float value) { ny(address(), value); return this; }
		/** Sets the specified value to the {@code z} field. */
		public OVRVector3f.Buffer z(float value) { nz(address(), value); return this; }

	}

}