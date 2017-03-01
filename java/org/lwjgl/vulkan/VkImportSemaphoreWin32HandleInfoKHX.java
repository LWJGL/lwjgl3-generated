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

import org.lwjgl.system.windows.*;

/**
 * (no short description available).
 * 
 * <h5>Description</h5>
 * 
 * <p>The handle types supported by {@code handleType} are:</p>
 * 
 * <h6>Handle Type Permanence for VkImportSemaphoreWin32HandleInfoKHX</h6>
 * 
 * <table class="lwjgl">
 * <thead><tr><th>Handle Type</th><th>Permanence</th></tr></thead>
 * <tbody>
 * <tr><td>VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHX</td><td>Permanent</td></tr>
 * <tr><td>VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHX</td><td>Permanent</td></tr>
 * <tr><td>VK_EXTERNAL_SEMAPHORE_HANDLE_TYPE_D3D12_FENCE_BIT_KHX</td><td>Permanent</td></tr>
 * </tbody>
 * </table>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code handleType} <b>must</b> be a value included in the <a target="_blank" href="https://www.khronos.org/registry/vulkan/specs/1.0-extensions/xhtml/vkspec.html#synchronization-handletypes-win32">Handle Type Permanence for VkImportSemaphoreWin32HandleInfoKHX</a> table.</li>
 * <li>The semaphore from which {@code handleType} was exported <b>must</b> have been created on the same underlying physical device as {@code semaphore}.</li>
 * </ul>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHXExternalSemaphoreWin32#VK_STRUCTURE_TYPE_IMPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHX STRUCTURE_TYPE_IMPORT_SEMAPHORE_WIN32_HANDLE_INFO_KHX}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code semaphore} <b>must</b> be a valid {@code VkSemaphore} handle</li>
 * <li>{@code handleType} <b>must</b> be a valid combination of {@code VkExternalSemaphoreHandleTypeFlagBitsKHX} values</li>
 * <li>{@code handleType} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link KHXExternalSemaphoreWin32#vkImportSemaphoreWin32HandleKHX ImportSemaphoreWin32HandleKHX}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code semaphore} &ndash; the semaphore into which the state will be imported.</li>
 * <li>{@code handleType} &ndash; specifies the type of {@code handle}.</li>
 * <li>{@code handle} &ndash; the external handle to import.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkImportSemaphoreWin32HandleInfoKHX {
    VkStructureType sType;
    const void * pNext;
    VkSemaphore semaphore;
    VkExternalSemaphoreHandleTypeFlagsKHX handleType;
    HANDLE handle;
}</code></pre>
 */
