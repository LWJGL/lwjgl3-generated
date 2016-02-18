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
 * struct VkSubmitInfo {
 *     VkStructureType sType;
 *     const void * pNext;
 *     uint32_t waitSemaphoreCount;
 *     const VkSemaphore * pWaitSemaphores;
 *     const VkPipelineStageFlags * pWaitDstStageMask;
 *     uint32_t commandBufferCount;
 *     const VkCommandBuffer * pCommandBuffers;
 *     uint32_t signalSemaphoreCount;
 *     const VkSemaphore * pSignalSemaphores;
 * }</code></pre>
 */
public class VkSubmitInfo extends Struct {

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
		PWAITDSTSTAGEMASK,
		COMMANDBUFFERCOUNT,
		PCOMMANDBUFFERS,
		SIGNALSEMAPHORECOUNT,
		PSIGNALSEMAPHORES;

	static {
		Layout layout = __struct(
			__member(4),
			__member(POINTER_SIZE),
			__member(4),
			__member(POINTER_SIZE),
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
		PWAITDSTSTAGEMASK = layout.offsetof(4);
		COMMANDBUFFERCOUNT = layout.offsetof(5);
		PCOMMANDBUFFERS = layout.offsetof(6);
		SIGNALSEMAPHORECOUNT = layout.offsetof(7);
		PSIGNALSEMAPHORES = layout.offsetof(8);
	}

	VkSubmitInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkSubmitInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkSubmitInfo(ByteBuffer container) {
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
	/**
	 * Returns a {@link IntBuffer} view of the data pointed to by the {@code pWaitDstStageMask} field.
	 *
	 * @param capacity the number of elements in the returned {@link IntBuffer}
	 */
	public IntBuffer pWaitDstStageMask(int capacity) { return npWaitDstStageMask(address(), capacity); }
	/** Returns the value of the {@code commandBufferCount} field. */
	public int commandBufferCount() { return ncommandBufferCount(address()); }
	/**
	 * Returns a {@link PointerBuffer} view of the data pointed to by the {@code pCommandBuffers} field.
	 *
	 * @param capacity the number of elements in the returned {@link PointerBuffer}
	 */
	public PointerBuffer pCommandBuffers(int capacity) { return npCommandBuffers(address(), capacity); }
	/** Returns the value of the {@code signalSemaphoreCount} field. */
	public int signalSemaphoreCount() { return nsignalSemaphoreCount(address()); }
	/**
	 * Returns a {@link LongBuffer} view of the data pointed to by the {@code pSignalSemaphores} field.
	 *
	 * @param capacity the number of elements in the returned {@link LongBuffer}
	 */
	public LongBuffer pSignalSemaphores(int capacity) { return npSignalSemaphores(address(), capacity); }

	/** Sets the specified value to the {@code sType} field. */
	public VkSubmitInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkSubmitInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code waitSemaphoreCount} field. */
	public VkSubmitInfo waitSemaphoreCount(int value) { nwaitSemaphoreCount(address(), value); return this; }
	/** Sets the address of the specified {@link LongBuffer} to the {@code pWaitSemaphores} field. */
	public VkSubmitInfo pWaitSemaphores(LongBuffer value) { npWaitSemaphores(address(), value); return this; }
	/** Sets the address of the specified {@link IntBuffer} to the {@code pWaitDstStageMask} field. */
	public VkSubmitInfo pWaitDstStageMask(IntBuffer value) { npWaitDstStageMask(address(), value); return this; }
	/** Sets the specified value to the {@code commandBufferCount} field. */
	public VkSubmitInfo commandBufferCount(int value) { ncommandBufferCount(address(), value); return this; }
	/** Sets the address of the specified {@link PointerBuffer} to the {@code pCommandBuffers} field. */
	public VkSubmitInfo pCommandBuffers(PointerBuffer value) { npCommandBuffers(address(), value); return this; }
	/** Sets the specified value to the {@code signalSemaphoreCount} field. */
	public VkSubmitInfo signalSemaphoreCount(int value) { nsignalSemaphoreCount(address(), value); return this; }
	/** Sets the address of the specified {@link LongBuffer} to the {@code pSignalSemaphores} field. */
	public VkSubmitInfo pSignalSemaphores(LongBuffer value) { npSignalSemaphores(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkSubmitInfo set(
		int sType,
		long pNext,
		int waitSemaphoreCount,
		LongBuffer pWaitSemaphores,
		IntBuffer pWaitDstStageMask,
		int commandBufferCount,
		PointerBuffer pCommandBuffers,
		int signalSemaphoreCount,
		LongBuffer pSignalSemaphores
	) {
		sType(sType);
		pNext(pNext);
		waitSemaphoreCount(waitSemaphoreCount);
		pWaitSemaphores(pWaitSemaphores);
		pWaitDstStageMask(pWaitDstStageMask);
		commandBufferCount(commandBufferCount);
		pCommandBuffers(pCommandBuffers);
		signalSemaphoreCount(signalSemaphoreCount);
		pSignalSemaphores(pSignalSemaphores);

		return this;
	}

	/** Unsafe version of {@link #set(VkSubmitInfo) set}. */
	public VkSubmitInfo nset(long struct) {
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
	public VkSubmitInfo set(VkSubmitInfo src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkSubmitInfo) set}. */
	public VkSubmitInfo set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkSubmitInfo} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkSubmitInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkSubmitInfo} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkSubmitInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkSubmitInfo} instance allocated with {@link BufferUtils}. */
	public static VkSubmitInfo create() {
		return new VkSubmitInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkSubmitInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkSubmitInfo create(long address) {
		return address == NULL ? null : new VkSubmitInfo(address, null);
	}

	/**
	 * Returns a new {@link VkSubmitInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSubmitInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSubmitInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkSubmitInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkSubmitInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkSubmitInfo.PNEXT); }
	/** Unsafe version of {@link #waitSemaphoreCount}. */
	public static int nwaitSemaphoreCount(long struct) { return memGetInt(struct + VkSubmitInfo.WAITSEMAPHORECOUNT); }
	/** Unsafe version of {@link #pWaitSemaphores(int) pWaitSemaphores}. */
	public static LongBuffer npWaitSemaphores(long struct, int capacity) { return memLongBuffer(memGetAddress(struct + VkSubmitInfo.PWAITSEMAPHORES), capacity); }
	/** Unsafe version of {@link #pWaitDstStageMask(int) pWaitDstStageMask}. */
	public static IntBuffer npWaitDstStageMask(long struct, int capacity) { return memIntBuffer(memGetAddress(struct + VkSubmitInfo.PWAITDSTSTAGEMASK), capacity); }
	/** Unsafe version of {@link #commandBufferCount}. */
	public static int ncommandBufferCount(long struct) { return memGetInt(struct + VkSubmitInfo.COMMANDBUFFERCOUNT); }
	/** Unsafe version of {@link #pCommandBuffers(int) pCommandBuffers}. */
	public static PointerBuffer npCommandBuffers(long struct, int capacity) { return memPointerBuffer(memGetAddress(struct + VkSubmitInfo.PCOMMANDBUFFERS), capacity); }
	/** Unsafe version of {@link #signalSemaphoreCount}. */
	public static int nsignalSemaphoreCount(long struct) { return memGetInt(struct + VkSubmitInfo.SIGNALSEMAPHORECOUNT); }
	/** Unsafe version of {@link #pSignalSemaphores(int) pSignalSemaphores}. */
	public static LongBuffer npSignalSemaphores(long struct, int capacity) { return memLongBuffer(memGetAddress(struct + VkSubmitInfo.PSIGNALSEMAPHORES), capacity); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkSubmitInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkSubmitInfo.PNEXT, value); }
	/** Unsafe version of {@link #waitSemaphoreCount(int) waitSemaphoreCount}. */
	public static void nwaitSemaphoreCount(long struct, int value) { memPutInt(struct + VkSubmitInfo.WAITSEMAPHORECOUNT, value); }
	/** Unsafe version of {@link #pWaitSemaphores(LongBuffer) pWaitSemaphores}. */
	public static void npWaitSemaphores(long struct, LongBuffer value) { memPutAddress(struct + VkSubmitInfo.PWAITSEMAPHORES, memAddressSafe(value)); }
	/** Unsafe version of {@link #pWaitDstStageMask(IntBuffer) pWaitDstStageMask}. */
	public static void npWaitDstStageMask(long struct, IntBuffer value) { memPutAddress(struct + VkSubmitInfo.PWAITDSTSTAGEMASK, memAddressSafe(value)); }
	/** Unsafe version of {@link #commandBufferCount(int) commandBufferCount}. */
	public static void ncommandBufferCount(long struct, int value) { memPutInt(struct + VkSubmitInfo.COMMANDBUFFERCOUNT, value); }
	/** Unsafe version of {@link #pCommandBuffers(PointerBuffer) pCommandBuffers}. */
	public static void npCommandBuffers(long struct, PointerBuffer value) { memPutAddress(struct + VkSubmitInfo.PCOMMANDBUFFERS, memAddressSafe(value)); }
	/** Unsafe version of {@link #signalSemaphoreCount(int) signalSemaphoreCount}. */
	public static void nsignalSemaphoreCount(long struct, int value) { memPutInt(struct + VkSubmitInfo.SIGNALSEMAPHORECOUNT, value); }
	/** Unsafe version of {@link #pSignalSemaphores(LongBuffer) pSignalSemaphores}. */
	public static void npSignalSemaphores(long struct, LongBuffer value) { memPutAddress(struct + VkSubmitInfo.PSIGNALSEMAPHORES, memAddressSafe(value)); }

