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
 * <pre><code>struct nk_draw_list {
    {@link NkRect struct nk_rect} clip_rect;
    {@link NkVec2 struct nk_vec2} circle_vtx[12];
    {@link NkConvertConfig struct nk_convert_config} config;
    struct nk_buffer * buffer;
    struct nk_buffer * vertices;
    struct nk_buffer * elements;
    unsigned int element_count;
    unsigned int vertex_count;
    unsigned int cmd_count;
    nk_size cmd_offset;
    unsigned int path_count;
    unsigned int path_offset;
    {@link NkHandle nk_handle} userdata;
}</code></pre>
 */
public class NkDrawList extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		CLIP_RECT,
		CIRCLE_VTX,
		CONFIG,
		BUFFER,
		VERTICES,
		ELEMENTS,
		ELEMENT_COUNT,
		VERTEX_COUNT,
		CMD_COUNT,
		CMD_OFFSET,
		PATH_COUNT,
		PATH_OFFSET,
		USERDATA;

	static {
		Layout layout = __struct(
			__member(NkRect.SIZEOF, NkRect.ALIGNOF),
			__array(NkVec2.SIZEOF, NkVec2.ALIGNOF, 12),
			__member(NkConvertConfig.SIZEOF, NkConvertConfig.ALIGNOF),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(NkHandle.SIZEOF, NkHandle.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		CLIP_RECT = layout.offsetof(0);
		CIRCLE_VTX = layout.offsetof(1);
		CONFIG = layout.offsetof(2);
		BUFFER = layout.offsetof(3);
		VERTICES = layout.offsetof(4);
		ELEMENTS = layout.offsetof(5);
		ELEMENT_COUNT = layout.offsetof(6);
		VERTEX_COUNT = layout.offsetof(7);
		CMD_COUNT = layout.offsetof(8);
		CMD_OFFSET = layout.offsetof(9);
		PATH_COUNT = layout.offsetof(10);
		PATH_OFFSET = layout.offsetof(11);
		USERDATA = layout.offsetof(12);
	}

	NkDrawList(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkDrawList} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkDrawList(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link NkRect} view of the {@code clip_rect} field. */
	public NkRect clip_rect() { return nclip_rect(address()); }
	/** Returns a {@link NkVec2}.Buffer view of the {@code circle_vtx} field. */
	public NkVec2.Buffer circle_vtx() { return ncircle_vtx(address()); }
	/** Returns a {@link NkVec2} view of the struct at the specified index of the {@code circle_vtx} field. */
	public NkVec2 circle_vtx(int index) { return ncircle_vtx(address(), index); }
	/** Returns a {@link NkConvertConfig} view of the {@code config} field. */
	public NkConvertConfig config() { return nconfig(address()); }
	/** Returns a {@link NkBuffer} view of the struct pointed to by the {@code buffer} field. */
	public NkBuffer buffer() { return nbuffer(address()); }
	/** Returns a {@link NkBuffer} view of the struct pointed to by the {@code vertices} field. */
	public NkBuffer vertices() { return nvertices(address()); }
	/** Returns a {@link NkBuffer} view of the struct pointed to by the {@code elements} field. */
	public NkBuffer elements() { return nelements(address()); }
	/** Returns the value of the {@code element_count} field. */
	public int element_count() { return nelement_count(address()); }
	/** Returns the value of the {@code vertex_count} field. */
	public int vertex_count() { return nvertex_count(address()); }
	/** Returns the value of the {@code cmd_count} field. */
	public int cmd_count() { return ncmd_count(address()); }
	/** Returns the value of the {@code cmd_offset} field. */
	public long cmd_offset() { return ncmd_offset(address()); }
	/** Returns the value of the {@code path_count} field. */
	public int path_count() { return npath_count(address()); }
	/** Returns the value of the {@code path_offset} field. */
	public int path_offset() { return npath_offset(address()); }
	/** Returns a {@link NkHandle} view of the {@code userdata} field. */
	public NkHandle userdata() { return nuserdata(address()); }

	// -----------------------------------

	/** Returns a new {@link NkDrawList} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static NkDrawList malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link NkDrawList} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static NkDrawList calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link NkDrawList} instance allocated with {@link BufferUtils}. */
	public static NkDrawList create() {
		return new NkDrawList(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link NkDrawList} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkDrawList create(long address) {
		return address == NULL ? null : new NkDrawList(address, null);
	}

	/**
	 * Returns a new {@link NkDrawList.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkDrawList.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkDrawList.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link NkDrawList.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link NkDrawList} instance allocated on the thread-local {@link MemoryStack}. */
	public static NkDrawList mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link NkDrawList} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static NkDrawList callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link NkDrawList} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkDrawList mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link NkDrawList} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static NkDrawList callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link NkDrawList.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkDrawList.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link NkDrawList.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link NkDrawList.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #clip_rect}. */
	public static NkRect nclip_rect(long struct) { return NkRect.create(struct + NkDrawList.CLIP_RECT); }
	/** Unsafe version of {@link #circle_vtx}. */
	public static NkVec2.Buffer ncircle_vtx(long struct) {
		return NkVec2.create(struct + NkDrawList.CIRCLE_VTX, 12);
	}
	/** Unsafe version of {@link #circle_vtx(int) circle_vtx}. */
	public static NkVec2 ncircle_vtx(long struct, int index) {
		return NkVec2.create(struct + NkDrawList.CIRCLE_VTX + index * NkVec2.SIZEOF);
	}
	/** Unsafe version of {@link #config}. */
	public static NkConvertConfig nconfig(long struct) { return NkConvertConfig.create(struct + NkDrawList.CONFIG); }
	/** Unsafe version of {@link #buffer}. */
	public static NkBuffer nbuffer(long struct) { return NkBuffer.create(memGetAddress(struct + NkDrawList.BUFFER)); }
	/** Unsafe version of {@link #vertices}. */
	public static NkBuffer nvertices(long struct) { return NkBuffer.create(memGetAddress(struct + NkDrawList.VERTICES)); }
	/** Unsafe version of {@link #elements}. */
	public static NkBuffer nelements(long struct) { return NkBuffer.create(memGetAddress(struct + NkDrawList.ELEMENTS)); }
	/** Unsafe version of {@link #element_count}. */
	public static int nelement_count(long struct) { return memGetInt(struct + NkDrawList.ELEMENT_COUNT); }
	/** Unsafe version of {@link #vertex_count}. */
	public static int nvertex_count(long struct) { return memGetInt(struct + NkDrawList.VERTEX_COUNT); }
	/** Unsafe version of {@link #cmd_count}. */
	public static int ncmd_count(long struct) { return memGetInt(struct + NkDrawList.CMD_COUNT); }
	/** Unsafe version of {@link #cmd_offset}. */
	public static long ncmd_offset(long struct) { return memGetAddress(struct + NkDrawList.CMD_OFFSET); }
	/** Unsafe version of {@link #path_count}. */
	public static int npath_count(long struct) { return memGetInt(struct + NkDrawList.PATH_COUNT); }
	/** Unsafe version of {@link #path_offset}. */
	public static int npath_offset(long struct) { return memGetInt(struct + NkDrawList.PATH_OFFSET); }
	/** Unsafe version of {@link #userdata}. */
	public static NkHandle nuserdata(long struct) { return NkHandle.create(struct + NkDrawList.USERDATA); }

	// -----------------------------------

	/** An array of {@link NkDrawList} structs. */
	public static class Buffer extends StructBuffer<NkDrawList, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link NkDrawList.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkDrawList#SIZEOF}, and its mark will be undefined.
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
		protected NkDrawList newInstance(long address) {
			return new NkDrawList(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link NkRect} view of the {@code clip_rect} field. */
		public NkRect clip_rect() { return NkDrawList.nclip_rect(address()); }
		/** Returns a {@link NkVec2}.Buffer view of the {@code circle_vtx} field. */
		public NkVec2.Buffer circle_vtx() { return NkDrawList.ncircle_vtx(address()); }
		/** Returns a {@link NkVec2} view of the struct at the specified index of the {@code circle_vtx} field. */
		public NkVec2 circle_vtx(int index) { return NkDrawList.ncircle_vtx(address(), index); }
		/** Returns a {@link NkConvertConfig} view of the {@code config} field. */
		public NkConvertConfig config() { return NkDrawList.nconfig(address()); }
		/** Returns a {@link NkBuffer} view of the struct pointed to by the {@code buffer} field. */
		public NkBuffer buffer() { return NkDrawList.nbuffer(address()); }
		/** Returns a {@link NkBuffer} view of the struct pointed to by the {@code vertices} field. */
		public NkBuffer vertices() { return NkDrawList.nvertices(address()); }
		/** Returns a {@link NkBuffer} view of the struct pointed to by the {@code elements} field. */
		public NkBuffer elements() { return NkDrawList.nelements(address()); }
		/** Returns the value of the {@code element_count} field. */
		public int element_count() { return NkDrawList.nelement_count(address()); }
		/** Returns the value of the {@code vertex_count} field. */
		public int vertex_count() { return NkDrawList.nvertex_count(address()); }
		/** Returns the value of the {@code cmd_count} field. */
		public int cmd_count() { return NkDrawList.ncmd_count(address()); }
		/** Returns the value of the {@code cmd_offset} field. */
		public long cmd_offset() { return NkDrawList.ncmd_offset(address()); }
		/** Returns the value of the {@code path_count} field. */
		public int path_count() { return NkDrawList.npath_count(address()); }
		/** Returns the value of the {@code path_offset} field. */
		public int path_offset() { return NkDrawList.npath_offset(address()); }
		/** Returns a {@link NkHandle} view of the {@code userdata} field. */
		public NkHandle userdata() { return NkDrawList.nuserdata(address()); }

	}

}