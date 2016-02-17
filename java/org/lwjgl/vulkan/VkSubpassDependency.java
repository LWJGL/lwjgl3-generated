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
 * struct VkSubpassDependency {
 *     uint32_t srcSubpass;
 *     uint32_t dstSubpass;
 *     VkPipelineStageFlags srcStageMask;
 *     VkPipelineStageFlags dstStageMask;
 *     VkAccessFlags srcAccessMask;
 *     VkAccessFlags dstAccessMask;
 *     VkDependencyFlags dependencyFlags;
 * }</code></pre>
 */
public class VkSubpassDependency extends Struct {

	/** The struct size in bytes. */
	public static final int SIZEOF;

	@JavadocExclude
	public static final int __ALIGNMENT;

	/** The struct member offsets. */
	public static final int
		SRCSUBPASS,
		DSTSUBPASS,
		SRCSTAGEMASK,
		DSTSTAGEMASK,
		SRCACCESSMASK,
		DSTACCESSMASK,
		DEPENDENCYFLAGS;

	static {
		Layout layout = __struct(
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4),
			__member(4)
		);

		SIZEOF = layout.getSize();
		__ALIGNMENT = layout.getAlignment();

		SRCSUBPASS = layout.offsetof(0);
		DSTSUBPASS = layout.offsetof(1);
		SRCSTAGEMASK = layout.offsetof(2);
		DSTSTAGEMASK = layout.offsetof(3);
		SRCACCESSMASK = layout.offsetof(4);
		DSTACCESSMASK = layout.offsetof(5);
		DEPENDENCYFLAGS = layout.offsetof(6);
	}

	VkSubpassDependency(long address, ByteBuffer container) {
		super(address, container);
	}

	/**
	 * Creates a {@link VkSubpassDependency} instance at the current position of the specified {@link ByteBuffer} container. Changes to the buffer's content will be
	 * visible to the struct instance and vice versa.
	 *
	 * <p>The created instance holds a strong reference to the container object.</p>
	 */
	public VkSubpassDependency(ByteBuffer container) {
		this(memAddress(container), checkContainer(container, SIZEOF));
	}

	@Override
	public int sizeof() { return SIZEOF; }

	/** Returns the value of the {@code srcSubpass} field. */
	public int srcSubpass() { return nsrcSubpass(address()); }
	/** Returns the value of the {@code dstSubpass} field. */
	public int dstSubpass() { return ndstSubpass(address()); }
	/** Returns the value of the {@code srcStageMask} field. */
	public int srcStageMask() { return nsrcStageMask(address()); }
	/** Returns the value of the {@code dstStageMask} field. */
	public int dstStageMask() { return ndstStageMask(address()); }
	/** Returns the value of the {@code srcAccessMask} field. */
	public int srcAccessMask() { return nsrcAccessMask(address()); }
	/** Returns the value of the {@code dstAccessMask} field. */
	public int dstAccessMask() { return ndstAccessMask(address()); }
	/** Returns the value of the {@code dependencyFlags} field. */
	public int dependencyFlags() { return ndependencyFlags(address()); }

	/** Sets the specified value to the {@code srcSubpass} field. */
	public VkSubpassDependency srcSubpass(int value) { nsrcSubpass(address(), value); return this; }
	/** Sets the specified value to the {@code dstSubpass} field. */
	public VkSubpassDependency dstSubpass(int value) { ndstSubpass(address(), value); return this; }
	/** Sets the specified value to the {@code srcStageMask} field. */
	public VkSubpassDependency srcStageMask(int value) { nsrcStageMask(address(), value); return this; }
	/** Sets the specified value to the {@code dstStageMask} field. */
	public VkSubpassDependency dstStageMask(int value) { ndstStageMask(address(), value); return this; }
	/** Sets the specified value to the {@code srcAccessMask} field. */
	public VkSubpassDependency srcAccessMask(int value) { nsrcAccessMask(address(), value); return this; }
	/** Sets the specified value to the {@code dstAccessMask} field. */
	public VkSubpassDependency dstAccessMask(int value) { ndstAccessMask(address(), value); return this; }
	/** Sets the specified value to the {@code dependencyFlags} field. */
	public VkSubpassDependency dependencyFlags(int value) { ndependencyFlags(address(), value); return this; }

	/** Initializes this struct with the specified values. */
	public VkSubpassDependency set(
		int srcSubpass,
		int dstSubpass,
		int srcStageMask,
		int dstStageMask,
		int srcAccessMask,
		int dstAccessMask,
		int dependencyFlags
	) {
		srcSubpass(srcSubpass);
		dstSubpass(dstSubpass);
		srcStageMask(srcStageMask);
		dstStageMask(dstStageMask);
		srcAccessMask(srcAccessMask);
		dstAccessMask(dstAccessMask);
		dependencyFlags(dependencyFlags);

		return this;
	}

	/** Unsafe version of {@link #set(VkSubpassDependency) set}. */
	public VkSubpassDependency nset(long struct) {
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
	public VkSubpassDependency set(VkSubpassDependency src) {
		return nset(src.address());
	}

	/** {@link ByteBuffer} version of {@link #set(VkSubpassDependency) set}. */
	public VkSubpassDependency set(ByteBuffer struct) {
		if ( CHECKS )
			checkBuffer(struct, SIZEOF);
		return nset(memAddress(struct));
	}

	// -----------------------------------

	/** Returns a new {@link VkSubpassDependency} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed. */
	public static VkSubpassDependency malloc() {
		return create(nmemAlloc(SIZEOF));
	}

	/** Returns a new {@link VkSubpassDependency} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed. */
	public static VkSubpassDependency calloc() {
		return create(nmemCalloc(1, SIZEOF));
	}

	/** Returns a new {@link VkSubpassDependency} instance allocated with {@link BufferUtils}. */
	public static VkSubpassDependency create() {
		return new VkSubpassDependency(BufferUtils.createByteBuffer(SIZEOF));
	}

	/** Returns a new {@link VkSubpassDependency} instance for the specified memory address or {@code null} if the address is {@code NULL}. */
	public static VkSubpassDependency create(long address) {
		return address == NULL ? null : new VkSubpassDependency(address, null);
	}

	/**
	 * Returns a new {@link VkSubpassDependency.Buffer} instance allocated with {@link MemoryUtil#memAlloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer malloc(int capacity) {
		return create(nmemAlloc(capacity * SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSubpassDependency.Buffer} instance allocated with {@link MemoryUtil#memCalloc}. The instance must be explicitly freed.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer calloc(int capacity) {
		return create(nmemCalloc(capacity, SIZEOF), capacity);
	}

	/**
	 * Returns a new {@link VkSubpassDependency.Buffer} instance allocated with {@link BufferUtils}.
	 *
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(int capacity) {
		return new Buffer(BufferUtils.createByteBuffer(capacity * SIZEOF));
	}

	/**
	 * Create a {@link VkSubpassDependency.Buffer} instance at the specified memory.
	 *
	 * @param address  the memory address
	 * @param capacity the buffer capacity
	 */
	public static Buffer create(long address, int capacity) {
		return address == NULL ? null : new Buffer(address, null, -1, 0, capacity, capacity);
	}

	/** Unsafe version of {@link #srcSubpass}. */
	public static int nsrcSubpass(long struct) { return memGetInt(struct + VkSubpassDependency.SRCSUBPASS); }
	/** Unsafe version of {@link #dstSubpass}. */
	public static int ndstSubpass(long struct) { return memGetInt(struct + VkSubpassDependency.DSTSUBPASS); }
	/** Unsafe version of {@link #srcStageMask}. */
	public static int nsrcStageMask(long struct) { return memGetInt(struct + VkSubpassDependency.SRCSTAGEMASK); }
	/** Unsafe version of {@link #dstStageMask}. */
	public static int ndstStageMask(long struct) { return memGetInt(struct + VkSubpassDependency.DSTSTAGEMASK); }
	/** Unsafe version of {@link #srcAccessMask}. */
	public static int nsrcAccessMask(long struct) { return memGetInt(struct + VkSubpassDependency.SRCACCESSMASK); }
	/** Unsafe version of {@link #dstAccessMask}. */
	public static int ndstAccessMask(long struct) { return memGetInt(struct + VkSubpassDependency.DSTACCESSMASK); }
	/** Unsafe version of {@link #dependencyFlags}. */
	public static int ndependencyFlags(long struct) { return memGetInt(struct + VkSubpassDependency.DEPENDENCYFLAGS); }

	/** Unsafe version of {@link #srcSubpass(int) srcSubpass}. */
	public static void nsrcSubpass(long struct, int value) { memPutInt(struct + VkSubpassDependency.SRCSUBPASS, value); }
	/** Unsafe version of {@link #dstSubpass(int) dstSubpass}. */
	public static void ndstSubpass(long struct, int value) { memPutInt(struct + VkSubpassDependency.DSTSUBPASS, value); }
	/** Unsafe version of {@link #srcStageMask(int) srcStageMask}. */
	public static void nsrcStageMask(long struct, int value) { memPutInt(struct + VkSubpassDependency.SRCSTAGEMASK, value); }
	/** Unsafe version of {@link #dstStageMask(int) dstStageMask}. */
	public static void ndstStageMask(long struct, int value) { memPutInt(struct + VkSubpassDependency.DSTSTAGEMASK, value); }
	/** Unsafe version of {@link #srcAccessMask(int) srcAccessMask}. */
	public static void nsrcAccessMask(long struct, int value) { memPutInt(struct + VkSubpassDependency.SRCACCESSMASK, value); }
	/** Unsafe version of {@link #dstAccessMask(int) dstAccessMask}. */
	public static void ndstAccessMask(long struct, int value) { memPutInt(struct + VkSubpassDependency.DSTACCESSMASK, value); }
	/** Unsafe version of {@link #dependencyFlags(int) dependencyFlags}. */
	public static void ndependencyFlags(long struct, int value) { memPutInt(struct + VkSubpassDependency.DEPENDENCYFLAGS, value); }

	// -----------------------------------

	/** An array of {@link VkSubpassDependency} structs. */
	public static final class Buffer extends StructBuffer<VkSubpassDependency, Buffer> {

		/**
		 * Creates a new {@link VkSubpassDependency.Buffer} instance backed by the specified container.
		 *
		 * Changes to the container's content will be visible to the struct buffer instance and vice versa. The two buffers' position, limit, and mark values
		 * will be independent. The new buffer's position will be zero, its capacity and its limit will be the number of bytes remaining in this buffer divided
		 * by {@link VkSubpassDependency#SIZEOF}, and its mark will be undefined.
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
		protected VkSubpassDependency newInstance(long address) {
			return new VkSubpassDependency(address, container);
		}

		@Override
		protected int sizeof() {
			return SIZEOF;
		}

		/** Returns the value of the {@code srcSubpass} field. */
		public int srcSubpass() { return VkSubpassDependency.nsrcSubpass(address()); }
		/** Returns the value of the {@code dstSubpass} field. */
		public int dstSubpass() { return VkSubpassDependency.ndstSubpass(address()); }
		/** Returns the value of the {@code srcStageMask} field. */
		public int srcStageMask() { return VkSubpassDependency.nsrcStageMask(address()); }
		/** Returns the value of the {@code dstStageMask} field. */
		public int dstStageMask() { return VkSubpassDependency.ndstStageMask(address()); }
		/** Returns the value of the {@code srcAccessMask} field. */
		public int srcAccessMask() { return VkSubpassDependency.nsrcAccessMask(address()); }
		/** Returns the value of the {@code dstAccessMask} field. */
		public int dstAccessMask() { return VkSubpassDependency.ndstAccessMask(address()); }
		/** Returns the value of the {@code dependencyFlags} field. */
		public int dependencyFlags() { return VkSubpassDependency.ndependencyFlags(address()); }

		/** Sets the specified value to the {@code srcSubpass} field. */
		public VkSubpassDependency.Buffer srcSubpass(int value) { VkSubpassDependency.nsrcSubpass(address(), value); return this; }
		/** Sets the specified value to the {@code dstSubpass} field. */
		public VkSubpassDependency.Buffer dstSubpass(int value) { VkSubpassDependency.ndstSubpass(address(), value); return this; }
		/** Sets the specified value to the {@code srcStageMask} field. */
		public VkSubpassDependency.Buffer srcStageMask(int value) { VkSubpassDependency.nsrcStageMask(address(), value); return this; }
		/** Sets the specified value to the {@code dstStageMask} field. */
		public VkSubpassDependency.Buffer dstStageMask(int value) { VkSubpassDependency.ndstStageMask(address(), value); return this; }
		/** Sets the specified value to the {@code srcAccessMask} field. */
		public VkSubpassDependency.Buffer srcAccessMask(int value) { VkSubpassDependency.nsrcAccessMask(address(), value); return this; }
		/** Sets the specified value to the {@code dstAccessMask} field. */
		public VkSubpassDependency.Buffer dstAccessMask(int value) { VkSubpassDependency.ndstAccessMask(address(), value); return this; }
		/** Sets the specified value to the {@code dependencyFlags} field. */
		public VkSubpassDependency.Buffer dependencyFlags(int value) { VkSubpassDependency.ndependencyFlags(address(), value); return this; }

	}

}