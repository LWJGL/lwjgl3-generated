/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * Represents a color in Red-Green-Blue space including an alpha component. Color values range from 0 to 1.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code r} &ndash; The red color component</li>
 * <li>{@code g} &ndash; The green color component</li>
 * <li>{@code b} &ndash; The blue color component</li>
 * <li>{@code a} &ndash; The alpha color component</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct aiColor4D {
    float r;
    float g;
    float b;
    float a;
}</code></pre>
 */
public class AIColor4D extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		R,
		G,
		B,
		A;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		R = layout.offsetof(0);
		G = layout.offsetof(1);
		B = layout.offsetof(2);
		A = layout.offsetof(3);
	}

	AIColor4D(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link AIColor4D} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public AIColor4D(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code r} field. */
	public float r() { return nr(address()); }
	/** Returns the value of the {@code g} field. */
	public float g() { return ng(address()); }
	/** Returns the value of the {@code b} field. */
	public float b() { return nb(address()); }
	/** Returns the value of the {@code a} field. */
	public float a() { return na(address()); }

	/** Sets the specified value to the {@code r} field. */
	public AIColor4D r(float value) { nr(address(), value); return this; }
	/** Sets the specified value to the {@code g} field. */
	public AIColor4D g(float value) { ng(address(), value); return this; }
	/** Sets the specified value to the {@code b} field. */
	public AIColor4D b(float value) { nb(address(), value); return this; }
	/** Sets the specified value to the {@code a} field. */
	public AIColor4D a(float value) { na(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public AIColor4D set(
		float r,
		float g,
		float b,
		float a
	) {
		r(r);
		g(g);
		b(b);
		a(a);

		return this;
	}

	/** Unsafe version of {@link #set(AIColor4D) set}. */
	public AIColor4D nset(long struct) {
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
	public AIColor4D set(AIColor4D src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link AIColor4D} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static AIColor4D malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link AIColor4D} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static AIColor4D calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link AIColor4D} instance allocated with {@link BufferUtils}. */
	public static AIColor4D create() {
		return new AIColor4D(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link AIColor4D} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static AIColor4D create(long address) {
		return address == NULL ? null : new AIColor4D(address, null);
	}

	/**
	 * Returns a new {@link AIColor4D.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link AIColor4D.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link AIColor4D.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link AIColor4D.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link AIColor4D} instance allocated on the thread-local {@link MemoryStack}. */
	public static AIColor4D mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link AIColor4D} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static AIColor4D callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link AIColor4D} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static AIColor4D mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link AIColor4D} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static AIColor4D callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link AIColor4D.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link AIColor4D.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link AIColor4D.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link AIColor4D.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #r}. */
	public static float nr(long struct) { return memGetFloat(struct + AIColor4D.R); }
	/** Unsafe version of {@link #g}. */
	public static float ng(long struct) { return memGetFloat(struct + AIColor4D.G); }
	/** Unsafe version of {@link #b}. */
	public static float nb(long struct) { return memGetFloat(struct + AIColor4D.B); }
	/** Unsafe version of {@link #a}. */
	public static float na(long struct) { return memGetFloat(struct + AIColor4D.A); }

	/** Unsafe version of {@link #r(float) r}. */
	public static void nr(long struct, float value) { memPutFloat(struct + AIColor4D.R, value); }
	/** Unsafe version of {@link #g(float) g}. */
	public static void ng(long struct, float value) { memPutFloat(struct + AIColor4D.G, value); }
	/** Unsafe version of {@link #b(float) b}. */
	public static void nb(long struct, float value) { memPutFloat(struct + AIColor4D.B, value); }
	/** Unsafe version of {@link #a(float) a}. */
	public static void na(long struct, float value) { memPutFloat(struct + AIColor4D.A, value); }

	// -----------------------------------

	/** An array of {@link AIColor4D} structs. */
	public static class Buffer extends StructBuffer<AIColor4D, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link AIColor4D.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link AIColor4D#SIZEOF}, and its mark will be undefined.
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
		protected AIColor4D newInstance(long address) {
			return new AIColor4D(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code r} field. */
		public float r() { return AIColor4D.nr(address()); }
		/** Returns the value of the {@code g} field. */
		public float g() { return AIColor4D.ng(address()); }
		/** Returns the value of the {@code b} field. */
		public float b() { return AIColor4D.nb(address()); }
		/** Returns the value of the {@code a} field. */
		public float a() { return AIColor4D.na(address()); }

		/** Sets the specified value to the {@code r} field. */
		public AIColor4D.Buffer r(float value) { AIColor4D.nr(address(), value); return this; }
		/** Sets the specified value to the {@code g} field. */
		public AIColor4D.Buffer g(float value) { AIColor4D.ng(address(), value); return this; }
		/** Sets the specified value to the {@code b} field. */
		public AIColor4D.Buffer b(float value) { AIColor4D.nb(address(), value); return this; }
		/** Sets the specified value to the {@code a} field. */
		public AIColor4D.Buffer a(float value) { AIColor4D.na(address(), value); return this; }

	}

}