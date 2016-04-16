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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkAllocationCallbacks.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#memory-allocation">Vulkan Specification</a>
 * 
 * <p>Contains pointers to callback functions that are used to create, reallocate and free host memory allocations on behalf of a Vulkan implementation.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code pfnAllocation} <b>must</b> be a pointer to a valid user-defined PFN_vkAllocationFunction</li>
 * <li>{@code pfnReallocation} <b>must</b> be a pointer to a valid user-defined PFN_vkReallocationFunction</li>
 * <li>{@code pfnFree} <b>must</b> be a pointer to a valid user-defined PFN_vkFreeFunction</li>
 * <li>If either of {@code pfnInternalAllocation} or {@code pfnInternalFree} is not {@code NULL}, both <b>must</b> be valid callbacks</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code pUserData} &ndash; 
 * a value to be interpreted by the implementation of the callbacks. When any of the callbacks in {@code VkAllocationCallbacks} are called, the Vulkan
 * implementation will pass this value as the first parameter to the callback. This value <b>can</b> vary each time an allocator is passed into a command, even
 * when the same object takes an allocator in multiple commands.</li>
 * <li>{@code pfnAllocation} &ndash; a pointer to an application-defined memory allocation function of type {@code PFN_vkAllocationFunction}</li>
 * <li>{@code pfnReallocation} &ndash; a pointer to an application-defined memory reallocation function of type {@code PFN_vkReallocationFunction}</li>
 * <li>{@code pfnFree} &ndash; a pointer to an application-defined memory free function of type {@code PFN_vkFreeFunction}</li>
 * <li>{@code pfnInternalAllocation} &ndash; 
 * a pointer to an application-defined function that is called by the implementation when the implementation makes internal allocations, and it is of type
 * {@code PFN_vkInternalAllocationNotification}</li>
 * <li>{@code pfnInternalFree} &ndash; 
 * a pointer to an application-defined function that is called by the implementation when the implementation frees internal allocations, and it is of type
 * {@code PFN_vkInternalFreeNotification}</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkAllocationCallbacks {
    void * pUserData;
    PFN_vkAllocationFunction pfnAllocation;
    PFN_vkReallocationFunction pfnReallocation;
    PFN_vkFreeFunction pfnFree;
    PFN_vkInternalAllocationNotification pfnInternalAllocation;
    PFN_vkInternalFreeNotification pfnInternalFree;
}</code></pre>
 */
