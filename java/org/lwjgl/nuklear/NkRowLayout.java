/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
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
 * <h3>Layout</h3>
 * 
 * <pre><code>struct nk_row_layout {
    int type;
    int index;
    float height;
    int columns;
    const float * ratio;
    float item_width;
    float item_height;
    float item_offset;
    float filled;
    {@link NkRect struct nk_rect} item;
    int tree_depth;
}</code></pre>
 */
public class NkRowLayout extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		TYPE,
		INDEX,
		HEIGHT,
		COLUMNS,
		RATIO,
		ITEM_WIDTH,
		ITEM_HEIGHT,
		ITEM_OFFSET,
		FILLED,
		ITEM,
		TREE_DEPTH;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(NkRect.SIZEOF, NkRect.ALIGNOF),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		TYPE = layout.offsetof(0);
		INDEX = layout.offsetof(1);
		HEIGHT = layout.offsetof(2);
		COLUMNS = layout.offsetof(3);
		RATIO = layout.offsetof(4);
		ITEM_WIDTH = layout.offsetof(5);
		ITEM_HEIGHT = layout.offsetof(6);
		ITEM_OFFSET = layout.offsetof(7);
		FILLED = layout.offsetof(8);
		ITEM = layout.offsetof(9);
		TREE_DEPTH = layout.offsetof(10);
	}

	NkRowLayout(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkRowLayout} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkRowLayout(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code type} field. */
	public int type() { return ntype(address()); }
	/** Returns the value of the {@code index} field. */
	public int index() { return nindex(address()); }
	/** Returns the value of the {@code height} field. */
	public float height() { return nheight(address()); }
	/** Returns the value of the {@code columns} field. */
	public int columns() { return ncolumns(address()); }
	/**
	 * Returns a {@link FloatBuffer} view of the data pointed to by the {@code ratio} field.
	 *
	 * @param capacity the number of elements in the returned buffer
	 */
	public FloatBuffer ratio(int capacity) { return nratio(address(), capacity); }
	/** Returns the value of the {@code item_width} field. */
	public float item_width() { return nitem_width(address()); }
	/** Returns the value of the {@code item_height} field. */
	public float item_height() { return nitem_height(address()); }
	/** Returns the value of the {@code item_offset} field. */
	public float item_offset() { return nitem_offset(address()); }
	/** Returns the value of the {@code filled} field. */
	public float filled() { return nfilled(address()); }
	/** Returns a {@link NkRect} view of the {@code item} field. */
	public NkRect item() { return nitem(address()); }
	/** Returns the value of the {@code tree_depth} field. */
	public int tree_depth() { return ntree_depth(address()); }

	/** Sets the specified value to the {@code type} field. */
	public NkRowLayout type(int value) { ntype(address(), value); return this; }
	/** Sets the specified value to the {@code index} field. */
	public NkRowLayout index(int value) { nindex(address(), value); return this; }
	/** Sets the specified value to the {@code height} field. */
	public NkRowLayout height(float value) { nheight(address(), value); return this; }
	/** Sets the specified value to the {@code columns} field. */
	public NkRowLayout columns(int value) { ncolumns(address(), value); return this; }
	/** Sets the address of the specified {@link FloatBuffer} to the {@code ratio} field. */
	public NkRowLayout ratio(FloatBuffer value) { nratio(address(), value); return this; }
	/** Sets the specified value to the {@code item_width} field. */
	public NkRowLayout item_width(float value) { nitem_width(address(), value); return this; }
	/** Sets the specified value to the {@code item_height} field. */
	public NkRowLayout item_height(float value) { nitem_height(address(), value); return this; }
	/** Sets the specified value to the {@code item_offset} field. */
	public NkRowLayout item_offset(float value) { nitem_offset(address(), value); return this; }
	/** Sets the specified value to the {@code filled} field. */
	public NkRowLayout filled(float value) { nfilled(address(), value); return this; }
	/** Copies the specified {@link NkRect} to the {@code item} field. */
	public NkRowLayout item(NkRect value) { nitem(address(), value); return this; }
	/** Sets the specified value to the {@code tree_depth} field. */
	public NkRowLayout tree_depth(int value) { ntree_depth(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public NkRowLayout set(
		int type,
		int index,
		float height,
		int columns,
		FloatBuffer ratio,
		float item_width,
		float item_height,
		float item_offset,
		float filled,
		NkRect item,
		int tree_depth
	) {
		type(type);
		index(index);
		height(height);
		columns(columns);
		ratio(ratio);
		item_width(item_width);
		item_height(item_height);
		item_offset(item_offset);
		filled(filled);
		item(item);
		tree_depth(tree_depth);

		return this;
	}

	/** Unsafe version of {@link #set(NkRowLayout) set}. */
	public NkRowLayout nset(long struct) {
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
	public NkRowLayout set(NkRowLayout src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link NkRowLayout} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkRowLayout malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkRowLayout} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkRowLayout calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkRowLayout} instance allocated with {@link BufferUtils}. */
	public static NkRowLayout create() {
		return new NkRowLayout(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkRowLayout} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkRowLayout create(long address) {
		return address == NULL ? null : new NkRowLayout(address, null);
	}

	/**
	 * Returns a new {@link NkRowLayout.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkRowLayout.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkRowLayout.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkRowLayout.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkRowLayout} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkRowLayout mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkRowLayout} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkRowLayout callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkRowLayout} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkRowLayout mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkRowLayout} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkRowLayout callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkRowLayout.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkRowLayout.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkRowLayout.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkRowLayout.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #type}. */
	public static int ntype(long struct) { return memGetInt(struct + NkRowLayout.TYPE); }
	/** Unsafe version of {@link #index}. */
	public static int nindex(long struct) { return memGetInt(struct + NkRowLayout.INDEX); }
	/** Unsafe version of {@link #height}. */
	public static float nheight(long struct) { return memGetFloat(struct + NkRowLayout.HEIGHT); }
	/** Unsafe version of {@link #columns}. */
	public static int ncolumns(long struct) { return memGetInt(struct + NkRowLayout.COLUMNS); }
	/** Unsafe version of {@link #ratio(int) ratio}. */
	public static FloatBuffer nratio(long struct, int capacity) { return memFloatBuffer(memGetAddress(struct + NkRowLayout.RATIO), capacity); }
	/** Unsafe version of {@link #item_width}. */
	public static float nitem_width(long struct) { return memGetFloat(struct + NkRowLayout.ITEM_WIDTH); }
	/** Unsafe version of {@link #item_height}. */
	public static float nitem_height(long struct) { return memGetFloat(struct + NkRowLayout.ITEM_HEIGHT); }
	/** Unsafe version of {@link #item_offset}. */
	public static float nitem_offset(long struct) { return memGetFloat(struct + NkRowLayout.ITEM_OFFSET); }
	/** Unsafe version of {@link #filled}. */
	public static float nfilled(long struct) { return memGetFloat(struct + NkRowLayout.FILLED); }
	/** Unsafe version of {@link #item}. */
	public static NkRect nitem(long struct) { return NkRect.create(struct + NkRowLayout.ITEM); }
	/** Unsafe version of {@link #tree_depth}. */
	public static int ntree_depth(long struct) { return memGetInt(struct + NkRowLayout.TREE_DEPTH); }

	/** Unsafe version of {@link #type(int) type}. */
	public static void ntype(long struct, int value) { memPutInt(struct + NkRowLayout.TYPE, value); }
	/** Unsafe version of {@link #index(int) index}. */
	public static void nindex(long struct, int value) { memPutInt(struct + NkRowLayout.INDEX, value); }
	/** Unsafe version of {@link #height(float) height}. */
	public static void nheight(long struct, float value) { memPutFloat(struct + NkRowLayout.HEIGHT, value); }
	/** Unsafe version of {@link #columns(int) columns}. */
	public static void ncolumns(long struct, int value) { memPutInt(struct + NkRowLayout.COLUMNS, value); }
	/** Unsafe version of {@link #ratio(FloatBuffer) ratio}. */
	public static void nratio(long struct, FloatBuffer value) { memPutAddress(struct + NkRowLayout.RATIO, memAddress(value)); }
	/** Unsafe version of {@link #item_width(float) item_width}. */
	public static void nitem_width(long struct, float value) { memPutFloat(struct + NkRowLayout.ITEM_WIDTH, value); }
	/** Unsafe version of {@link #item_height(float) item_height}. */
	public static void nitem_height(long struct, float value) { memPutFloat(struct + NkRowLayout.ITEM_HEIGHT, value); }
	/** Unsafe version of {@link #item_offset(float) item_offset}. */
	public static void nitem_offset(long struct, float value) { memPutFloat(struct + NkRowLayout.ITEM_OFFSET, value); }
	/** Unsafe version of {@link #filled(float) filled}. */
	public static void nfilled(long struct, float value) { memPutFloat(struct + NkRowLayout.FILLED, value); }
	/** Unsafe version of {@link #item(NkRect) item}. */
	public static void nitem(long struct, NkRect value) { memCopy(value.address(), struct + NkRowLayout.ITEM, NkRect.SIZEOF); }
	/** Unsafe version of {@link #tree_depth(int) tree_depth}. */
	public static void ntree_depth(long struct, int value) { memPutInt(struct + NkRowLayout.TREE_DEPTH, value); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + NkRowLayout.RATIO));
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

	/** An array of {@link NkRowLayout} structs. */
	public static final class Buffer extends StructBuffer<NkRowLayout, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link NkRowLayout.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkRowLayout#SIZEOF}, and its mark will be undefined.
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
		protected NkRowLayout newInstance(long address) {
			return new NkRowLayout(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code type} field. */
		public int type() { return NkRowLayout.ntype(address()); }
		/** Returns the value of the {@code index} field. */
		public int index() { return NkRowLayout.nindex(address()); }
		/** Returns the value of the {@code height} field. */
		public float height() { return NkRowLayout.nheight(address()); }
		/** Returns the value of the {@code columns} field. */
		public int columns() { return NkRowLayout.ncolumns(address()); }
		/**
		 * Returns a {@link FloatBuffer} view of the data pointed to by the {@code ratio} field.
		 *
		 * @param capacity the number of elements in the returned buffer
		 */
		public FloatBuffer ratio(int capacity) { return NkRowLayout.nratio(address(), capacity); }
		/** Returns the value of the {@code item_width} field. */
		public float item_width() { return NkRowLayout.nitem_width(address()); }
		/** Returns the value of the {@code item_height} field. */
		public float item_height() { return NkRowLayout.nitem_height(address()); }
		/** Returns the value of the {@code item_offset} field. */
		public float item_offset() { return NkRowLayout.nitem_offset(address()); }
		/** Returns the value of the {@code filled} field. */
		public float filled() { return NkRowLayout.nfilled(address()); }
		/** Returns a {@link NkRect} view of the {@code item} field. */
		public NkRect item() { return NkRowLayout.nitem(address()); }
		/** Returns the value of the {@code tree_depth} field. */
		public int tree_depth() { return NkRowLayout.ntree_depth(address()); }

		/** Sets the specified value to the {@code type} field. */
		public NkRowLayout.Buffer type(int value) { NkRowLayout.ntype(address(), value); return this; }
		/** Sets the specified value to the {@code index} field. */
		public NkRowLayout.Buffer index(int value) { NkRowLayout.nindex(address(), value); return this; }
		/** Sets the specified value to the {@code height} field. */
		public NkRowLayout.Buffer height(float value) { NkRowLayout.nheight(address(), value); return this; }
		/** Sets the specified value to the {@code columns} field. */
		public NkRowLayout.Buffer columns(int value) { NkRowLayout.ncolumns(address(), value); return this; }
		/** Sets the address of the specified {@link FloatBuffer} to the {@code ratio} field. */
		public NkRowLayout.Buffer ratio(FloatBuffer value) { NkRowLayout.nratio(address(), value); return this; }
		/** Sets the specified value to the {@code item_width} field. */
		public NkRowLayout.Buffer item_width(float value) { NkRowLayout.nitem_width(address(), value); return this; }
		/** Sets the specified value to the {@code item_height} field. */
		public NkRowLayout.Buffer item_height(float value) { NkRowLayout.nitem_height(address(), value); return this; }
		/** Sets the specified value to the {@code item_offset} field. */
		public NkRowLayout.Buffer item_offset(float value) { NkRowLayout.nitem_offset(address(), value); return this; }
		/** Sets the specified value to the {@code filled} field. */
		public NkRowLayout.Buffer filled(float value) { NkRowLayout.nfilled(address(), value); return this; }
		/** Copies the specified {@link NkRect} to the {@code item} field. */
		public NkRowLayout.Buffer item(NkRect value) { NkRowLayout.nitem(address(), value); return this; }
		/** Sets the specified value to the {@code tree_depth} field. */
		public NkRowLayout.Buffer tree_depth(int value) { NkRowLayout.ntree_depth(address(), value); return this; }

	}

}