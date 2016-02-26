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
 * <pre><code style="font-family: monospace">
 * struct VkMemoryBarrier {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkAccessFlags srcAccessMask;
 *     VkAccessFlags dstAccessMask;
 * }</code></pre>
 * 
 * <h3>Member documentation</h3>
 * 
 * <table border=1 cellspacing=0 cellpadding=2 class=lwjgl>
 * <tr><td>pNext</td><td>reserved for use by extensions</td></tr>
 * </table>
 */
public class VkMemoryBarrier extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		SRCACCESSMASK,
		DSTACCESSMASK;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		SRCACCESSMASK = layout.offsetof(2);
		DSTACCESSMASK = layout.offsetof(3);
	}

	VkMemoryBarrier(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkMemoryBarrier} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkMemoryBarrier(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code srcAccessMask} field. */
	public int srcAccessMask() { return nsrcAccessMask(address()); }
	/** Returns the value of the {@code dstAccessMask} field. */
	public int dstAccessMask() { return ndstAccessMask(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkMemoryBarrier sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkMemoryBarrier pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code srcAccessMask} field. */
	public VkMemoryBarrier srcAccessMask(int value) { nsrcAccessMask(address(), value); return this; }
	/** Sets the specified value to the {@code dstAccessMask} field. */
	public VkMemoryBarrier dstAccessMask(int value) { ndstAccessMask(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkMemoryBarrier set(
		int sType,
		long pNext,
		int srcAccessMask,
		int dstAccessMask
	) {
		sType(sType);
		pNext(pNext);
		srcAccessMask(srcAccessMask);
		dstAccessMask(dstAccessMask);

		return this;
	}

	/** Unsafe version of {@link #set(VkMemoryBarrier) set}. */
	public VkMemoryBarrier nset(long struct) {
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
	public VkMemoryBarrier set(VkMemoryBarrier src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkMemoryBarrier} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkMemoryBarrier malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkMemoryBarrier} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkMemoryBarrier calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkMemoryBarrier} instance allocated with {@link BufferUtils}. */
	public static VkMemoryBarrier create() {
		return new VkMemoryBarrier(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkMemoryBarrier} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkMemoryBarrier create(long address) {
		return address == NULL ? null : new VkMemoryBarrier(address, null);
	}

	/**
	 * Returns a new {@link VkMemoryBarrier.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkMemoryBarrier.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkMemoryBarrier.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkMemoryBarrier.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkMemoryBarrier.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkMemoryBarrier.PNEXT); }
	/** Unsafe version of {@link #srcAccessMask}. */
	public static int nsrcAccessMask(long struct) { return memGetInt(struct + VkMemoryBarrier.SRCACCESSMASK); }
	/** Unsafe version of {@link #dstAccessMask}. */
	public static int ndstAccessMask(long struct) { return memGetInt(struct + VkMemoryBarrier.DSTACCESSMASK); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkMemoryBarrier.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkMemoryBarrier.PNEXT, value); }
	/** Unsafe version of {@link #srcAccessMask(int) srcAccessMask}. */
	public static void nsrcAccessMask(long struct, int value) { memPutInt(struct + VkMemoryBarrier.SRCACCESSMASK, value); }
	/** Unsafe version of {@link #dstAccessMask(int) dstAccessMask}. */
	public static void ndstAccessMask(long struct, int value) { memPutInt(struct + VkMemoryBarrier.DSTACCESSMASK, value); }

	// -----------------------------------

	/** An array of {@link VkMemoryBarrier} structs. */
	public static final class Buffer extends StructBuffer<VkMemoryBarrier, Buffer> {

		/**
		 * Creates a new {@link VkMemoryBarrier.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkMemoryBarrier#SIZEOF}, and its mark will be undefined.
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
		protected VkMemoryBarrier newInstance(long address) {
			return new VkMemoryBarrier(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkMemoryBarrier.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkMemoryBarrier.npNext(address()); }
		/** Returns the value of the {@code srcAccessMask} field. */
		public int srcAccessMask() { return VkMemoryBarrier.nsrcAccessMask(address()); }
		/** Returns the value of the {@code dstAccessMask} field. */
		public int dstAccessMask() { return VkMemoryBarrier.ndstAccessMask(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkMemoryBarrier.Buffer sType(int value) { VkMemoryBarrier.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkMemoryBarrier.Buffer pNext(long value) { VkMemoryBarrier.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code srcAccessMask} field. */
		public VkMemoryBarrier.Buffer srcAccessMask(int value) { VkMemoryBarrier.nsrcAccessMask(address(), value); return this; }
		/** Sets the specified value to the {@code dstAccessMask} field. */
		public VkMemoryBarrier.Buffer dstAccessMask(int value) { VkMemoryBarrier.ndstAccessMask(address(), value); return this; }

	}

}