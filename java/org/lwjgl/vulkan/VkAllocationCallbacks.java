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
 * struct VkAllocationCallbacks {
 *     void * pUserData;
 *     PFN_vkAllocationFunction pfnAllocation;
 *     PFN_vkReallocationFunction pfnReallocation;
 *     PFN_vkFreeFunction pfnFree;
 *     PFN_vkInternalAllocationNotification pfnInternalAllocation;
 *     PFN_vkInternalFreeNotification pfnInternalFree;
 * }</code></pre>
 */
public class VkAllocationCallbacks extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

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
		__ALIGNMENT = layout.getAlignment();

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
	public VkAllocationFunction pfnAllocationClosure() { return npfnAllocationClosure(address()); }
	/** Returns the function address at the {@code pfnReallocation} field. */
	public long pfnReallocation() { return npfnReallocation(address()); }
	/** Returns the {@code VkReallocationFunction} instance at the {@code pfnReallocation} field. */
	public VkReallocationFunction pfnReallocationClosure() { return npfnReallocationClosure(address()); }
	/** Returns the function address at the {@code pfnFree} field. */
	public long pfnFree() { return npfnFree(address()); }
	/** Returns the {@code VkFreeFunction} instance at the {@code pfnFree} field. */
	public VkFreeFunction pfnFreeClosure() { return npfnFreeClosure(address()); }
	/** Returns the function address at the {@code pfnInternalAllocation} field. */
	public long pfnInternalAllocation() { return npfnInternalAllocation(address()); }
	/** Returns the {@code VkInternalAllocationNotification} instance at the {@code pfnInternalAllocation} field. */
	public VkInternalAllocationNotification pfnInternalAllocationClosure() { return npfnInternalAllocationClosure(address()); }
	/** Returns the function address at the {@code pfnInternalFree} field. */
	public long pfnInternalFree() { return npfnInternalFree(address()); }
	/** Returns the {@code VkInternalFreeNotification} instance at the {@code pfnInternalFree} field. */
	public VkInternalFreeNotification pfnInternalFreeClosure() { return npfnInternalFreeClosure(address()); }

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

	/** {@link ByteBuffer} version of {@link #set(VkAllocationCallbacks) set}. */
	public VkAllocationCallbacks set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkAllocationCallbacks} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkAllocationCallbacks malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkAllocationCallbacks} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
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
	 * Returns a new {@link VkAllocationCallbacks.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkAllocationCallbacks.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
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

	/** Unsafe version of {@link #pUserData}. */
	public static long npUserData(long struct) { return memGetAddress(struct + VkAllocationCallbacks.PUSERDATA); }
	/** Unsafe version of {@link #pfnAllocation}. */
	public static long npfnAllocation(long struct) { return memGetAddress(struct + VkAllocationCallbacks.PFNALLOCATION); }
	/** Unsafe version of {@link #pfnAllocationClosure}. */
	public static VkAllocationFunction npfnAllocationClosure(long struct) { return org.lwjgl.system.libffi.Closure.create(npfnAllocation(struct)); }
	/** Unsafe version of {@link #pfnReallocation}. */
	public static long npfnReallocation(long struct) { return memGetAddress(struct + VkAllocationCallbacks.PFNREALLOCATION); }
	/** Unsafe version of {@link #pfnReallocationClosure}. */
	public static VkReallocationFunction npfnReallocationClosure(long struct) { return org.lwjgl.system.libffi.Closure.create(npfnReallocation(struct)); }
	/** Unsafe version of {@link #pfnFree}. */
	public static long npfnFree(long struct) { return memGetAddress(struct + VkAllocationCallbacks.PFNFREE); }
	/** Unsafe version of {@link #pfnFreeClosure}. */
	public static VkFreeFunction npfnFreeClosure(long struct) { return org.lwjgl.system.libffi.Closure.create(npfnFree(struct)); }
	/** Unsafe version of {@link #pfnInternalAllocation}. */
	public static long npfnInternalAllocation(long struct) { return memGetAddress(struct + VkAllocationCallbacks.PFNINTERNALALLOCATION); }
	/** Unsafe version of {@link #pfnInternalAllocationClosure}. */
	public static VkInternalAllocationNotification npfnInternalAllocationClosure(long struct) { return org.lwjgl.system.libffi.Closure.create(npfnInternalAllocation(struct)); }
	/** Unsafe version of {@link #pfnInternalFree}. */
	public static long npfnInternalFree(long struct) { return memGetAddress(struct + VkAllocationCallbacks.PFNINTERNALFREE); }
	/** Unsafe version of {@link #pfnInternalFreeClosure}. */
	public static VkInternalFreeNotification npfnInternalFreeClosure(long struct) { return org.lwjgl.system.libffi.Closure.create(npfnInternalFree(struct)); }

	/** Unsafe version of {@link #pUserData(long) pUserData}. */
	public static void npUserData(long struct, long value) { memPutAddress(struct + VkAllocationCallbacks.PUSERDATA, value); }
	/** Unsafe version of {@link #pfnAllocation(long) pfnAllocation}. */
	public static void npfnAllocation(long struct, long value) { memPutAddress(struct + VkAllocationCallbacks.PFNALLOCATION, value); }
	/** Unsafe version of {@link #pfnReallocation(long) pfnReallocation}. */
	public static void npfnReallocation(long struct, long value) { memPutAddress(struct + VkAllocationCallbacks.PFNREALLOCATION, value); }
	/** Unsafe version of {@link #pfnFree(long) pfnFree}. */
	public static void npfnFree(long struct, long value) { memPutAddress(struct + VkAllocationCallbacks.PFNFREE, value); }
	/** Unsafe version of {@link #pfnInternalAllocation(long) pfnInternalAllocation}. */
	public static void npfnInternalAllocation(long struct, long value) { memPutAddress(struct + VkAllocationCallbacks.PFNINTERNALALLOCATION, value); }
	/** Unsafe version of {@link #pfnInternalFree(long) pfnInternalFree}. */
	public static void npfnInternalFree(long struct, long value) { memPutAddress(struct + VkAllocationCallbacks.PFNINTERNALFREE, value); }

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
			return new VkAllocationCallbacks(address, container);
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
		public VkAllocationFunction pfnAllocationClosure() { return VkAllocationCallbacks.npfnAllocationClosure(address()); }
		/** Returns the function address at the {@code pfnReallocation} field. */
		public long pfnReallocation() { return VkAllocationCallbacks.npfnReallocation(address()); }
		/** Returns the {@code VkReallocationFunction} instance at the {@code pfnReallocation} field. */
		public VkReallocationFunction pfnReallocationClosure() { return VkAllocationCallbacks.npfnReallocationClosure(address()); }
		/** Returns the function address at the {@code pfnFree} field. */
		public long pfnFree() { return VkAllocationCallbacks.npfnFree(address()); }
		/** Returns the {@code VkFreeFunction} instance at the {@code pfnFree} field. */
		public VkFreeFunction pfnFreeClosure() { return VkAllocationCallbacks.npfnFreeClosure(address()); }
		/** Returns the function address at the {@code pfnInternalAllocation} field. */
		public long pfnInternalAllocation() { return VkAllocationCallbacks.npfnInternalAllocation(address()); }
		/** Returns the {@code VkInternalAllocationNotification} instance at the {@code pfnInternalAllocation} field. */
		public VkInternalAllocationNotification pfnInternalAllocationClosure() { return VkAllocationCallbacks.npfnInternalAllocationClosure(address()); }
		/** Returns the function address at the {@code pfnInternalFree} field. */
		public long pfnInternalFree() { return VkAllocationCallbacks.npfnInternalFree(address()); }
		/** Returns the {@code VkInternalFreeNotification} instance at the {@code pfnInternalFree} field. */
		public VkInternalFreeNotification pfnInternalFreeClosure() { return VkAllocationCallbacks.npfnInternalFreeClosure(address()); }

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