public class VkAllocationCallbacks extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		PUSERDATA,
		PFNALLOCATION,
		PFNREALLOCATION,
		PFNFREE,
		PFNINTERNALALLOCATION,
		PFNINTERNALFREE;

	static {
		Layout layout = __struct(
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		PUSERDATA = layout.offsetof(0);
		PFNALLOCATION = layout.offsetof(1);
		PFNREALLOCATION = layout.offsetof(2);
		PFNFREE = layout.offsetof(3);
		PFNINTERNALALLOCATION = layout.offsetof(4);
		PFNINTERNALFREE = layout.offsetof(5);
	}

	VkAllocationCallbacks(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkAllocationCallbacks} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkAllocationCallbacks(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code pUserData} field. */
	public long pUserData() { return npUserData(address()); }
	/** Returns the function address at the {@code pfnAllocation} field. */
	public long pfnAllocation() { return npfnAllocation(address()); }
	/** Returns the {@code VkAllocationFunction} instance at the {@code pfnAllocation} field. */
	public VkAllocationFunction pfnAllocationCallback() { return npfnAllocationCallback(address()); }
	/** Returns the function address at the {@code pfnReallocation} field. */
	public long pfnReallocation() { return npfnReallocation(address()); }
	/** Returns the {@code VkReallocationFunction} instance at the {@code pfnReallocation} field. */
	public VkReallocationFunction pfnReallocationCallback() { return npfnReallocationCallback(address()); }
	/** Returns the function address at the {@code pfnFree} field. */
	public long pfnFree() { return npfnFree(address()); }
	/** Returns the {@code VkFreeFunction} instance at the {@code pfnFree} field. */
	public VkFreeFunction pfnFreeCallback() { return npfnFreeCallback(address()); }
	/** Returns the function address at the {@code pfnInternalAllocation} field. */
	public long pfnInternalAllocation() { return npfnInternalAllocation(address()); }
	/** Returns the {@code VkInternalAllocationNotification} instance at the {@code pfnInternalAllocation} field. */
	public VkInternalAllocationNotification pfnInternalAllocationCallback() { return npfnInternalAllocationCallback(address()); }
	/** Returns the function address at the {@code pfnInternalFree} field. */
	public long pfnInternalFree() { return npfnInternalFree(address()); }
	/** Returns the {@code VkInternalFreeNotification} instance at the {@code pfnInternalFree} field. */
	public VkInternalFreeNotification pfnInternalFreeCallback() { return npfnInternalFreeCallback(address()); }

	/** Sets the specified value to the {@code pUserData} field. */
	public VkAllocationCallbacks pUserData(long value) { npUserData(address(), value); return this; }
	/** Sets the specified function address to the {@code pfnAllocation} field. */
	public VkAllocationCallbacks pfnAllocation(long value) { npfnAllocation(address(), value); return this; }
	/** Sets the address of the specified {@link VkAllocationFunction} to the {@code pfnAllocation} field. */
	public VkAllocationCallbacks pfnAllocation(VkAllocationFunction value) { return pfnAllocation(addressSafe(value)); }
	/** Sets the specified function address to the {@code pfnReallocation} field. */
	public VkAllocationCallbacks pfnReallocation(long value) { npfnReallocation(address(), value); return this; }
	/** Sets the address of the specified {@link VkReallocationFunction} to the {@code pfnReallocation} field. */
	public VkAllocationCallbacks pfnReallocation(VkReallocationFunction value) { return pfnReallocation(addressSafe(value)); }
	/** Sets the specified function address to the {@code pfnFree} field. */
	public VkAllocationCallbacks pfnFree(long value) { npfnFree(address(), value); return this; }
	/** Sets the address of the specified {@link VkFreeFunction} to the {@code pfnFree} field. */
	public VkAllocationCallbacks pfnFree(VkFreeFunction value) { return pfnFree(addressSafe(value)); }
	/** Sets the specified function address to the {@code pfnInternalAllocation} field. */
	public VkAllocationCallbacks pfnInternalAllocation(long value) { npfnInternalAllocation(address(), value); return this; }
	/** Sets the address of the specified {@link VkInternalAllocationNotification} to the {@code pfnInternalAllocation} field. */
	public VkAllocationCallbacks pfnInternalAllocation(VkInternalAllocationNotification value) { return pfnInternalAllocation(addressSafe(value)); }
	/** Sets the specified function address to the {@code pfnInternalFree} field. */
	public VkAllocationCallbacks pfnInternalFree(long value) { npfnInternalFree(address(), value); return this; }
	/** Sets the address of the specified {@link VkInternalFreeNotification} to the {@code pfnInternalFree} field. */
	public VkAllocationCallbacks pfnInternalFree(VkInternalFreeNotification value) { return pfnInternalFree(addressSafe(value)); }

	/** Initializes this struct with the specified values. */
	public VkAllocationCallbacks set(
		long pUserData,
		VkAllocationFunction pfnAllocation,
		VkReallocationFunction pfnReallocation,
		VkFreeFunction pfnFree,
		VkInternalAllocationNotification pfnInternalAllocation,
		VkInternalFreeNotification pfnInternalFree
	) {
		pUserData(pUserData);
		pfnAllocation(pfnAllocation);
		pfnReallocation(pfnReallocation);
		pfnFree(pfnFree);
		pfnInternalAllocation(pfnInternalAllocation);
		pfnInternalFree(pfnInternalFree);

		return this;
	}

	/** Unsafe version of {@link #set(VkAllocationCallbacks) set}. */
	public VkAllocationCallbacks nset(long struct) {
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
	public VkAllocationCallbacks set(VkAllocationCallbacks src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkAllocationCallbacks} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkAllocationCallbacks malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkAllocationCallbacks} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkAllocationCallbacks calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkAllocationCallbacks} instance allocated with {@link BufferUtils}. */
	public static VkAllocationCallbacks create() {
		return new VkAllocationCallbacks(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkAllocationCallbacks} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkAllocationCallbacks create(long address) {
		return address == NULL ? null : new VkAllocationCallbacks(address, null);
	}

	/**
	 * Returns a new {@link VkAllocationCallbacks.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkAllocationCallbacks.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkAllocationCallbacks.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkAllocationCallbacks.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkAllocationCallbacks} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkAllocationCallbacks mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkAllocationCallbacks} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkAllocationCallbacks callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkAllocationCallbacks} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkAllocationCallbacks mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkAllocationCallbacks} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkAllocationCallbacks callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkAllocationCallbacks.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkAllocationCallbacks.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkAllocationCallbacks.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkAllocationCallbacks.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #pUserData}. */
	public static long npUserData(long struct) { return memGetAddress(struct + VkAllocationCallbacks.PUSERDATA); }
	/** Unsafe version of {@link #pfnAllocation}. */
	public static long npfnAllocation(long struct) { return memGetAddress(struct + VkAllocationCallbacks.PFNALLOCATION); }
	/** Unsafe version of {@link #pfnAllocationCallback}. */
	public static VkAllocationFunction npfnAllocationCallback(long struct) { return Callback.create(npfnAllocation(struct)); }
	/** Unsafe version of {@link #pfnReallocation}. */
	public static long npfnReallocation(long struct) { return memGetAddress(struct + VkAllocationCallbacks.PFNREALLOCATION); }
	/** Unsafe version of {@link #pfnReallocationCallback}. */
	public static VkReallocationFunction npfnReallocationCallback(long struct) { return Callback.create(npfnReallocation(struct)); }
	/** Unsafe version of {@link #pfnFree}. */
	public static long npfnFree(long struct) { return memGetAddress(struct + VkAllocationCallbacks.PFNFREE); }
	/** Unsafe version of {@link #pfnFreeCallback}. */
	public static VkFreeFunction npfnFreeCallback(long struct) { return Callback.create(npfnFree(struct)); }
	/** Unsafe version of {@link #pfnInternalAllocation}. */
	public static long npfnInternalAllocation(long struct) { return memGetAddress(struct + VkAllocationCallbacks.PFNINTERNALALLOCATION); }
	/** Unsafe version of {@link #pfnInternalAllocationCallback}. */
	public static VkInternalAllocationNotification npfnInternalAllocationCallback(long struct) { return Callback.create(npfnInternalAllocation(struct)); }
	/** Unsafe version of {@link #pfnInternalFree}. */
	public static long npfnInternalFree(long struct) { return memGetAddress(struct + VkAllocationCallbacks.PFNINTERNALFREE); }
	/** Unsafe version of {@link #pfnInternalFreeCallback}. */
	public static VkInternalFreeNotification npfnInternalFreeCallback(long struct) { return Callback.create(npfnInternalFree(struct)); }

	/** Unsafe version of {@link #pUserData(long) pUserData}. */
	public static void npUserData(long struct, long value) { memPutAddress(struct + VkAllocationCallbacks.PUSERDATA, value); }
	/** Unsafe version of {@link #pfnAllocation(long) pfnAllocation}. */
	public static void npfnAllocation(long struct, long value) { memPutAddress(struct + VkAllocationCallbacks.PFNALLOCATION, checkPointer(value)); }
	/** Unsafe version of {@link #pfnReallocation(long) pfnReallocation}. */
	public static void npfnReallocation(long struct, long value) { memPutAddress(struct + VkAllocationCallbacks.PFNREALLOCATION, checkPointer(value)); }
	/** Unsafe version of {@link #pfnFree(long) pfnFree}. */
	public static void npfnFree(long struct, long value) { memPutAddress(struct + VkAllocationCallbacks.PFNFREE, checkPointer(value)); }
	/** Unsafe version of {@link #pfnInternalAllocation(long) pfnInternalAllocation}. */
	public static void npfnInternalAllocation(long struct, long value) { memPutAddress(struct + VkAllocationCallbacks.PFNINTERNALALLOCATION, value); }
	/** Unsafe version of {@link #pfnInternalFree(long) pfnInternalFree}. */
	public static void npfnInternalFree(long struct, long value) { memPutAddress(struct + VkAllocationCallbacks.PFNINTERNALFREE, value); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + VkAllocationCallbacks.PFNALLOCATION));
		checkPointer(memGetAddress(struct + VkAllocationCallbacks.PFNREALLOCATION));
		checkPointer(memGetAddress(struct + VkAllocationCallbacks.PFNFREE));
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

	/** An array of {@link VkAllocationCallbacks} structs. */
	public static final class Buffer extends StructBuffer<VkAllocationCallbacks, Buffer> {

		/**
		 * Creates a new {@link VkAllocationCallbacks.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkAllocationCallbacks#SIZEOF}, and its mark will be undefined.
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
		protected VkAllocationCallbacks newInstance(long address) {
			return new VkAllocationCallbacks(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code pUserData} field. */
		public long pUserData() { return VkAllocationCallbacks.npUserData(address()); }
		/** Returns the function address at the {@code pfnAllocation} field. */
		public long pfnAllocation() { return VkAllocationCallbacks.npfnAllocation(address()); }
		/** Returns the {@code VkAllocationFunction} instance at the {@code pfnAllocation} field. */
		public VkAllocationFunction pfnAllocationCallback() { return VkAllocationCallbacks.npfnAllocationCallback(address()); }
		/** Returns the function address at the {@code pfnReallocation} field. */
		public long pfnReallocation() { return VkAllocationCallbacks.npfnReallocation(address()); }
		/** Returns the {@code VkReallocationFunction} instance at the {@code pfnReallocation} field. */
		public VkReallocationFunction pfnReallocationCallback() { return VkAllocationCallbacks.npfnReallocationCallback(address()); }
		/** Returns the function address at the {@code pfnFree} field. */
		public long pfnFree() { return VkAllocationCallbacks.npfnFree(address()); }
		/** Returns the {@code VkFreeFunction} instance at the {@code pfnFree} field. */
		public VkFreeFunction pfnFreeCallback() { return VkAllocationCallbacks.npfnFreeCallback(address()); }
		/** Returns the function address at the {@code pfnInternalAllocation} field. */
		public long pfnInternalAllocation() { return VkAllocationCallbacks.npfnInternalAllocation(address()); }
		/** Returns the {@code VkInternalAllocationNotification} instance at the {@code pfnInternalAllocation} field. */
		public VkInternalAllocationNotification pfnInternalAllocationCallback() { return VkAllocationCallbacks.npfnInternalAllocationCallback(address()); }
		/** Returns the function address at the {@code pfnInternalFree} field. */
		public long pfnInternalFree() { return VkAllocationCallbacks.npfnInternalFree(address()); }
		/** Returns the {@code VkInternalFreeNotification} instance at the {@code pfnInternalFree} field. */
		public VkInternalFreeNotification pfnInternalFreeCallback() { return VkAllocationCallbacks.npfnInternalFreeCallback(address()); }

		/** Sets the specified value to the {@code pUserData} field. */
		public VkAllocationCallbacks.Buffer pUserData(long value) { VkAllocationCallbacks.npUserData(address(), value); return this; }
		/** Sets the specified function address to the {@code pfnAllocation} field. */
		public VkAllocationCallbacks.Buffer pfnAllocation(long value) { VkAllocationCallbacks.npfnAllocation(address(), value); return this; }
		/** Sets the address of the specified {@link VkAllocationFunction} to the {@code pfnAllocation} field. */
		public VkAllocationCallbacks.Buffer pfnAllocation(VkAllocationFunction value) { return pfnAllocation(addressSafe(value)); }
		/** Sets the specified function address to the {@code pfnReallocation} field. */
		public VkAllocationCallbacks.Buffer pfnReallocation(long value) { VkAllocationCallbacks.npfnReallocation(address(), value); return this; }
		/** Sets the address of the specified {@link VkReallocationFunction} to the {@code pfnReallocation} field. */
		public VkAllocationCallbacks.Buffer pfnReallocation(VkReallocationFunction value) { return pfnReallocation(addressSafe(value)); }
		/** Sets the specified function address to the {@code pfnFree} field. */
		public VkAllocationCallbacks.Buffer pfnFree(long value) { VkAllocationCallbacks.npfnFree(address(), value); return this; }
		/** Sets the address of the specified {@link VkFreeFunction} to the {@code pfnFree} field. */
		public VkAllocationCallbacks.Buffer pfnFree(VkFreeFunction value) { return pfnFree(addressSafe(value)); }
		/** Sets the specified function address to the {@code pfnInternalAllocation} field. */
		public VkAllocationCallbacks.Buffer pfnInternalAllocation(long value) { VkAllocationCallbacks.npfnInternalAllocation(address(), value); return this; }
		/** Sets the address of the specified {@link VkInternalAllocationNotification} to the {@code pfnInternalAllocation} field. */
		public VkAllocationCallbacks.Buffer pfnInternalAllocation(VkInternalAllocationNotification value) { return pfnInternalAllocation(addressSafe(value)); }
		/** Sets the specified function address to the {@code pfnInternalFree} field. */
		public VkAllocationCallbacks.Buffer pfnInternalFree(long value) { VkAllocationCallbacks.npfnInternalFree(address(), value); return this; }
		/** Sets the address of the specified {@link VkInternalFreeNotification} to the {@code pfnInternalFree} field. */
		public VkAllocationCallbacks.Buffer pfnInternalFree(VkInternalFreeNotification value) { return pfnInternalFree(addressSafe(value)); }

	}

}