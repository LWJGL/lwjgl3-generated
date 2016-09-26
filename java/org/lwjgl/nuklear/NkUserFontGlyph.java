/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code uv} &ndash; texture coordinates</li>
 * <li>{@code offset} &ndash; offset between top left and glyph</li>
 * <li>{@code width} &ndash; width of the glyph</li>
 * <li>{@code height} &ndash; height of the glyph</li>
 * <li>{@code xadvance} &ndash; offset to the next glyph</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct nk_user_font_glyph {
    {@link NkVec2 struct nk_vec2} uv[2];
    {@link NkVec2 struct nk_vec2} offset;
    float width;
    float height;
    float xadvance;
}</code></pre>
 */
public class NkUserFontGlyph extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		UV,
		OFFSET,
		WIDTH,
		HEIGHT,
		XADVANCE;

	static {
		Layout layout = __struct(
			__array(NkVec2.SIZEOF, NkVec2.ALIGNOF, 2),
			__member(NkVec2.SIZEOF, NkVec2.ALIGNOF),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		UV = layout.offsetof(0);
		OFFSET = layout.offsetof(1);
		WIDTH = layout.offsetof(2);
		HEIGHT = layout.offsetof(3);
		XADVANCE = layout.offsetof(4);
	}

	NkUserFontGlyph(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkUserFontGlyph} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkUserFontGlyph(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link NkVec2}.Buffer view of the {@code uv} field. */
	public NkVec2.Buffer uv() { return nuv(address()); }
	/** Returns a {@link NkVec2} view of the struct at the specified index of the {@code uv} field. */
	public NkVec2 uv(int index) { return nuv(address(), index); }
	/** Returns a {@link NkVec2} view of the {@code offset} field. */
	public NkVec2 offset() { return noffset(address()); }
	/** Returns the value of the {@code width} field. */
	public float width() { return nwidth(address()); }
	/** Returns the value of the {@code height} field. */
	public float height() { return nheight(address()); }
	/** Returns the value of the {@code xadvance} field. */
	public float xadvance() { return nxadvance(address()); }

	/** Copies the specified {@link NkVec2.Buffer} to the {@code uv} field. */
	public NkUserFontGlyph uv(NkVec2.Buffer value) { nuv(address(), value); return this; }
	/** Copies the specified {@link NkVec2} at the specified index of the {@code uv} field. */
	public NkUserFontGlyph uv(int index, NkVec2 value) { nuv(address(), index, value); return this; }
	/** Copies the specified {@link NkVec2} to the {@code offset} field. */
	public NkUserFontGlyph offset(NkVec2 value) { noffset(address(), value); return this; }
	/** Sets the specified value to the {@code width} field. */
	public NkUserFontGlyph width(float value) { nwidth(address(), value); return this; }
	/** Sets the specified value to the {@code height} field. */
	public NkUserFontGlyph height(float value) { nheight(address(), value); return this; }
	/** Sets the specified value to the {@code xadvance} field. */
	public NkUserFontGlyph xadvance(float value) { nxadvance(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkUserFontGlyph set(
		NkVec2.Buffer uv,
		NkVec2 offset,
		float width,
		float height,
		float xadvance
	) {
		uv(uv);
		offset(offset);
		width(width);
		height(height);
		xadvance(xadvance);

		return this;
	}

	/** Unsafe version of {@link #set(NkUserFontGlyph) set}. */
	public NkUserFontGlyph nset(long struct) {
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
	public NkUserFontGlyph set(NkUserFontGlyph src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkUserFontGlyph} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkUserFontGlyph malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkUserFontGlyph} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkUserFontGlyph calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkUserFontGlyph} instance allocated with {@link BufferUtils}. */
	public static NkUserFontGlyph create() {
		return new NkUserFontGlyph(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkUserFontGlyph} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkUserFontGlyph create(long address) {
		return address == NULL ? null : new NkUserFontGlyph(address, null);
	}

	/**
	 * Returns a new {@link NkUserFontGlyph.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkUserFontGlyph.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkUserFontGlyph.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkUserFontGlyph.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkUserFontGlyph} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkUserFontGlyph mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkUserFontGlyph} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkUserFontGlyph callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkUserFontGlyph} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkUserFontGlyph mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkUserFontGlyph} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkUserFontGlyph callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkUserFontGlyph.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkUserFontGlyph.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkUserFontGlyph.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkUserFontGlyph.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #uv}. */
	public static NkVec2.Buffer nuv(long struct) {
		return NkVec2.create(struct + NkUserFontGlyph.UV, 2);
	}
	/** Unsafe version of {@link #uv(int) uv}. */
	public static NkVec2 nuv(long struct, int index) {
		return NkVec2.create(struct + NkUserFontGlyph.UV + index * NkVec2.SIZEOF);
	}
	/** Unsafe version of {@link #offset}. */
	public static NkVec2 noffset(long struct) { return NkVec2.create(struct + NkUserFontGlyph.OFFSET); }
	/** Unsafe version of {@link #width}. */
	public static float nwidth(long struct) { return memGetFloat(struct + NkUserFontGlyph.WIDTH); }
	/** Unsafe version of {@link #height}. */
	public static float nheight(long struct) { return memGetFloat(struct + NkUserFontGlyph.HEIGHT); }
	/** Unsafe version of {@link #xadvance}. */
	public static float nxadvance(long struct) { return memGetFloat(struct + NkUserFontGlyph.XADVANCE); }

	/** Unsafe version of {@link #uv(NkVec2.Buffer) uv}. */
	public static void nuv(long struct, NkVec2.Buffer value) {
		if ( CHECKS ) checkBufferGT(value, 2);
		memCopy(value.address(), struct + NkUserFontGlyph.UV, value.remaining() * NkVec2.SIZEOF);
	}
	/** Unsafe version of {@link #uv(int, NkVec2) uv}. */
	public static void nuv(long struct, int index, NkVec2 value) { memCopy(value.address(), struct + NkUserFontGlyph.UV + index * NkVec2.SIZEOF, NkVec2.SIZEOF); }
	/** Unsafe version of {@link #offset(NkVec2) offset}. */
	public static void noffset(long struct, NkVec2 value) { memCopy(value.address(), struct + NkUserFontGlyph.OFFSET, NkVec2.SIZEOF); }
	/** Unsafe version of {@link #width(float) width}. */
	public static void nwidth(long struct, float value) { memPutFloat(struct + NkUserFontGlyph.WIDTH, value); }
	/** Unsafe version of {@link #height(float) height}. */
	public static void nheight(long struct, float value) { memPutFloat(struct + NkUserFontGlyph.HEIGHT, value); }
	/** Unsafe version of {@link #xadvance(float) xadvance}. */
	public static void nxadvance(long struct, float value) { memPutFloat(struct + NkUserFontGlyph.XADVANCE, value); }

	// -----------------------------------

	/** An array of {@link NkUserFontGlyph} structs. */
	public static final class Buffer extends StructBuffer<NkUserFontGlyph, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link NkUserFontGlyph.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkUserFontGlyph#SIZEOF}, and its mark will be undefined.
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
		protected NkUserFontGlyph newInstance(long address) {
			return new NkUserFontGlyph(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link NkVec2}.Buffer view of the {@code uv} field. */
		public NkVec2.Buffer uv() { return NkUserFontGlyph.nuv(address()); }
		/** Returns a {@link NkVec2} view of the struct at the specified index of the {@code uv} field. */
		public NkVec2 uv(int index) { return NkUserFontGlyph.nuv(address(), index); }
		/** Returns a {@link NkVec2} view of the {@code offset} field. */
		public NkVec2 offset() { return NkUserFontGlyph.noffset(address()); }
		/** Returns the value of the {@code width} field. */
		public float width() { return NkUserFontGlyph.nwidth(address()); }
		/** Returns the value of the {@code height} field. */
		public float height() { return NkUserFontGlyph.nheight(address()); }
		/** Returns the value of the {@code xadvance} field. */
		public float xadvance() { return NkUserFontGlyph.nxadvance(address()); }

		/** Copies the specified {@link NkVec2.Buffer} to the {@code uv} field. */
		public NkUserFontGlyph.Buffer uv(NkVec2.Buffer value) { NkUserFontGlyph.nuv(address(), value); return this; }
		/** Copies the specified {@link NkVec2} at the specified index of the {@code uv} field. */
		public NkUserFontGlyph.Buffer uv(int index, NkVec2 value) { NkUserFontGlyph.nuv(address(), index, value); return this; }
		/** Copies the specified {@link NkVec2} to the {@code offset} field. */
		public NkUserFontGlyph.Buffer offset(NkVec2 value) { NkUserFontGlyph.noffset(address(), value); return this; }
		/** Sets the specified value to the {@code width} field. */
		public NkUserFontGlyph.Buffer width(float value) { NkUserFontGlyph.nwidth(address(), value); return this; }
		/** Sets the specified value to the {@code height} field. */
		public NkUserFontGlyph.Buffer height(float value) { NkUserFontGlyph.nheight(address(), value); return this; }
		/** Sets the specified value to the {@code xadvance} field. */
		public NkUserFontGlyph.Buffer xadvance(float value) { NkUserFontGlyph.nxadvance(address(), value); return this; }

	}

}