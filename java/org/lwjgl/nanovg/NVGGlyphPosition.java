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
 * A glyph position.
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code str} &ndash; position of the glyph in the input string</li>
 * <li>{@code x} &ndash; the x-coordinate of the logical glyph position</li>
 * <li>{@code minx} &ndash; the left bound of the glyph shape</li>
 * <li>{@code maxx} &ndash; the right bound of the glyph shape</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct NVGglyphPosition {
    char * str;
    float x;
    float minx;
    float maxx;
}</code></pre>
 */
public class NVGGlyphPosition extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STR,
		X,
		MINX,
		MAXX;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STR = layout.offsetof(0);
		X = layout.offsetof(1);
		MINX = layout.offsetof(2);
		MAXX = layout.offsetof(3);
	}

	NVGGlyphPosition(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NVGGlyphPosition} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NVGGlyphPosition(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code str} field. */
	public long str() { return nstr(address()); }
	/** Returns the value of the {@code x} field. */
	public float x() { return nx(address()); }
	/** Returns the value of the {@code minx} field. */
	public float minx() { return nminx(address()); }
	/** Returns the value of the {@code maxx} field. */
	public float maxx() { return nmaxx(address()); }

	/** Sets the specified value to the {@code str} field. */
	public NVGGlyphPosition str(long value) { nstr(address(), value); return this; }
	/** Sets the specified value to the {@code x} field. */
	public NVGGlyphPosition x(float value) { nx(address(), value); return this; }
	/** Sets the specified value to the {@code minx} field. */
	public NVGGlyphPosition minx(float value) { nminx(address(), value); return this; }
	/** Sets the specified value to the {@code maxx} field. */
	public NVGGlyphPosition maxx(float value) { nmaxx(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NVGGlyphPosition set(
		long str,
		float x,
		float minx,
		float maxx
	) {
		str(str);
		x(x);
		minx(minx);
		maxx(maxx);

		return this;
	}

	/** Unsafe version of {@link #set(NVGGlyphPosition) set}. */
	public NVGGlyphPosition nset(long struct) {
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
	public NVGGlyphPosition set(NVGGlyphPosition src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NVGGlyphPosition} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NVGGlyphPosition malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NVGGlyphPosition} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NVGGlyphPosition calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NVGGlyphPosition} instance allocated with {@link BufferUtils}. */
	public static NVGGlyphPosition create() {
		return new NVGGlyphPosition(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NVGGlyphPosition} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NVGGlyphPosition create(long address) {
		return address == NULL ? null : new NVGGlyphPosition(address, null);
	}

	/**
	 * Returns a new {@link NVGGlyphPosition.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NVGGlyphPosition.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NVGGlyphPosition.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NVGGlyphPosition.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NVGGlyphPosition} instance allocated on the thread-local {@link MemoryStack}. */
	public static NVGGlyphPosition mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NVGGlyphPosition} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NVGGlyphPosition callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NVGGlyphPosition} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NVGGlyphPosition mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NVGGlyphPosition} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NVGGlyphPosition callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NVGGlyphPosition.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NVGGlyphPosition.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NVGGlyphPosition.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NVGGlyphPosition.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #str}. */
	public static long nstr(long struct) { return memGetAddress(struct + NVGGlyphPosition.STR); }
	/** Unsafe version of {@link #x}. */
	public static float nx(long struct) { return memGetFloat(struct + NVGGlyphPosition.X); }
	/** Unsafe version of {@link #minx}. */
	public static float nminx(long struct) { return memGetFloat(struct + NVGGlyphPosition.MINX); }
	/** Unsafe version of {@link #maxx}. */
	public static float nmaxx(long struct) { return memGetFloat(struct + NVGGlyphPosition.MAXX); }

	/** Unsafe version of {@link #str(long) str}. */
	public static void nstr(long struct, long value) { memPutAddress(struct + NVGGlyphPosition.STR, checkPointer(value)); }
	/** Unsafe version of {@link #x(float) x}. */
	public static void nx(long struct, float value) { memPutFloat(struct + NVGGlyphPosition.X, value); }
	/** Unsafe version of {@link #minx(float) minx}. */
	public static void nminx(long struct, float value) { memPutFloat(struct + NVGGlyphPosition.MINX, value); }
	/** Unsafe version of {@link #maxx(float) maxx}. */
	public static void nmaxx(long struct, float value) { memPutFloat(struct + NVGGlyphPosition.MAXX, value); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + NVGGlyphPosition.STR));
	}

	/**
	 * Calls {@link #validate(long)} for each struct contained in the specified struct array.
	 *
	 * @param array the struct array to validate
	 * @param count the number of structs in {@code array}
	 */
	public static void validate(long array, int count) {
		for ( int i = 0; i < count; i++ )
			validate(array + i * SIZEOF);
	}

	// -----------------------------------

	/** An array of {@link NVGGlyphPosition} structs. */
	public static final class Buffer extends StructBuffer<NVGGlyphPosition, Buffer> {

		/**
		 * Creates a new {@link NVGGlyphPosition.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NVGGlyphPosition#SIZEOF}, and its mark will be undefined.
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
		protected NVGGlyphPosition newInstance(long address) {
			return new NVGGlyphPosition(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code str} field. */
		public long str() { return NVGGlyphPosition.nstr(address()); }
		/** Returns the value of the {@code x} field. */
		public float x() { return NVGGlyphPosition.nx(address()); }
		/** Returns the value of the {@code minx} field. */
		public float minx() { return NVGGlyphPosition.nminx(address()); }
		/** Returns the value of the {@code maxx} field. */
		public float maxx() { return NVGGlyphPosition.nmaxx(address()); }

		/** Sets the specified value to the {@code str} field. */
		public NVGGlyphPosition.Buffer str(long value) { NVGGlyphPosition.nstr(address(), value); return this; }
		/** Sets the specified value to the {@code x} field. */
		public NVGGlyphPosition.Buffer x(float value) { NVGGlyphPosition.nx(address(), value); return this; }
		/** Sets the specified value to the {@code minx} field. */
		public NVGGlyphPosition.Buffer minx(float value) { NVGGlyphPosition.nminx(address(), value); return this; }
		/** Sets the specified value to the {@code maxx} field. */
		public NVGGlyphPosition.Buffer maxx(float value) { NVGGlyphPosition.nmaxx(address(), value); return this; }

	}

}