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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkDescriptorSetLayoutCreateInfo.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkDescriptorSetLayoutCreateInfo">Vulkan Specification</a>
 * 
 * <p>Contains information about how a descriptor set layout should be created.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>If {@code bindingCount} is not 0, {@code pBindings} <b>must</b> be a pointer to an array of {@code bindingCount} valid {@link VkDescriptorSetLayoutBinding}
 * structures</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link VK10#VK_STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO STRUCTURE_TYPE_DESCRIPTOR_SET_LAYOUT_CREATE_INFO}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code flags} &ndash; reserved for future use</li>
 * <li>{@code bindingCount} &ndash; the number of elements in {@code pBindings}</li>
 * <li>{@code pBindings} &ndash; a pointer to an array of {@link VkDescriptorSetLayoutBinding} structures</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkDescriptorSetLayoutCreateInfo {
    VkStructureType sType;
    const void * pNext;
    VkDescriptorSetLayoutCreateFlags flags;
    uint32_t bindingCount;
    const VkDescriptorSetLayoutBinding * pBindings;
}</code></pre>
 */
public class VkDescriptorSetLayoutCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		BINDINGCOUNT,
		PBINDINGS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		BINDINGCOUNT = layout.offsetof(3);
		PBINDINGS = layout.offsetof(4);
	}

	VkDescriptorSetLayoutCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDescriptorSetLayoutCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDescriptorSetLayoutCreateInfo(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code flags} field. */
	public int flags() { return nflags(address()); }
	/** Returns the value of the {@code bindingCount} field. */
	public int bindingCount() { return nbindingCount(address()); }
	/** Returns a {@link VkDescriptorSetLayoutBinding.Buffer} view of the struct array pointed to by the {@code pBindings} field. */
	public VkDescriptorSetLayoutBinding.Buffer pBindings() { return npBindings(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkDescriptorSetLayoutCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkDescriptorSetLayoutCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkDescriptorSetLayoutCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the address of the specified {@link VkDescriptorSetLayoutBinding.Buffer} to the {@code pBindings} field. */
	public VkDescriptorSetLayoutCreateInfo pBindings(VkDescriptorSetLayoutBinding.Buffer value) { npBindings(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkDescriptorSetLayoutCreateInfo set(
		int sType,
		long pNext,
		int flags,
		VkDescriptorSetLayoutBinding.Buffer pBindings
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		pBindings(pBindings);

		return this;
	}

	/** Unsafe version of {@link #set(VkDescriptorSetLayoutCreateInfo) set}. */
	public VkDescriptorSetLayoutCreateInfo nset(long struct) {
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
	public VkDescriptorSetLayoutCreateInfo set(VkDescriptorSetLayoutCreateInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkDescriptorSetLayoutCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkDescriptorSetLayoutCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDescriptorSetLayoutCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkDescriptorSetLayoutCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDescriptorSetLayoutCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkDescriptorSetLayoutCreateInfo create() {
		return new VkDescriptorSetLayoutCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDescriptorSetLayoutCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDescriptorSetLayoutCreateInfo create(long address) {
		return address == NULL ? null : new VkDescriptorSetLayoutCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkDescriptorSetLayoutCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDescriptorSetLayoutCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDescriptorSetLayoutCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDescriptorSetLayoutCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkDescriptorSetLayoutCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkDescriptorSetLayoutCreateInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkDescriptorSetLayoutCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkDescriptorSetLayoutCreateInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkDescriptorSetLayoutCreateInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDescriptorSetLayoutCreateInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDescriptorSetLayoutCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDescriptorSetLayoutCreateInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDescriptorSetLayoutCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDescriptorSetLayoutCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDescriptorSetLayoutCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDescriptorSetLayoutCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkDescriptorSetLayoutCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkDescriptorSetLayoutCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkDescriptorSetLayoutCreateInfo.FLAGS); }
	/** Unsafe version of {@link #bindingCount}. */
	public static int nbindingCount(long struct) { return memGetInt(struct + VkDescriptorSetLayoutCreateInfo.BINDINGCOUNT); }
	/** Unsafe version of {@link #pBindings}. */
	public static VkDescriptorSetLayoutBinding.Buffer npBindings(long struct) { return VkDescriptorSetLayoutBinding.create(memGetAddress(struct + VkDescriptorSetLayoutCreateInfo.PBINDINGS), nbindingCount(struct)); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkDescriptorSetLayoutCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkDescriptorSetLayoutCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkDescriptorSetLayoutCreateInfo.FLAGS, value); }
	/** Sets the specified value to the {@code bindingCount} field of the specified {@code struct}. */
	public static void nbindingCount(long struct, int value) { memPutInt(struct + VkDescriptorSetLayoutCreateInfo.BINDINGCOUNT, value); }
	/** Unsafe version of {@link #pBindings(VkDescriptorSetLayoutBinding.Buffer) pBindings}. */
	public static void npBindings(long struct, VkDescriptorSetLayoutBinding.Buffer value) { memPutAddress(struct + VkDescriptorSetLayoutCreateInfo.PBINDINGS, addressSafe(value)); nbindingCount(struct, value == null ? 0 : value.remaining()); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		if ( nbindingCount(struct) != 0 )
			checkPointer(memGetAddress(struct + VkDescriptorSetLayoutCreateInfo.PBINDINGS));
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

	/** An array of {@link VkDescriptorSetLayoutCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkDescriptorSetLayoutCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkDescriptorSetLayoutCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDescriptorSetLayoutCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkDescriptorSetLayoutCreateInfo newInstance(long address) {
			return new VkDescriptorSetLayoutCreateInfo(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkDescriptorSetLayoutCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkDescriptorSetLayoutCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkDescriptorSetLayoutCreateInfo.nflags(address()); }
		/** Returns the value of the {@code bindingCount} field. */
		public int bindingCount() { return VkDescriptorSetLayoutCreateInfo.nbindingCount(address()); }
		/** Returns a {@link VkDescriptorSetLayoutBinding.Buffer} view of the struct array pointed to by the {@code pBindings} field. */
		public VkDescriptorSetLayoutBinding.Buffer pBindings() { return VkDescriptorSetLayoutCreateInfo.npBindings(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkDescriptorSetLayoutCreateInfo.Buffer sType(int value) { VkDescriptorSetLayoutCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkDescriptorSetLayoutCreateInfo.Buffer pNext(long value) { VkDescriptorSetLayoutCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkDescriptorSetLayoutCreateInfo.Buffer flags(int value) { VkDescriptorSetLayoutCreateInfo.nflags(address(), value); return this; }
		/** Sets the address of the specified {@link VkDescriptorSetLayoutBinding.Buffer} to the {@code pBindings} field. */
		public VkDescriptorSetLayoutCreateInfo.Buffer pBindings(VkDescriptorSetLayoutBinding.Buffer value) { VkDescriptorSetLayoutCreateInfo.npBindings(address(), value); return this; }

	}

}