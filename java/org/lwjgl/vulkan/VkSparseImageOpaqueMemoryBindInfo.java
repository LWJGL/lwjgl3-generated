/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkSparseImageOpaqueMemoryBindInfo.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkSparseImageOpaqueMemoryBindInfo">Vulkan Specification</a>
 * 
 * <p>Describes a memory binding to an opaque region of a {@code VkImage} object.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code image} <b>must</b> be a valid {@code VkImage} handle</li>
 * <li>{@code pBinds} <b>must</b> be a pointer to an array of {@code bindCount} valid {@link VkSparseMemoryBind} structures</li>
 * <li>{@code bindCount} <b>must</b> be greater than 0</li>
 * <li>For any given element of {@code pBinds}, if the {@code flags} member of that element contains {@link VK10#VK_SPARSE_MEMORY_BIND_METADATA_BIT SPARSE_MEMORY_BIND_METADATA_BIT}, the binding range
 * defined <b>must</b> be within the mip tail region of the metadata aspect of {@code image}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code image} &ndash; the {@code VkImage} object to be bound</li>
 * <li>{@code bindCount} &ndash; the number of {@code VkSparseMemoryBind} structures in the {@code pBinds} array</li>
 * <li>{@code pBinds} &ndash;  a pointer to array of {@link VkSparseMemoryBind} structures</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkSparseImageOpaqueMemoryBindInfo {
    VkImage image;
    uint32_t bindCount;
    const VkSparseMemoryBind * pBinds;
}</code></pre>
 */
public class VkSparseImageOpaqueMemoryBindInfo extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		IMAGE,
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

		IMAGE = layout.offsetof(0);
		BINDCOUNT = layout.offsetof(1);
		PBINDS = layout.offsetof(2);
	}

	VkSparseImageOpaqueMemoryBindInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkSparseImageOpaqueMemoryBindInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkSparseImageOpaqueMemoryBindInfo(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code image} field. */
	public long image() { return nimage(address()); }
	/** Returns the value of the {@code bindCount} field. */
	public int bindCount() { return nbindCount(address()); }
	/** Returns a {@link VkSparseMemoryBind.Buffer} view of the struct array pointed to by the {@code pBinds} field. */
	public VkSparseMemoryBind.Buffer pBinds() { return npBinds(address()); }

	/** Sets the specified value to the {@code image} field. */
	public VkSparseImageOpaqueMemoryBindInfo image(long value) { nimage(address(), value); return this; }
	/** Sets the address of the specified {@link VkSparseMemoryBind.Buffer} to the {@code pBinds} field. */
	public VkSparseImageOpaqueMemoryBindInfo pBinds(VkSparseMemoryBind.Buffer value) { npBinds(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkSparseImageOpaqueMemoryBindInfo set(
		long image,
		VkSparseMemoryBind.Buffer pBinds
	) {
		image(image);
		pBinds(pBinds);

		return this;
	}

	/** Unsafe version of {@link #set(VkSparseImageOpaqueMemoryBindInfo) set}. */
	public VkSparseImageOpaqueMemoryBindInfo nset(long struct) {
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
	public VkSparseImageOpaqueMemoryBindInfo set(VkSparseImageOpaqueMemoryBindInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkSparseImageOpaqueMemoryBindInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkSparseImageOpaqueMemoryBindInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkSparseImageOpaqueMemoryBindInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkSparseImageOpaqueMemoryBindInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkSparseImageOpaqueMemoryBindInfo} instance allocated with {@link BufferUtils}. */
	public static VkSparseImageOpaqueMemoryBindInfo create() {
		return new VkSparseImageOpaqueMemoryBindInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkSparseImageOpaqueMemoryBindInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkSparseImageOpaqueMemoryBindInfo create(long address) {
		return address == NULL ? null : new VkSparseImageOpaqueMemoryBindInfo(address, null);
	}

	/**
	 * Returns a new {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkSparseImageOpaqueMemoryBindInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkSparseImageOpaqueMemoryBindInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkSparseImageOpaqueMemoryBindInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkSparseImageOpaqueMemoryBindInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkSparseImageOpaqueMemoryBindInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkSparseImageOpaqueMemoryBindInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkSparseImageOpaqueMemoryBindInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkSparseImageOpaqueMemoryBindInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #image}. */
	public static long nimage(long struct) { return memGetLong(struct + VkSparseImageOpaqueMemoryBindInfo.IMAGE); }
	/** Unsafe version of {@link #bindCount}. */
	public static int nbindCount(long struct) { return memGetInt(struct + VkSparseImageOpaqueMemoryBindInfo.BINDCOUNT); }
	/** Unsafe version of {@link #pBinds}. */
	public static VkSparseMemoryBind.Buffer npBinds(long struct) { return VkSparseMemoryBind.create(memGetAddress(struct + VkSparseImageOpaqueMemoryBindInfo.PBINDS), nbindCount(struct)); }

	/** Unsafe version of {@link #image(long) image}. */
	public static void nimage(long struct, long value) { memPutLong(struct + VkSparseImageOpaqueMemoryBindInfo.IMAGE, value); }
	/** Sets the specified value to the {@code bindCount} field of the specified {@code struct}. */
	public static void nbindCount(long struct, int value) { memPutInt(struct + VkSparseImageOpaqueMemoryBindInfo.BINDCOUNT, value); }
	/** Unsafe version of {@link #pBinds(VkSparseMemoryBind.Buffer) pBinds}. */
	public static void npBinds(long struct, VkSparseMemoryBind.Buffer value) { memPutAddress(struct + VkSparseImageOpaqueMemoryBindInfo.PBINDS, value.address()); nbindCount(struct, value.remaining()); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + VkSparseImageOpaqueMemoryBindInfo.PBINDS));
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

	/** An array of {@link VkSparseImageOpaqueMemoryBindInfo} structs. */
	public static final class Buffer extends StructBuffer<VkSparseImageOpaqueMemoryBindInfo, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkSparseImageOpaqueMemoryBindInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkSparseImageOpaqueMemoryBindInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkSparseImageOpaqueMemoryBindInfo newInstance(long address) {
			return new VkSparseImageOpaqueMemoryBindInfo(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code image} field. */
		public long image() { return VkSparseImageOpaqueMemoryBindInfo.nimage(address()); }
		/** Returns the value of the {@code bindCount} field. */
		public int bindCount() { return VkSparseImageOpaqueMemoryBindInfo.nbindCount(address()); }
		/** Returns a {@link VkSparseMemoryBind.Buffer} view of the struct array pointed to by the {@code pBinds} field. */
		public VkSparseMemoryBind.Buffer pBinds() { return VkSparseImageOpaqueMemoryBindInfo.npBinds(address()); }

		/** Sets the specified value to the {@code image} field. */
		public VkSparseImageOpaqueMemoryBindInfo.Buffer image(long value) { VkSparseImageOpaqueMemoryBindInfo.nimage(address(), value); return this; }
		/** Sets the address of the specified {@link VkSparseMemoryBind.Buffer} to the {@code pBinds} field. */
		public VkSparseImageOpaqueMemoryBindInfo.Buffer pBinds(VkSparseMemoryBind.Buffer value) { VkSparseImageOpaqueMemoryBindInfo.npBinds(address(), value); return this; }

	}

}