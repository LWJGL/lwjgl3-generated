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

/**
 * Structure specifying parameters of a newly created debug report callback.
 * 
 * <h5>See Also</h5>
 * 
 * <p>{@link VkDebugReportCallbackEXT}, {@code VkDebugReportFlagsEXT}, {@code VkStructureType}, {@link EXTDebugReport#vkCreateDebugReportCallbackEXT CreateDebugReportCallbackEXT}</p>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure.</li>
 * <li>{@code pNext} &ndash; {@code NULL} or a pointer to an extension-specific structure.</li>
 * <li>{@code flags} &ndash; indicate which event(s) will cause this callback to be called. Flags are interpreted as bitmasks and multiple may be set. Bits which <b>can</b> be set include:
 * 
 * <pre><code>typedef enum VkDebugReportFlagBitsEXT {
    VK_DEBUG_REPORT_INFORMATION_BIT_EXT = 0x00000001,
    VK_DEBUG_REPORT_WARNING_BIT_EXT = 0x00000002,
    VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT = 0x00000004,
    VK_DEBUG_REPORT_ERROR_BIT_EXT = 0x00000008,
    VK_DEBUG_REPORT_DEBUG_BIT_EXT = 0x00000010,
} VkDebugReportFlagBitsEXT;</code></pre>
 * 
 * <p>Description</p>
 * 
 * <p>* {@link EXTDebugReport#VK_DEBUG_REPORT_ERROR_BIT_EXT DEBUG_REPORT_ERROR_BIT_EXT} indicates an error that may cause     undefined results, including an application crash.   * {@link EXTDebugReport#VK_DEBUG_REPORT_WARNING_BIT_EXT DEBUG_REPORT_WARNING_BIT_EXT} indicates an unexpected use.     E.g. Not destroying objects prior to destroying the containing object or     potential inconsistencies between descriptor set layout and the layout     in the corresponding shader, etc.   * {@link EXTDebugReport#VK_DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT DEBUG_REPORT_PERFORMANCE_WARNING_BIT_EXT} indicates a     potentially non-optimal use of Vulkan.     E.g. using {@link VK10#vkCmdClearColorImage CmdClearColorImage} when a RenderPass load_op would     have worked.   * {@link EXTDebugReport#VK_DEBUG_REPORT_INFORMATION_BIT_EXT DEBUG_REPORT_INFORMATION_BIT_EXT} indicates an informational     message such as resource details that may be handy when debugging an     application.   * {@link EXTDebugReport#VK_DEBUG_REPORT_DEBUG_BIT_EXT DEBUG_REPORT_DEBUG_BIT_EXT} indicates diagnostic information     from the loader and layers.    * {@code pfnCallback} is the application callback function to call.   * {@code pUserData} is user data to be passed to the callback.</p></li>
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
public class VkDebugReportCallbackCreateInfoEXT extends Struct implements NativeResource {

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
	public static class Buffer extends StructBuffer<VkDebugReportCallbackCreateInfoEXT, Buffer> implements NativeResource {

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
			return new VkDebugReportCallbackCreateInfoEXT(address, container);
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