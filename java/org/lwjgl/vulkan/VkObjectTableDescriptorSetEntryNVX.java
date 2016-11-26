/*
 * Copyright LWJGL. All rights reserved.
 * License terms: https://www.lwjgl.org/license
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * (no short description available).
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code type} must be {@link NVXDeviceGeneratedCommands#VK_OBJECT_ENTRY_DESCRIPTOR_SET_NVX OBJECT_ENTRY_DESCRIPTOR_SET_NVX}</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code type} <b>must</b> be a valid {@code VkObjectEntryTypeNVX} value</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkObjectEntryUsageFlagBitsNVX} values</li>
 * <li>{@code flags} <b>must</b> not be 0</li>
 * <li>{@code pipelineLayout} <b>must</b> be a valid {@code VkPipelineLayout} handle</li>
 * <li>{@code descriptorSet} <b>must</b> be a valid {@code VkDescriptorSet} handle</li>
 * <li>Both of {@code descriptorSet}, and {@code pipelineLayout} <b>must</b> have been created, allocated, or retrieved from the same {@code VkDevice}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code descriptorSet} &ndash; specifies the {@code VkDescriptorSet} that can be bound with this entry.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkObjectTableDescriptorSetEntryNVX {
    VkObjectEntryTypeNVX type;
    VkObjectEntryUsageFlagsNVX flags;
    VkPipelineLayout pipelineLayout;
    VkDescriptorSet descriptorSet;
}</code></pre>
 */
