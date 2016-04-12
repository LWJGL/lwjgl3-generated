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
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkCommandBufferBeginInfo.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkCommandBufferBeginInfo">Vulkan Specification</a>
 * 
 * <p>Contrains information about a command buffer recording.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code sType} <b>must</b> be {@link VK10#VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO}</li>
 * <li>{@code pNext} <b>must</b> be {@code NULL}</li>
 * <li>{@code flags} <b>must</b> be a valid combination of {@code VkCommandBufferUsageFlagBits} values</li>
 * <li>If {@code flags} contains {@link VK10#VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT}, the {@code renderPass} member of {@code pInheritanceInfo} <b>must</b> be a
 * valid {@code VkRenderPass}</li>
 * <li>If {@code flags} contains {@link VK10#VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT}, the {@code subpass} member of {@code pInheritanceInfo} <b>must</b> be a valid
 * subpass index within the {@code renderPass} member of {@code pInheritanceInfo}</li>
 * <li>If {@code flags} contains {@link VK10#VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT}, the {@code framebuffer} member of {@code pInheritanceInfo} <b>must</b> be
 * either {@link VK10#VK_NULL_HANDLE NULL_HANDLE}, or a valid {@code VkFramebuffer} that is compatible with the {@code renderPass} member of {@code pInheritanceInfo}</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code sType} &ndash; the type of this structure. Must be: {@link VK10#VK_STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO STRUCTURE_TYPE_COMMAND_BUFFER_BEGIN_INFO}</li>
 * <li>{@code pNext} &ndash; reserved for use by extensions</li>
 * <li>{@code flags} &ndash; a combination of bitfield flags indicating usage behavior for the command buffer. One or more of:<br><table><tr><td>{@link VK10#VK_COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT COMMAND_BUFFER_USAGE_ONE_TIME_SUBMIT_BIT}</td></tr><tr><td>{@link VK10#VK_COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT COMMAND_BUFFER_USAGE_RENDER_PASS_CONTINUE_BIT}</td></tr><tr><td>{@link VK10#VK_COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT COMMAND_BUFFER_USAGE_SIMULTANEOUS_USE_BIT}</td></tr></table></li>
 * <li>{@code pInheritanceInfo} &ndash; 
 * a pointer to a {@link VkCommandBufferInheritanceInfo} structure, which is used if {@code commandBuffer} is a secondary command buffer. If this is a primary
 * command buffer, then this value is ignored.</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkCommandBufferBeginInfo {
    VkStructureType sType;
    const void * pNext;
    VkCommandBufferUsageFlags flags;
    const VkCommandBufferInheritanceInfo * pInheritanceInfo;
}</code></pre>
 */
public class VkCommandBufferBeginInfo extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		STYPE,
		PNEXT,
		FLAGS,
		PINHERITANCEINFO;

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
		FLAGS = layout.offsetof(2);
		PINHERITANCEINFO = layout.offsetof(3);
	}

	VkCommandBufferBeginInfo(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkCommandBufferBeginInfo} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkCommandBufferBeginInfo(ByteBuffer container) {
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
	/** Returns a {@link VkCommandBufferInheritanceInfo} view of the struct pointed to by the {@code pInheritanceInfo} field. */
	public VkCommandBufferInheritanceInfo pInheritanceInfo() { return npInheritanceInfo(address()); }

	/** Sets the specified value to the {@code sType} field. */
	public VkCommandBufferBeginInfo sType(int value) { nsType(address(), value); return this; }
	/** Sets the specified value to the {@code pNext} field. */
	public VkCommandBufferBeginInfo pNext(long value) { npNext(address(), value); return this; }
	/** Sets the specified value to the {@code flags} field. */
	public VkCommandBufferBeginInfo flags(int value) { nflags(address(), value); return this; }
	/** Sets the address of the specified {@link VkCommandBufferInheritanceInfo} to the {@code pInheritanceInfo} field. */
	public VkCommandBufferBeginInfo pInheritanceInfo(VkCommandBufferInheritanceInfo value) { npInheritanceInfo(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkCommandBufferBeginInfo set(
		int sType,
		long pNext,
		int flags,
		VkCommandBufferInheritanceInfo pInheritanceInfo
	) {
		sType(sType);
		pNext(pNext);
		flags(flags);
		pInheritanceInfo(pInheritanceInfo);

		return this;
	}

	/** Unsafe version of {@link #set(VkCommandBufferBeginInfo) set}. */
	public VkCommandBufferBeginInfo nset(long struct) {
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
	public VkCommandBufferBeginInfo set(VkCommandBufferBeginInfo src) {
		return nset(src.address());
	}

	// -----------------------------------

	/** Returns a new {@link VkCommandBufferBeginInfo} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkCommandBufferBeginInfo malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkCommandBufferBeginInfo} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkCommandBufferBeginInfo calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkCommandBufferBeginInfo} instance allocated with {@link BufferUtils}. */
	public static VkCommandBufferBeginInfo create() {
		return new VkCommandBufferBeginInfo(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkCommandBufferBeginInfo} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkCommandBufferBeginInfo create(long address) {
		return address == NULL ? null : new VkCommandBufferBeginInfo(address, null);
	}

	/**
	 * Returns a new {@link VkCommandBufferBeginInfo.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkCommandBufferBeginInfo.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkCommandBufferBeginInfo.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkCommandBufferBeginInfo.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkCommandBufferBeginInfo} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkCommandBufferBeginInfo mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkCommandBufferBeginInfo} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkCommandBufferBeginInfo callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkCommandBufferBeginInfo} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkCommandBufferBeginInfo mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkCommandBufferBeginInfo} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkCommandBufferBeginInfo callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkCommandBufferBeginInfo.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkCommandBufferBeginInfo.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkCommandBufferBeginInfo.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkCommandBufferBeginInfo.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #sType}. */
	public static int nsType(long struct) { return memGetInt(struct + VkCommandBufferBeginInfo.STYPE); }
	/** Unsafe version of {@link #pNext}. */
	public static long npNext(long struct) { return memGetAddress(struct + VkCommandBufferBeginInfo.PNEXT); }
	/** Unsafe version of {@link #flags}. */
	public static int nflags(long struct) { return memGetInt(struct + VkCommandBufferBeginInfo.FLAGS); }
	/** Unsafe version of {@link #pInheritanceInfo}. */
	public static VkCommandBufferInheritanceInfo npInheritanceInfo(long struct) { return VkCommandBufferInheritanceInfo.create(memGetAddress(struct + VkCommandBufferBeginInfo.PINHERITANCEINFO)); }

	/** Unsafe version of {@link #sType(int) sType}. */
	public static void nsType(long struct, int value) { memPutInt(struct + VkCommandBufferBeginInfo.STYPE, value); }
	/** Unsafe version of {@link #pNext(long) pNext}. */
	public static void npNext(long struct, long value) { memPutAddress(struct + VkCommandBufferBeginInfo.PNEXT, value); }
	/** Unsafe version of {@link #flags(int) flags}. */
	public static void nflags(long struct, int value) { memPutInt(struct + VkCommandBufferBeginInfo.FLAGS, value); }
	/** Unsafe version of {@link #pInheritanceInfo(VkCommandBufferInheritanceInfo) pInheritanceInfo}. */
	public static void npInheritanceInfo(long struct, VkCommandBufferInheritanceInfo value) { memPutAddress(struct + VkCommandBufferBeginInfo.PINHERITANCEINFO, addressSafe(value)); }

	// -----------------------------------

	/** An array of {@link VkCommandBufferBeginInfo} structs. */
	public static final class Buffer extends StructBuffer<VkCommandBufferBeginInfo, Buffer> {

		/**
		 * Creates a new {@link VkCommandBufferBeginInfo.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkCommandBufferBeginInfo#SIZEOF}, and its mark will be undefined.
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
		protected VkCommandBufferBeginInfo newInstance(long address) {
			return new VkCommandBufferBeginInfo(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code sType} field. */
		public int sType() { return VkCommandBufferBeginInfo.nsType(address()); }
		/** Returns the value of the {@code pNext} field. */
		public long pNext() { return VkCommandBufferBeginInfo.npNext(address()); }
		/** Returns the value of the {@code flags} field. */
		public int flags() { return VkCommandBufferBeginInfo.nflags(address()); }
		/** Returns a {@link VkCommandBufferInheritanceInfo} view of the struct pointed to by the {@code pInheritanceInfo} field. */
		public VkCommandBufferInheritanceInfo pInheritanceInfo() { return VkCommandBufferBeginInfo.npInheritanceInfo(address()); }

		/** Sets the specified value to the {@code sType} field. */
		public VkCommandBufferBeginInfo.Buffer sType(int value) { VkCommandBufferBeginInfo.nsType(address(), value); return this; }
		/** Sets the specified value to the {@code pNext} field. */
		public VkCommandBufferBeginInfo.Buffer pNext(long value) { VkCommandBufferBeginInfo.npNext(address(), value); return this; }
		/** Sets the specified value to the {@code flags} field. */
		public VkCommandBufferBeginInfo.Buffer flags(int value) { VkCommandBufferBeginInfo.nflags(address(), value); return this; }
		/** Sets the address of the specified {@link VkCommandBufferInheritanceInfo} to the {@code pInheritanceInfo} field. */
		public VkCommandBufferBeginInfo.Buffer pInheritanceInfo(VkCommandBufferInheritanceInfo value) { VkCommandBufferBeginInfo.npInheritanceInfo(address(), value); return this; }

	}

}