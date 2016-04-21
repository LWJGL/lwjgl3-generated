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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkDebugReportCallbackCreateInfoEXT.html">Khronos Reference Page</a>
 * 
 * <p>Defines the conditions under which a callback will be called.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link EXTDebugReport#VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkDebugReportFlagBitsEXT} values</li>
 * <li>{@code flags} <b>must not</b> be 0</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link EXTDebugReport#VK_STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT STRUCTURE_TYPE_DEBUG_REPORT_CALLBACK_CREATE_INFO_EXT}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code flags} &ndash; indicate which event(s) will cause this callback to be called. One or more of:<br><table><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_DEBUG_BIT_EXT DEBUG_REPORT_DEBUG_BIT_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_ERROR_BIT_EXT DEBUG_REPORT_ERROR_BIT_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_ERROR_CALLBACK_REF_EXT DEBUG_REPORT_ERROR_CALLBACK_REF_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_ERROR_NONE_EXT DEBUG_REPORT_ERROR_NONE_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_INFORMATION_BIT_EXT DEBUG_REPORT_INFORMATION_BIT_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT DEBUG_REPORT_OBJECT_TYPE_BUFFER_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT DEBUG_REPORT_OBJECT_TYPE_BUFFER_VIEW_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT DEBUG_REPORT_OBJECT_TYPE_COMMAND_BUFFER_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT DEBUG_REPORT_OBJECT_TYPE_COMMAND_POOL_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT DEBUG_REPORT_OBJECT_TYPE_DEBUG_REPORT_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_POOL_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT DEBUG_REPORT_OBJECT_TYPE_DESCRIPTOR_SET_LAYOUT_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT DEBUG_REPORT_OBJECT_TYPE_DEVICE_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT DEBUG_REPORT_OBJECT_TYPE_DEVICE_MEMORY_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT DEBUG_REPORT_OBJECT_TYPE_EVENT_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT DEBUG_REPORT_OBJECT_TYPE_FENCE_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT DEBUG_REPORT_OBJECT_TYPE_FRAMEBUFFER_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT DEBUG_REPORT_OBJECT_TYPE_IMAGE_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT DEBUG_REPORT_OBJECT_TYPE_IMAGE_VIEW_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT DEBUG_REPORT_OBJECT_TYPE_INSTANCE_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT DEBUG_REPORT_OBJECT_TYPE_PHYSICAL_DEVICE_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT DEBUG_REPORT_OBJECT_TYPE_PIPELINE_CACHE_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT DEBUG_REPORT_OBJECT_TYPE_PIPELINE_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT DEBUG_REPORT_OBJECT_TYPE_PIPELINE_LAYOUT_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT DEBUG_REPORT_OBJECT_TYPE_QUERY_POOL_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT DEBUG_REPORT_OBJECT_TYPE_QUEUE_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT DEBUG_REPORT_OBJECT_TYPE_RENDER_PASS_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT DEBUG_REPORT_OBJECT_TYPE_SAMPLER_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT DEBUG_REPORT_OBJECT_TYPE_SEMAPHORE_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT DEBUG_REPORT_OBJECT_TYPE_SHADER_MODULE_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT DEBUG_REPORT_OBJECT_TYPE_SURFACE_KHR_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT DEBUG_REPORT_OBJECT_TYPE_SWAPCHAIN_KHR_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT DEBUG_REPORT_OBJECT_TYPE_UNKNOWN_EXT}</td></tr><tr><td>{@link EXTDebugReport#VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT}</td><td>{@link EXTDebugReport#VK_DEBUG_REPORT_WARNING_BIT_EXT DEBUG_REPORT_WARNING_BIT_EXT}</td></tr></table></li>
 * <li>{@code pfnCallback} &ndash; the application callback function to call</li>
 * <li>{@code pUserData} &ndash; user data to be passed to the callback</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkDebugReportCallbackCreateInfoEXT {
    VkStructureType sType;
    const void * pNext;
    VkDebugReportFlagsEXT flags;
    PFN_vkDebugReportCallbackEXT pfnCallback;
    void * pUserData;
}</code></pre>
 */
