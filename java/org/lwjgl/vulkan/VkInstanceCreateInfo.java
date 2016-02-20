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
 * struct VkInstanceCreateInfo {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkInstanceCreateFlags flags;
 *     const VkApplicationInfo * pApplicationInfo;
 *     uint32_t enabledLayerCount;
 *     const char * const * ppEnabledLayerNames;
 *     uint32_t enabledExtensionCount;
 *     const char * const * ppEnabledExtensionNames;
 * }</code></pre>
 */
public class VkInstanceCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

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
		__ALIGNMENT = layout.getAlignment();

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
	/**
	 * Returns a {@link PointerBuffer} view of the data pointed to by the {@code ppEnabledLayerNames} field.
	 *
	 * @param capacity the number of elements in the returned {@link PointerBuffer}
	 */
	public PointerBuffer ppEnabledLayerNames(int capacity) { return nppEnabledLayerNames(address(), capacity); }
	/** Returns the value of the {@code enabledExtensionCount} field. */
	public int enabledExtensionCount() { return nenabledExtensionCount(address()); }
	/**
	 * Returns a {@link PointerBuffer} view of the data pointed to by the {@code ppEnabledExtensionNames} field.
	 *
	 * @param capacity the number of elements in the returned {@link PointerBuffer}
	 */
	public PointerBuffer ppEnabledExtensionNames(int capacity) { return nppEnabledExtensionNames(address(), capacity); }

	/** Sets the specified value to the {@code sType} field. */
	public VkInstanceCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkInstanceCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkInstanceCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the address of the specified {@link VkApplicationInfo} to the {@code pApplicationInfo} field. */
	public VkInstanceCreateInfo pApplicationInfo(VkApplicationInfo value) { npApplicationInfo(address(), value); return this; }
	/** Sets the specified value to the {@code enabledLayerCount} field. */
	public VkInstanceCreateInfo enabledLayerCount(int value) { nenabledLayerCount(address(), value); return this; }
	/** Sets the address of the specified {@link PointerBuffer} to the {@code ppEnabledLayerNames} field. */
	public VkInstanceCreateInfo ppEnabledLayerNames(PointerBuffer value) { nppEnabledLayerNames(address(), value); return this; }
	/** Sets the specified value to the {@code enabledExtensionCount} field. */
	public VkInstanceCreateInfo enabledExtensionCount(int value) { nenabledExtensionCount(address(), value); return this; }
	/** Sets the address of the specified {@link PointerBuffer} to the {@code ppEnabledExtensionNames} field. */
	public VkInstanceCreateInfo ppEnabledExtensionNames(PointerBuffer value) { nppEnabledExtensionNames(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkInstanceCreateInfo set(
		int sType,
		long pNext,
		int flags,
		VkApplicationInfo pApplicationInfo,
		int enabledLayerCount,
		PointerBuffer ppEnabledLayerNames,
		int enabledExtensionCount,
		PointerBuffer ppEnabledExtensionNames
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		pApplicationInfo(pApplicationInfo);
		enabledLayerCount(enabledLayerCount);
		ppEnabledLayerNames(ppEnabledLayerNames);
		enabledExtensionCount(enabledExtensionCount);
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

	/** {@link ByteBuffer} version of {@link #set(VkInstanceCreateInfo) set}. */
	public VkInstanceCreateInfo set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkInstanceCreateInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkInstanceCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkInstanceCreateInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
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
	 * Returns a new {@link VkInstanceCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkInstanceCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
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
	/** Unsafe version of {@link #ppEnabledLayerNames(int) ppEnabledLayerNames}. */
	public static PointerBuffer nppEnabledLayerNames(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + VkInstanceCreateInfo.PPENABLEDLAYERNAMES), capacity); }
	/** Unsafe version of {@link #enabledExtensionCount}. */
	public static int nenabledExtensionCount(long struct) { return memGetInt(struct + VkInstanceCreateInfo.ENABLEDEXTENSIONCOUNT); }
	/** Unsafe version of {@link #ppEnabledExtensionNames(int) ppEnabledExtensionNames}. */
	public static PointerBuffer nppEnabledExtensionNames(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + VkInstanceCreateInfo.PPENABLEDEXTENSIONNAMES), capacity); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkInstanceCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkInstanceCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkInstanceCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #pApplicationInfo(VkApplicationInfo) pApplicationInfo}. */
	public static void npApplicationInfo(long struct, VkApplicationInfo value) { memPutAddress(struct + VkInstanceCreateInfo.PAPPLICATIONINFO, addressSafe(value)); }
	/** Unsafe version of {@link #enabledLayerCount(int) enabledLayerCount}. */
	public static void nenabledLayerCount(long struct, int value) { memPutInt(struct + VkInstanceCreateInfo.ENABLEDLAYERCOUNT, value); }
	/** Unsafe version of {@link #ppEnabledLayerNames(PointerBuffer) ppEnabledLayerNames}. */
	public static void nppEnabledLayerNames(long struct, PointerBuffer value) { memPutAddress(struct + VkInstanceCreateInfo.PPENABLEDLAYERNAMES, memAddressSafe(value)); }
	/** Unsafe version of {@link #enabledExtensionCount(int) enabledExtensionCount}. */
	public static void nenabledExtensionCount(long struct, int value) { memPutInt(struct + VkInstanceCreateInfo.ENABLEDEXTENSIONCOUNT, value); }
	/** Unsafe version of {@link #ppEnabledExtensionNames(PointerBuffer) ppEnabledExtensionNames}. */
	public static void nppEnabledExtensionNames(long struct, PointerBuffer value) { memPutAddress(struct + VkInstanceCreateInfo.PPENABLEDEXTENSIONNAMES, memAddressSafe(value)); }

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
			return new VkInstanceCreateInfo(address, container);
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
		/**
		 * Returns a {@link PointerBuffer} view of the data pointed to by the {@code ppEnabledLayerNames} field.
		 *
		 * @param capacity the number of elements in the returned {@link PointerBuffer}
		 */
		public PointerBuffer ppEnabledLayerNames(int capacity) { return VkInstanceCreateInfo.nppEnabledLayerNames(address(), capacity); }
		/** Returns the value of the {@code enabledExtensionCount} field. */
		public int enabledExtensionCount() { return VkInstanceCreateInfo.nenabledExtensionCount(address()); }
		/**
		 * Returns a {@link PointerBuffer} view of the data pointed to by the {@code ppEnabledExtensionNames} field.
		 *
		 * @param capacity the number of elements in the returned {@link PointerBuffer}
		 */
		public PointerBuffer ppEnabledExtensionNames(int capacity) { return VkInstanceCreateInfo.nppEnabledExtensionNames(address(), capacity); }

		/** Sets the specified value to the {@code sType} field. */
		public VkInstanceCreateInfo.Buffer sType(int value) { VkInstanceCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkInstanceCreateInfo.Buffer pNext(long value) { VkInstanceCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkInstanceCreateInfo.Buffer flags(int value) { VkInstanceCreateInfo.nflags(address(), value); return this; }
		/** Sets the address of the specified {@link VkApplicationInfo} to the {@code pApplicationInfo} field. */
		public VkInstanceCreateInfo.Buffer pApplicationInfo(VkApplicationInfo value) { VkInstanceCreateInfo.npApplicationInfo(address(), value); return this; }
		/** Sets the specified value to the {@code enabledLayerCount} field. */
		public VkInstanceCreateInfo.Buffer enabledLayerCount(int value) { VkInstanceCreateInfo.nenabledLayerCount(address(), value); return this; }
		/** Sets the address of the specified {@link PointerBuffer} to the {@code ppEnabledLayerNames} field. */
		public VkInstanceCreateInfo.Buffer ppEnabledLayerNames(PointerBuffer value) { VkInstanceCreateInfo.nppEnabledLayerNames(address(), value); return this; }
		/** Sets the specified value to the {@code enabledExtensionCount} field. */
		public VkInstanceCreateInfo.Buffer enabledExtensionCount(int value) { VkInstanceCreateInfo.nenabledExtensionCount(address(), value); return this; }
		/** Sets the address of the specified {@link PointerBuffer} to the {@code ppEnabledExtensionNames} field. */
		public VkInstanceCreateInfo.Buffer ppEnabledExtensionNames(PointerBuffer value) { VkInstanceCreateInfo.nppEnabledExtensionNames(address(), value); return this; }

	}

}