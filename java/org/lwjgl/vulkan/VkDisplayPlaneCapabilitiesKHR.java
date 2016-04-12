/*
 * Copyright LWJGL. All rights reserved.
 * License terms: http://lwjgl.org/license.php
 * MACHINE GENERATED FILE, DO NOT EDIT
 */
package org.lwjgl.vulkan;

import java.nio.*;

import org.lwjgl.*;
import org.lwjgl.system.*;

import static org.lwjgl.system.MemoryUtil.*;
import static org.lwjgl.system.MemoryStack.*;

/**
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0/man/html/VkDisplayPlaneCapabilitiesKHR.html">Khronos Reference Page</a><br>
 * <a href="https://www.khronos.org/registry/vulkan/specs/1.0-wsi_extensions/xhtml/vkspec.html#VkDisplayPlaneCapabilitiesKHR">Vulkan Specification</a>
 * 
 * <p>Describes capabilities of a mode and plane combination.</p>
 * 
 * <h5>Valid Usage</h5>
 * 
 * <ul>
 * <li>{@code supportedAlpha} <b>must</b> be a valid combination of {@code VkDisplayPlaneAlphaFlagBitsKHR} values</li>
 * </ul>
 * 
 * <h3>Member documentation</h3>
 * 
 * <ul>
 * <li>{@code supportedAlpha} &ndash; a bitmask describing the supported alpha blending modes. One or more of:<br><table><tr><td>{@link KHRDisplay#VK_DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR DISPLAY_PLANE_ALPHA_GLOBAL_BIT_KHR}</td><td>{@link KHRDisplay#VK_DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR DISPLAY_PLANE_ALPHA_OPAQUE_BIT_KHR}</td></tr><tr><td>{@link KHRDisplay#VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR DISPLAY_PLANE_ALPHA_PER_PIXEL_BIT_KHR}</td><td>{@link KHRDisplay#VK_DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR DISPLAY_PLANE_ALPHA_PER_PIXEL_PREMULTIPLIED_BIT_KHR}</td></tr></table></li>
 * <li>{@code minSrcPosition} &ndash; the minimum source rect offset supported by this plane using the specified mode</li>
 * <li>{@code maxSrcPosition} &ndash; the maximum source rect offset supported by this plane using the specified mode</li>
 * <li>{@code minSrcExtent} &ndash; the minimum source rect size supported by this plane using the specified mode</li>
 * <li>{@code maxSrcExtent} &ndash; the maximum source rect size supported by this plane using the specified mode</li>
 * <li>{@code minDstPosition} &ndash; the minimum output rect offset supported by this plane using the specified mode</li>
 * <li>{@code maxDstPosition} &ndash; the maximum output rect offset supported by this plane using the specified mode</li>
 * <li>{@code minDstExtent} &ndash; the minimum output rect size supported by this plane using the specified mode</li>
 * <li>{@code maxDstExtent} &ndash; the maximum output rect size supported by this plane using the specified mode</li>
 * </ul>
 * 
 * <h3>Layout</h3>
 * 
 * <pre><code>struct VkDisplayPlaneCapabilitiesKHR {
    VkDisplayPlaneAlphaFlagsKHR supportedAlpha;
    {@link VkOffset2D VkOffset2D} minSrcPosition;
    {@link VkOffset2D VkOffset2D} maxSrcPosition;
    {@link VkExtent2D VkExtent2D} minSrcExtent;
    {@link VkExtent2D VkExtent2D} maxSrcExtent;
    {@link VkOffset2D VkOffset2D} minDstPosition;
    {@link VkOffset2D VkOffset2D} maxDstPosition;
    {@link VkExtent2D VkExtent2D} minDstExtent;
    {@link VkExtent2D VkExtent2D} maxDstExtent;
}</code></pre>
 */
