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
 * Structure describing the fine-grained features that can be supported by an implementation.
 * 
 * <h5>Description</h5>
 * 
 * <ul>
 * <li>{@code sType} is the type of this structure.</li>
 * <li>{@code pNext} is {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code features} is a structure of type {@link VkPhysicalDeviceFeatures} describing the fine-grained features of the Vulkan 1.0 API.</li>
 * </ul>
 * 
 * <p>The {@code pNext} chain of this structure is used to extend the structure with features defined by extensions. This structure <b>can</b> be used in {@link KHRGetPhysicalDeviceProperties2#vkGetPhysicalDeviceFeatures2KHR GetPhysicalDeviceFeatures2KHR} or <b>can</b> be in the {@code pNext} chain of a {@link VkDeviceCreateInfo} structure, in which case it controls which features are enabled in the device in lieu of {@code pEnabledFeatures}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHRGetPhysicalDeviceProperties2#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2_KHR STRUCTURE_TYPE_PHYSICAL_DEVICE_FEATURES_2_KHR}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkPhysicalDeviceFeatures}, {@link KHRGetPhysicalDeviceProperties2#vkGetPhysicalDeviceFeatures2KHR GetPhysicalDeviceFeatures2KHR}</p>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkPhysicalDeviceFeatures2KHR {
    VkStructureType sType;
    void * pNext;
    {@link VkPhysicalDeviceFeatures VkPhysicalDeviceFeatures} features;
}</code></pre>
 */
public class VkPhysicalDeviceFeatures2KHR extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FEATURES;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(VkPhysicalDeviceFeatures.SIZEOF, VkPhysicalDeviceFeatures.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FEATURES = layout.offsetof(2);
	}

	VkPhysicalDeviceFeatures2KHR(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkPhysicalDeviceFeatures2KHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkPhysicalDeviceFeatures2KHR(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns a {@link VkPhysicalDeviceFeatures} view of the {@code features} field. */
	public VkPhysicalDeviceFeatures features() { return nfeatures(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkPhysicalDeviceFeatures2KHR sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkPhysicalDeviceFeatures2KHR pNext(long value) { npNext(address(), value); return this; }
	/** Copies the specified {@link VkPhysicalDeviceFeatures} to the {@code features} field. */
	public VkPhysicalDeviceFeatures2KHR features(VkPhysicalDeviceFeatures value) { nfeatures(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkPhysicalDeviceFeatures2KHR set(
		int sType,
		long pNext,
		VkPhysicalDeviceFeatures features
	) {
		sType(sType);
		pNext(pNext);
		features(features);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VkPhysicalDeviceFeatures2KHR set(VkPhysicalDeviceFeatures2KHR src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link VkPhysicalDeviceFeatures2KHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkPhysicalDeviceFeatures2KHR malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkPhysicalDeviceFeatures2KHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkPhysicalDeviceFeatures2KHR calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkPhysicalDeviceFeatures2KHR} instance allocated with {@link BufferUtils}. */
	public static VkPhysicalDeviceFeatures2KHR create() {
		return new VkPhysicalDeviceFeatures2KHR(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkPhysicalDeviceFeatures2KHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkPhysicalDeviceFeatures2KHR create(long address) {
		return address == NULL ? null : new VkPhysicalDeviceFeatures2KHR(address, null);
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceFeatures2KHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceFeatures2KHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceFeatures2KHR.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkPhysicalDeviceFeatures2KHR.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkPhysicalDeviceFeatures2KHR} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkPhysicalDeviceFeatures2KHR mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkPhysicalDeviceFeatures2KHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkPhysicalDeviceFeatures2KHR callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceFeatures2KHR} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPhysicalDeviceFeatures2KHR mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceFeatures2KHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPhysicalDeviceFeatures2KHR callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceFeatures2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceFeatures2KHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceFeatures2KHR.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceFeatures2KHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceFeatures2KHR.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceFeatures2KHR.PNEXT); }
	/** Unsafe version of {@link #features}. */
	public static VkPhysicalDeviceFeatures nfeatures(long struct) { return VkPhysicalDeviceFeatures.create(struct + VkPhysicalDeviceFeatures2KHR.FEATURES); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceFeatures2KHR.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceFeatures2KHR.PNEXT, value); }
	/** Unsafe version of {@link #features(VkPhysicalDeviceFeatures) features}. */
	public static void nfeatures(long struct, VkPhysicalDeviceFeatures value) { memCopy(value.address(), struct + VkPhysicalDeviceFeatures2KHR.FEATURES, VkPhysicalDeviceFeatures.SIZEOF); }

	// -----------------------------------

	/** An array of {@link VkPhysicalDeviceFeatures2KHR} structs. */
	public static class Buffer extends StructBuffer<VkPhysicalDeviceFeatures2KHR, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkPhysicalDeviceFeatures2KHR.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkPhysicalDeviceFeatures2KHR#SIZEOF}, and its mark will be undefined.
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
		protected VkPhysicalDeviceFeatures2KHR newInstance(long address) {
			return new VkPhysicalDeviceFeatures2KHR(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkPhysicalDeviceFeatures2KHR.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkPhysicalDeviceFeatures2KHR.npNext(address()); }
		/** Returns a {@link VkPhysicalDeviceFeatures} view of the {@code features} field. */
		public VkPhysicalDeviceFeatures features() { return VkPhysicalDeviceFeatures2KHR.nfeatures(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkPhysicalDeviceFeatures2KHR.Buffer sType(int value) { VkPhysicalDeviceFeatures2KHR.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkPhysicalDeviceFeatures2KHR.Buffer pNext(long value) { VkPhysicalDeviceFeatures2KHR.npNext(address(), value); return this; }
		/** Copies the specified {@link VkPhysicalDeviceFeatures} to the {@code features} field. */
		public VkPhysicalDeviceFeatures2KHR.Buffer features(VkPhysicalDeviceFeatures value) { VkPhysicalDeviceFeatures2KHR.nfeatures(address(), value); return this; }

	}

}