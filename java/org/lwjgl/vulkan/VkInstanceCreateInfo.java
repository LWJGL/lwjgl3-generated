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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkInstanceCreateInfo.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkInstanceCreateInfo">Vulkan Specification</a>
 * 
 * <p>Contains information about how a {@code VkInstance} should be created.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO STRUCTURE_TYPE_INSTANCE_CREATE_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be 0</li>
 * <li>If {@code pApplicationInfo} is not {@code NULL}, {@code pApplicationInfo} <b>must</b> be a pointer to a valid {@link VkApplicationInfo} structure</li>
 * <li>If {@code enabledLayerCount} is not 0, {@code ppEnabledLayerNames} <b>must</b> be a pointer to an array of {@code enabledLayerCount} null-terminated
 * strings</li>
 * <li>If {@code enabledExtensionCount} is not 0, {@code ppEnabledExtensionNames} <b>must</b> be a pointer to an array of {@code enabledExtensionCount}
 * null-terminated strings</li>
 * <li>Any given element of {@code ppEnabledLayerNames} <b>must</b> be the name of a layer present on the system, exactly matching a string returned in the
 * {@link VkLayerProperties} structure by {@link VK10#vkEnumerateInstanceLayerProperties EnumerateInstanceLayerProperties}</li>
 * <li>Any given element of {@code ppEnabledExtensionNames} <b>must</b> be the name of an extension present on the system, exactly matching a string returned in
 * the {@link VkExtensionProperties} structure by {@link VK10#vkEnumerateInstanceExtensionProperties EnumerateInstanceExtensionProperties}</li>
 * <li>If an extension listed in {@code ppEnabledExtensionNames} is provided as part of a layer, then both the layer and extension <b>must</b> be enabled to
 * enable that extension</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link VK10#VK_STRUCTURE_TYPE_INSTANCE_CREATE_INFO STRUCTURE_TYPE_INSTANCE_CREATE_INFO}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code flags} &ndash; reserved for future use</li>
 * <li>{@code pApplicationInfo} &ndash; a pointer to an instance of {@link VkApplicationInfo}</li>
 * <li>{@code enabledLayerCount} &ndash; the number of global layers to enable</li>
 * <li>{@code ppEnabledLayerNames} &ndash; a pointer to an array of {@code enabledLayerCount} null-terminated UTF-8 strings containing the names of layers to enable</li>
 * <li>{@code enabledExtensionCount} &ndash; the number of global extensions to enable</li>
 * <li>{@code ppEnabledExtensionNames} &ndash; a pointer to an array of {@code enabledExtensionCount} null-terminated UTF-8 strings containing the names of extensions to enable</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkInstanceCreateInfo {
    VkStructureType sType;
    const void * pNext;
    VkInstanceCreateFlags flags;
    const VkApplicationInfo * pApplicationInfo;
    uint32_t enabledLayerCount;
    const char * const * ppEnabledLayerNames;
    uint32_t enabledExtensionCount;
    const char * const * ppEnabledExtensionNames;
}</code></pre>
 */
public class VkInstanceCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		PAPPLICATIONINFO,
		ENABLEDLAYERCOUNT,
		PPENABLEDLAYERNAMES,
		ENABLEDEXTENSIONCOUNT,
		PPENABLEDEXTENSIONNAMES;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		PAPPLICATIONINFO = layout.offsetof(3);
		ENABLEDLAYERCOUNT = layout.offsetof(4);
		PPENABLEDLAYERNAMES = layout.offsetof(5);
		ENABLEDEXTENSIONCOUNT = layout.offsetof(6);
		PPENABLEDEXTENSIONNAMES = layout.offsetof(7);
	}

	VkInstanceCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkInstanceCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkInstanceCreateInfo(ByteBuffer container) {
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
	/** Returns a {@link VkApplicationInfo} view of the struct pointed to by the {@code pApplicationInfo} field. */
	public VkApplicationInfo pApplicationInfo() { return npApplicationInfo(address()); }
	/** Returns the value of the {@code enabledLayerCount} field. */
	public int enabledLayerCount() { return nenabledLayerCount(address()); }
	/** Returns a {@link PointerBuffer} view of the data pointed to by the {@code ppEnabledLayerNames} field. */
	public PointerBuffer ppEnabledLayerNames() { return nppEnabledLayerNames(address()); }
	/** Returns the value of the {@code enabledExtensionCount} field. */
	public int enabledExtensionCount() { return nenabledExtensionCount(address()); }
	/** Returns a {@link PointerBuffer} view of the data pointed to by the {@code ppEnabledExtensionNames} field. */
	public PointerBuffer ppEnabledExtensionNames() { return nppEnabledExtensionNames(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkInstanceCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkInstanceCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkInstanceCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the address of the specified {@link VkApplicationInfo} to the {@code pApplicationInfo} field. */
	public VkInstanceCreateInfo pApplicationInfo(VkApplicationInfo value) { npApplicationInfo(address(), value); return this; }
	/** Sets the address of the specified {@link PointerBuffer} to the {@code ppEnabledLayerNames} field. */
	public VkInstanceCreateInfo ppEnabledLayerNames(PointerBuffer value) { nppEnabledLayerNames(address(), value); return this; }
	/** Sets the address of the specified {@link PointerBuffer} to the {@code ppEnabledExtensionNames} field. */
	public VkInstanceCreateInfo ppEnabledExtensionNames(PointerBuffer value) { nppEnabledExtensionNames(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkInstanceCreateInfo set(
		int sType,
		long pNext,
		int flags,
		VkApplicationInfo pApplicationInfo,
		PointerBuffer ppEnabledLayerNames,
		PointerBuffer ppEnabledExtensionNames
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		pApplicationInfo(pApplicationInfo);
		ppEnabledLayerNames(ppEnabledLayerNames);
		ppEnabledExtensionNames(ppEnabledExtensionNames);

		return this;
	}

	/** Unsafe version of {@link #set(VkInstanceCreateInfo) set}. */
	public VkInstanceCreateInfo nset(long struct) {
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
	public VkInstanceCreateInfo set(VkInstanceCreateInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkInstanceCreateInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkInstanceCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkInstanceCreateInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkInstanceCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkInstanceCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkInstanceCreateInfo create() {
		return new VkInstanceCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkInstanceCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkInstanceCreateInfo create(long address) {
		return address == NULL ? null : new VkInstanceCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkInstanceCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkInstanceCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkInstanceCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkInstanceCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkInstanceCreateInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkInstanceCreateInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkInstanceCreateInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkInstanceCreateInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkInstanceCreateInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkInstanceCreateInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkInstanceCreateInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkInstanceCreateInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkInstanceCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkInstanceCreateInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkInstanceCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkInstanceCreateInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkInstanceCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkInstanceCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkInstanceCreateInfo.FLAGS); }
	/** Unsafe version of {@link #pApplicationInfo}. */
	public static VkApplicationInfo npApplicationInfo(long struct) { return VkApplicationInfo.create(memGetAddress(struct + VkInstanceCreateInfo.PAPPLICATIONINFO)); }
	/** Unsafe version of {@link #enabledLayerCount}. */
	public static int nenabledLayerCount(long struct) { return memGetInt(struct + VkInstanceCreateInfo.ENABLEDLAYERCOUNT); }
	/** Unsafe version of {@link #ppEnabledLayerNames() ppEnabledLayerNames}. */
	public static PointerBuffer nppEnabledLayerNames(long struct) { return memPointerBuffer(memGetAddress(struct + VkInstanceCreateInfo.PPENABLEDLAYERNAMES), nenabledLayerCount(struct)); }
	/** Unsafe version of {@link #enabledExtensionCount}. */
	public static int nenabledExtensionCount(long struct) { return memGetInt(struct + VkInstanceCreateInfo.ENABLEDEXTENSIONCOUNT); }
	/** Unsafe version of {@link #ppEnabledExtensionNames() ppEnabledExtensionNames}. */
	public static PointerBuffer nppEnabledExtensionNames(long struct) { return memPointerBuffer(memGetAddress(struct + VkInstanceCreateInfo.PPENABLEDEXTENSIONNAMES), nenabledExtensionCount(struct)); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkInstanceCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkInstanceCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkInstanceCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #pApplicationInfo(VkApplicationInfo) pApplicationInfo}. */
	public static void npApplicationInfo(long struct, VkApplicationInfo value) { memPutAddress(struct + VkInstanceCreateInfo.PAPPLICATIONINFO, addressSafe(value)); }
	/** Sets the specified value to the {@code enabledLayerCount} field of the specified {@code struct}. */
	public static void nenabledLayerCount(long struct, int value) { memPutInt(struct + VkInstanceCreateInfo.ENABLEDLAYERCOUNT, value); }
	/** Unsafe version of {@link #ppEnabledLayerNames(PointerBuffer) ppEnabledLayerNames}. */
	public static void nppEnabledLayerNames(long struct, PointerBuffer value) { memPutAddress(struct + VkInstanceCreateInfo.PPENABLEDLAYERNAMES, memAddressSafe(value)); nenabledLayerCount(struct, value == null ? 0 : value.remaining()); }
	/** Sets the specified value to the {@code enabledExtensionCount} field of the specified {@code struct}. */
	public static void nenabledExtensionCount(long struct, int value) { memPutInt(struct + VkInstanceCreateInfo.ENABLEDEXTENSIONCOUNT, value); }
	/** Unsafe version of {@link #ppEnabledExtensionNames(PointerBuffer) ppEnabledExtensionNames}. */
	public static void nppEnabledExtensionNames(long struct, PointerBuffer value) { memPutAddress(struct + VkInstanceCreateInfo.PPENABLEDEXTENSIONNAMES, memAddressSafe(value)); nenabledExtensionCount(struct, value == null ? 0 : value.remaining()); }

	/**
	 * Validates pointer members that should not be {@code NULL}.
	 *
	 * @param struct the struct to validate
	 */
	public static void validate(long struct) {
		if ( nenabledLayerCount(struct) != 0 )
			checkPointer(memGetAddress(struct + VkInstanceCreateInfo.PPENABLEDLAYERNAMES));
		if ( nenabledExtensionCount(struct) != 0 )
			checkPointer(memGetAddress(struct + VkInstanceCreateInfo.PPENABLEDEXTENSIONNAMES));
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

	/** An array of {@link VkInstanceCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkInstanceCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkInstanceCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkInstanceCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkInstanceCreateInfo newInstance(long address) {
			return new VkInstanceCreateInfo(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkInstanceCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkInstanceCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkInstanceCreateInfo.nflags(address()); }
		/** Returns a {@link VkApplicationInfo} view of the struct pointed to by the {@code pApplicationInfo} field. */
		public VkApplicationInfo pApplicationInfo() { return VkInstanceCreateInfo.npApplicationInfo(address()); }
		/** Returns the value of the {@code enabledLayerCount} field. */
		public int enabledLayerCount() { return VkInstanceCreateInfo.nenabledLayerCount(address()); }
		/** Returns a {@link PointerBuffer} view of the data pointed to by the {@code ppEnabledLayerNames} field. */
		public PointerBuffer ppEnabledLayerNames() { return VkInstanceCreateInfo.nppEnabledLayerNames(address()); }
		/** Returns the value of the {@code enabledExtensionCount} field. */
		public int enabledExtensionCount() { return VkInstanceCreateInfo.nenabledExtensionCount(address()); }
		/** Returns a {@link PointerBuffer} view of the data pointed to by the {@code ppEnabledExtensionNames} field. */
		public PointerBuffer ppEnabledExtensionNames() { return VkInstanceCreateInfo.nppEnabledExtensionNames(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkInstanceCreateInfo.Buffer sType(int value) { VkInstanceCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkInstanceCreateInfo.Buffer pNext(long value) { VkInstanceCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkInstanceCreateInfo.Buffer flags(int value) { VkInstanceCreateInfo.nflags(address(), value); return this; }
		/** Sets the address of the specified {@link VkApplicationInfo} to the {@code pApplicationInfo} field. */
		public VkInstanceCreateInfo.Buffer pApplicationInfo(VkApplicationInfo value) { VkInstanceCreateInfo.npApplicationInfo(address(), value); return this; }
		/** Sets the address of the specified {@link PointerBuffer} to the {@code ppEnabledLayerNames} field. */
		public VkInstanceCreateInfo.Buffer ppEnabledLayerNames(PointerBuffer value) { VkInstanceCreateInfo.nppEnabledLayerNames(address(), value); return this; }
		/** Sets the address of the specified {@link PointerBuffer} to the {@code ppEnabledExtensionNames} field. */
		public VkInstanceCreateInfo.Buffer ppEnabledExtensionNames(PointerBuffer value) { VkInstanceCreateInfo.nppEnabledExtensionNames(address(), value); return this; }

	}

}