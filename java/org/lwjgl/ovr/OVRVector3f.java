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
import static org.lwjgl.system.MemoryStack.*;

/**
 * A 3D vector with float components.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code x} &ndash; the vector x component</li>
 * <li>{@code y} &ndash; the vector y component</li>
 * <li>{@code z} &ndash; the vector z component</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct ovrVector3f {
    float x;
    float y;
    float z;
}</code></pre>
 */
public class OVRVector3f extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

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
		ALIGNOF = layout.getAlignment();

		X = layout.offsetof(0);
		Y = layout.offsetof(1);
		Z = layout.offsetof(2);
	}

	OVRVector3f(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link OVRVector3f} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRVector3f(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
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

	// -----------------------------------

	/** Returns a new {@link OVRVector3f} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static OVRVector3f malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRVector3f} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static OVRVector3f calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRVector3f} instance allocated with {@link BufferUtils}. */
	public static OVRVector3f create() {
		return new OVRVector3f(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link OVRVector3f} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static OVRVector3f create(long address) {
		return address == NULL ? null : new OVRVector3f(address, null);
	}

	/**
	 * Returns a new {@link OVRVector3f.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRVector3f.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRVector3f.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link OVRVector3f.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link OVRVector3f} instance allocated on the thread-local {@link MemoryStack}. */
	public static OVRVector3f mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link OVRVector3f} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static OVRVector3f callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link OVRVector3f} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRVector3f mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRVector3f} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRVector3f callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRVector3f.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRVector3f.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRVector3f.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRVector3f.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

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
		protected OVRVector3f newInstance(long address) {
			return new OVRVector3f(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code x} field. */
		public float x() { return OVRVector3f.nx(address()); }
		/** Returns the value of the {@code y} field. */
		public float y() { return OVRVector3f.ny(address()); }
		/** Returns the value of the {@code z} field. */
		public float z() { return OVRVector3f.nz(address()); }

		/** Sets the specified value to the {@code x} field. */
		public OVRVector3f.Buffer x(float value) { OVRVector3f.nx(address(), value); return this; }
		/** Sets the specified value to the {@code y} field. */
		public OVRVector3f.Buffer y(float value) { OVRVector3f.ny(address(), value); return this; }
		/** Sets the specified value to the {@code z} field. */
		public OVRVector3f.Buffer z(float value) { OVRVector3f.nz(address(), value); return this; }

	}

}