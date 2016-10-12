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
 * <h3>Layout</h3>
 * 
 * <pre><code>union struct nk_style_item_data {
    {@link NkImage struct nk_image} image;
    {@link NkColor struct nk_color} color;
}</code></pre>
 */
public class NkStyleItemData extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		IMAGE,
		COLOR;

	static {
		Layout layout = __union(
			__member(NkImage.SIZEOF, NkImage.ALIGNOF),
			__member(NkColor.SIZEOF, NkColor.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		IMAGE = layout.offsetof(0);
		COLOR = layout.offsetof(1);
	}

	NkStyleItemData(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkStyleItemData} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkStyleItemData(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link NkImage} view of the {@code image} field. */
	public NkImage image() { return nimage(address()); }
	/** Returns a {@link NkColor} view of the {@code color} field. */
	public NkColor color() { return ncolor(address()); }

	/** Copies the specified {@link NkImage} to the {@code image} field. */
	public NkStyleItemData image(NkImage value) { nimage(address(), value); return this; }
	/** Copies the specified {@link NkColor} to the {@code color} field. */
	public NkStyleItemData color(NkColor value) { ncolor(address(), value); return this; }

	/** Unsafe version of {@link #set(NkStyleItemData) set}. */
	public NkStyleItemData nset(long struct) {
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
	public NkStyleItemData set(NkStyleItemData src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkStyleItemData} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkStyleItemData malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkStyleItemData} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkStyleItemData calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkStyleItemData} instance allocated with {@link BufferUtils}. */
	public static NkStyleItemData create() {
		return new NkStyleItemData(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkStyleItemData} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkStyleItemData create(long address) {
		return address == NULL ? null : new NkStyleItemData(address, null);
	}

	/**
	 * Returns a new {@link NkStyleItemData.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkStyleItemData.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkStyleItemData.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkStyleItemData.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkStyleItemData} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkStyleItemData mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkStyleItemData} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkStyleItemData callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkStyleItemData} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkStyleItemData mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkStyleItemData} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkStyleItemData callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkStyleItemData.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkStyleItemData.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkStyleItemData.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkStyleItemData.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #image}. */
	public static NkImage nimage(long struct) { return NkImage.create(struct + NkStyleItemData.IMAGE); }
	/** Unsafe version of {@link #color}. */
	public static NkColor ncolor(long struct) { return NkColor.create(struct + NkStyleItemData.COLOR); }

	/** Unsafe version of {@link #image(NkImage) image}. */
	public static void nimage(long struct, NkImage value) { memCopy(value.address(), struct + NkStyleItemData.IMAGE, NkImage.SIZEOF); }
	/** Unsafe version of {@link #color(NkColor) color}. */
	public static void ncolor(long struct, NkColor value) { memCopy(value.address(), struct + NkStyleItemData.COLOR, NkColor.SIZEOF); }

	// -----------------------------------

	/** An array of {@link NkStyleItemData} structs. */
	public static class Buffer extends StructBuffer<NkStyleItemData, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link NkStyleItemData.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkStyleItemData#SIZEOF}, and its mark will be undefined.
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
		protected NkStyleItemData newInstance(long address) {
			return new NkStyleItemData(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link NkImage} view of the {@code image} field. */
		public NkImage image() { return NkStyleItemData.nimage(address()); }
		/** Returns a {@link NkColor} view of the {@code color} field. */
		public NkColor color() { return NkStyleItemData.ncolor(address()); }

		/** Copies the specified {@link NkImage} to the {@code image} field. */
		public NkStyleItemData.Buffer image(NkImage value) { NkStyleItemData.nimage(address(), value); return this; }
		/** Copies the specified {@link NkColor} to the {@code color} field. */
		public NkStyleItemData.Buffer color(NkColor value) { NkStyleItemData.ncolor(address(), value); return this; }

	}

}