public class VkDisplayPlaneCapabilitiesKHR extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	public static final int ALIGNOF;

	/** The struct member offsets. */
	public static final int
		SUPPORTEDALPHA,
		MINSRCPOSITION,
		MAXSRCPOSITION,
		MINSRCEXTENT,
		MAXSRCEXTENT,
		MINDSTPOSITION,
		MAXDSTPOSITION,
		MINDSTEXTENT,
		MAXDSTEXTENT;

	static {
		Layout layout = __struct(
			__member(4),
			__member(VkOffset2D.SIZEOF, VkOffset2D.ALIGNOF),
			__member(VkOffset2D.SIZEOF, VkOffset2D.ALIGNOF),
			__member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
			__member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
			__member(VkOffset2D.SIZEOF, VkOffset2D.ALIGNOF),
			__member(VkOffset2D.SIZEOF, VkOffset2D.ALIGNOF),
			__member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF),
			__member(VkExtent2D.SIZEOF, VkExtent2D.ALIGNOF)
		);

		SIZEOF = layout.getSize();
		ALIGNOF = layout.getAlignment();

		SUPPORTEDALPHA = layout.offsetof(0);
		MINSRCPOSITION = layout.offsetof(1);
		MAXSRCPOSITION = layout.offsetof(2);
		MINSRCEXTENT = layout.offsetof(3);
		MAXSRCEXTENT = layout.offsetof(4);
		MINDSTPOSITION = layout.offsetof(5);
		MAXDSTPOSITION = layout.offsetof(6);
		MINDSTEXTENT = layout.offsetof(7);
		MAXDSTEXTENT = layout.offsetof(8);
	}

	VkDisplayPlaneCapabilitiesKHR(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkDisplayPlaneCapabilitiesKHR} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkDisplayPlaneCapabilitiesKHR(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code supportedAlpha} field. */
	public int supportedAlpha() { return nsupportedAlpha(address()); }
	/** Returns a {@link VkOffset2D} view of the {@code minSrcPosition} field. */
	public VkOffset2D minSrcPosition() { return nminSrcPosition(address()); }
	/** Returns a {@link VkOffset2D} view of the {@code maxSrcPosition} field. */
	public VkOffset2D maxSrcPosition() { return nmaxSrcPosition(address()); }
	/** Returns a {@link VkExtent2D} view of the {@code minSrcExtent} field. */
	public VkExtent2D minSrcExtent() { return nminSrcExtent(address()); }
	/** Returns a {@link VkExtent2D} view of the {@code maxSrcExtent} field. */
	public VkExtent2D maxSrcExtent() { return nmaxSrcExtent(address()); }
	/** Returns a {@link VkOffset2D} view of the {@code minDstPosition} field. */
	public VkOffset2D minDstPosition() { return nminDstPosition(address()); }
	/** Returns a {@link VkOffset2D} view of the {@code maxDstPosition} field. */
	public VkOffset2D maxDstPosition() { return nmaxDstPosition(address()); }
	/** Returns a {@link VkExtent2D} view of the {@code minDstExtent} field. */
	public VkExtent2D minDstExtent() { return nminDstExtent(address()); }
	/** Returns a {@link VkExtent2D} view of the {@code maxDstExtent} field. */
	public VkExtent2D maxDstExtent() { return nmaxDstExtent(address()); }

	// -----------------------------------

	/** Returns a new {@link VkDisplayPlaneCapabilitiesKHR} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed. */
	public static VkDisplayPlaneCapabilitiesKHR malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkDisplayPlaneCapabilitiesKHR} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed. */
	public static VkDisplayPlaneCapabilitiesKHR calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkDisplayPlaneCapabilitiesKHR} instance allocated with {@link BufferUtils}. */
	public static VkDisplayPlaneCapabilitiesKHR create() {
		return new VkDisplayPlaneCapabilitiesKHR(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkDisplayPlaneCapabilitiesKHR} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkDisplayPlaneCapabilitiesKHR create(long address) {
		return address == NULL ? null : new VkDisplayPlaneCapabilitiesKHR(address, null);
	}

	/**
	 * Returns a new {@link VkDisplayPlaneCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memAlloc memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplayPlaneCapabilitiesKHR.Buffer} instance allocated with {@link MemoryUtil#memCalloc memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplayPlaneCapabilitiesKHR.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkDisplayPlaneCapabilitiesKHR.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	// -----------------------------------

	/** Returns a new {@link VkDisplayPlaneCapabilitiesKHR} instance allocated on the thread-local {@link MemoryStack}. */
	public static VkDisplayPlaneCapabilitiesKHR mallocStack() {
		return mallocStack(stackGet());
	}

	/** Returns a new {@link VkDisplayPlaneCapabilitiesKHR} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero. */
	public static VkDisplayPlaneCapabilitiesKHR callocStack() {
		return callocStack(stackGet());
	}

	/**
	 * Returns a new {@link VkDisplayPlaneCapabilitiesKHR} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDisplayPlaneCapabilitiesKHR mallocStack(MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDisplayPlaneCapabilitiesKHR} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 */
	public static VkDisplayPlaneCapabilitiesKHR callocStack(MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, 1, SIZEOF));
	}

	/**
	 * Returns a new {@link VkDisplayPlaneCapabilitiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity) {
		return mallocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDisplayPlaneCapabilitiesKHR.Buffer} instance allocated on the thread-local {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity) {
		return callocStack(capacity, stackGet());
	}

	/**
	 * Returns a new {@link VkDisplayPlaneCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack}.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer mallocStack(int capacity, MemoryStack stack) {
		return create(stack.nmalloc(ALIGNOF, capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkDisplayPlaneCapabilitiesKHR.Buffer} instance allocated on the specified {@link MemoryStack} and initializes all its bits to zero.
	 *
	 * @param stack the stack from which to allocate
	 * @param capacity the buffer capacity
	 */
	public static Buffer callocStack(int capacity, MemoryStack stack) {
		return create(stack.ncalloc(ALIGNOF, capacity, SIZEOF), capacity);
	}

	// -----------------------------------

	/** Unsafe version of {@link #supportedAlpha}. */
	public static int nsupportedAlpha(long struct) { return memGetInt(struct + VkDisplayPlaneCapabilitiesKHR.SUPPORTEDALPHA); }
	/** Unsafe version of {@link #minSrcPosition}. */
	public static VkOffset2D nminSrcPosition(long struct) { return VkOffset2D.create(struct + VkDisplayPlaneCapabilitiesKHR.MINSRCPOSITION); }
	/** Unsafe version of {@link #maxSrcPosition}. */
	public static VkOffset2D nmaxSrcPosition(long struct) { return VkOffset2D.create(struct + VkDisplayPlaneCapabilitiesKHR.MAXSRCPOSITION); }
	/** Unsafe version of {@link #minSrcExtent}. */
	public static VkExtent2D nminSrcExtent(long struct) { return VkExtent2D.create(struct + VkDisplayPlaneCapabilitiesKHR.MINSRCEXTENT); }
	/** Unsafe version of {@link #maxSrcExtent}. */
	public static VkExtent2D nmaxSrcExtent(long struct) { return VkExtent2D.create(struct + VkDisplayPlaneCapabilitiesKHR.MAXSRCEXTENT); }
	/** Unsafe version of {@link #minDstPosition}. */
	public static VkOffset2D nminDstPosition(long struct) { return VkOffset2D.create(struct + VkDisplayPlaneCapabilitiesKHR.MINDSTPOSITION); }
	/** Unsafe version of {@link #maxDstPosition}. */
	public static VkOffset2D nmaxDstPosition(long struct) { return VkOffset2D.create(struct + VkDisplayPlaneCapabilitiesKHR.MAXDSTPOSITION); }
	/** Unsafe version of {@link #minDstExtent}. */
	public static VkExtent2D nminDstExtent(long struct) { return VkExtent2D.create(struct + VkDisplayPlaneCapabilitiesKHR.MINDSTEXTENT); }
	/** Unsafe version of {@link #maxDstExtent}. */
	public static VkExtent2D nmaxDstExtent(long struct) { return VkExtent2D.create(struct + VkDisplayPlaneCapabilitiesKHR.MAXDSTEXTENT); }

	// -----------------------------------

	/** An array of {@link VkDisplayPlaneCapabilitiesKHR} structs. */
	public static final class Buffer extends StructBuffer<VkDisplayPlaneCapabilitiesKHR, Buffer> {

		/**
		 * Creates a new {@link VkDisplayPlaneCapabilitiesKHR.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkDisplayPlaneCapabilitiesKHR#SIZEOF}, and its mark will be undefined.
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
		protected VkDisplayPlaneCapabilitiesKHR newInstance(long address) {
			return new VkDisplayPlaneCapabilitiesKHR(address, getContainer());
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code supportedAlpha} field. */
		public int supportedAlpha() { return VkDisplayPlaneCapabilitiesKHR.nsupportedAlpha(address()); }
		/** Returns a {@link VkOffset2D} view of the {@code minSrcPosition} field. */
		public VkOffset2D minSrcPosition() { return VkDisplayPlaneCapabilitiesKHR.nminSrcPosition(address()); }
		/** Returns a {@link VkOffset2D} view of the {@code maxSrcPosition} field. */
		public VkOffset2D maxSrcPosition() { return VkDisplayPlaneCapabilitiesKHR.nmaxSrcPosition(address()); }
		/** Returns a {@link VkExtent2D} view of the {@code minSrcExtent} field. */
		public VkExtent2D minSrcExtent() { return VkDisplayPlaneCapabilitiesKHR.nminSrcExtent(address()); }
		/** Returns a {@link VkExtent2D} view of the {@code maxSrcExtent} field. */
		public VkExtent2D maxSrcExtent() { return VkDisplayPlaneCapabilitiesKHR.nmaxSrcExtent(address()); }
		/** Returns a {@link VkOffset2D} view of the {@code minDstPosition} field. */
		public VkOffset2D minDstPosition() { return VkDisplayPlaneCapabilitiesKHR.nminDstPosition(address()); }
		/** Returns a {@link VkOffset2D} view of the {@code maxDstPosition} field. */
		public VkOffset2D maxDstPosition() { return VkDisplayPlaneCapabilitiesKHR.nmaxDstPosition(address()); }
		/** Returns a {@link VkExtent2D} view of the {@code minDstExtent} field. */
		public VkExtent2D minDstExtent() { return VkDisplayPlaneCapabilitiesKHR.nminDstExtent(address()); }
		/** Returns a {@link VkExtent2D} view of the {@code maxDstExtent} field. */
		public VkExtent2D maxDstExtent() { return VkDisplayPlaneCapabilitiesKHR.nmaxDstExtent(address()); }

	}

}