	// -----------------------------------

	/** An array of {@link VkSubmitInfo} structs. */
	public static final class Buffer extends StructBuffer<VkSubmitInfo, Buffer> {

		/**
		 * Creates a new {@link VkSubmitInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkSubmitInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkSubmitInfo newInstance(long address) {
			return new VkSubmitInfo(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkSubmitInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkSubmitInfo.npNext(address()); }
		/** Returns the value of the {@code waitSemaphoreCount} field. */
		public int waitSemaphoreCount() { return VkSubmitInfo.nwaitSemaphoreCount(address()); }
		/**
		 * Returns a {@link LongBuffer} view of the data pointed to by the {@code pWaitSemaphores} field.
		 *
		 * @param capacity the number of elements in the returned {@link LongBuffer}
		 */
		public LongBuffer pWaitSemaphores(int capacity) { return VkSubmitInfo.npWaitSemaphores(address(), capacity); }
		/**
		 * Returns a {@link IntBuffer} view of the data pointed to by the {@code pWaitDstStageMask} field.
		 *
		 * @param capacity the number of elements in the returned {@link IntBuffer}
		 */
		public IntBuffer pWaitDstStageMask(int capacity) { return VkSubmitInfo.npWaitDstStageMask(address(), capacity); }
		/** Returns the value of the {@code commandBufferCount} field. */
		public int commandBufferCount() { return VkSubmitInfo.ncommandBufferCount(address()); }
		/**
		 * Returns a {@link PointerBuffer} view of the data pointed to by the {@code pCommandBuffers} field.
		 *
		 * @param capacity the number of elements in the returned {@link PointerBuffer}
		 */
		public PointerBuffer pCommandBuffers(int capacity) { return VkSubmitInfo.npCommandBuffers(address(), capacity); }
		/** Returns the value of the {@code signalSemaphoreCount} field. */
		public int signalSemaphoreCount() { return VkSubmitInfo.nsignalSemaphoreCount(address()); }
		/**
		 * Returns a {@link LongBuffer} view of the data pointed to by the {@code pSignalSemaphores} field.
		 *
		 * @param capacity the number of elements in the returned {@link LongBuffer}
		 */
		public LongBuffer pSignalSemaphores(int capacity) { return VkSubmitInfo.npSignalSemaphores(address(), capacity); }