public class VkDebugReportCallbackCreateInfoEXT extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		PFNCALLBACK,
		PUSERDATA;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		PFNCALLBACK = layout.offsetof(3);
		PUSERDATA = layout.offsetof(4);
	}

	VkDebugReportCallbackCreateInfoEXT(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDebugReportCallbackCreateInfoEXT} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDebugReportCallbackCreateInfoEXT(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code flags} field. */
	public int flags() { return nflags(address()); }
	/** Returns the {@code VkDebugReportCallbackEXT} instance at the {@code pfnCallback} field. */
	public VkDebugReportCallbackEXT pfnCallback() { return VkDebugReportCallbackEXT.create(npfnCallback(address())); }
	/** Returns the value of the {@code pUserData} field. */
	public long pUserData() { return npUserData(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkDebugReportCallbackCreateInfoEXT sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkDebugReportCallbackCreateInfoEXT pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkDebugReportCallbackCreateInfoEXT flags(int value) { nflags(address(), value); return this; }
	/** Sets the address of the specified {@link VkDebugReportCallbackEXTI} to the {@code pfnCallback} field. */
	public VkDebugReportCallbackCreateInfoEXT pfnCallback(VkDebugReportCallbackEXTI value) { npfnCallback(address(), addressSafe(value)); return this; }
	/** Sets the specified value to the {@code pUserData} field. */
	public VkDebugReportCallbackCreateInfoEXT pUserData(long value) { npUserData(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkDebugReportCallbackCreateInfoEXT set(
		int sType,
		long pNext,
		int flags,
		VkDebugReportCallbackEXTI pfnCallback,
		long pUserData
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		pfnCallback(pfnCallback);
		pUserData(pUserData);

		return this;
	}

	/** Unsafe version of {@link #set(VkDebugReportCallbackCreateInfoEXT) set}. */
	public VkDebugReportCallbackCreateInfoEXT nset(long struct) {
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
	public VkDebugReportCallbackCreateInfoEXT set(VkDebugReportCallbackCreateInfoEXT src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkDebugReportCallbackCreateInfoEXT} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkDebugReportCallbackCreateInfoEXT malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDebugReportCallbackCreateInfoEXT} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkDebugReportCallbackCreateInfoEXT calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDebugReportCallbackCreateInfoEXT} instance allocated with {@link BufferUtils}. */
	public static VkDebugReportCallbackCreateInfoEXT create() {
		return new VkDebugReportCallbackCreateInfoEXT(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDebugReportCallbackCreateInfoEXT} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDebugReportCallbackCreateInfoEXT create(long address) {
		return address == NULL ? null : new VkDebugReportCallbackCreateInfoEXT(address, null);
	}

	/**
	 * Returns a new {@link VkDebugReportCallbackCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDebugReportCallbackCreateInfoEXT.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDebugReportCallbackCreateInfoEXT.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDebugReportCallbackCreateInfoEXT.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkDebugReportCallbackCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkDebugReportCallbackCreateInfoEXT mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkDebugReportCallbackCreateInfoEXT} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkDebugReportCallbackCreateInfoEXT callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkDebugReportCallbackCreateInfoEXT} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDebugReportCallbackCreateInfoEXT mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDebugReportCallbackCreateInfoEXT} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDebugReportCallbackCreateInfoEXT callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDebugReportCallbackCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDebugReportCallbackCreateInfoEXT.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDebugReportCallbackCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDebugReportCallbackCreateInfoEXT.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkDebugReportCallbackCreateInfoEXT.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkDebugReportCallbackCreateInfoEXT.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkDebugReportCallbackCreateInfoEXT.FLAGS); }
	/** Unsafe version of {@link #pfnCallback}. */
	public static long npfnCallback(long struct) { return memGetAddress(struct + VkDebugReportCallbackCreateInfoEXT.PFNCALLBACK); }
	/** Unsafe version of {@link #pUserData}. */
	public static long npUserData(long struct) { return memGetAddress(struct + VkDebugReportCallbackCreateInfoEXT.PUSERDATA); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkDebugReportCallbackCreateInfoEXT.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkDebugReportCallbackCreateInfoEXT.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkDebugReportCallbackCreateInfoEXT.FLAGS, value); }
	/** Unsafe version of {@link #pfnCallback(VkDebugReportCallbackEXTI) pfnCallback}. */
	public static void npfnCallback(long struct, long value) { memPutAddress(struct + VkDebugReportCallbackCreateInfoEXT.PFNCALLBACK, checkPointer(value)); }
	/** Unsafe version of {@link #pUserData(long) pUserData}. */
	public static void npUserData(long struct, long value) { memPutAddress(struct + VkDebugReportCallbackCreateInfoEXT.PUSERDATA, value); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		checkPointer(memGetAddress(struct + VkDebugReportCallbackCreateInfoEXT.PFNCALLBACK));
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

	/** An array of {@link VkDebugReportCallbackCreateInfoEXT} structs. */
	public static final class Buffer extends StructBuffer<VkDebugReportCallbackCreateInfoEXT, Buffer> {

		/**
		 * Creates a new {@link VkDebugReportCallbackCreateInfoEXT.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDebugReportCallbackCreateInfoEXT#SIZEOF}, and its mark will be undefined.
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
		protected VkDebugReportCallbackCreateInfoEXT newInstance(long address) {
			return new VkDebugReportCallbackCreateInfoEXT(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkDebugReportCallbackCreateInfoEXT.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkDebugReportCallbackCreateInfoEXT.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkDebugReportCallbackCreateInfoEXT.nflags(address()); }
		/** Returns the {@code VkDebugReportCallbackEXT} instance at the {@code pfnCallback} field. */
		public VkDebugReportCallbackEXT pfnCallback() { return VkDebugReportCallbackEXT.create(VkDebugReportCallbackCreateInfoEXT.npfnCallback(address())); }
		/** Returns the value of the {@code pUserData} field. */
		public long pUserData() { return VkDebugReportCallbackCreateInfoEXT.npUserData(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkDebugReportCallbackCreateInfoEXT.Buffer sType(int value) { VkDebugReportCallbackCreateInfoEXT.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkDebugReportCallbackCreateInfoEXT.Buffer pNext(long value) { VkDebugReportCallbackCreateInfoEXT.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkDebugReportCallbackCreateInfoEXT.Buffer flags(int value) { VkDebugReportCallbackCreateInfoEXT.nflags(address(), value); return this; }
		/** Sets the address of the specified {@link VkDebugReportCallbackEXTI} to the {@code pfnCallback} field. */
		public VkDebugReportCallbackCreateInfoEXT.Buffer pfnCallback(VkDebugReportCallbackEXTI value) { VkDebugReportCallbackCreateInfoEXT.npfnCallback(address(), addressSafe(value)); return this; }
		/** Sets the specified value to the {@code pUserData} field. */
		public VkDebugReportCallbackCreateInfoEXT.Buffer pUserData(long value) { VkDebugReportCallbackCreateInfoEXT.npUserData(address(), value); return this; }

	}

}