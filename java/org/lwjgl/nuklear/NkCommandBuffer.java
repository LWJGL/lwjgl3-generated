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
 * <pre><code>struct nk_command_buffer {
    struct nk_buffer * base;
    {@link NkRect struct nk_rect} clip;
    int use_clipping;
    {@link NkHandle nk_handle} userdata;
    nk_size begin;
    nk_size end;
    nk_size last;
}</code></pre>
 */
public class NkCommandBuffer extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		BASE,
		CLIP,
		USE_CLIPPING,
		USERDATA,
		BEGIN,
		END,
		LAST;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(NkRect.SIZEOF, NkRect.ALIGNOF),
			__member(4),
			__member(NkHandle.SIZEOF, NkHandle.ALIGNOF),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		BASE = layout.offsetof(0);
		CLIP = layout.offsetof(1);
		USE_CLIPPING = layout.offsetof(2);
		USERDATA = layout.offsetof(3);
		BEGIN = layout.offsetof(4);
		END = layout.offsetof(5);
		LAST = layout.offsetof(6);
	}

	NkCommandBuffer(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link NkCommandBuffer} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public NkCommandBuffer(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link NkBuffer} view of the struct pointed to by the {@code base} field. */
	public NkBuffer base() { return nbase(address()); }
	/** Returns a {@link NkRect} view of the {@code clip} field. */
	public NkRect clip() { return nclip(address()); }
	/** Returns the value of the {@code use_clipping} field. */
	public int use_clipping() { return nuse_clipping(address()); }
	/** Returns a {@link NkHandle} view of the {@code userdata} field. */
	public NkHandle userdata() { return nuserdata(address()); }
	/** Returns the value of the {@code begin} field. */
	public long begin() { return nbegin(address()); }
	/** Returns the value of the {@code end} field. */
	public long end() { return nend(address()); }
	/** Returns the value of the {@code last} field. */
	public long last() { return nlast(address()); }

	// -----------------------------------

	/** Returns a new {@link NkCommandBuffer} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static NkCommandBuffer create(long address) {
		return address == NULL ? null : new NkCommandBuffer(address, null);
	}

	/**
	 * Create a {@link NkCommandBuffer.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #base}. */
	public static NkBuffer nbase(long struct) { return NkBuffer.create(memGetAddress(struct + NkCommandBuffer.BASE)); }
	/** Unsafe version of {@link #clip}. */
	public static NkRect nclip(long struct) { return NkRect.create(struct + NkCommandBuffer.CLIP); }
	/** Unsafe version of {@link #use_clipping}. */
	public static int nuse_clipping(long struct) { return memGetInt(struct + NkCommandBuffer.USE_CLIPPING); }
	/** Unsafe version of {@link #userdata}. */
	public static NkHandle nuserdata(long struct) { return NkHandle.create(struct + NkCommandBuffer.USERDATA); }
	/** Unsafe version of {@link #begin}. */
	public static long nbegin(long struct) { return memGetAddress(struct + NkCommandBuffer.BEGIN); }
	/** Unsafe version of {@link #end}. */
	public static long nend(long struct) { return memGetAddress(struct + NkCommandBuffer.END); }
	/** Unsafe version of {@link #last}. */
	public static long nlast(long struct) { return memGetAddress(struct + NkCommandBuffer.LAST); }

	// -----------------------------------

	/** An array of {@link NkCommandBuffer} structs. */
	public static class Buffer extends StructBuffer<NkCommandBuffer, Buffer> {

		/**
		 * Creates a new {@link NkCommandBuffer.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link NkCommandBuffer#SIZEOF}, and its mark will be undefined.
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
		protected NkCommandBuffer newInstance(long address) {
			return new NkCommandBuffer(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link NkBuffer} view of the struct pointed to by the {@code base} field. */
		public NkBuffer base() { return NkCommandBuffer.nbase(address()); }
		/** Returns a {@link NkRect} view of the {@code clip} field. */
		public NkRect clip() { return NkCommandBuffer.nclip(address()); }
		/** Returns the value of the {@code use_clipping} field. */
		public int use_clipping() { return NkCommandBuffer.nuse_clipping(address()); }
		/** Returns a {@link NkHandle} view of the {@code userdata} field. */
		public NkHandle userdata() { return NkCommandBuffer.nuserdata(address()); }
		/** Returns the value of the {@code begin} field. */
		public long begin() { return NkCommandBuffer.nbegin(address()); }
		/** Returns the value of the {@code end} field. */
		public long end() { return NkCommandBuffer.nend(address()); }
		/** Returns the value of the {@code last} field. */
		public long last() { return NkCommandBuffer.nlast(address()); }

	}

}