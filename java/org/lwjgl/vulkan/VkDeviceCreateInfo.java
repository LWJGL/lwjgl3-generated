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
 * struct VkDeviceCreateInfo {
 *     VkStructureType sType;
 *     const void * pNext;
 *     VkDeviceCreateFlags flags;
 *     uint32_t queueCreateInfoCount;
 *     const VkDeviceQueueCreateInfo * pQueueCreateInfos;
 *     uint32_t enabledLayerCount;
 *     const char * const * ppEnabledLayerNames;
 *     uint32_t enabledExtensionCount;
 *     const char * const * ppEnabledExtensionNames;
 *     const VkPhysicalDeviceFeatures * pEnabledFeatures;
 * }</code></pre>
 */
public class VkDeviceCreateInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		QUEUECREATEINFOCOUNT,
		PQUEUECREATEINFOS,
		ENABLEDLAYERCOUNT,
		PPENABLEDLAYERNAMES,
		ENABLEDEXTENSIONCOUNT,
		PPENABLEDEXTENSIONNAMES,
		PENABLEDFEATURES;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
			__member(POINTER_SIZE)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		STYPE = layout.offsetof(0);
		PNEXT = layout.offsetof(1);
		FLAGS = layout.offsetof(2);
		QUEUECREATEINFOCOUNT = layout.offsetof(3);
		PQUEUECREATEINFOS = layout.offsetof(4);
		ENABLEDLAYERCOUNT = layout.offsetof(5);
		PPENABLEDLAYERNAMES = layout.offsetof(6);
		ENABLEDEXTENSIONCOUNT = layout.offsetof(7);
		PPENABLEDEXTENSIONNAMES = layout.offsetof(8);
		PENABLEDFEATURES = layout.offsetof(9);
	}

	VkDeviceCreateInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDeviceCreateInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDeviceCreateInfo(ByteBuffer container) {
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
	/** Returns the value of the {@code queueCreateInfoCount} field. */
	public int queueCreateInfoCount() { return nqueueCreateInfoCount(address()); }
	/** Returns a {@link VkDeviceQueueCreateInfo.Buffer} view of the struct array pointed to by the {@code pQueueCreateInfos} field. */
	public VkDeviceQueueCreateInfo.Buffer pQueueCreateInfos(int capacity) { return npQueueCreateInfos(address(), capacity); }
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
	/** Returns a {@link VkPhysicalDeviceFeatures} view of the struct pointed to by the {@code pEnabledFeatures} field. */
	public VkPhysicalDeviceFeatures pEnabledFeatures() { return npEnabledFeatures(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkDeviceCreateInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkDeviceCreateInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkDeviceCreateInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the specified value to the {@code queueCreateInfoCount} field. */
	public VkDeviceCreateInfo queueCreateInfoCount(int value) { nqueueCreateInfoCount(address(), value); return this; }
	/** Sets the address of the specified {@link VkDeviceQueueCreateInfo.Buffer} to the {@code pQueueCreateInfos} field. */
	public VkDeviceCreateInfo pQueueCreateInfos(VkDeviceQueueCreateInfo.Buffer value) { npQueueCreateInfos(address(), value); return this; }
	/** Sets the specified value to the {@code enabledLayerCount} field. */
	public VkDeviceCreateInfo enabledLayerCount(int value) { nenabledLayerCount(address(), value); return this; }
	/** Sets the address of the specified {@link PointerBuffer} to the {@code ppEnabledLayerNames} field. */
	public VkDeviceCreateInfo ppEnabledLayerNames(PointerBuffer value) { nppEnabledLayerNames(address(), value); return this; }
	/** Sets the specified value to the {@code enabledExtensionCount} field. */
	public VkDeviceCreateInfo enabledExtensionCount(int value) { nenabledExtensionCount(address(), value); return this; }
	/** Sets the address of the specified {@link PointerBuffer} to the {@code ppEnabledExtensionNames} field. */
	public VkDeviceCreateInfo ppEnabledExtensionNames(PointerBuffer value) { nppEnabledExtensionNames(address(), value); return this; }
	/** Sets the address of the specified {@link VkPhysicalDeviceFeatures} to the {@code pEnabledFeatures} field. */
	public VkDeviceCreateInfo pEnabledFeatures(VkPhysicalDeviceFeatures value) { npEnabledFeatures(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkDeviceCreateInfo set(
		int sType,
		long pNext,
		int flags,
		int queueCreateInfoCount,
		VkDeviceQueueCreateInfo.Buffer pQueueCreateInfos,
		int enabledLayerCount,
		PointerBuffer ppEnabledLayerNames,
		int enabledExtensionCount,
		PointerBuffer ppEnabledExtensionNames,
		VkPhysicalDeviceFeatures pEnabledFeatures
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		queueCreateInfoCount(queueCreateInfoCount);
		pQueueCreateInfos(pQueueCreateInfos);
		enabledLayerCount(enabledLayerCount);
		ppEnabledLayerNames(ppEnabledLayerNames);
		enabledExtensionCount(enabledExtensionCount);
		ppEnabledExtensionNames(ppEnabledExtensionNames);
		pEnabledFeatures(pEnabledFeatures);

		return this;
	}

	/** Unsafe version of {@link #set(VkDeviceCreateInfo) set}. */
	public VkDeviceCreateInfo nset(long struct) {
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
	public VkDeviceCreateInfo set(VkDeviceCreateInfo src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkDeviceCreateInfo) set}. */
	public VkDeviceCreateInfo set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkDeviceCreateInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkDeviceCreateInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDeviceCreateInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkDeviceCreateInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDeviceCreateInfo} instance allocated with {@link BufferUtils}. */
	public static VkDeviceCreateInfo create() {
		return new VkDeviceCreateInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDeviceCreateInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDeviceCreateInfo create(long address) {
		return address == NULL ? null : new VkDeviceCreateInfo(address, null);
	}

	/**
	 * Returns a new {@link VkDeviceCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDeviceCreateInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDeviceCreateInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDeviceCreateInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkDeviceCreateInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkDeviceCreateInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkDeviceCreateInfo.FLAGS); }
	/** Unsafe version of {@link #queueCreateInfoCount}. */
	public static int nqueueCreateInfoCount(long struct) { return memGetInt(struct + VkDeviceCreateInfo.QUEUECREATEINFOCOUNT); }
	/** Unsafe version of {@link #pQueueCreateInfos}. */
	public static VkDeviceQueueCreateInfo.Buffer npQueueCreateInfos(long struct, int capacity) { return VkDeviceQueueCreateInfo.create(memGetAddress(struct + VkDeviceCreateInfo.PQUEUECREATEINFOS), capacity); }
	/** Unsafe version of {@link #enabledLayerCount}. */
	public static int nenabledLayerCount(long struct) { return memGetInt(struct + VkDeviceCreateInfo.ENABLEDLAYERCOUNT); }
	/** Unsafe version of {@link #ppEnabledLayerNames(int) ppEnabledLayerNames}. */
	public static PointerBuffer nppEnabledLayerNames(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + VkDeviceCreateInfo.PPENABLEDLAYERNAMES), capacity); }
	/** Unsafe version of {@link #enabledExtensionCount}. */
	public static int nenabledExtensionCount(long struct) { return memGetInt(struct + VkDeviceCreateInfo.ENABLEDEXTENSIONCOUNT); }
	/** Unsafe version of {@link #ppEnabledExtensionNames(int) ppEnabledExtensionNames}. */
	public static PointerBuffer nppEnabledExtensionNames(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + VkDeviceCreateInfo.PPENABLEDEXTENSIONNAMES), capacity); }
	/** Unsafe version of {@link #pEnabledFeatures}. */
	public static VkPhysicalDeviceFeatures npEnabledFeatures(long struct) { return VkPhysicalDeviceFeatures.create(memGetAddress(struct + VkDeviceCreateInfo.PENABLEDFEATURES)); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkDeviceCreateInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkDeviceCreateInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkDeviceCreateInfo.FLAGS, value); }
	/** Unsafe version of {@link #queueCreateInfoCount(int) queueCreateInfoCount}. */
	public static void nqueueCreateInfoCount(long struct, int value) { memPutInt(struct + VkDeviceCreateInfo.QUEUECREATEINFOCOUNT, value); }
	/** Unsafe version of {@link #pQueueCreateInfos(VkDeviceQueueCreateInfo.Buffer) pQueueCreateInfos}. */
	public static void npQueueCreateInfos(long struct, VkDeviceQueueCreateInfo.Buffer value) { memPutAddress(struct + VkDeviceCreateInfo.PQUEUECREATEINFOS, addressSafe(value)); }
	/** Unsafe version of {@link #enabledLayerCount(int) enabledLayerCount}. */
	public static void nenabledLayerCount(long struct, int value) { memPutInt(struct + VkDeviceCreateInfo.ENABLEDLAYERCOUNT, value); }
	/** Unsafe version of {@link #ppEnabledLayerNames(PointerBuffer) ppEnabledLayerNames}. */
	public static void nppEnabledLayerNames(long struct, PointerBuffer value) { memPutAddress(struct + VkDeviceCreateInfo.PPENABLEDLAYERNAMES, memAddressSafe(value)); }
	/** Unsafe version of {@link #enabledExtensionCount(int) enabledExtensionCount}. */
	public static void nenabledExtensionCount(long struct, int value) { memPutInt(struct + VkDeviceCreateInfo.ENABLEDEXTENSIONCOUNT, value); }
	/** Unsafe version of {@link #ppEnabledExtensionNames(PointerBuffer) ppEnabledExtensionNames}. */
	public static void nppEnabledExtensionNames(long struct, PointerBuffer value) { memPutAddress(struct + VkDeviceCreateInfo.PPENABLEDEXTENSIONNAMES, memAddressSafe(value)); }
	/** Unsafe version of {@link #pEnabledFeatures(VkPhysicalDeviceFeatures) pEnabledFeatures}. */
	public static void npEnabledFeatures(long struct, VkPhysicalDeviceFeatures value) { memPutAddress(struct + VkDeviceCreateInfo.PENABLEDFEATURES, addressSafe(value)); }

	// -----------------------------------

	/** An array of {@link VkDeviceCreateInfo} structs. */
	public static final class Buffer extends StructBuffer<VkDeviceCreateInfo, Buffer> {

		/**
		 * Creates a new {@link VkDeviceCreateInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDeviceCreateInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkDeviceCreateInfo newInstance(long address) {
			return new VkDeviceCreateInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkDeviceCreateInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkDeviceCreateInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkDeviceCreateInfo.nflags(address()); }
		/** Returns the value of the {@code queueCreateInfoCount} field. */
		public int queueCreateInfoCount() { return VkDeviceCreateInfo.nqueueCreateInfoCount(address()); }
		/** Returns a {@link VkDeviceQueueCreateInfo.Buffer} view of the struct array pointed to by the {@code pQueueCreateInfos} field. */
		public VkDeviceQueueCreateInfo.Buffer pQueueCreateInfos(int capacity) { return VkDeviceCreateInfo.npQueueCreateInfos(address(), capacity); }
		/** Returns the value of the {@code enabledLayerCount} field. */
		public int enabledLayerCount() { return VkDeviceCreateInfo.nenabledLayerCount(address()); }
		/**
		 * Returns a {@link PointerBuffer} view of the data pointed to by the {@code ppEnabledLayerNames} field.
		 *
		 * @param capacity the number of elements in the returned {@link PointerBuffer}
		 */
		public PointerBuffer ppEnabledLayerNames(int capacity) { return VkDeviceCreateInfo.nppEnabledLayerNames(address(), capacity); }
		/** Returns the value of the {@code enabledExtensionCount} field. */
		public int enabledExtensionCount() { return VkDeviceCreateInfo.nenabledExtensionCount(address()); }
		/**
		 * Returns a {@link PointerBuffer} view of the data pointed to by the {@code ppEnabledExtensionNames} field.
		 *
		 * @param capacity the number of elements in the returned {@link PointerBuffer}
		 */
		public PointerBuffer ppEnabledExtensionNames(int capacity) { return VkDeviceCreateInfo.nppEnabledExtensionNames(address(), capacity); }
		/** Returns a {@link VkPhysicalDeviceFeatures} view of the struct pointed to by the {@code pEnabledFeatures} field. */
		public VkPhysicalDeviceFeatures pEnabledFeatures() { return VkDeviceCreateInfo.npEnabledFeatures(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkDeviceCreateInfo.Buffer sType(int value) { VkDeviceCreateInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkDeviceCreateInfo.Buffer pNext(long value) { VkDeviceCreateInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkDeviceCreateInfo.Buffer flags(int value) { VkDeviceCreateInfo.nflags(address(), value); return this; }
		/** Sets the specified value to the {@code queueCreateInfoCount} field. */
		public VkDeviceCreateInfo.Buffer queueCreateInfoCount(int value) { VkDeviceCreateInfo.nqueueCreateInfoCount(address(), value); return this; }
		/** Sets the address of the specified {@link VkDeviceQueueCreateInfo.Buffer} to the {@code pQueueCreateInfos} field. */
		public VkDeviceCreateInfo.Buffer pQueueCreateInfos(VkDeviceQueueCreateInfo.Buffer value) { VkDeviceCreateInfo.npQueueCreateInfos(address(), value); return this; }
		/** Sets the specified value to the {@code enabledLayerCount} field. */
		public VkDeviceCreateInfo.Buffer enabledLayerCount(int value) { VkDeviceCreateInfo.nenabledLayerCount(address(), value); return this; }
		/** Sets the address of the specified {@link PointerBuffer} to the {@code ppEnabledLayerNames} field. */
		public VkDeviceCreateInfo.Buffer ppEnabledLayerNames(PointerBuffer value) { VkDeviceCreateInfo.nppEnabledLayerNames(address(), value); return this; }
		/** Sets the specified value to the {@code enabledExtensionCount} field. */
		public VkDeviceCreateInfo.Buffer enabledExtensionCount(int value) { VkDeviceCreateInfo.nenabledExtensionCount(address(), value); return this; }
		/** Sets the address of the specified {@link PointerBuffer} to the {@code ppEnabledExtensionNames} field. */
		public VkDeviceCreateInfo.Buffer ppEnabledExtensionNames(PointerBuffer value) { VkDeviceCreateInfo.nppEnabledExtensionNames(address(), value); return this; }
		/** Sets the address of the specified {@link VkPhysicalDeviceFeatures} to the {@code pEnabledFeatures} field. */
		public VkDeviceCreateInfo.Buffer pEnabledFeatures(VkPhysicalDeviceFeatures value) { VkDeviceCreateInfo.npEnabledFeatures(address(), value); return this; }

	}

}