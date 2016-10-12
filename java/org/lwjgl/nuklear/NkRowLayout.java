/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.nuklear;

import java.nio.*;

import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;

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
public class NkRowLayout extends Struct {

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

	// -----------------------------------

	/** Returns a new {@link NkRowLayout} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkRowLayout create(long address) {
		return address == NULL ? null : new NkRowLayout(address, null);
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

	// -----------------------------------

	/** An array of {@link NkRowLayout} structs. */
	public static class Buffer extends StructBuffer<NkRowLayout, Buffer> {

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
			return new NkRowLayout(address, container);
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

	}

}