		/** Sets the specified value to the {@code sType} field. */
		public VkSubmitInfo.Buffer sType(int value) { VkSubmitInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkSubmitInfo.Buffer pNext(long value) { VkSubmitInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code waitSemaphoreCount} field. */
		public VkSubmitInfo.Buffer waitSemaphoreCount(int value) { VkSubmitInfo.nwaitSemaphoreCount(address(), value); return this; }
		/** Sets the address of the specified {@link LongBuffer} to the {@code pWaitSemaphores} field. */
		public VkSubmitInfo.Buffer pWaitSemaphores(LongBuffer value) { VkSubmitInfo.npWaitSemaphores(address(), value); return this; }
		/** Sets the address of the specified {@link IntBuffer} to the {@code pWaitDstStageMask} field. */
		public VkSubmitInfo.Buffer pWaitDstStageMask(IntBuffer value) { VkSubmitInfo.npWaitDstStageMask(address(), value); return this; }
		/** Sets the specified value to the {@code commandBufferCount} field. */
		public VkSubmitInfo.Buffer commandBufferCount(int value) { VkSubmitInfo.ncommandBufferCount(address(), value); return this; }
		/** Sets the address of the specified {@link PointerBuffer} to the {@code pCommandBuffers} field. */
		public VkSubmitInfo.Buffer pCommandBuffers(PointerBuffer value) { VkSubmitInfo.npCommandBuffers(address(), value); return this; }
		/** Sets the specified value to the {@code signalSemaphoreCount} field. */
		public VkSubmitInfo.Buffer signalSemaphoreCount(int value) { VkSubmitInfo.nsignalSemaphoreCount(address(), value); return this; }
		/** Sets the address of the specified {@link LongBuffer} to the {@code pSignalSemaphores} field. */
		public VkSubmitInfo.Buffer pSignalSemaphores(LongBuffer value) { VkSubmitInfo.npSignalSemaphores(address(), value); return this; }

	}

}