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
import static org.lwjgl.system.MemoryStack.*;

/**
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkSpecializationMapEntry.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkSpecializationMapEntry">Vulkan Specification</a>
 * 
 * <p>Contains information about a specialization constant.</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code constantID} &ndash; ID of the specialization constant in SPIR-V</li>
 * <li>{@code offset} &ndash; byte offset of the specialization constant value within the supplied data buffer</li>
 * <li>{@code size} &ndash; byte size of the specialization constant value within the supplied data buffer</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkSpecializationMapEntry {
    uint32_t constantID;
    uint32_t offset;
    size_t size;
}</code></pre>
 */
public class VkSpecializationMapEntry extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		CONSTANTID,
		OFFSET,
		SIZE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		CONSTANTID = layout.offsetof(0);
		OFFSET = layout.offsetof(1);
		SIZE = layout.offsetof(2);
	}

	VkSpecializationMapEntry(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkSpecializationMapEntry} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkSpecializationMapEntry(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code constantID} field. */
	public int constantID() { return nconstantID(address()); }
	/** Returns the value of the {@code offset} field. */
	public int offset() { return noffset(address()); }
	/** Returns the value of the {@code size} field. */
	public long size() { return nsize(address()); }

	/** Sets the specified value to the {@code constantID} field. */
	public VkSpecializationMapEntry constantID(int value) { nconstantID(address(), value); return this; }
	/** Sets the specified value to the {@code offset} field. */
	public VkSpecializationMapEntry offset(int value) { noffset(address(), value); return this; }
	/** Sets the specified value to the {@code size} field. */
	public VkSpecializationMapEntry size(long value) { nsize(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkSpecializationMapEntry set(
		int constantID,
		int offset,
		long size
	) {
		constantID(constantID);
		offset(offset);
		size(size);

		return this;
	}

	/** Unsafe version of {@link #set(VkSpecializationMapEntry) set}. */
	public VkSpecializationMapEntry nset(long struct) {
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
	public VkSpecializationMapEntry set(VkSpecializationMapEntry src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkSpecializationMapEntry} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkSpecializationMapEntry malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkSpecializationMapEntry} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkSpecializationMapEntry calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkSpecializationMapEntry} instance allocated with {@link BufferUtils}. */
	public static VkSpecializationMapEntry create() {
		return new VkSpecializationMapEntry(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkSpecializationMapEntry} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkSpecializationMapEntry create(long address) {
		return address == NULL ? null : new VkSpecializationMapEntry(address, null);
	}

	/**
	 * Returns a new {@link VkSpecializationMapEntry.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSpecializationMapEntry.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSpecializationMapEntry.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkSpecializationMapEntry.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkSpecializationMapEntry} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkSpecializationMapEntry mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkSpecializationMapEntry} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkSpecializationMapEntry callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkSpecializationMapEntry} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkSpecializationMapEntry mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkSpecializationMapEntry} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkSpecializationMapEntry callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkSpecializationMapEntry.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkSpecializationMapEntry.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkSpecializationMapEntry.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSpecializationMapEntry.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #constantID}. */
	public static int nconstantID(long struct) { return memGetInt(struct + VkSpecializationMapEntry.CONSTANTID); }
	/** Unsafe version of {@link #offset}. */
	public static int noffset(long struct) { return memGetInt(struct + VkSpecializationMapEntry.OFFSET); }
	/** Unsafe version of {@link #size}. */
	public static long nsize(long struct) { return memGetAddress(struct + VkSpecializationMapEntry.SIZE); }

	/** Unsafe version of {@link #constantID(int) constantID}. */
	public static void nconstantID(long struct, int value) { memPutInt(struct + VkSpecializationMapEntry.CONSTANTID, value); }
	/** Unsafe version of {@link #offset(int) offset}. */
	public static void noffset(long struct, int value) { memPutInt(struct + VkSpecializationMapEntry.OFFSET, value); }
	/** Unsafe version of {@link #size(long) size}. */
	public static void nsize(long struct, long value) { memPutAddress(struct + VkSpecializationMapEntry.SIZE, value); }

	// -----------------------------------

	/** An array of {@link VkSpecializationMapEntry} structs. */
	public static final class Buffer extends StructBuffer<VkSpecializationMapEntry, Buffer> {

		/**
		 * Creates a new {@link VkSpecializationMapEntry.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkSpecializationMapEntry#SIZEOF}, and its mark will be undefined.
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
		protected VkSpecializationMapEntry newInstance(long address) {
			return new VkSpecializationMapEntry(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code constantID} field. */
		public int constantID() { return VkSpecializationMapEntry.nconstantID(address()); }
		/** Returns the value of the {@code offset} field. */
		public int offset() { return VkSpecializationMapEntry.noffset(address()); }
		/** Returns the value of the {@code size} field. */
		public long size() { return VkSpecializationMapEntry.nsize(address()); }

		/** Sets the specified value to the {@code constantID} field. */
		public VkSpecializationMapEntry.Buffer constantID(int value) { VkSpecializationMapEntry.nconstantID(address(), value); return this; }
		/** Sets the specified value to the {@code offset} field. */
		public VkSpecializationMapEntry.Buffer offset(int value) { VkSpecializationMapEntry.noffset(address(), value); return this; }
		/** Sets the specified value to the {@code size} field. */
		public VkSpecializationMapEntry.Buffer size(long value) { VkSpecializationMapEntry.nsize(address(), value); return this; }

	}

}