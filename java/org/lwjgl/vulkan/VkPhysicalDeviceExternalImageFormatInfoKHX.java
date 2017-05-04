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
 * Structure specifying external image creation parameters.
 * 
 * <h5>Description</h5>
 * 
 * <p>If {@code handleType} is 0, {@link KHRGetPhysicalDeviceProperties2#vkGetPhysicalDeviceImageFormatProperties2KHR GetPhysicalDeviceImageFormatProperties2KHR} will behave as if {@link VkPhysicalDeviceExternalImageFormatInfoKHX} was not present and {@link VkExternalImageFormatPropertiesKHX} will be ignored.</p>
 * 
 * <p>If {@code handleType} is not compatible with the {@code format}, {@code type}, {@code tiling}, {@code usage}, and {@code flags} specified in {@link VkPhysicalDeviceImageFormatInfo2KHR}, then {@link KHRGetPhysicalDeviceProperties2#vkGetPhysicalDeviceImageFormatProperties2KHR GetPhysicalDeviceImageFormatProperties2KHR} returns {@link VK10#VK_ERROR_FORMAT_NOT_SUPPORTED ERROR_FORMAT_NOT_SUPPORTED}.</p>
 * 
 * <h5>Valid Usage (Implicit)</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link KHXExternalMemoryCapabilities#VK_STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO_KHX STRUCTURE_TYPE_PHYSICAL_DEVICE_EXTERNAL_IMAGE_FORMAT_INFO_KHX}</li>
 * <li>If {@code handleType} is not 0, {@code handleType} <b>must</b> be a valid {@code VkExternalMemoryHandleTypeFlagBitsKHX} value</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code handleType} &ndash; a bit indicating a memory handle type that will be used with the memory associated with the image. Bits which can be set include:
 * 
 * <pre><code>typedef enum VkExternalMemoryHandleTypeFlagBitsKHX {
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT_KHX = 0x00000001,
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_BIT_KHX = 0x00000002,
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHX = 0x00000004,
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHX = 0x00000008,
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHX = 0x00000010,
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHX = 0x00000020,
    VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHX = 0x00000040,
} VkExternalMemoryHandleTypeFlagBitsKHX;</code></pre>
 * 
 * <ul>
 * <li>{@link KHXExternalMemoryCapabilities#VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT_KHX EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_FD_BIT_KHX} is a POSIX file descriptor handle that has only limited valid usage outside of Vulkan and other compatible APIs. It <b>must</b> be compatible with the POSIX system calls fname:dup, fname:dup2, fname:close, and the non-standard system call fname:dup3. Additionally, it <b>must</b> be transportable over a socket using an {@code SCM_RIGHTS} control message. It owns a reference to the underlying memory resource represented by its Vulkan memory object.</li>
 * <li>{@link #EXTERNAL_MEMORY_HANDLE_TYPE_WIN32_BIT_KHX} is an NT handle that has only limited valid usage outside of Vulkan and other compatible APIs. It <b>must</b> be compatible with the functions fname:DuplicateHandle, fname:CloseHandle, fname:CompareObjectHandles, fname:GetHandleInformation, and fname:SetHandleInformation. It owns a reference to the underlying memory resource represented by its Vulkan memory object.</li>
 * <li>{@link KHXExternalMemoryCapabilities#VK_EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHX EXTERNAL_MEMORY_HANDLE_TYPE_OPAQUE_WIN32_KMT_BIT_KHX} is a global share handle that has only limited valid usage outside of Vulkan and other compatible APIs. It is not compatible with any native APIs. It does not own own a reference to the underlying memory resource represented its Vulkan memory object, and will therefore become invalid when all Vulkan memory objects associated with it are destroyed.</li>
 * <li>{@link KHXExternalMemoryCapabilities#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHX EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_BIT_KHX} is an NT handle returned by {@code IDXGIResource1}::fname:CreateSharedHandle referring to a Direct3D 10 or 11 texture resource. It owns a reference to the memory used by the Direct3D resource.</li>
 * <li>{@link KHXExternalMemoryCapabilities#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHX EXTERNAL_MEMORY_HANDLE_TYPE_D3D11_TEXTURE_KMT_BIT_KHX} is a global share handle returned by {@code IDXGIResource}::fname:GetSharedHandle referring to a Direct3D 10 or 11 texture resource. It does not own own a reference to the underlying Direct3D resource, and will therefore become invalid when all Vulkan memory objects and Direct3D resources associated with it are destroyed.</li>
 * <li>{@link KHXExternalMemoryCapabilities#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHX EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_HEAP_BIT_KHX} is an NT handle returned by {@code ID3D12Device}::fname:CreateSharedHandle referring to a Direct3D 12 heap resource. It owns a reference to the resources used by the Direct3D heap.</li>
 * <li>{@link KHXExternalMemoryCapabilities#VK_EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHX EXTERNAL_MEMORY_HANDLE_TYPE_D3D12_RESOURCE_BIT_KHX} is an NT handle returned by {@code ID3D12Device}::fname:CreateSharedHandle referring to a Direct3D 12 committed resource. It owns a reference to the memory used by the Direct3D resource.</li>
 * </ul></li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkPhysicalDeviceExternalImageFormatInfoKHX {
    VkStructureType sType;
    const void * pNext;
    VkExternalMemoryHandleTypeFlagBitsKHX handleType;
}</code></pre>
 */
public class VkPhysicalDeviceExternalImageFormatInfoKHX extends Struct implements NativeResource {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		HANDLETYPE;

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
		HANDLETYPE = layout.offsetof(2);
	}

	VkPhysicalDeviceExternalImageFormatInfoKHX(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkPhysicalDeviceExternalImageFormatInfoKHX} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkPhysicalDeviceExternalImageFormatInfoKHX(ByteBuffer container) {
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

	/** Sets the specified value to the {@code sType} field. */
	public VkPhysicalDeviceExternalImageFormatInfoKHX sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkPhysicalDeviceExternalImageFormatInfoKHX pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code handleType} field. */
	public VkPhysicalDeviceExternalImageFormatInfoKHX handleType(int value) { nhandleType(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkPhysicalDeviceExternalImageFormatInfoKHX set(
		int sType,
		long pNext,
		int handleType
	) {
		sType(sType);
		pNext(pNext);
		handleType(handleType);

		return this;
	}

	/**
	 * Copies the specified struct data to this struct.
	 *
	 * @param src the source struct
	 *
	 * @return this struct
	 */
	public VkPhysicalDeviceExternalImageFormatInfoKHX set(VkPhysicalDeviceExternalImageFormatInfoKHX src) {
		memCopy(src.address(), address(), SIZEOF);
		return this;
	}

	// -----------------------------------

	/** Returns a new {@link VkPhysicalDeviceExternalImageFormatInfoKHX} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkPhysicalDeviceExternalImageFormatInfoKHX malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkPhysicalDeviceExternalImageFormatInfoKHX} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkPhysicalDeviceExternalImageFormatInfoKHX calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkPhysicalDeviceExternalImageFormatInfoKHX} instance allocated with {@link BufferUtils}. */
	public static VkPhysicalDeviceExternalImageFormatInfoKHX create() {
		return new VkPhysicalDeviceExternalImageFormatInfoKHX(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkPhysicalDeviceExternalImageFormatInfoKHX} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkPhysicalDeviceExternalImageFormatInfoKHX create(long address) {
		return address == NULL ? null : new VkPhysicalDeviceExternalImageFormatInfoKHX(address, null);
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceExternalImageFormatInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceExternalImageFormatInfoKHX.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceExternalImageFormatInfoKHX.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkPhysicalDeviceExternalImageFormatInfoKHX.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkPhysicalDeviceExternalImageFormatInfoKHX} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkPhysicalDeviceExternalImageFormatInfoKHX mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkPhysicalDeviceExternalImageFormatInfoKHX} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkPhysicalDeviceExternalImageFormatInfoKHX callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceExternalImageFormatInfoKHX} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPhysicalDeviceExternalImageFormatInfoKHX mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceExternalImageFormatInfoKHX} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkPhysicalDeviceExternalImageFormatInfoKHX callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceExternalImageFormatInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceExternalImageFormatInfoKHX.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceExternalImageFormatInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkPhysicalDeviceExternalImageFormatInfoKHX.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkPhysicalDeviceExternalImageFormatInfoKHX.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkPhysicalDeviceExternalImageFormatInfoKHX.PNEXT); }
	/** Unsafe version of {@link #handleType}. */
	public static int nhandleType(long struct) { return memGetInt(struct + VkPhysicalDeviceExternalImageFormatInfoKHX.HANDLETYPE); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceExternalImageFormatInfoKHX.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkPhysicalDeviceExternalImageFormatInfoKHX.PNEXT, value); }
	/** Unsafe version of {@link #handleType(int) handleType}. */
	public static void nhandleType(long struct, int value) { memPutInt(struct + VkPhysicalDeviceExternalImageFormatInfoKHX.HANDLETYPE, value); }

	// -----------------------------------

	/** An array of {@link VkPhysicalDeviceExternalImageFormatInfoKHX} structs. */
	public static class Buffer extends StructBuffer<VkPhysicalDeviceExternalImageFormatInfoKHX, Buffer> implements NativeResource {

		/**
		 * Creates a new {@link VkPhysicalDeviceExternalImageFormatInfoKHX.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkPhysicalDeviceExternalImageFormatInfoKHX#SIZEOF}, and its mark will be undefined.
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
		protected VkPhysicalDeviceExternalImageFormatInfoKHX newInstance(long address) {
			return new VkPhysicalDeviceExternalImageFormatInfoKHX(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkPhysicalDeviceExternalImageFormatInfoKHX.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkPhysicalDeviceExternalImageFormatInfoKHX.npNext(address()); }
		/** Returns the value of the {@code handleType} field. */
		public int handleType() { return VkPhysicalDeviceExternalImageFormatInfoKHX.nhandleType(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkPhysicalDeviceExternalImageFormatInfoKHX.Buffer sType(int value) { VkPhysicalDeviceExternalImageFormatInfoKHX.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkPhysicalDeviceExternalImageFormatInfoKHX.Buffer pNext(long value) { VkPhysicalDeviceExternalImageFormatInfoKHX.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code handleType} field. */
		public VkPhysicalDeviceExternalImageFormatInfoKHX.Buffer handleType(int value) { VkPhysicalDeviceExternalImageFormatInfoKHX.nhandleType(address(), value); return this; }

	}

}