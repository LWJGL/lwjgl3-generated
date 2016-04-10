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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkSparseBufferMemoryBindInfo.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkSparseBufferMemoryBindInfo">Vulkan Specification</a>
 * 
 * <p>Describes a memory binding to a {@code VkBuffer} object.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code buffer} <b>must</b> be a valid {@code VkBuffer} handle</li>
 * <li>{@code pBinds} <b>must</b> be a pointer to an array of {@code bindCount} valid {@link VkSparseMemoryBind} structures</li>
 * <li>{@code bindCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code buffer} &ndash; the {@code VkBuffer} object to be bound</li>
 * <li>{@code bindCount} &ndash; the number of {@code VkSparseMemoryBind} structures in the {@code pBinds} array</li>
 * <li>{@code pBinds} &ndash; a pointer to array of {@link VkSparseMemoryBind} structures</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkSparseBufferMemoryBindInfo {
    VkBuffer buffer;
    uint32_t bindCount;
    const VkSparseMemoryBind * pBinds;
}</code></pre>
 */
public class VkSparseBufferMemoryBindInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		BUFFER,
		BINDCOUNT,
		PBINDS;

	static {
		Layout layout = __struct(
			__member(8),
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		BUFFER = layout.offsetof(0);
		BINDCOUNT = layout.offsetof(1);
		PBINDS = layout.offsetof(2);
	}

	VkSparseBufferMemoryBindInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkSparseBufferMemoryBindInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkSparseBufferMemoryBindInfo(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code buffer} field. */
	public long buffer() { return nbuffer(address()); }
	/** Returns the value of the {@code bindCount} field. */
	public int bindCount() { return nbindCount(address()); }
	/** Returns a {@link VkSparseMemoryBind.Buffer} view of the struct array pointed to by the {@code pBinds} field. */
	public VkSparseMemoryBind.Buffer pBinds() { return npBinds(address()); }

	/** Sets the specified value to the {@code buffer} field. */
	public VkSparseBufferMemoryBindInfo buffer(long value) { nbuffer(address(), value); return this; }
	/** Sets the address of the specified {@link VkSparseMemoryBind.Buffer} to the {@code pBinds} field. */
	public VkSparseBufferMemoryBindInfo pBinds(VkSparseMemoryBind.Buffer value) { npBinds(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkSparseBufferMemoryBindInfo set(
		long buffer,
		VkSparseMemoryBind.Buffer pBinds
	) {
		buffer(buffer);
		pBinds(pBinds);

		return this;
	}

	/** Unsafe version of {@link #set(VkSparseBufferMemoryBindInfo) set}. */
	public VkSparseBufferMemoryBindInfo nset(long struct) {
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
	public VkSparseBufferMemoryBindInfo set(VkSparseBufferMemoryBindInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkSparseBufferMemoryBindInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkSparseBufferMemoryBindInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkSparseBufferMemoryBindInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkSparseBufferMemoryBindInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkSparseBufferMemoryBindInfo} instance allocated with {@link BufferUtils}. */
	public static VkSparseBufferMemoryBindInfo create() {
		return new VkSparseBufferMemoryBindInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkSparseBufferMemoryBindInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkSparseBufferMemoryBindInfo create(long address) {
		return address == NULL ? null : new VkSparseBufferMemoryBindInfo(address, null);
	}

	/**
	 * Returns a new {@link VkSparseBufferMemoryBindInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSparseBufferMemoryBindInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSparseBufferMemoryBindInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkSparseBufferMemoryBindInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkSparseBufferMemoryBindInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkSparseBufferMemoryBindInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkSparseBufferMemoryBindInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkSparseBufferMemoryBindInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkSparseBufferMemoryBindInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkSparseBufferMemoryBindInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkSparseBufferMemoryBindInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkSparseBufferMemoryBindInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkSparseBufferMemoryBindInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkSparseBufferMemoryBindInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkSparseBufferMemoryBindInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSparseBufferMemoryBindInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #buffer}. */
	public static long nbuffer(long struct) { return memGetLong(struct + VkSparseBufferMemoryBindInfo.BUFFER); }
	/** Unsafe version of {@link #bindCount}. */
	public static int nbindCount(long struct) { return memGetInt(struct + VkSparseBufferMemoryBindInfo.BINDCOUNT); }
	/** Unsafe version of {@link #pBinds}. */
	public static VkSparseMemoryBind.Buffer npBinds(long struct) { return VkSparseMemoryBind.create(memGetAddress(struct + VkSparseBufferMemoryBindInfo.PBINDS), nbindCount(struct)); }

	/** Unsafe version of {@link #buffer(long) buffer}. */
	public static void nbuffer(long struct, long value) { memPutLong(struct + VkSparseBufferMemoryBindInfo.BUFFER, value); }
	/** Sets the specified value to the {@code bindCount} field of the specified {@code struct}. */
	public static void nbindCount(long struct, int value) { memPutInt(struct + VkSparseBufferMemoryBindInfo.BINDCOUNT, value); }
	/** Unsafe version of {@link #pBinds(VkSparseMemoryBind.Buffer) pBinds}. */
	public static void npBinds(long struct, VkSparseMemoryBind.Buffer value) { memPutAddress(struct + VkSparseBufferMemoryBindInfo.PBINDS, value.address()); nbindCount(struct, value.remaining()); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + VkSparseBufferMemoryBindInfo.PBINDS));
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

	/** An array of {@link VkSparseBufferMemoryBindInfo} structs. */
	public static final class Buffer extends StructBuffer<VkSparseBufferMemoryBindInfo, Buffer> {

		/**
		 * Creates a new {@link VkSparseBufferMemoryBindInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkSparseBufferMemoryBindInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkSparseBufferMemoryBindInfo newInstance(long address) {
			return new VkSparseBufferMemoryBindInfo(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code buffer} field. */
		public long buffer() { return VkSparseBufferMemoryBindInfo.nbuffer(address()); }
		/** Returns the value of the {@code bindCount} field. */
		public int bindCount() { return VkSparseBufferMemoryBindInfo.nbindCount(address()); }
		/** Returns a {@link VkSparseMemoryBind.Buffer} view of the struct array pointed to by the {@code pBinds} field. */
		public VkSparseMemoryBind.Buffer pBinds() { return VkSparseBufferMemoryBindInfo.npBinds(address()); }

		/** Sets the specified value to the {@code buffer} field. */
		public VkSparseBufferMemoryBindInfo.Buffer buffer(long value) { VkSparseBufferMemoryBindInfo.nbuffer(address(), value); return this; }
		/** Sets the address of the specified {@link VkSparseMemoryBind.Buffer} to the {@code pBinds} field. */
		public VkSparseBufferMemoryBindInfo.Buffer pBinds(VkSparseMemoryBind.Buffer value) { VkSparseBufferMemoryBindInfo.npBinds(address(), value); return this; }

	}

}