public class VkImportSemaphoreWin32HandleInfoKHX extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		SEMAPHORE,
		HANDLETYPE,
		HANDLE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(8),
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		SEMAPHORE = layout.offsetof(2);
		HANDLETYPE = layout.offsetof(3);
		HANDLE = layout.offsetof(4);
	}

	VkImportSemaphoreWin32HandleInfoKHX(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkImportSemaphoreWin32HandleInfoKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkImportSemaphoreWin32HandleInfoKHX(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code semaphore} field. */
	public long semaphore() { return nsemaphore(address()); }
	/** Returns the value of the {@code handleType} field. */
	public int handleType() { return nhandleType(address()); }
	/** Returns the value of the {@code handle} field. */
	public long handle() { return nhandle(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkImportSemaphoreWin32HandleInfoKHX sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkImportSemaphoreWin32HandleInfoKHX pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code semaphore} field. */
	public VkImportSemaphoreWin32HandleInfoKHX semaphore(long value) { nsemaphore(address(), value); return this; }
	/** Sets the specified value to the {@code handleType} field. */
	public VkImportSemaphoreWin32HandleInfoKHX handleType(int value) { nhandleType(address(), value); return this; }
	/** Sets the specified value to the {@code handle} field. */
	public VkImportSemaphoreWin32HandleInfoKHX handle(long value) { nhandle(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkImportSemaphoreWin32HandleInfoKHX set(
		int sType,
		long pNext,
		long semaphore,
		int handleType,
		long handle
	) {
		sType(sType);
		pNext(pNext);
		semaphore(semaphore);
		handleType(handleType);
		handle(handle);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VkImportSemaphoreWin32HandleInfoKHX set(VkImportSemaphoreWin32HandleInfoKHX src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link VkImportSemaphoreWin32HandleInfoKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkImportSemaphoreWin32HandleInfoKHX malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkImportSemaphoreWin32HandleInfoKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkImportSemaphoreWin32HandleInfoKHX calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkImportSemaphoreWin32HandleInfoKHX} instance allocated with {@link BufferUtils}. */
	public static VkImportSemaphoreWin32HandleInfoKHX create() {
		return new VkImportSemaphoreWin32HandleInfoKHX(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkImportSemaphoreWin32HandleInfoKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkImportSemaphoreWin32HandleInfoKHX create(long address) {
		return address == NULL ? null : new VkImportSemaphoreWin32HandleInfoKHX(address, null);
	}

	/**
	 * Returns a new {@link VkImportSemaphoreWin32HandleInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImportSemaphoreWin32HandleInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImportSemaphoreWin32HandleInfoKHX.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkImportSemaphoreWin32HandleInfoKHX.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkImportSemaphoreWin32HandleInfoKHX} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkImportSemaphoreWin32HandleInfoKHX mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkImportSemaphoreWin32HandleInfoKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkImportSemaphoreWin32HandleInfoKHX callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkImportSemaphoreWin32HandleInfoKHX} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkImportSemaphoreWin32HandleInfoKHX mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkImportSemaphoreWin32HandleInfoKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkImportSemaphoreWin32HandleInfoKHX callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkImportSemaphoreWin32HandleInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkImportSemaphoreWin32HandleInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkImportSemaphoreWin32HandleInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImportSemaphoreWin32HandleInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkImportSemaphoreWin32HandleInfoKHX.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkImportSemaphoreWin32HandleInfoKHX.PNEXT); }
	/** Unsafe version of {@link #semaphore}. */
	public static long nsemaphore(long struct) { return memGetLong(struct + VkImportSemaphoreWin32HandleInfoKHX.SEMAPHORE); }
	/** Unsafe version of {@link #handleType}. */
	public static int nhandleType(long struct) { return memGetInt(struct + VkImportSemaphoreWin32HandleInfoKHX.HANDLETYPE); }
	/** Unsafe version of {@link #handle}. */
	public static long nhandle(long struct) { return memGetAddress(struct + VkImportSemaphoreWin32HandleInfoKHX.HANDLE); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkImportSemaphoreWin32HandleInfoKHX.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkImportSemaphoreWin32HandleInfoKHX.PNEXT, value); }
	/** Unsafe version of {@link #semaphore(long) semaphore}. */
	public static void nsemaphore(long struct, long value) { memPutLong(struct + VkImportSemaphoreWin32HandleInfoKHX.SEMAPHORE, value); }
	/** Unsafe version of {@link #handleType(int) handleType}. */
	public static void nhandleType(long struct, int value) { memPutInt(struct + VkImportSemaphoreWin32HandleInfoKHX.HANDLETYPE, value); }
	/** Unsafe version of {@link #handle(long) handle}. */
	public static void nhandle(long struct, long value) { memPutAddress(struct + VkImportSemaphoreWin32HandleInfoKHX.HANDLE, check(value)); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		check(memGetAddress(struct + VkImportSemaphoreWin32HandleInfoKHX.HANDLE));
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

	/** An array of {@link VkImportSemaphoreWin32HandleInfoKHX} structs. */
	public static class Buffer extends StructBuffer<VkImportSemaphoreWin32HandleInfoKHX, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkImportSemaphoreWin32HandleInfoKHX.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkImportSemaphoreWin32HandleInfoKHX#SIZEOF}, and its mark will be undefined.
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
		protected VkImportSemaphoreWin32HandleInfoKHX newInstance(long address) {
			return new VkImportSemaphoreWin32HandleInfoKHX(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkImportSemaphoreWin32HandleInfoKHX.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkImportSemaphoreWin32HandleInfoKHX.npNext(address()); }
		/** Returns the value of the {@code semaphore} field. */
		public long semaphore() { return VkImportSemaphoreWin32HandleInfoKHX.nsemaphore(address()); }
		/** Returns the value of the {@code handleType} field. */
		public int handleType() { return VkImportSemaphoreWin32HandleInfoKHX.nhandleType(address()); }
		/** Returns the value of the {@code handle} field. */
		public long handle() { return VkImportSemaphoreWin32HandleInfoKHX.nhandle(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkImportSemaphoreWin32HandleInfoKHX.Buffer sType(int value) { VkImportSemaphoreWin32HandleInfoKHX.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkImportSemaphoreWin32HandleInfoKHX.Buffer pNext(long value) { VkImportSemaphoreWin32HandleInfoKHX.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code semaphore} field. */
		public VkImportSemaphoreWin32HandleInfoKHX.Buffer semaphore(long value) { VkImportSemaphoreWin32HandleInfoKHX.nsemaphore(address(), value); return this; }
		/** Sets the specified value to the {@code handleType} field. */
		public VkImportSemaphoreWin32HandleInfoKHX.Buffer handleType(int value) { VkImportSemaphoreWin32HandleInfoKHX.nhandleType(address(), value); return this; }
		/** Sets the specified value to the {@code handle} field. */
		public VkImportSemaphoreWin32HandleInfoKHX.Buffer handle(long value) { VkImportSemaphoreWin32HandleInfoKHX.nhandle(address(), value); return this; }

	}

}