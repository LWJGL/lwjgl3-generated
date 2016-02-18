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
 * struct VkBindSparseInfo {
 *     VkStructureType sType;
 *     const void * pNext;
 *     uint32_t waitSemaphoreCount;
 *     const VkSemaphore * pWaitSemaphores;
 *     uint32_t bufferBindCount;
 *     const VkSparseBufferMemoryBindInfo * pBufferBinds;
 *     uint32_t imageOpaqueBindCount;
 *     const VkSparseImageOpaqueMemoryBindInfo * pImageOpaqueBinds;
 *     uint32_t imageBindCount;
 *     const VkSparseImageMemoryBindInfo * pImageBinds;
 *     uint32_t signalSemaphoreCount;
 *     const VkSemaphore * pSignalSemaphores;
 * }</code></pre>
 */
public class VkBindSparseInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		WAITSEMAPHORECOUNT,
		PWAITSEMAPHORES,
		BUFFERBINDCOUNT,
		PBUFFERBINDS,
		IMAGEOPAQUEBINDCOUNT,
		PIMAGEOPAQUEBINDS,
		IMAGEBINDCOUNT,
		PIMAGEBINDS,
		SIGNALSEMAPHORECOUNT,
		PSIGNALSEMAPHORES;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
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
		WAITSEMAPHORECOUNT = layout.offsetof(2);
		PWAITSEMAPHORES = layout.offsetof(3);
		BUFFERBINDCOUNT = layout.offsetof(4);
		PBUFFERBINDS = layout.offsetof(5);
		IMAGEOPAQUEBINDCOUNT = layout.offsetof(6);
		PIMAGEOPAQUEBINDS = layout.offsetof(7);
		IMAGEBINDCOUNT = layout.offsetof(8);
		PIMAGEBINDS = layout.offsetof(9);
		SIGNALSEMAPHORECOUNT = layout.offsetof(10);
		PSIGNALSEMAPHORES = layout.offsetof(11);
	}

	VkBindSparseInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkBindSparseInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkBindSparseInfo(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code sType} field. */
	public int sType() { return nsType(address()); }
	/** Returns the value of the {@code pNext} field. */
	public long pNext() { return npNext(address()); }
	/** Returns the value of the {@code waitSemaphoreCount} field. */
	public int waitSemaphoreCount() { return nwaitSemaphoreCount(address()); }
	/**
	 * Returns a {@link LongBuffer} view of the data pointed to by the {@code pWaitSemaphores} field.
	 *
	 * @param capacity the number of elements in the returned {@link LongBuffer}
	 */
	public LongBuffer pWaitSemaphores(int capacity) { return npWaitSemaphores(address(), capacity); }
	/** Returns the value of the {@code bufferBindCount} field. */
	public int bufferBindCount() { return nbufferBindCount(address()); }
	/** Returns a {@link VkSparseBufferMemoryBindInfo} view of the struct pointed to by the {@code pBufferBinds} field. */
	public VkSparseBufferMemoryBindInfo pBufferBinds() { return npBufferBinds(address()); }
	/** Returns the value of the {@code imageOpaqueBindCount} field. */
	public int imageOpaqueBindCount() { return nimageOpaqueBindCount(address()); }
	/** Returns a {@link VkSparseImageOpaqueMemoryBindInfo} view of the struct pointed to by the {@code pImageOpaqueBinds} field. */
	public VkSparseImageOpaqueMemoryBindInfo pImageOpaqueBinds() { return npImageOpaqueBinds(address()); }
	/** Returns the value of the {@code imageBindCount} field. */
	public int imageBindCount() { return nimageBindCount(address()); }
	/** Returns a {@link VkSparseImageMemoryBindInfo} view of the struct pointed to by the {@code pImageBinds} field. */
	public VkSparseImageMemoryBindInfo pImageBinds() { return npImageBinds(address()); }
	/** Returns the value of the {@code signalSemaphoreCount} field. */
	public int signalSemaphoreCount() { return nsignalSemaphoreCount(address()); }
	/**
	 * Returns a {@link LongBuffer} view of the data pointed to by the {@code pSignalSemaphores} field.
	 *
	 * @param capacity the number of elements in the returned {@link LongBuffer}
	 */
	public LongBuffer pSignalSemaphores(int capacity) { return npSignalSemaphores(address(), capacity); }

	/** Sets the specified value to the {@code sType} field. */
	public VkBindSparseInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkBindSparseInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code waitSemaphoreCount} field. */
	public VkBindSparseInfo waitSemaphoreCount(int value) { nwaitSemaphoreCount(address(), value); return this; }
	/** Sets the address of the specified {@link LongBuffer} to the {@code pWaitSemaphores} field. */
	public VkBindSparseInfo pWaitSemaphores(LongBuffer value) { npWaitSemaphores(address(), value); return this; }
	/** Sets the specified value to the {@code bufferBindCount} field. */
	public VkBindSparseInfo bufferBindCount(int value) { nbufferBindCount(address(), value); return this; }
	/** Sets the address of the specified {@link VkSparseBufferMemoryBindInfo} to the {@code pBufferBinds} field. */
	public VkBindSparseInfo pBufferBinds(VkSparseBufferMemoryBindInfo value) { npBufferBinds(address(), value); return this; }
	/** Sets the specified value to the {@code imageOpaqueBindCount} field. */
	public VkBindSparseInfo imageOpaqueBindCount(int value) { nimageOpaqueBindCount(address(), value); return this; }
	/** Sets the address of the specified {@link VkSparseImageOpaqueMemoryBindInfo} to the {@code pImageOpaqueBinds} field. */
	public VkBindSparseInfo pImageOpaqueBinds(VkSparseImageOpaqueMemoryBindInfo value) { npImageOpaqueBinds(address(), value); return this; }
	/** Sets the specified value to the {@code imageBindCount} field. */
	public VkBindSparseInfo imageBindCount(int value) { nimageBindCount(address(), value); return this; }
	/** Sets the address of the specified {@link VkSparseImageMemoryBindInfo} to the {@code pImageBinds} field. */
	public VkBindSparseInfo pImageBinds(VkSparseImageMemoryBindInfo value) { npImageBinds(address(), value); return this; }
	/** Sets the specified value to the {@code signalSemaphoreCount} field. */
	public VkBindSparseInfo signalSemaphoreCount(int value) { nsignalSemaphoreCount(address(), value); return this; }
	/** Sets the address of the specified {@link LongBuffer} to the {@code pSignalSemaphores} field. */
	public VkBindSparseInfo pSignalSemaphores(LongBuffer value) { npSignalSemaphores(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkBindSparseInfo set(
		int sType,
		long pNext,
		int waitSemaphoreCount,
		LongBuffer pWaitSemaphores,
		int bufferBindCount,
		VkSparseBufferMemoryBindInfo pBufferBinds,
		int imageOpaqueBindCount,
		VkSparseImageOpaqueMemoryBindInfo pImageOpaqueBinds,
		int imageBindCount,
		VkSparseImageMemoryBindInfo pImageBinds,
		int signalSemaphoreCount,
		LongBuffer pSignalSemaphores
	) {
		sType(sType);
		pNext(pNext);
		waitSemaphoreCount(waitSemaphoreCount);
		pWaitSemaphores(pWaitSemaphores);
		bufferBindCount(bufferBindCount);
		pBufferBinds(pBufferBinds);
		imageOpaqueBindCount(imageOpaqueBindCount);
		pImageOpaqueBinds(pImageOpaqueBinds);
		imageBindCount(imageBindCount);
		pImageBinds(pImageBinds);
		signalSemaphoreCount(signalSemaphoreCount);
		pSignalSemaphores(pSignalSemaphores);

		return this;
	}

	/** Unsafe version of {@link #set(VkBindSparseInfo) set}. */
	public VkBindSparseInfo nset(long struct) {
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
	public VkBindSparseInfo set(VkBindSparseInfo src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkBindSparseInfo) set}. */
	public VkBindSparseInfo set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkBindSparseInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkBindSparseInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkBindSparseInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkBindSparseInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkBindSparseInfo} instance allocated with {@link BufferUtils}. */
	public static VkBindSparseInfo create() {
		return new VkBindSparseInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkBindSparseInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkBindSparseInfo create(long address) {
		return address == NULL ? null : new VkBindSparseInfo(address, null);
	}

	/**
	 * Returns a new {@link VkBindSparseInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkBindSparseInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkBindSparseInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkBindSparseInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkBindSparseInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkBindSparseInfo.PNEXT); }
	/** Unsafe version of {@link #waitSemaphoreCount}. */
	public static int nwaitSemaphoreCount(long struct) { return memGetInt(struct + VkBindSparseInfo.WAITSEMAPHORECOUNT); }
	/** Unsafe version of {@link #pWaitSemaphores(int) pWaitSemaphores}. */
	public static LongBuffer npWaitSemaphores(long struct, int capacity) { return memLongBuffer(memGetAddress(struct + VkBindSparseInfo.PWAITSEMAPHORES), capacity); }
	/** Unsafe version of {@link #bufferBindCount}. */
	public static int nbufferBindCount(long struct) { return memGetInt(struct + VkBindSparseInfo.BUFFERBINDCOUNT); }
	/** Unsafe version of {@link #pBufferBinds}. */
	public static VkSparseBufferMemoryBindInfo npBufferBinds(long struct) { return VkSparseBufferMemoryBindInfo.create(memGetAddress(struct + VkBindSparseInfo.PBUFFERBINDS)); }
	/** Unsafe version of {@link #imageOpaqueBindCount}. */
	public static int nimageOpaqueBindCount(long struct) { return memGetInt(struct + VkBindSparseInfo.IMAGEOPAQUEBINDCOUNT); }
	/** Unsafe version of {@link #pImageOpaqueBinds}. */
	public static VkSparseImageOpaqueMemoryBindInfo npImageOpaqueBinds(long struct) { return VkSparseImageOpaqueMemoryBindInfo.create(memGetAddress(struct + VkBindSparseInfo.PIMAGEOPAQUEBINDS)); }
	/** Unsafe version of {@link #imageBindCount}. */
	public static int nimageBindCount(long struct) { return memGetInt(struct + VkBindSparseInfo.IMAGEBINDCOUNT); }
	/** Unsafe version of {@link #pImageBinds}. */
	public static VkSparseImageMemoryBindInfo npImageBinds(long struct) { return VkSparseImageMemoryBindInfo.create(memGetAddress(struct + VkBindSparseInfo.PIMAGEBINDS)); }
	/** Unsafe version of {@link #signalSemaphoreCount}. */
	public static int nsignalSemaphoreCount(long struct) { return memGetInt(struct + VkBindSparseInfo.SIGNALSEMAPHORECOUNT); }
	/** Unsafe version of {@link #pSignalSemaphores(int) pSignalSemaphores}. */
	public static LongBuffer npSignalSemaphores(long struct, int capacity) { return memLongBuffer(memGetAddress(struct + VkBindSparseInfo.PSIGNALSEMAPHORES), capacity); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkBindSparseInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkBindSparseInfo.PNEXT, value); }
	/** Unsafe version of {@link #waitSemaphoreCount(int) waitSemaphoreCount}. */
	public static void nwaitSemaphoreCount(long struct, int value) { memPutInt(struct + VkBindSparseInfo.WAITSEMAPHORECOUNT, value); }
	/** Unsafe version of {@link #pWaitSemaphores(LongBuffer) pWaitSemaphores}. */
	public static void npWaitSemaphores(long struct, LongBuffer value) { memPutAddress(struct + VkBindSparseInfo.PWAITSEMAPHORES, memAddressSafe(value)); }
	/** Unsafe version of {@link #bufferBindCount(int) bufferBindCount}. */
	public static void nbufferBindCount(long struct, int value) { memPutInt(struct + VkBindSparseInfo.BUFFERBINDCOUNT, value); }
	/** Unsafe version of {@link #pBufferBinds(VkSparseBufferMemoryBindInfo) pBufferBinds}. */
	public static void npBufferBinds(long struct, VkSparseBufferMemoryBindInfo value) { memPutAddress(struct + VkBindSparseInfo.PBUFFERBINDS, value.address()); }
	/** Unsafe version of {@link #imageOpaqueBindCount(int) imageOpaqueBindCount}. */
	public static void nimageOpaqueBindCount(long struct, int value) { memPutInt(struct + VkBindSparseInfo.IMAGEOPAQUEBINDCOUNT, value); }
	/** Unsafe version of {@link #pImageOpaqueBinds(VkSparseImageOpaqueMemoryBindInfo) pImageOpaqueBinds}. */
	public static void npImageOpaqueBinds(long struct, VkSparseImageOpaqueMemoryBindInfo value) { memPutAddress(struct + VkBindSparseInfo.PIMAGEOPAQUEBINDS, value.address()); }
	/** Unsafe version of {@link #imageBindCount(int) imageBindCount}. */
	public static void nimageBindCount(long struct, int value) { memPutInt(struct + VkBindSparseInfo.IMAGEBINDCOUNT, value); }
	/** Unsafe version of {@link #pImageBinds(VkSparseImageMemoryBindInfo) pImageBinds}. */
	public static void npImageBinds(long struct, VkSparseImageMemoryBindInfo value) { memPutAddress(struct + VkBindSparseInfo.PIMAGEBINDS, value.address()); }
	/** Unsafe version of {@link #signalSemaphoreCount(int) signalSemaphoreCount}. */
	public static void nsignalSemaphoreCount(long struct, int value) { memPutInt(struct + VkBindSparseInfo.SIGNALSEMAPHORECOUNT, value); }
	/** Unsafe version of {@link #pSignalSemaphores(LongBuffer) pSignalSemaphores}. */
	public static void npSignalSemaphores(long struct, LongBuffer value) { memPutAddress(struct + VkBindSparseInfo.PSIGNALSEMAPHORES, memAddressSafe(value)); }

	// -----------------------------------

	/** An array of {@link VkBindSparseInfo} structs. */
	public static final class Buffer extends StructBuffer<VkBindSparseInfo, Buffer> {

		/**
		 * Creates a new {@link VkBindSparseInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkBindSparseInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkBindSparseInfo newInstance(long address) {
			return new VkBindSparseInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkBindSparseInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkBindSparseInfo.npNext(address()); }
		/** Returns the value of the {@code waitSemaphoreCount} field. */
		public int waitSemaphoreCount() { return VkBindSparseInfo.nwaitSemaphoreCount(address()); }
		/**
		 * Returns a {@link LongBuffer} view of the data pointed to by the {@code pWaitSemaphores} field.
		 *
		 * @param capacity the number of elements in the returned {@link LongBuffer}
		 */
		public LongBuffer pWaitSemaphores(int capacity) { return VkBindSparseInfo.npWaitSemaphores(address(), capacity); }
		/** Returns the value of the {@code bufferBindCount} field. */
		public int bufferBindCount() { return VkBindSparseInfo.nbufferBindCount(address()); }
		/** Returns a {@link VkSparseBufferMemoryBindInfo} view of the struct pointed to by the {@code pBufferBinds} field. */
		public VkSparseBufferMemoryBindInfo pBufferBinds() { return VkBindSparseInfo.npBufferBinds(address()); }
		/** Returns the value of the {@code imageOpaqueBindCount} field. */
		public int imageOpaqueBindCount() { return VkBindSparseInfo.nimageOpaqueBindCount(address()); }
		/** Returns a {@link VkSparseImageOpaqueMemoryBindInfo} view of the struct pointed to by the {@code pImageOpaqueBinds} field. */
		public VkSparseImageOpaqueMemoryBindInfo pImageOpaqueBinds() { return VkBindSparseInfo.npImageOpaqueBinds(address()); }
		/** Returns the value of the {@code imageBindCount} field. */
		public int imageBindCount() { return VkBindSparseInfo.nimageBindCount(address()); }
		/** Returns a {@link VkSparseImageMemoryBindInfo} view of the struct pointed to by the {@code pImageBinds} field. */
		public VkSparseImageMemoryBindInfo pImageBinds() { return VkBindSparseInfo.npImageBinds(address()); }
		/** Returns the value of the {@code signalSemaphoreCount} field. */
		public int signalSemaphoreCount() { return VkBindSparseInfo.nsignalSemaphoreCount(address()); }
		/**
		 * Returns a {@link LongBuffer} view of the data pointed to by the {@code pSignalSemaphores} field.
		 *
		 * @param capacity the number of elements in the returned {@link LongBuffer}
		 */
		public LongBuffer pSignalSemaphores(int capacity) { return VkBindSparseInfo.npSignalSemaphores(address(), capacity); }

		/** Sets the specified value to the {@code sType} field. */
		public VkBindSparseInfo.Buffer sType(int value) { VkBindSparseInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkBindSparseInfo.Buffer pNext(long value) { VkBindSparseInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code waitSemaphoreCount} field. */
		public VkBindSparseInfo.Buffer waitSemaphoreCount(int value) { VkBindSparseInfo.nwaitSemaphoreCount(address(), value); return this; }
		/** Sets the address of the specified {@link LongBuffer} to the {@code pWaitSemaphores} field. */
		public VkBindSparseInfo.Buffer pWaitSemaphores(LongBuffer value) { VkBindSparseInfo.npWaitSemaphores(address(), value); return this; }
		/** Sets the specified value to the {@code bufferBindCount} field. */
		public VkBindSparseInfo.Buffer bufferBindCount(int value) { VkBindSparseInfo.nbufferBindCount(address(), value); return this; }
		/** Sets the address of the specified {@link VkSparseBufferMemoryBindInfo} to the {@code pBufferBinds} field. */
		public VkBindSparseInfo.Buffer pBufferBinds(VkSparseBufferMemoryBindInfo value) { VkBindSparseInfo.npBufferBinds(address(), value); return this; }
		/** Sets the specified value to the {@code imageOpaqueBindCount} field. */
		public VkBindSparseInfo.Buffer imageOpaqueBindCount(int value) { VkBindSparseInfo.nimageOpaqueBindCount(address(), value); return this; }
		/** Sets the address of the specified {@link VkSparseImageOpaqueMemoryBindInfo} to the {@code pImageOpaqueBinds} field. */
		public VkBindSparseInfo.Buffer pImageOpaqueBinds(VkSparseImageOpaqueMemoryBindInfo value) { VkBindSparseInfo.npImageOpaqueBinds(address(), value); return this; }
		/** Sets the specified value to the {@code imageBindCount} field. */
		public VkBindSparseInfo.Buffer imageBindCount(int value) { VkBindSparseInfo.nimageBindCount(address(), value); return this; }
		/** Sets the address of the specified {@link VkSparseImageMemoryBindInfo} to the {@code pImageBinds} field. */
		public VkBindSparseInfo.Buffer pImageBinds(VkSparseImageMemoryBindInfo value) { VkBindSparseInfo.npImageBinds(address(), value); return this; }
		/** Sets the specified value to the {@code signalSemaphoreCount} field. */
		public VkBindSparseInfo.Buffer signalSemaphoreCount(int value) { VkBindSparseInfo.nsignalSemaphoreCount(address(), value); return this; }
		/** Sets the address of the specified {@link LongBuffer} to the {@code pSignalSemaphores} field. */
		public VkBindSparseInfo.Buffer pSignalSemaphores(LongBuffer value) { VkBindSparseInfo.npSignalSemaphores(address(), value); return this; }

	}

}