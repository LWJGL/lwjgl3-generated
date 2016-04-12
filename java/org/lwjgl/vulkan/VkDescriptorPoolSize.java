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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkDescriptorPoolSize.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkDescriptorPoolSize">Vulkan Specification</a>
 * 
 * <p>Contains a descriptor type and number of descriptors of that type to be allocated in a pool.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be a valid {@code VkDescriptorType} value</li>
 * <li>{@code descriptorCount} <b>must</b> be greater than 0</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code type} &ndash; the type of descriptor. One of:<br><table><tr><td>{@link VK10#VK_DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER DESCRIPTOR_TYPE_COMBINED_IMAGE_SAMPLER}</td><td>{@link VK10#VK_DESCRIPTOR_TYPE_INPUT_ATTACHMENT DESCRIPTOR_TYPE_INPUT_ATTACHMENT}</td></tr><tr><td>{@link VK10#VK_DESCRIPTOR_TYPE_SAMPLED_IMAGE DESCRIPTOR_TYPE_SAMPLED_IMAGE}</td><td>{@link VK10#VK_DESCRIPTOR_TYPE_SAMPLER DESCRIPTOR_TYPE_SAMPLER}</td></tr><tr><td>{@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER DESCRIPTOR_TYPE_STORAGE_BUFFER}</td><td>{@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC DESCRIPTOR_TYPE_STORAGE_BUFFER_DYNAMIC}</td></tr><tr><td>{@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_IMAGE DESCRIPTOR_TYPE_STORAGE_IMAGE}</td><td>{@link VK10#VK_DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER DESCRIPTOR_TYPE_STORAGE_TEXEL_BUFFER}</td></tr><tr><td>{@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER DESCRIPTOR_TYPE_UNIFORM_BUFFER}</td><td>{@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC DESCRIPTOR_TYPE_UNIFORM_BUFFER_DYNAMIC}</td></tr><tr><td>{@link VK10#VK_DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER DESCRIPTOR_TYPE_UNIFORM_TEXEL_BUFFER}</td></tr></table></li>
 * <li>{@code descriptorCount} &ndash; the number of descriptors of that type to allocate</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkDescriptorPoolSize {
    VkDescriptorType type;
    uint32_t descriptorCount;
}</code></pre>
 */
public class VkDescriptorPoolSize extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		TYPE,
		DESCRIPTORCOUNT;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		TYPE = layout.offsetof(0);
		DESCRIPTORCOUNT = layout.offsetof(1);
	}

	VkDescriptorPoolSize(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDescriptorPoolSize} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDescriptorPoolSize(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code type} field. */
	public int type() { return ntype(address()); }
	/** Returns the value of the {@code descriptorCount} field. */
	public int descriptorCount() { return ndescriptorCount(address()); }

	/** Sets the specified value to the {@code type} field. */
	public VkDescriptorPoolSize type(int value) { ntype(address(), value); return this; }
	/** Sets the specified value to the {@code descriptorCount} field. */
	public VkDescriptorPoolSize descriptorCount(int value) { ndescriptorCount(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkDescriptorPoolSize set(
		int type,
		int descriptorCount
	) {
		type(type);
		descriptorCount(descriptorCount);

		return this;
	}

	/** Unsafe version of {@link #set(VkDescriptorPoolSize) set}. */
	public VkDescriptorPoolSize nset(long struct) {
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
	public VkDescriptorPoolSize set(VkDescriptorPoolSize src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkDescriptorPoolSize} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkDescriptorPoolSize malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDescriptorPoolSize} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkDescriptorPoolSize calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDescriptorPoolSize} instance allocated with {@link BufferUtils}. */
	public static VkDescriptorPoolSize create() {
		return new VkDescriptorPoolSize(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDescriptorPoolSize} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDescriptorPoolSize create(long address) {
		return address == NULL ? null : new VkDescriptorPoolSize(address, null);
	}

	/**
	 * Returns a new {@link VkDescriptorPoolSize.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDescriptorPoolSize.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDescriptorPoolSize.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDescriptorPoolSize.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkDescriptorPoolSize} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkDescriptorPoolSize mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkDescriptorPoolSize} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkDescriptorPoolSize callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkDescriptorPoolSize} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDescriptorPoolSize mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDescriptorPoolSize} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDescriptorPoolSize callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDescriptorPoolSize.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDescriptorPoolSize.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDescriptorPoolSize.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDescriptorPoolSize.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #type}. */
	public static int ntype(long struct) { return memGetInt(struct + VkDescriptorPoolSize.TYPE); }
	/** Unsafe version of {@link #descriptorCount}. */
	public static int ndescriptorCount(long struct) { return memGetInt(struct + VkDescriptorPoolSize.DESCRIPTORCOUNT); }

	/** Unsafe version of {@link #type(int) type}. */
	public static void ntype(long struct, int value) { memPutInt(struct + VkDescriptorPoolSize.TYPE, value); }
	/** Unsafe version of {@link #descriptorCount(int) descriptorCount}. */
	public static void ndescriptorCount(long struct, int value) { memPutInt(struct + VkDescriptorPoolSize.DESCRIPTORCOUNT, value); }

	// -----------------------------------

	/** An array of {@link VkDescriptorPoolSize} structs. */
	public static final class Buffer extends StructBuffer<VkDescriptorPoolSize, Buffer> {

		/**
		 * Creates a new {@link VkDescriptorPoolSize.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDescriptorPoolSize#SIZEOF}, and its mark will be undefined.
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
		protected VkDescriptorPoolSize newInstance(long address) {
			return new VkDescriptorPoolSize(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code type} field. */
		public int type() { return VkDescriptorPoolSize.ntype(address()); }
		/** Returns the value of the {@code descriptorCount} field. */
		public int descriptorCount() { return VkDescriptorPoolSize.ndescriptorCount(address()); }

		/** Sets the specified value to the {@code type} field. */
		public VkDescriptorPoolSize.Buffer type(int value) { VkDescriptorPoolSize.ntype(address(), value); return this; }
		/** Sets the specified value to the {@code descriptorCount} field. */
		public VkDescriptorPoolSize.Buffer descriptorCount(int value) { VkDescriptorPoolSize.ndescriptorCount(address(), value); return this; }

	}

}