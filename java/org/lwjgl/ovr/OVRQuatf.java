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
 * A quaternion rotation.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code x} &ndash; the vector x component</li>
 * <li>{@code y} &ndash; the vector y component</li>
 * <li>{@code z} &ndash; the vector z component</li>
 * <li>{@code w} &ndash; the vector w component</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct ovrQuatf {
    float x;
    float y;
    float z;
    float w;
}</code></pre>
 */
public class OVRQuatf extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		X,
		Y,
		Z,
		W;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		X = layout.offsetof(0);
		Y = layout.offsetof(1);
		Z = layout.offsetof(2);
		W = layout.offsetof(3);
	}

	OVRQuatf(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link OVRQuatf} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRQuatf(ByteBuffer container) {
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
	/** Returns the value of the {@code w} field. */
	public float w() { return nw(address()); }

	/** Sets the specified value to the {@code x} field. */
	public OVRQuatf x(float value) { nx(address(), value); return this; }
	/** Sets the specified value to the {@code y} field. */
	public OVRQuatf y(float value) { ny(address(), value); return this; }
	/** Sets the specified value to the {@code z} field. */
	public OVRQuatf z(float value) { nz(address(), value); return this; }
	/** Sets the specified value to the {@code w} field. */
	public OVRQuatf w(float value) { nw(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public OVRQuatf set(
		float x,
		float y,
		float z,
		float w
	) {
		x(x);
		y(y);
		z(z);
		w(w);

		return this;
	}

	/** Unsafe version of {@link #set(OVRQuatf) set}. */
	public OVRQuatf nset(long struct) {
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
	public OVRQuatf set(OVRQuatf src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link OVRQuatf} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static OVRQuatf malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRQuatf} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static OVRQuatf calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRQuatf} instance allocated with {@link BufferUtils}. */
	public static OVRQuatf create() {
		return new OVRQuatf(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link OVRQuatf} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static OVRQuatf create(long address) {
		return address == NULL ? null : new OVRQuatf(address, null);
	}

	/**
	 * Returns a new {@link OVRQuatf.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRQuatf.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRQuatf.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link OVRQuatf.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link OVRQuatf} instance allocated on the thread-local {@link MemoryStack}. */
	public static OVRQuatf mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link OVRQuatf} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static OVRQuatf callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link OVRQuatf} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRQuatf mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRQuatf} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRQuatf callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRQuatf.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRQuatf.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRQuatf.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRQuatf.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #x}. */
	public static float nx(long struct) { return memGetFloat(struct + OVRQuatf.X); }
	/** Unsafe version of {@link #y}. */
	public static float ny(long struct) { return memGetFloat(struct + OVRQuatf.Y); }
	/** Unsafe version of {@link #z}. */
	public static float nz(long struct) { return memGetFloat(struct + OVRQuatf.Z); }
	/** Unsafe version of {@link #w}. */
	public static float nw(long struct) { return memGetFloat(struct + OVRQuatf.W); }

	/** Unsafe version of {@link #x(float) x}. */
	public static void nx(long struct, float value) { memPutFloat(struct + OVRQuatf.X, value); }
	/** Unsafe version of {@link #y(float) y}. */
	public static void ny(long struct, float value) { memPutFloat(struct + OVRQuatf.Y, value); }
	/** Unsafe version of {@link #z(float) z}. */
	public static void nz(long struct, float value) { memPutFloat(struct + OVRQuatf.Z, value); }
	/** Unsafe version of {@link #w(float) w}. */
	public static void nw(long struct, float value) { memPutFloat(struct + OVRQuatf.W, value); }

	// -----------------------------------

	/** An array of {@link OVRQuatf} structs. */
	public static final class Buffer extends StructBuffer<OVRQuatf, Buffer> {

		/**
		 * Creates a new {@link OVRQuatf.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRQuatf#SIZEOF}, and its mark will be undefined.
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
		protected OVRQuatf newInstance(long address) {
			return new OVRQuatf(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code x} field. */
		public float x() { return OVRQuatf.nx(address()); }
		/** Returns the value of the {@code y} field. */
		public float y() { return OVRQuatf.ny(address()); }
		/** Returns the value of the {@code z} field. */
		public float z() { return OVRQuatf.nz(address()); }
		/** Returns the value of the {@code w} field. */
		public float w() { return OVRQuatf.nw(address()); }

		/** Sets the specified value to the {@code x} field. */
		public OVRQuatf.Buffer x(float value) { OVRQuatf.nx(address(), value); return this; }
		/** Sets the specified value to the {@code y} field. */
		public OVRQuatf.Buffer y(float value) { OVRQuatf.ny(address(), value); return this; }
		/** Sets the specified value to the {@code z} field. */
		public OVRQuatf.Buffer z(float value) { OVRQuatf.nz(address(), value); return this; }
		/** Sets the specified value to the {@code w} field. */
		public OVRQuatf.Buffer w(float value) { OVRQuatf.nw(address(), value); return this; }

	}

}