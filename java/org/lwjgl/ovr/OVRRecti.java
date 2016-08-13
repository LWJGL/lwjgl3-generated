/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
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
 * A 2D rectangle with a position and size. All components are integers.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code Pos} &ndash; the rectangle position</li>
 * <li>{@code Size} &ndash; the rectangle size</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct ovrRecti {
    {@link OVRVector2i ovrVector2i} Pos;
    {@link OVRSizei ovrSizei} Size;
}</code></pre>
 */
public class OVRRecti extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		POS,
		SIZE;

	static {
		Layout layout = __struct(
			__member(OVRVector2i.SIZEOF, OVRVector2i.ALIGNOF),
			__member(OVRSizei.SIZEOF, OVRSizei.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		POS = layout.offsetof(0);
		SIZE = layout.offsetof(1);
	}

	OVRRecti(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link OVRRecti} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public OVRRecti(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link OVRVector2i} view of the {@code Pos} field. */
	public OVRVector2i Pos() { return nPos(address()); }
	/** Returns a {@link OVRSizei} view of the {@code Size} field. */
	public OVRSizei Size() { return nSize(address()); }

	/** Copies the specified {@link OVRVector2i} to the {@code Pos} field. */
	public OVRRecti Pos(OVRVector2i value) { nPos(address(), value); return this; }
	/** Copies the specified {@link OVRSizei} to the {@code Size} field. */
	public OVRRecti Size(OVRSizei value) { nSize(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public OVRRecti set(
		OVRVector2i Pos,
		OVRSizei Size
	) {
		Pos(Pos);
		Size(Size);

		return this;
	}

	/** Unsafe version of {@link #set(OVRRecti) set}. */
	public OVRRecti nset(long struct) {
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
	public OVRRecti set(OVRRecti src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link OVRRecti} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static OVRRecti malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link OVRRecti} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static OVRRecti calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link OVRRecti} instance allocated with {@link BufferUtils}. */
	public static OVRRecti create() {
		return new OVRRecti(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link OVRRecti} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static OVRRecti create(long address) {
		return address == NULL ? null : new OVRRecti(address, null);
	}

	/**
	 * Returns a new {@link OVRRecti.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRRecti.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRRecti.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link OVRRecti.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link OVRRecti} instance allocated on the thread-local {@link MemoryStack}. */
	public static OVRRecti mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link OVRRecti} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static OVRRecti callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link OVRRecti} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRRecti mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRRecti} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static OVRRecti callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link OVRRecti.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRRecti.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link OVRRecti.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link OVRRecti.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #Pos}. */
	public static OVRVector2i nPos(long struct) { return OVRVector2i.create(struct + OVRRecti.POS); }
	/** Unsafe version of {@link #Size}. */
	public static OVRSizei nSize(long struct) { return OVRSizei.create(struct + OVRRecti.SIZE); }

	/** Unsafe version of {@link #Pos(OVRVector2i) Pos}. */
	public static void nPos(long struct, OVRVector2i value) { memCopy(value.address(), struct + OVRRecti.POS, OVRVector2i.SIZEOF); }
	/** Unsafe version of {@link #Size(OVRSizei) Size}. */
	public static void nSize(long struct, OVRSizei value) { memCopy(value.address(), struct + OVRRecti.SIZE, OVRSizei.SIZEOF); }

	// -----------------------------------

	/** An array of {@link OVRRecti} structs. */
	public static final class Buffer extends StructBuffer<OVRRecti, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link OVRRecti.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link OVRRecti#SIZEOF}, and its mark will be undefined.
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
		protected OVRRecti newInstance(long address) {
			return new OVRRecti(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link OVRVector2i} view of the {@code Pos} field. */
		public OVRVector2i Pos() { return OVRRecti.nPos(address()); }
		/** Returns a {@link OVRSizei} view of the {@code Size} field. */
		public OVRSizei Size() { return OVRRecti.nSize(address()); }

		/** Copies the specified {@link OVRVector2i} to the {@code Pos} field. */
		public OVRRecti.Buffer Pos(OVRVector2i value) { OVRRecti.nPos(address(), value); return this; }
		/** Copies the specified {@link OVRSizei} to the {@code Size} field. */
		public OVRRecti.Buffer Size(OVRSizei value) { OVRRecti.nSize(address(), value); return this; }

	}

}