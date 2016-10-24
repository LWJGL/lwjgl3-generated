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
 * import Win32 memory created on the same physical device.
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link NVExternalMemoryWin32#VK_STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV STRUCTURE_TYPE_IMPORT_MEMORY_WIN32_HANDLE_INFO_NV}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code handleType} <b>must</b> be a valid combination of {@code VkExternalMemoryHandleTypeFlagBitsNV} values</li>
 * <li>{@code handleType} <b>must</b> not be 0</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code handleType} &ndash; 0 or a flag specifying the type of memory handle in {@code handle}. Flags which <b>may</b> be specified are:
 * 
 * <pre><code>typedef enum VkExternalMemoryHandleTypeFlagBitsNV {
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_NV = 0x00000001,
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_NV = 0x00000002,
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_BIT_NV = 0x00000004,
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_KMT_BIT_NV = 0x00000008,
} VkExternalMemoryHandleTypeFlagBitsNV;</code></pre></li>
 * <li>{@code handle} &ndash; a Windows {@code HANDLE} referring to the memory.
 * 
 * <ul>
 * <li>if {@code handleType} is {@link NVExternalMemoryCapabilities#VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_NV EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_NV} or {@link NVExternalMemoryCapabilities#VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_NV EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_NV}, {@code handle} <b>must</b> be a valid handle returned by {@link NVExternalMemoryWin32#vkGetMemoryWin32HandleNV GetMemoryWin32HandleNV} or, in the case of {@link NVExternalMemoryCapabilities#VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_NV EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_NV}, a handle duplicated from such a handle using {@code DuplicateHandle()}.</li>
 * <li>if {@code handleType} is {@link NVExternalMemoryCapabilities#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_BIT_NV EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_BIT_NV}, {@code handle} <b>must</b> be a valid NT handle returned by {@code IDXGIResource1::ftext:CreateSharedHandle()} or a handle duplicated from such a handle using {@code DuplicateHandle()}.</li>
 * <li>if {@code handleType} is {@link NVExternalMemoryCapabilities#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_KMT_BIT_NV EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_IMAGE_KMT_BIT_NV}, {@code handle} <b>must</b> be a valid handle returned by {@code IDXGIResource::GetSharedHandle()}.</li>
 * </ul></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkImportMemoryWin32HandleInfoNV {
    VkStructureType sType;
    const void * pNext;
    VkExternalMemoryHandleTypeFlagsNV handleType;
    HANDLE handle;
}</code></pre>
 */
public class VkImportMemoryWin32HandleInfoNV extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		HANDLETYPE,
		HANDLE;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		HANDLETYPE = layout.offsetof(2);
		HANDLE = layout.offsetof(3);
	}

	VkImportMemoryWin32HandleInfoNV(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkImportMemoryWin32HandleInfoNV} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkImportMemoryWin32HandleInfoNV(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code handleType} field. */
	public int handleType() { return nhandleType(address()); }
	/** Returns the value of the {@code handle} field. */
	public long handle() { return nhandle(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkImportMemoryWin32HandleInfoNV sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkImportMemoryWin32HandleInfoNV pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code handleType} field. */
	public VkImportMemoryWin32HandleInfoNV handleType(int value) { nhandleType(address(), value); return this; }
	/** Sets the specified value to the {@code handle} field. */
	public VkImportMemoryWin32HandleInfoNV handle(long value) { nhandle(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkImportMemoryWin32HandleInfoNV set(
		int sType,
		long pNext,
		int handleType,
		long handle
	) {
		sType(sType);
		pNext(pNext);
		handleType(handleType);
		handle(handle);

		return this;
	}

	/** Unsafe version of {@link #set(VkImportMemoryWin32HandleInfoNV) set}. */
	public VkImportMemoryWin32HandleInfoNV nset(long struct) {
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
	public VkImportMemoryWin32HandleInfoNV set(VkImportMemoryWin32HandleInfoNV src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkImportMemoryWin32HandleInfoNV} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkImportMemoryWin32HandleInfoNV malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkImportMemoryWin32HandleInfoNV} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkImportMemoryWin32HandleInfoNV calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkImportMemoryWin32HandleInfoNV} instance allocated with {@link BufferUtils}. */
	public static VkImportMemoryWin32HandleInfoNV create() {
		return new VkImportMemoryWin32HandleInfoNV(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkImportMemoryWin32HandleInfoNV} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkImportMemoryWin32HandleInfoNV create(long address) {
		return address == NULL ? null : new VkImportMemoryWin32HandleInfoNV(address, null);
	}

	/**
	 * Returns a new {@link VkImportMemoryWin32HandleInfoNV.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImportMemoryWin32HandleInfoNV.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImportMemoryWin32HandleInfoNV.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkImportMemoryWin32HandleInfoNV.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkImportMemoryWin32HandleInfoNV} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkImportMemoryWin32HandleInfoNV mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkImportMemoryWin32HandleInfoNV} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkImportMemoryWin32HandleInfoNV callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkImportMemoryWin32HandleInfoNV} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkImportMemoryWin32HandleInfoNV mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkImportMemoryWin32HandleInfoNV} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkImportMemoryWin32HandleInfoNV callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkImportMemoryWin32HandleInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkImportMemoryWin32HandleInfoNV.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkImportMemoryWin32HandleInfoNV.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkImportMemoryWin32HandleInfoNV.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkImportMemoryWin32HandleInfoNV.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkImportMemoryWin32HandleInfoNV.PNEXT); }
	/** Unsafe version of {@link #handleType}. */
	public static int nhandleType(long struct) { return memGetInt(struct + VkImportMemoryWin32HandleInfoNV.HANDLETYPE); }
	/** Unsafe version of {@link #handle}. */
	public static long nhandle(long struct) { return memGetAddress(struct + VkImportMemoryWin32HandleInfoNV.HANDLE); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkImportMemoryWin32HandleInfoNV.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkImportMemoryWin32HandleInfoNV.PNEXT, value); }
	/** Unsafe version of {@link #handleType(int) handleType}. */
	public static void nhandleType(long struct, int value) { memPutInt(struct + VkImportMemoryWin32HandleInfoNV.HANDLETYPE, value); }
	/** Unsafe version of {@link #handle(long) handle}. */
	public static void nhandle(long struct, long value) { memPutAddress(struct + VkImportMemoryWin32HandleInfoNV.HANDLE, checkPointer(value)); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + VkImportMemoryWin32HandleInfoNV.HANDLE));
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

	/** An array of {@link VkImportMemoryWin32HandleInfoNV} structs. */
	public static class Buffer extends StructBuffer<VkImportMemoryWin32HandleInfoNV, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkImportMemoryWin32HandleInfoNV.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkImportMemoryWin32HandleInfoNV#SIZEOF}, and its mark will be undefined.
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
		protected VkImportMemoryWin32HandleInfoNV newInstance(long address) {
			return new VkImportMemoryWin32HandleInfoNV(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkImportMemoryWin32HandleInfoNV.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkImportMemoryWin32HandleInfoNV.npNext(address()); }
		/** Returns the value of the {@code handleType} field. */
		public int handleType() { return VkImportMemoryWin32HandleInfoNV.nhandleType(address()); }
		/** Returns the value of the {@code handle} field. */
		public long handle() { return VkImportMemoryWin32HandleInfoNV.nhandle(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkImportMemoryWin32HandleInfoNV.Buffer sType(int value) { VkImportMemoryWin32HandleInfoNV.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkImportMemoryWin32HandleInfoNV.Buffer pNext(long value) { VkImportMemoryWin32HandleInfoNV.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code handleType} field. */
		public VkImportMemoryWin32HandleInfoNV.Buffer handleType(int value) { VkImportMemoryWin32HandleInfoNV.nhandleType(address(), value); return this; }
		/** Sets the specified value to the {@code handle} field. */
		public VkImportMemoryWin32HandleInfoNV.Buffer handle(long value) { VkImportMemoryWin32HandleInfoNV.nhandle(address(), value); return this; }

	}

}