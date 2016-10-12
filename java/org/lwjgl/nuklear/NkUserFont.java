/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code userdata} &ndash; user provided font handle</li>
 * <li>{@code height} &ndash; max height of the font</li>
 * <li>{@code width} &ndash; font string width in pixel callback</li>
 * <li>{@code query} &ndash; font glyph callback to query drawing info</li>
 * <li>{@code texture} &ndash; texture handle to the used font atlas or texture</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct nk_user_font {
    {@link NkHandle nk_handle} userdata;
    float height;
    nk_text_width_f width;
    nk_query_font_glyph_f query;
    {@link NkHandle nk_handle} texture;
}</code></pre>
 */
public class NkUserFont extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		USERDATA,
		HEIGHT,
		WIDTH,
		QUERY,
		TEXTURE;

	static {
		Layout layout = __struct(
			__member(NkHandle.SIZEOF, NkHandle.ALIGNOF),
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(NkHandle.SIZEOF, NkHandle.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		USERDATA = layout.offsetof(0);
		HEIGHT = layout.offsetof(1);
		WIDTH = layout.offsetof(2);
		QUERY = layout.offsetof(3);
		TEXTURE = layout.offsetof(4);
	}

	NkUserFont(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkUserFont} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkUserFont(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link NkHandle} view of the {@code userdata} field. */
	public NkHandle userdata() { return nuserdata(address()); }
	/** Returns the value of the {@code height} field. */
	public float height() { return nheight(address()); }
	/** Returns the {@code NkTextWidthCallback} instance at the {@code width} field. */
	public NkTextWidthCallback width() { return NkTextWidthCallback.create(nwidth(address())); }
	/** Returns the {@code NkQueryFontGlyphCallback} instance at the {@code query} field. */
	public NkQueryFontGlyphCallback query() { return NkQueryFontGlyphCallback.create(nquery(address())); }
	/** Returns a {@link NkHandle} view of the {@code texture} field. */
	public NkHandle texture() { return ntexture(address()); }

	/** Copies the specified {@link NkHandle} to the {@code userdata} field. */
	public NkUserFont userdata(NkHandle value) { nuserdata(address(), value); return this; }
	/** Sets the specified value to the {@code height} field. */
	public NkUserFont height(float value) { nheight(address(), value); return this; }
	/** Sets the address of the specified {@link NkTextWidthCallbackI} to the {@code width} field. */
	public NkUserFont width(NkTextWidthCallbackI value) { nwidth(address(), addressSafe(value)); return this; }
	/** Sets the address of the specified {@link NkQueryFontGlyphCallbackI} to the {@code query} field. */
	public NkUserFont query(NkQueryFontGlyphCallbackI value) { nquery(address(), addressSafe(value)); return this; }
	/** Copies the specified {@link NkHandle} to the {@code texture} field. */
	public NkUserFont texture(NkHandle value) { ntexture(address(), value); return this; }

	/** Unsafe version of {@link #set(NkUserFont) set}. */
	public NkUserFont nset(long struct) {
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
	public NkUserFont set(NkUserFont src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkUserFont} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkUserFont malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkUserFont} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkUserFont calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkUserFont} instance allocated with {@link BufferUtils}. */
	public static NkUserFont create() {
		return new NkUserFont(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkUserFont} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkUserFont create(long address) {
		return address == NULL ? null : new NkUserFont(address, null);
	}

	/**
	 * Returns a new {@link NkUserFont.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkUserFont.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkUserFont.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkUserFont.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkUserFont} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkUserFont mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkUserFont} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkUserFont callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkUserFont} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkUserFont mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkUserFont} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkUserFont callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkUserFont.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkUserFont.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkUserFont.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkUserFont.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #userdata}. */
	public static NkHandle nuserdata(long struct) { return NkHandle.create(struct + NkUserFont.USERDATA); }
	/** Unsafe version of {@link #height}. */
	public static float nheight(long struct) { return memGetFloat(struct + NkUserFont.HEIGHT); }
	/** Unsafe version of {@link #width}. */
	public static long nwidth(long struct) { return memGetAddress(struct + NkUserFont.WIDTH); }
	/** Unsafe version of {@link #query}. */
	public static long nquery(long struct) { return memGetAddress(struct + NkUserFont.QUERY); }
	/** Unsafe version of {@link #texture}. */
	public static NkHandle ntexture(long struct) { return NkHandle.create(struct + NkUserFont.TEXTURE); }

	/** Unsafe version of {@link #userdata(NkHandle) userdata}. */
	public static void nuserdata(long struct, NkHandle value) { memCopy(value.address(), struct + NkUserFont.USERDATA, NkHandle.SIZEOF); }
	/** Unsafe version of {@link #height(float) height}. */
	public static void nheight(long struct, float value) { memPutFloat(struct + NkUserFont.HEIGHT, value); }
	/** Unsafe version of {@link #width(NkTextWidthCallbackI) width}. */
	public static void nwidth(long struct, long value) { memPutAddress(struct + NkUserFont.WIDTH, value); }
	/** Unsafe version of {@link #query(NkQueryFontGlyphCallbackI) query}. */
	public static void nquery(long struct, long value) { memPutAddress(struct + NkUserFont.QUERY, value); }
	/** Unsafe version of {@link #texture(NkHandle) texture}. */
	public static void ntexture(long struct, NkHandle value) { memCopy(value.address(), struct + NkUserFont.TEXTURE, NkHandle.SIZEOF); }

	// -----------------------------------

	/** An array of {@link NkUserFont} structs. */
	public static class Buffer extends StructBuffer<NkUserFont, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link NkUserFont.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkUserFont#SIZEOF}, and its mark will be undefined.
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
		protected NkUserFont newInstance(long address) {
			return new NkUserFont(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link NkHandle} view of the {@code userdata} field. */
		public NkHandle userdata() { return NkUserFont.nuserdata(address()); }
		/** Returns the value of the {@code height} field. */
		public float height() { return NkUserFont.nheight(address()); }
		/** Returns the {@code NkTextWidthCallback} instance at the {@code width} field. */
		public NkTextWidthCallback width() { return NkTextWidthCallback.create(NkUserFont.nwidth(address())); }
		/** Returns the {@code NkQueryFontGlyphCallback} instance at the {@code query} field. */
		public NkQueryFontGlyphCallback query() { return NkQueryFontGlyphCallback.create(NkUserFont.nquery(address())); }
		/** Returns a {@link NkHandle} view of the {@code texture} field. */
		public NkHandle texture() { return NkUserFont.ntexture(address()); }

		/** Copies the specified {@link NkHandle} to the {@code userdata} field. */
		public NkUserFont.Buffer userdata(NkHandle value) { NkUserFont.nuserdata(address(), value); return this; }
		/** Sets the specified value to the {@code height} field. */
		public NkUserFont.Buffer height(float value) { NkUserFont.nheight(address(), value); return this; }
		/** Sets the address of the specified {@link NkTextWidthCallbackI} to the {@code width} field. */
		public NkUserFont.Buffer width(NkTextWidthCallbackI value) { NkUserFont.nwidth(address(), addressSafe(value)); return this; }
		/** Sets the address of the specified {@link NkQueryFontGlyphCallbackI} to the {@code query} field. */
		public NkUserFont.Buffer query(NkQueryFontGlyphCallbackI value) { NkUserFont.nquery(address(), addressSafe(value)); return this; }
		/** Copies the specified {@link NkHandle} to the {@code texture} field. */
		public NkUserFont.Buffer texture(NkHandle value) { NkUserFont.ntexture(address(), value); return this; }

	}

}