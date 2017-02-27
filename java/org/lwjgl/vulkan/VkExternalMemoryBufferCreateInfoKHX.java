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
 * Specify that a buffer may be backed by external memory.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The bits in {@code handleTypes} <b>must</b> be compatible with each other and the other buffer creation parameters, as reported in {@link VkExternalBufferPropertiesKHX}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHXExternalMemory#VK_STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO_KHX STRUCTURE_TYPE_EXTERNAL_MEMORY_BUFFER_CREATE_INFO_KHX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code handleTypes} <b>must</b> be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsKHX} values</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code handleTypes} &ndash; a bitmask of {@code VkExternalMemoryHandleTypeFlagBitsKHX} specifying one or more external memory handle types.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkExternalMemoryBufferCreateInfoKHX {
    VkStructureType sType;
    const void * pNext;
    VkExternalMemoryHandleTypeFlagsKHX handleTypes;
}</code></pre>
 */
public class VkExternalMemoryBufferCreateInfoKHX extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		HANDLETYPES;

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
		HANDLETYPES = layout.offsetof(2);
	}

	VkExternalMemoryBufferCreateInfoKHX(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkExternalMemoryBufferCreateInfoKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkExternalMemoryBufferCreateInfoKHX(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code handleTypes} field. */
	public int handleTypes() { return nhandleTypes(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkExternalMemoryBufferCreateInfoKHX sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkExternalMemoryBufferCreateInfoKHX pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code handleTypes} field. */
	public VkExternalMemoryBufferCreateInfoKHX handleTypes(int value) { nhandleTypes(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkExternalMemoryBufferCreateInfoKHX set(
		int sType,
		long pNext,
		int handleTypes
	) {
		sType(sType);
		pNext(pNext);
		handleTypes(handleTypes);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VkExternalMemoryBufferCreateInfoKHX set(VkExternalMemoryBufferCreateInfoKHX src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link VkExternalMemoryBufferCreateInfoKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkExternalMemoryBufferCreateInfoKHX malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkExternalMemoryBufferCreateInfoKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkExternalMemoryBufferCreateInfoKHX calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkExternalMemoryBufferCreateInfoKHX} instance allocated with {@link BufferUtils}. */
	public static VkExternalMemoryBufferCreateInfoKHX create() {
		return new VkExternalMemoryBufferCreateInfoKHX(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkExternalMemoryBufferCreateInfoKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkExternalMemoryBufferCreateInfoKHX create(long address) {
		return address == NULL ? null : new VkExternalMemoryBufferCreateInfoKHX(address, null);
	}

	/**
	 * Returns a new {@link VkExternalMemoryBufferCreateInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkExternalMemoryBufferCreateInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkExternalMemoryBufferCreateInfoKHX.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkExternalMemoryBufferCreateInfoKHX.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkExternalMemoryBufferCreateInfoKHX} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkExternalMemoryBufferCreateInfoKHX mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkExternalMemoryBufferCreateInfoKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkExternalMemoryBufferCreateInfoKHX callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkExternalMemoryBufferCreateInfoKHX} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkExternalMemoryBufferCreateInfoKHX mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkExternalMemoryBufferCreateInfoKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkExternalMemoryBufferCreateInfoKHX callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkExternalMemoryBufferCreateInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkExternalMemoryBufferCreateInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkExternalMemoryBufferCreateInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkExternalMemoryBufferCreateInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkExternalMemoryBufferCreateInfoKHX.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkExternalMemoryBufferCreateInfoKHX.PNEXT); }
	/** Unsafe version of {@link #handleTypes}. */
	public static int nhandleTypes(long struct) { return memGetInt(struct + VkExternalMemoryBufferCreateInfoKHX.HANDLETYPES); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkExternalMemoryBufferCreateInfoKHX.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkExternalMemoryBufferCreateInfoKHX.PNEXT, value); }
	/** Unsafe version of {@link #handleTypes(int) handleTypes}. */
	public static void nhandleTypes(long struct, int value) { memPutInt(struct + VkExternalMemoryBufferCreateInfoKHX.HANDLETYPES, value); }

	// -----------------------------------

	/** An array of {@link VkExternalMemoryBufferCreateInfoKHX} structs. */
	public static class Buffer extends StructBuffer<VkExternalMemoryBufferCreateInfoKHX, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkExternalMemoryBufferCreateInfoKHX.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkExternalMemoryBufferCreateInfoKHX#SIZEOF}, and its mark will be undefined.
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
		protected VkExternalMemoryBufferCreateInfoKHX newInstance(long address) {
			return new VkExternalMemoryBufferCreateInfoKHX(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkExternalMemoryBufferCreateInfoKHX.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkExternalMemoryBufferCreateInfoKHX.npNext(address()); }
		/** Returns the value of the {@code handleTypes} field. */
		public int handleTypes() { return VkExternalMemoryBufferCreateInfoKHX.nhandleTypes(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkExternalMemoryBufferCreateInfoKHX.Buffer sType(int value) { VkExternalMemoryBufferCreateInfoKHX.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkExternalMemoryBufferCreateInfoKHX.Buffer pNext(long value) { VkExternalMemoryBufferCreateInfoKHX.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code handleTypes} field. */
		public VkExternalMemoryBufferCreateInfoKHX.Buffer handleTypes(int value) { VkExternalMemoryBufferCreateInfoKHX.nhandleTypes(address(), value); return this; }

	}

}