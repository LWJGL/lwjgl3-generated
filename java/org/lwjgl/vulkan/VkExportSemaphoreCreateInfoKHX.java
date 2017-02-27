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
 * Structure specifying handle types that can be exported from a semaphore.
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>The bits in {@code handleTypes} must be supported and compatible, as reported by {@link VkExternalSemaphorePropertiesKHX}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHXExternalSemaphore#VK_STRUCTURE_TYPE_EXPORT_SEMAPHORE_CREATE_INFO_KHX STRUCTURE_TYPE_EXPORT_SEMAPHORE_CREATE_INFO_KHX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code handleTypes} <b>must</b> be a valid combination of {@code VkExternalSemaphoreHandleTypeFlagBitsKHX} values</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code handleTypes} &ndash; a bitmask of {@code VkExternalSemaphoreHandleTypeFlagBitsKHX} specifying one or more semaphore handle types the application <b>can</b> export from the resulting allocation. The application <b>can</b> request multiple handle types for the same semaphore.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkExportSemaphoreCreateInfoKHX {
    VkStructureType sType;
    const void * pNext;
    VkExternalSemaphoreHandleTypeFlagsKHX handleTypes;
}</code></pre>
 */
public class VkExportSemaphoreCreateInfoKHX extends Struct implements NativeResource {

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

	VkExportSemaphoreCreateInfoKHX(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkExportSemaphoreCreateInfoKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkExportSemaphoreCreateInfoKHX(ByteBuffer container) {
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
	public VkExportSemaphoreCreateInfoKHX sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkExportSemaphoreCreateInfoKHX pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code handleTypes} field. */
	public VkExportSemaphoreCreateInfoKHX handleTypes(int value) { nhandleTypes(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkExportSemaphoreCreateInfoKHX set(
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
	public VkExportSemaphoreCreateInfoKHX set(VkExportSemaphoreCreateInfoKHX src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link VkExportSemaphoreCreateInfoKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkExportSemaphoreCreateInfoKHX malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkExportSemaphoreCreateInfoKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkExportSemaphoreCreateInfoKHX calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkExportSemaphoreCreateInfoKHX} instance allocated with {@link BufferUtils}. */
	public static VkExportSemaphoreCreateInfoKHX create() {
		return new VkExportSemaphoreCreateInfoKHX(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkExportSemaphoreCreateInfoKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkExportSemaphoreCreateInfoKHX create(long address) {
		return address == NULL ? null : new VkExportSemaphoreCreateInfoKHX(address, null);
	}

	/**
	 * Returns a new {@link VkExportSemaphoreCreateInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkExportSemaphoreCreateInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkExportSemaphoreCreateInfoKHX.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkExportSemaphoreCreateInfoKHX.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkExportSemaphoreCreateInfoKHX} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkExportSemaphoreCreateInfoKHX mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkExportSemaphoreCreateInfoKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkExportSemaphoreCreateInfoKHX callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkExportSemaphoreCreateInfoKHX} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkExportSemaphoreCreateInfoKHX mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkExportSemaphoreCreateInfoKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkExportSemaphoreCreateInfoKHX callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkExportSemaphoreCreateInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkExportSemaphoreCreateInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkExportSemaphoreCreateInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkExportSemaphoreCreateInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkExportSemaphoreCreateInfoKHX.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkExportSemaphoreCreateInfoKHX.PNEXT); }
	/** Unsafe version of {@link #handleTypes}. */
	public static int nhandleTypes(long struct) { return memGetInt(struct + VkExportSemaphoreCreateInfoKHX.HANDLETYPES); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkExportSemaphoreCreateInfoKHX.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkExportSemaphoreCreateInfoKHX.PNEXT, value); }
	/** Unsafe version of {@link #handleTypes(int) handleTypes}. */
	public static void nhandleTypes(long struct, int value) { memPutInt(struct + VkExportSemaphoreCreateInfoKHX.HANDLETYPES, value); }

	// -----------------------------------

	/** An array of {@link VkExportSemaphoreCreateInfoKHX} structs. */
	public static class Buffer extends StructBuffer<VkExportSemaphoreCreateInfoKHX, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkExportSemaphoreCreateInfoKHX.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkExportSemaphoreCreateInfoKHX#SIZEOF}, and its mark will be undefined.
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
		protected VkExportSemaphoreCreateInfoKHX newInstance(long address) {
			return new VkExportSemaphoreCreateInfoKHX(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkExportSemaphoreCreateInfoKHX.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkExportSemaphoreCreateInfoKHX.npNext(address()); }
		/** Returns the value of the {@code handleTypes} field. */
		public int handleTypes() { return VkExportSemaphoreCreateInfoKHX.nhandleTypes(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkExportSemaphoreCreateInfoKHX.Buffer sType(int value) { VkExportSemaphoreCreateInfoKHX.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkExportSemaphoreCreateInfoKHX.Buffer pNext(long value) { VkExportSemaphoreCreateInfoKHX.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code handleTypes} field. */
		public VkExportSemaphoreCreateInfoKHX.Buffer handleTypes(int value) { VkExportSemaphoreCreateInfoKHX.nhandleTypes(address(), value); return this; }

	}

}