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
 * Structure describing push descriptor limits that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <ul>
 * <li>{@code maxPushDescriptors} is the maximum number of descriptors that <b>can</b> be used in a descriptor set created with {@link KHRPushDescriptor#VK_DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR DESCRIPTOR_SET_LAYOUT_CREATE_PUSH_DESCRIPTOR_BIT_KHR} set.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRPushDescriptor#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_PUSH_DESCRIPTOR_PROPERTIES_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkPhysicalDevicePushDescriptorPropertiesKHR {
    VkStructureType sType;
    void * pNext;
    uint32_t maxPushDescriptors;
}</code></pre>
 */
public class VkPhysicalDevicePushDescriptorPropertiesKHR extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		MAXPUSHDESCRIPTORS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		MAXPUSHDESCRIPTORS = layout.offsetof(2);
	}

	VkPhysicalDevicePushDescriptorPropertiesKHR(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkPhysicalDevicePushDescriptorPropertiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkPhysicalDevicePushDescriptorPropertiesKHR(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code maxPushDescriptors} field. */
	public int maxPushDescriptors() { return nmaxPushDescriptors(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkPhysicalDevicePushDescriptorPropertiesKHR sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkPhysicalDevicePushDescriptorPropertiesKHR pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code maxPushDescriptors} field. */
	public VkPhysicalDevicePushDescriptorPropertiesKHR maxPushDescriptors(int value) { nmaxPushDescriptors(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkPhysicalDevicePushDescriptorPropertiesKHR set(
		int sType,
		long pNext,
		int maxPushDescriptors
	) {
		sType(sType);
		pNext(pNext);
		maxPushDescriptors(maxPushDescriptors);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VkPhysicalDevicePushDescriptorPropertiesKHR set(VkPhysicalDevicePushDescriptorPropertiesKHR src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link VkPhysicalDevicePushDescriptorPropertiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkPhysicalDevicePushDescriptorPropertiesKHR malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkPhysicalDevicePushDescriptorPropertiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkPhysicalDevicePushDescriptorPropertiesKHR calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkPhysicalDevicePushDescriptorPropertiesKHR} instance allocated with {@link BufferUtils}. */
	public static VkPhysicalDevicePushDescriptorPropertiesKHR create() {
		return new VkPhysicalDevicePushDescriptorPropertiesKHR(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkPhysicalDevicePushDescriptorPropertiesKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkPhysicalDevicePushDescriptorPropertiesKHR create(long address) {
		return address == NULL ? null : new VkPhysicalDevicePushDescriptorPropertiesKHR(address, null);
	}

	/**
	 * Returns a new {@link VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkPhysicalDevicePushDescriptorPropertiesKHR} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkPhysicalDevicePushDescriptorPropertiesKHR mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkPhysicalDevicePushDescriptorPropertiesKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkPhysicalDevicePushDescriptorPropertiesKHR callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkPhysicalDevicePushDescriptorPropertiesKHR} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPhysicalDevicePushDescriptorPropertiesKHR mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPhysicalDevicePushDescriptorPropertiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPhysicalDevicePushDescriptorPropertiesKHR callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDevicePushDescriptorPropertiesKHR.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDevicePushDescriptorPropertiesKHR.PNEXT); }
	/** Unsafe version of {@link #maxPushDescriptors}. */
	public static int nmaxPushDescriptors(long struct) { return memGetInt(struct + VkPhysicalDevicePushDescriptorPropertiesKHR.MAXPUSHDESCRIPTORS); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDevicePushDescriptorPropertiesKHR.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDevicePushDescriptorPropertiesKHR.PNEXT, value); }
	/** Unsafe version of {@link #maxPushDescriptors(int) maxPushDescriptors}. */
	public static void nmaxPushDescriptors(long struct, int value) { memPutInt(struct + VkPhysicalDevicePushDescriptorPropertiesKHR.MAXPUSHDESCRIPTORS, value); }

	// -----------------------------------

	/** An array of {@link VkPhysicalDevicePushDescriptorPropertiesKHR} structs. */
	public static class Buffer extends StructBuffer<VkPhysicalDevicePushDescriptorPropertiesKHR, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkPhysicalDevicePushDescriptorPropertiesKHR#SIZEOF}, and its mark will be undefined.
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
		protected VkPhysicalDevicePushDescriptorPropertiesKHR newInstance(long address) {
			return new VkPhysicalDevicePushDescriptorPropertiesKHR(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkPhysicalDevicePushDescriptorPropertiesKHR.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkPhysicalDevicePushDescriptorPropertiesKHR.npNext(address()); }
		/** Returns the value of the {@code maxPushDescriptors} field. */
		public int maxPushDescriptors() { return VkPhysicalDevicePushDescriptorPropertiesKHR.nmaxPushDescriptors(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer sType(int value) { VkPhysicalDevicePushDescriptorPropertiesKHR.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer pNext(long value) { VkPhysicalDevicePushDescriptorPropertiesKHR.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code maxPushDescriptors} field. */
		public VkPhysicalDevicePushDescriptorPropertiesKHR.Buffer maxPushDescriptors(int value) { VkPhysicalDevicePushDescriptorPropertiesKHR.nmaxPushDescriptors(address(), value); return this; }

	}

}