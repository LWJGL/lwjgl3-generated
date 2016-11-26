/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.assimp;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

/**
 * Represents a color in Red-Green-Blue space.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code r} &ndash; The red color value</li>
 * <li>{@code g} &ndash; The green color value</li>
 * <li>{@code b} &ndash; The blue color value</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct aiColor3D {
    float r;
    float g;
    float b;
}</code></pre>
 */
public class AIColor3D extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		R,
		G,
		B;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		R = layout.offsetof(0);
		G = layout.offsetof(1);
		B = layout.offsetof(2);
	}

	AIColor3D(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link AIColor3D} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public AIColor3D(ByteBuffer container) {
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

	// -----------------------------------

	/** Returns a new {@link AIColor3D} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static AIColor3D create(long address) {
		return address == NULL ? null : new AIColor3D(address, null);
	}

	/**
	 * Create a {@link AIColor3D.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #r}. */
	public static float nr(long struct) { return memGetFloat(struct + AIColor3D.R); }
	/** Unsafe version of {@link #g}. */
	public static float ng(long struct) { return memGetFloat(struct + AIColor3D.G); }
	/** Unsafe version of {@link #b}. */
	public static float nb(long struct) { return memGetFloat(struct + AIColor3D.B); }

	// -----------------------------------

	/** An array of {@link AIColor3D} structs. */
	public static class Buffer extends StructBuffer<AIColor3D, Buffer> {

		/**
		 * Creates a new {@link AIColor3D.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link AIColor3D#SIZEOF}, and its mark will be undefined.
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
		protected AIColor3D newInstance(long address) {
			return new AIColor3D(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code r} field. */
		public float r() { return AIColor3D.nr(address()); }
		/** Returns the value of the {@code g} field. */
		public float g() { return AIColor3D.ng(address()); }
		/** Returns the value of the {@code b} field. */
		public float b() { return AIColor3D.nb(address()); }

	}

}