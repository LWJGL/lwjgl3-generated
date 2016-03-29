/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nanovg;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * A NanoVG color.
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct NVGcolor {
    union {
        float[4] rgba;
        struct {
            float r;
            float g;
            float b;
            float a;
        };
    };
}</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table class=lwjgl>
 * <tr><td>rgba</td><td>an array of 4 color components</td></tr>
 * <tr><td>r</td><td>the color red component</td></tr>
 * <tr><td>g</td><td>the color green component</td></tr>
 * <tr><td>b</td><td>the color blue component</td></tr>
 * <tr><td>a</td><td>the color alpha component</td></tr>
 * </table>
 */
public class NVGColor extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		RGBA,
		R,
		G,
		B,
		A;

	static {
		Layout layout = __struct(
			__union(
				__array(4, 4),
				__struct(
					__member(4),
					__member(4),
					__member(4),
					__member(4)
				)
			)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		RGBA = layout.offsetof(1);
		R = layout.offsetof(3);
		G = layout.offsetof(4);
		B = layout.offsetof(5);
		A = layout.offsetof(6);
	}

	NVGColor(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NVGColor} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NVGColor(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link FloatBuffer} view of the {@code rgba} field. */
	public FloatBuffer rgba() { return nrgba(address()); }
	/** Returns the value at the specified index of the {@code rgba} field. */
	public float rgba(int index) { return nrgba(address(), index); }
	/** Returns the value of the {@code r} field. */
	public float r() { return nr(address()); }
	/** Returns the value of the {@code g} field. */
	public float g() { return ng(address()); }
	/** Returns the value of the {@code b} field. */
	public float b() { return nb(address()); }
	/** Returns the value of the {@code a} field. */
	public float a() { return na(address()); }

	/** Copies the specified {@link FloatBuffer} to the {@code rgba} field. */
	public NVGColor rgba(FloatBuffer value) { nrgba(address(), value); return this; }
	/** Sets the specified value at the specified index of the {@code rgba} field. */
	public NVGColor rgba(int index, float value) { nrgba(address(), index, value); return this; }
	/** Sets the specified value to the {@code r} field. */
	public NVGColor r(float value) { nr(address(), value); return this; }
	/** Sets the specified value to the {@code g} field. */
	public NVGColor g(float value) { ng(address(), value); return this; }
	/** Sets the specified value to the {@code b} field. */
	public NVGColor b(float value) { nb(address(), value); return this; }
	/** Sets the specified value to the {@code a} field. */
	public NVGColor a(float value) { na(address(), value); return this; }

	/** Unsafe version of {@link #set(NVGColor) set}. */
	public NVGColor nset(long struct) {
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
	public NVGColor set(NVGColor src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NVGColor} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NVGColor malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NVGColor} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NVGColor calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NVGColor} instance allocated with {@link BufferUtils}. */
	public static NVGColor create() {
		return new NVGColor(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NVGColor} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NVGColor create(long address) {
		return address == NULL ? null : new NVGColor(address, null);
	}

	/**
	 * Returns a new {@link NVGColor.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NVGColor.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NVGColor.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NVGColor.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NVGColor} instance allocated on the thread-local {@link MemoryStack}. */
	public static NVGColor mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NVGColor} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NVGColor callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NVGColor} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NVGColor mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NVGColor} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NVGColor callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NVGColor.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NVGColor.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NVGColor.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NVGColor.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #rgba}. */
	public static FloatBuffer nrgba(long struct) {
		return memFloatBuffer(struct + NVGColor.RGBA, 4);
	}
	/** Unsafe version of {@link #rgba(int) rgba}. */
	public static float nrgba(long struct, int index) { return memGetFloat(struct + NVGColor.RGBA + index * 4); }
	/** Unsafe version of {@link #r}. */
	public static float nr(long struct) { return memGetFloat(struct + NVGColor.R); }
	/** Unsafe version of {@link #g}. */
	public static float ng(long struct) { return memGetFloat(struct + NVGColor.G); }
	/** Unsafe version of {@link #b}. */
	public static float nb(long struct) { return memGetFloat(struct + NVGColor.B); }
	/** Unsafe version of {@link #a}. */
	public static float na(long struct) { return memGetFloat(struct + NVGColor.A); }

	/** Unsafe version of {@link #rgba(FloatBuffer) rgba}. */
	public static void nrgba(long struct, FloatBuffer value) {
		if ( CHECKS ) checkBufferGT(value, 4);
		memCopy(memAddress(value), struct + NVGColor.RGBA, value.remaining() * 4);
	}
	/** Unsafe version of {@link #rgba(int, float) rgba}. */
	public static void nrgba(long struct, int index, float value) { memPutFloat(struct + NVGColor.RGBA + index * 4, value); }
	/** Unsafe version of {@link #r(float) r}. */
	public static void nr(long struct, float value) { memPutFloat(struct + NVGColor.R, value); }
	/** Unsafe version of {@link #g(float) g}. */
	public static void ng(long struct, float value) { memPutFloat(struct + NVGColor.G, value); }
	/** Unsafe version of {@link #b(float) b}. */
	public static void nb(long struct, float value) { memPutFloat(struct + NVGColor.B, value); }
	/** Unsafe version of {@link #a(float) a}. */
	public static void na(long struct, float value) { memPutFloat(struct + NVGColor.A, value); }

	// -----------------------------------

	/** An array of {@link NVGColor} structs. */
	public static final class Buffer extends StructBuffer<NVGColor, Buffer> {

		/**
		 * Creates a new {@link NVGColor.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NVGColor#SIZEOF}, and its mark will be undefined.
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
		protected NVGColor newInstance(long address) {
			return new NVGColor(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link FloatBuffer} view of the {@code rgba} field. */
		public FloatBuffer rgba() { return NVGColor.nrgba(address()); }
		/** Returns the value at the specified index of the {@code rgba} field. */
		public float rgba(int index) { return NVGColor.nrgba(address(), index); }
		/** Returns the value of the {@code r} field. */
		public float r() { return NVGColor.nr(address()); }
		/** Returns the value of the {@code g} field. */
		public float g() { return NVGColor.ng(address()); }
		/** Returns the value of the {@code b} field. */
		public float b() { return NVGColor.nb(address()); }
		/** Returns the value of the {@code a} field. */
		public float a() { return NVGColor.na(address()); }

		/** Copies the specified {@link FloatBuffer} to the {@code rgba} field. */
		public NVGColor.Buffer rgba(FloatBuffer value) { NVGColor.nrgba(address(), value); return this; }
		/** Sets the specified value at the specified index of the {@code rgba} field. */
		public NVGColor.Buffer rgba(int index, float value) { NVGColor.nrgba(address(), index, value); return this; }
		/** Sets the specified value to the {@code r} field. */
		public NVGColor.Buffer r(float value) { NVGColor.nr(address(), value); return this; }
		/** Sets the specified value to the {@code g} field. */
		public NVGColor.Buffer g(float value) { NVGColor.ng(address(), value); return this; }
		/** Sets the specified value to the {@code b} field. */
		public NVGColor.Buffer b(float value) { NVGColor.nb(address(), value); return this; }
		/** Sets the specified value to the {@code a} field. */
		public NVGColor.Buffer a(float value) { NVGColor.na(address(), value); return this; }

	}

}