/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.Checks.*;
import static org.lwjgl.system.MemoryUtil.*;

/**
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkImageBlit {
    {@link VkImageSubresourceLayers VkImageSubresourceLayers} srcSubresource;
    {@link VkOffset3D VkOffset3D}[2] srcOffsets;
    {@link VkImageSubresourceLayers VkImageSubresourceLayers} dstSubresource;
    {@link VkOffset3D VkOffset3D}[2] dstOffsets;
}</code></pre>
 */
public class VkImageBlit extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		SRCSUBRESOURCE,
		SRCOFFSETS,
		DSTSUBRESOURCE,
		DSTOFFSETS;

	static {
		Layout layout = __struct(
			__member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.__ALIGNMENT),
			__array(VkOffset3D.SIZEOF, VkOffset3D.__ALIGNMENT, 2),
			__member(VkImageSubresourceLayers.SIZEOF, VkImageSubresourceLayers.__ALIGNMENT),
			__array(VkOffset3D.SIZEOF, VkOffset3D.__ALIGNMENT, 2)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		SRCSUBRESOURCE = layout.offsetof(0);
		SRCOFFSETS = layout.offsetof(1);
		DSTSUBRESOURCE = layout.offsetof(2);
		DSTOFFSETS = layout.offsetof(3);
	}

	VkImageBlit(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkImageBlit} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkImageBlit(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns a {@link VkImageSubresourceLayers} view of the {@code srcSubresource} field. */
	public VkImageSubresourceLayers srcSubresource() { return nsrcSubresource(address()); }
	/** Returns a {@link VkOffset3D}.Buffer view of the {@code srcOffsets} field. */
	public VkOffset3D.Buffer srcOffsets() { return nsrcOffsets(address()); }
	/** Returns a {@link VkOffset3D} view of the struct at the specified index of the {@code srcOffsets} field. */
	public VkOffset3D srcOffsets(int index) { return nsrcOffsets(address(), index); }
	/** Returns a {@link VkImageSubresourceLayers} view of the {@code dstSubresource} field. */
	public VkImageSubresourceLayers dstSubresource() { return ndstSubresource(address()); }
	/** Returns a {@link VkOffset3D}.Buffer view of the {@code dstOffsets} field. */
	public VkOffset3D.Buffer dstOffsets() { return ndstOffsets(address()); }
	/** Returns a {@link VkOffset3D} view of the struct at the specified index of the {@code dstOffsets} field. */
	public VkOffset3D dstOffsets(int index) { return ndstOffsets(address(), index); }

	/** Copies the specified {@link VkImageSubresourceLayers} to the {@code srcSubresource} field. */
	public VkImageBlit srcSubresource(VkImageSubresourceLayers value) { nsrcSubresource(address(), value); return this; }
	/** Copies the specified {@link VkOffset3D.Buffer} to the {@code srcOffsets} field. */
	public VkImageBlit srcOffsets(VkOffset3D.Buffer value) { nsrcOffsets(address(), value); return this; }
	/** Copies the specified {@link VkOffset3D} at the specified index of the {@code srcOffsets} field. */
	public VkImageBlit srcOffsets(int index, VkOffset3D value) { nsrcOffsets(address(), index, value); return this; }
	/** Copies the specified {@link VkImageSubresourceLayers} to the {@code dstSubresource} field. */
	public VkImageBlit dstSubresource(VkImageSubresourceLayers value) { ndstSubresource(address(), value); return this; }
	/** Copies the specified {@link VkOffset3D.Buffer} to the {@code dstOffsets} field. */
	public VkImageBlit dstOffsets(VkOffset3D.Buffer value) { ndstOffsets(address(), value); return this; }
	/** Copies the specified {@link VkOffset3D} at the specified index of the {@code dstOffsets} field. */
	public VkImageBlit dstOffsets(int index, VkOffset3D value) { ndstOffsets(address(), index, value); return this; }

	/** Initializes this struct with the specified values. */
	public VkImageBlit set(
		VkImageSubresourceLayers srcSubresource,
		VkOffset3D.Buffer srcOffsets,
		VkImageSubresourceLayers dstSubresource,
		VkOffset3D.Buffer dstOffsets
	) {
		srcSubresource(srcSubresource);
		srcOffsets(srcOffsets);
		dstSubresource(dstSubresource);
		dstOffsets(dstOffsets);

		return this;
	}

	/** Unsafe version of {@link #set(VkImageBlit) set}. */
	public VkImageBlit nset(long struct) {
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
	public VkImageBlit set(VkImageBlit src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkImageBlit} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkImageBlit malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkImageBlit} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkImageBlit calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkImageBlit} instance allocated with {@link BufferUtils}. */
	public static VkImageBlit create() {
		return new VkImageBlit(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkImageBlit} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkImageBlit create(long address) {
		return address == NULL ? null : new VkImageBlit(address, null);
	}

	/**
	 * Returns a new {@link VkImageBlit.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageBlit.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImageBlit.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkImageBlit.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #srcSubresource}. */
	public static VkImageSubresourceLayers nsrcSubresource(long struct) { return VkImageSubresourceLayers.create(struct + VkImageBlit.SRCSUBRESOURCE); }
	/** Unsafe version of {@link #srcOffsets}. */
	public static VkOffset3D.Buffer nsrcOffsets(long struct) {
		return VkOffset3D.create(struct + VkImageBlit.SRCOFFSETS, 2);
	}
	/** Unsafe version of {@link #srcOffsets(int) srcOffsets}. */
	public static VkOffset3D nsrcOffsets(long struct, int index) {
		return VkOffset3D.create(struct + VkImageBlit.SRCOFFSETS + index * VkOffset3D.SIZEOF);
	}
	/** Unsafe version of {@link #dstSubresource}. */
	public static VkImageSubresourceLayers ndstSubresource(long struct) { return VkImageSubresourceLayers.create(struct + VkImageBlit.DSTSUBRESOURCE); }
	/** Unsafe version of {@link #dstOffsets}. */
	public static VkOffset3D.Buffer ndstOffsets(long struct) {
		return VkOffset3D.create(struct + VkImageBlit.DSTOFFSETS, 2);
	}
	/** Unsafe version of {@link #dstOffsets(int) dstOffsets}. */
	public static VkOffset3D ndstOffsets(long struct, int index) {
		return VkOffset3D.create(struct + VkImageBlit.DSTOFFSETS + index * VkOffset3D.SIZEOF);
	}

	/** Unsafe version of {@link #srcSubresource(VkImageSubresourceLayers) srcSubresource}. */
	public static void nsrcSubresource(long struct, VkImageSubresourceLayers value) { memCopy(value.address(), struct + VkImageBlit.SRCSUBRESOURCE, VkImageSubresourceLayers.SIZEOF); }
	/** Unsafe version of {@link #srcOffsets(VkOffset3D.Buffer) srcOffsets}. */
	public static void nsrcOffsets(long struct, VkOffset3D.Buffer value) {
		if ( CHECKS ) checkBufferGT(value, 2);
		memCopy(value.address(), struct + VkImageBlit.SRCOFFSETS, value.remaining() * VkOffset3D.SIZEOF);
	}
	/** Unsafe version of {@link #srcOffsets(int, VkOffset3D) srcOffsets}. */
	public static void nsrcOffsets(long struct, int index, VkOffset3D value) { memCopy(value.address(), struct + VkImageBlit.SRCOFFSETS + index * VkOffset3D.SIZEOF, VkOffset3D.SIZEOF); }
	/** Unsafe version of {@link #dstSubresource(VkImageSubresourceLayers) dstSubresource}. */
	public static void ndstSubresource(long struct, VkImageSubresourceLayers value) { memCopy(value.address(), struct + VkImageBlit.DSTSUBRESOURCE, VkImageSubresourceLayers.SIZEOF); }
	/** Unsafe version of {@link #dstOffsets(VkOffset3D.Buffer) dstOffsets}. */
	public static void ndstOffsets(long struct, VkOffset3D.Buffer value) {
		if ( CHECKS ) checkBufferGT(value, 2);
		memCopy(value.address(), struct + VkImageBlit.DSTOFFSETS, value.remaining() * VkOffset3D.SIZEOF);
	}
	/** Unsafe version of {@link #dstOffsets(int, VkOffset3D) dstOffsets}. */
	public static void ndstOffsets(long struct, int index, VkOffset3D value) { memCopy(value.address(), struct + VkImageBlit.DSTOFFSETS + index * VkOffset3D.SIZEOF, VkOffset3D.SIZEOF); }

	// -----------------------------------

	/** An array of {@link VkImageBlit} structs. */
	public static final class Buffer extends StructBuffer<VkImageBlit, Buffer> {

		/**
		 * Creates a new {@link VkImageBlit.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkImageBlit#SIZEOF}, and its mark will be undefined.
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
		protected VkImageBlit newInstance(long address) {
			return new VkImageBlit(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns a {@link VkImageSubresourceLayers} view of the {@code srcSubresource} field. */
		public VkImageSubresourceLayers srcSubresource() { return VkImageBlit.nsrcSubresource(address()); }
		/** Returns a {@link VkOffset3D}.Buffer view of the {@code srcOffsets} field. */
		public VkOffset3D.Buffer srcOffsets() { return VkImageBlit.nsrcOffsets(address()); }
		/** Returns a {@link VkOffset3D} view of the struct at the specified index of the {@code srcOffsets} field. */
		public VkOffset3D srcOffsets(int index) { return VkImageBlit.nsrcOffsets(address(), index); }
		/** Returns a {@link VkImageSubresourceLayers} view of the {@code dstSubresource} field. */
		public VkImageSubresourceLayers dstSubresource() { return VkImageBlit.ndstSubresource(address()); }
		/** Returns a {@link VkOffset3D}.Buffer view of the {@code dstOffsets} field. */
		public VkOffset3D.Buffer dstOffsets() { return VkImageBlit.ndstOffsets(address()); }
		/** Returns a {@link VkOffset3D} view of the struct at the specified index of the {@code dstOffsets} field. */
		public VkOffset3D dstOffsets(int index) { return VkImageBlit.ndstOffsets(address(), index); }

		/** Copies the specified {@link VkImageSubresourceLayers} to the {@code srcSubresource} field. */
		public VkImageBlit.Buffer srcSubresource(VkImageSubresourceLayers value) { VkImageBlit.nsrcSubresource(address(), value); return this; }
		/** Copies the specified {@link VkOffset3D.Buffer} to the {@code srcOffsets} field. */
		public VkImageBlit.Buffer srcOffsets(VkOffset3D.Buffer value) { VkImageBlit.nsrcOffsets(address(), value); return this; }
		/** Copies the specified {@link VkOffset3D} at the specified index of the {@code srcOffsets} field. */
		public VkImageBlit.Buffer srcOffsets(int index, VkOffset3D value) { VkImageBlit.nsrcOffsets(address(), index, value); return this; }
		/** Copies the specified {@link VkImageSubresourceLayers} to the {@code dstSubresource} field. */
		public VkImageBlit.Buffer dstSubresource(VkImageSubresourceLayers value) { VkImageBlit.ndstSubresource(address(), value); return this; }
		/** Copies the specified {@link VkOffset3D.Buffer} to the {@code dstOffsets} field. */
		public VkImageBlit.Buffer dstOffsets(VkOffset3D.Buffer value) { VkImageBlit.ndstOffsets(address(), value); return this; }
		/** Copies the specified {@link VkOffset3D} at the specified index of the {@code dstOffsets} field. */
		public VkImageBlit.Buffer dstOffsets(int index, VkOffset3D value) { VkImageBlit.ndstOffsets(address(), index, value); return this; }

	}

}