public class VkObjectTableDescriptorSetEntryNVX extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		TYPE,
		FLAGS,
		PIPELINELAYOUT,
		DESCRIPTORSET;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(8),
			__member(8)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		TYPE = layout.offsetof(0);
		FLAGS = layout.offsetof(1);
		PIPELINELAYOUT = layout.offsetof(2);
		DESCRIPTORSET = layout.offsetof(3);
	}

	VkObjectTableDescriptorSetEntryNVX(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkObjectTableDescriptorSetEntryNVX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkObjectTableDescriptorSetEntryNVX(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code type} field. */
	public int type() { return ntype(address()); }
	/** Returns the value of the {@code flags} field. */
	public int flags() { return nflags(address()); }
	/** Returns the value of the {@code pipelineLayout} field. */
	public long pipelineLayout() { return npipelineLayout(address()); }
	/** Returns the value of the {@code descriptorSet} field. */
	public long descriptorSet() { return ndescriptorSet(address()); }

	/** Sets the specified value to the {@code type} field. */
	public VkObjectTableDescriptorSetEntryNVX type(int value) { ntype(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkObjectTableDescriptorSetEntryNVX flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code pipelineLayout} field. */
	public VkObjectTableDescriptorSetEntryNVX pipelineLayout(long value) { npipelineLayout(address(), value); return this; }
	/** Sets the specified value to the {@code descriptorSet} field. */
	public VkObjectTableDescriptorSetEntryNVX descriptorSet(long value) { ndescriptorSet(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkObjectTableDescriptorSetEntryNVX set(
		int type,
		int flags,
		long pipelineLayout,
		long descriptorSet
	) {
		type(type);
		flags(flags);
		pipelineLayout(pipelineLayout);
		descriptorSet(descriptorSet);

		return this;
	}

	/** Unsafe version of {@link #set(VkObjectTableDescriptorSetEntryNVX) set}. */
	public VkObjectTableDescriptorSetEntryNVX nset(long struct) {
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
	public VkObjectTableDescriptorSetEntryNVX set(VkObjectTableDescriptorSetEntryNVX src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkObjectTableDescriptorSetEntryNVX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkObjectTableDescriptorSetEntryNVX malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkObjectTableDescriptorSetEntryNVX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkObjectTableDescriptorSetEntryNVX calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkObjectTableDescriptorSetEntryNVX} instance allocated with {@link BufferUtils}. */
	public static VkObjectTableDescriptorSetEntryNVX create() {
		return new VkObjectTableDescriptorSetEntryNVX(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkObjectTableDescriptorSetEntryNVX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkObjectTableDescriptorSetEntryNVX create(long address) {
		return address == NULL ? null : new VkObjectTableDescriptorSetEntryNVX(address, null);
	}

	/**
	 * Returns a new {@link VkObjectTableDescriptorSetEntryNVX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkObjectTableDescriptorSetEntryNVX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkObjectTableDescriptorSetEntryNVX.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkObjectTableDescriptorSetEntryNVX.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkObjectTableDescriptorSetEntryNVX} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkObjectTableDescriptorSetEntryNVX mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkObjectTableDescriptorSetEntryNVX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkObjectTableDescriptorSetEntryNVX callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkObjectTableDescriptorSetEntryNVX} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkObjectTableDescriptorSetEntryNVX mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkObjectTableDescriptorSetEntryNVX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkObjectTableDescriptorSetEntryNVX callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkObjectTableDescriptorSetEntryNVX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkObjectTableDescriptorSetEntryNVX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkObjectTableDescriptorSetEntryNVX.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkObjectTableDescriptorSetEntryNVX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #type}. */
	public static int ntype(long struct) { return memGetInt(struct + VkObjectTableDescriptorSetEntryNVX.TYPE); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkObjectTableDescriptorSetEntryNVX.FLAGS); }
	/** Unsafe version of {@link #pipelineLayout}. */
	public static long npipelineLayout(long struct) { return memGetLong(struct + VkObjectTableDescriptorSetEntryNVX.PIPELINELAYOUT); }
	/** Unsafe version of {@link #descriptorSet}. */
	public static long ndescriptorSet(long struct) { return memGetLong(struct + VkObjectTableDescriptorSetEntryNVX.DESCRIPTORSET); }

	/** Unsafe version of {@link #type(int) type}. */
	public static void ntype(long struct, int value) { memPutInt(struct + VkObjectTableDescriptorSetEntryNVX.TYPE, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkObjectTableDescriptorSetEntryNVX.FLAGS, value); }
	/** Unsafe version of {@link #pipelineLayout(long) pipelineLayout}. */
	public static void npipelineLayout(long struct, long value) { memPutLong(struct + VkObjectTableDescriptorSetEntryNVX.PIPELINELAYOUT, value); }
	/** Unsafe version of {@link #descriptorSet(long) descriptorSet}. */
	public static void ndescriptorSet(long struct, long value) { memPutLong(struct + VkObjectTableDescriptorSetEntryNVX.DESCRIPTORSET, value); }

	// -----------------------------------

	/** An array of {@link VkObjectTableDescriptorSetEntryNVX} structs. */
	public static class Buffer extends StructBuffer<VkObjectTableDescriptorSetEntryNVX, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkObjectTableDescriptorSetEntryNVX.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkObjectTableDescriptorSetEntryNVX#SIZEOF}, and its mark will be undefined.
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
		protected VkObjectTableDescriptorSetEntryNVX newInstance(long address) {
			return new VkObjectTableDescriptorSetEntryNVX(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code type} field. */
		public int type() { return VkObjectTableDescriptorSetEntryNVX.ntype(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkObjectTableDescriptorSetEntryNVX.nflags(address()); }
		/** Returns the value of the {@code pipelineLayout} field. */
		public long pipelineLayout() { return VkObjectTableDescriptorSetEntryNVX.npipelineLayout(address()); }
		/** Returns the value of the {@code descriptorSet} field. */
		public long descriptorSet() { return VkObjectTableDescriptorSetEntryNVX.ndescriptorSet(address()); }

		/** Sets the specified value to the {@code type} field. */
		public VkObjectTableDescriptorSetEntryNVX.Buffer type(int value) { VkObjectTableDescriptorSetEntryNVX.ntype(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkObjectTableDescriptorSetEntryNVX.Buffer flags(int value) { VkObjectTableDescriptorSetEntryNVX.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code pipelineLayout} field. */
		public VkObjectTableDescriptorSetEntryNVX.Buffer pipelineLayout(long value) { VkObjectTableDescriptorSetEntryNVX.npipelineLayout(address(), value); return this; }
		/** Sets the specified value to the {@code descriptorSet} field. */
		public VkObjectTableDescriptorSetEntryNVX.Buffer descriptorSet(long value) { VkObjectTableDescriptorSetEntryNVX.ndescriptorSet(address(), value); return this; }

	}

}